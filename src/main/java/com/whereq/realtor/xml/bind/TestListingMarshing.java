package com.whereq.realtor.xml.bind;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;


public class TestListingMarshing 
{
	static ResidentialProperty residentialProperty = new ResidentialProperty();
	static 
	{
		residentialProperty.setListings(new ArrayList<ListingFull>());
		
		ListingFull listingFull = new ListingFull();
		listingFull.setMls("MLS_TEST");
		
		residentialProperty.getListings().add(listingFull);
	}
	
	public static void main(String[] args) throws JAXBException , XMLStreamException
	{
//		marshalingTest();
		System.out.println("************************************************");
		unMarshalingTest();
		System.out.println("-----------------");
	}

	private static void unMarshalingTest() throws JAXBException, XMLStreamException {
//		JAXBContext jaxbContext = JAXBContext.newInstance(REProperties.class);
//		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//		REProperties reProperties = (REProperties) jaxbUnmarshaller.unmarshal( new File("c:/tmp/vow.xml") );
//		
		
        JAXBContext jc = JAXBContext.newInstance(RETS.class);

        XMLInputFactory xif = XMLInputFactory.newFactory();
        xif.setProperty(XMLInputFactory.SUPPORT_DTD, false);
        XMLStreamReader xsr = xif.createXMLStreamReader(new StreamSource("C:/tmp/crea/treb_feed/active/active_freehold.xml"));
        //XMLStreamReader xsr = xif.createXMLStreamReader(new StreamSource("C:/tmp/vow.xml"));

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        RETS  rets = (RETS) unmarshaller.unmarshal(xsr );
        REProperties reProperties = rets.getRedata().get(0).getReProperties().get(0);
        int i = 0;
		for (ResidentialProperty residentialProperty : reProperties.getResidentialProperties()) {
			for(ListingFull listingFull : residentialProperty.getListings())
			{
				System.out.println(listingFull.getMls());
				i++;
			}	
		}
		System.out.println("total: " + i);
	}

	private static void marshalingTest() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(ResidentialProperty.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
		jaxbMarshaller.marshal(residentialProperty, System.out);
		jaxbMarshaller.marshal(residentialProperty, new File("c:/tmp/vow.xml"));
	}
}
