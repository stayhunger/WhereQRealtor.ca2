package com.whereq.realtor.xml.bind;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.whereq.realtor.batch.domain.ListingPO;

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
	
	public static void main(String[] args) throws JAXBException 
	{
//		marshalingTest();
		System.out.println("************************************************");
		unMarshalingTest();
	}

	private static void unMarshalingTest() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(REProperties.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		REProperties reProperties = (REProperties) jaxbUnmarshaller.unmarshal( new File("c:/tmp/vow.xml") );
		
		for (ResidentialProperty residentialProperty : reProperties.getResidentialProperties()) {
			for(ListingFull listingFull : residentialProperty.getListings())
			{
				System.out.println(listingFull.getMls());
				
			}	
		}
		
	}

	private static void marshalingTest() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(ResidentialProperty.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
		jaxbMarshaller.marshal(residentialProperty, System.out);
		jaxbMarshaller.marshal(residentialProperty, new File("c:/tmp/vow.xml"));
	}
}
