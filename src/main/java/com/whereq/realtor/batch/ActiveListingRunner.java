/*
 * 
 * TODO LIST
 * 		1. 2017/06/28
 * 			need to delete records just before run persistant, for now, it takes 30 secs for each job run
 * 			which means, the active_listing table will be empty during this time
 * 
 */

package com.whereq.realtor.batch;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;
import com.whereq.realtor.batch.domain.ListingActivePO;
import com.whereq.realtor.batch.repository.ListingActiveRepository;
import com.whereq.realtor.xml.bind.LiteCondoProperty;
import com.whereq.realtor.xml.bind.LiteCondoPropertyWrapper;
import com.whereq.realtor.xml.bind.LiteResProperty;
import com.whereq.realtor.xml.bind.LiteResPropertyWrapper;


@Component(value="active_runner")
public class ActiveListingRunner {

	@Inject
	private ListingActiveRepository repository;
	
    @Resource
    private Environment env;
	
	public void run() throws JAXBException, XMLStreamException{
		
		 Logger logger = LoggerFactory.getLogger(ActiveListingRunner.class);	
		
		List<ListingActivePO> poList = Lists.newArrayList();
		System.out.println("============================================================");
		System.out.println("Start: " + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()));
		System.out.println("Removing all active listing first, size: " + repository.count());
		repository.deleteAll();
		
		//scan active resedentials
        JAXBContext jc = JAXBContext.newInstance(LiteResPropertyWrapper.class);
        System.out.println("jaxbContent class: " + jc.getClass());
        
        XMLInputFactory xif = XMLInputFactory.newFactory();
        //xif.setProperty(XMLInputFactory.SUPPORT_DTD, false);
        
        String xmlpath = env.getProperty("ACTIVE_RES_PATH");
        System.out.println("env: " + xmlpath);
        //XMLStreamReader xsr = xif.createXMLStreamReader(new StreamSource("C:/tmp/active_freehold.xml"));
        XMLStreamReader xsr = xif.createXMLStreamReader(new StreamSource(xmlpath));

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        LiteResPropertyWrapper  response = (LiteResPropertyWrapper) unmarshaller.unmarshal(xsr );
        List<LiteResProperty> actResListings = response.getActiveProperties();
        int i=0;
		for (LiteResProperty liteResPro : actResListings) {
			{
				
				if (repository.findByMLS(liteResPro.getMls()) == null)
				{
					poList.add(saveIntoListingActiveTable(liteResPro,"RES")) ;
					logger.info(++i+ ":"+liteResPro.toString());
				} 
				else
					logger.info(liteResPro.getMls() + " exists in DB already !");

			}	
		}
		
		logger.info("Total: "+ i + " inserted on residential properties!");
		
		
		//scan active condos
        jc = JAXBContext.newInstance(LiteCondoPropertyWrapper.class);

        unmarshaller = jc.createUnmarshaller();
        xif = XMLInputFactory.newFactory();
        
        String xmlCondoPath = env.getProperty("ACTIVE_CND_PATH");
        System.out.println("env: " + xmlCondoPath);
       // xsr = xif.createXMLStreamReader(new StreamSource("C:/tmp/crea/treb_feed/active/active_condo.xml"));
        xsr = xif.createXMLStreamReader(new StreamSource(xmlCondoPath));
        //xsr = xif.createXMLStreamReader(new StreamSource("C:/tmp/active_condo.xml"));
        
        LiteCondoPropertyWrapper  responseCondo = (LiteCondoPropertyWrapper) unmarshaller.unmarshal(xsr );
        List<LiteCondoProperty> actCndListings = responseCondo.getActiveProperties();
        int j=0;
		for (LiteCondoProperty liteCndPro : actCndListings) {
			{
				
				if (repository.findByMLS(liteCndPro.getMls()) == null)
				{
					poList.add(saveIntoListingActiveTable(liteCndPro,"CND")) ;
					logger.info(++j+ ":"+liteCndPro.toString());
				} 
				else
					logger.info(liteCndPro.getMls() + " exists in DB already !");

			}	
		}
		
		logger.info("Total: "+ j + " inserted on condo properties!");
		logger.info("Total: "+ (i+j) + " inserted on all active properties!");
		
		repository.save(poList);
		System.out.println("Total: "+ (i+j) + " inserted on all active properties!");
		System.out.println("End: " + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()));
		System.out.println("============================================================");
		
	}
	
	
	private ListingActivePO saveIntoListingActiveTable(LiteResProperty litResPro, String type)
	{
		ListingActivePO listingPO = null;
		
		//System.out.println(litResPro.getMls() + " into listing_active table: for residentila");
		listingPO = new ListingActivePO();
		listingPO.setMLS(litResPro.getMls());
		listingPO.setStatus(litResPro.getStatus());
		listingPO.setType(type);
		
		return listingPO;
		
	}
	
	private ListingActivePO saveIntoListingActiveTable(LiteCondoProperty litCndPro, String type)
	{
		ListingActivePO listingPO = null;
		
		//System.out.println(litCndPro.getMls() + " into listing_active table: for condo");
		listingPO = new ListingActivePO();
		listingPO.setMLS(litCndPro.getMls());
		listingPO.setStatus(litCndPro.getStatus());
		listingPO.setType(type);
		
		return listingPO;
		
	}
	
	
	
	
}
