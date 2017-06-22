package com.whereq.realtor.batch;

import java.util.List;

import javax.inject.Inject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;

import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;
import com.whereq.realtor.batch.domain.FH_ListingAddrPO;
import com.whereq.realtor.batch.domain.FH_ListingExtraPO;
import com.whereq.realtor.batch.domain.FH_PropertyDetailsPO;
import com.whereq.realtor.batch.domain.FH_PropertyPO;
import com.whereq.realtor.batch.domain.FH_PropertyRoomsPO;
import com.whereq.realtor.batch.domain.ListingFullPO;
import com.whereq.realtor.batch.domain.ListingActivePO;
import com.whereq.realtor.batch.repository.ListingActiveRepository;
import com.whereq.realtor.xml.bind.LiteResProperty;
import com.whereq.realtor.xml.bind.LiteResPropertyWrapper;

@Component(value="active_runner")
public class ActiveListingRunner {

	@Inject
	private ListingActiveRepository repository;

	
	public void run() throws JAXBException, XMLStreamException{
		
		List<ListingActivePO> poList = Lists.newArrayList();
		
		
        JAXBContext jc = JAXBContext.newInstance(LiteResPropertyWrapper.class);

        XMLInputFactory xif = XMLInputFactory.newFactory();
        xif.setProperty(XMLInputFactory.SUPPORT_DTD, false);
        XMLStreamReader xsr = xif.createXMLStreamReader(new StreamSource("C:/tmp/active_freehold.xml"));
        //XMLStreamReader xsr = xif.createXMLStreamReader(new StreamSource("C:/tmp/crea/treb_feed/active/active_freehold.xml"));

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        LiteResPropertyWrapper  response = (LiteResPropertyWrapper) unmarshaller.unmarshal(xsr );
        List<LiteResProperty> actResListings = response.getActiveProperties();
        int i;
		for (LiteResProperty liteResPro : actResListings) {
			{
				
				//System.out.println(repository.findOne(1L).getMLS());
				//System.out.println(repository.findOne(2L).getMLS());
				poList.add(saveIntoListingActiveTable(liteResPro)) ;
				//System.out.println("i++:"+liteResPro.toString());

			}	
		}
		
		repository.save(poList);
		

		
	}
	
	
	private ListingActivePO saveIntoListingActiveTable(LiteResProperty litResPro)
	{
		ListingActivePO listingPO = null;
		
		System.out.println(litResPro.getMls() + " into listing_active table:");
		listingPO = new ListingActivePO();
		listingPO.setMLS(litResPro.getMls());
		listingPO.setStatus(litResPro.getStatus());
		listingPO.setType("RES");
		
		return listingPO;
		
	}
	
	
}
