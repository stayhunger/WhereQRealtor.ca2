package com.whereq.realtor.batch;

import java.io.File;
import java.util.List;

import javax.inject.Inject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;
import com.whereq.realtor.batch.domain.FH_ListingAddrPO;
import com.whereq.realtor.batch.domain.FH_ListingExtraPO;
import com.whereq.realtor.batch.domain.FH_PropertyPO;
import com.whereq.realtor.batch.domain.ListingPO;
import com.whereq.realtor.batch.repository.AddressRepository;
import com.whereq.realtor.batch.repository.FHListingRepository;
import com.whereq.realtor.batch.repository.FHPropertyRepository;
import com.whereq.realtor.batch.repository.ListingExtraRepository;
import com.whereq.realtor.xml.bind.ListingFull;
import com.whereq.realtor.xml.bind.REProperties;
import com.whereq.realtor.xml.bind.ResidentialProperty;

@Component(value="runner")
public class Runner {

	@Inject
	private FHListingRepository repository;

	@Inject
	private AddressRepository add_repository;
	
	@Inject
	private ListingExtraRepository extra_repository;
	
	@Inject
	private FHPropertyRepository property_repository;
	
	public void run() throws JAXBException{
		
		ListingPO listingPO = null;
		List<ListingPO> poList = Lists.newArrayList();
		
		FH_ListingAddrPO addrPO = null;
		List<FH_ListingAddrPO> addList = Lists.newArrayList();
		
		FH_ListingExtraPO extraPO = null;
		List<FH_ListingExtraPO> extraList = Lists.newArrayList();

		FH_PropertyPO ppyPO = null;
		List<FH_PropertyPO> ppyList = Lists.newArrayList();
		
		
		JAXBContext jaxbContext = JAXBContext.newInstance(REProperties.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		REProperties reProperties = (REProperties) jaxbUnmarshaller.unmarshal( new File("c:/temp/listing_test.xml") );
		
		for (ResidentialProperty residentialProperty : reProperties.getResidentialProperties()) {
			for(ListingFull listingFull : residentialProperty.getListings())
			{
				System.out.println(listingFull.getMls());
				listingPO = new ListingPO();
				listingPO.setMLS(listingFull.getMls());
				listingPO.setAddress(listingFull.getAddress());
				listingPO.setListPrice(listingFull.getListPrice());
				listingPO.setSaleLease(listingFull.getSaleLease());
				
				listingPO.setLegalDescription(listingFull.getLegalDescription());
				listingPO.setTaxes(listingFull.getTaxes());
				listingPO.setTaxYear(listingFull.getTaxYear());
				listingPO.setPostalCode(listingFull.getPostalCode());
				listingPO.setMunicipalityDistrict(listingFull.getMunicipalityDistrict());
				listingPO.setProvince(listingFull.getProvince());
				listingPO.setSellerPropertyInfoStatement(listingFull.getSellerPropertyInfoStatement());
				listingPO.setPixUpdtedDt(listingFull.getPixUpdatedDate());
				listingPO.setStatus(listingFull.getStatus());
				listingPO.setListBrokerage(listingFull.getListBrokerage());
				
				poList.add(listingPO);
				
				
				//fh address
				addrPO = new FH_ListingAddrPO();
				addrPO.setMLS(listingFull.getMls());
				addrPO.setArea(listingFull.getArea());
				addrPO.setMap(listingFull.getMap());
				addrPO.setMapColumn(listingFull.getMapColumn());
				addrPO.setMapRow(listingFull.getMapRow());
				addrPO.setStreet(listingFull.getStreet());
				addrPO.setStreetDirection(listingFull.getStreetDirection());
				addrPO.setStreetAbbreviation(listingFull.getStreetAbbreviation());
				addrPO.setAreaCode(listingFull.getAreaCode());
				addrPO.setMunicipalityCode(listingFull.getMunicipalityCode());
				addrPO.setCommunityCode(listingFull.getCommunityCode());
				addrPO.setMunicipalityDistrict(listingFull.getMunicipalityDistrict());
				addrPO.setMunicipality(listingFull.getMunicipality());
				addrPO.setCommunity(listingFull.getCommunity());
				addList.add(addrPO);
				
				
				//fh extra
				extraPO = new FH_ListingExtraPO();
				extraPO.setMLS(listingFull.getMls());
				extraPO.setExtras(listingFull.getExtras());
				extraPO.setRemarksForClients(listingFull.getRemarksForClients().getBytes());				
				extraList.add(extraPO);
				
				//fh property
				ppyPO = new FH_PropertyPO();
				ppyPO.setMLS(listingFull.getMls());
				ppyPO.setTypeOwn1Out(listingFull.getTypeOwn1out());
				ppyPO.setStyle(listingFull.getStyle());
				ppyPO.setFrontingOnNSEW(listingFull.getFontingOnNSEW());
				ppyPO.setRooms(listingFull.getRooms());
				ppyPO.setRoomsPlus(listingFull.getRoomsPlus());
				ppyPO.setBedrooms(listingFull.getBedrooms());
				ppyPO.setBedroomsPlus(listingFull.getBedroomPlus());
				ppyPO.setWashrooms(listingFull.getWashrooms());
				
				ppyPO.setLotFront(listingFull.getLotFront());
				ppyPO.setLotDepth(listingFull.getLotDepth());
				ppyPO.setLotIrregularities(listingFull.getLotIrregularities());
				ppyPO.setDirectionsCrossStreets(listingFull.getDirectionsCrossStreets());
				
				ppyPO.setWashroomsType1Pcs(listingFull.getWashroomsType1Pcs());
				ppyPO.setWashroomsType2Pcs(listingFull.getWashroomsType2Pcs());
				ppyPO.setWashroomsType3Pcs(listingFull.getWashroomsType3Pcs());
				ppyPO.setWashroomsType4Pcs(listingFull.getWashroomsType4Pcs());
				ppyPO.setWashroomsType1(listingFull.getWashroomsType1());
				ppyPO.setWashroomsType2(listingFull.getWashroomsType2());
				ppyPO.setWashroomsType3(listingFull.getWashroomsType3());
				ppyPO.setWashroomsType4(listingFull.getWashroomsType4());
				ppyPO.setWashroomsType1Level(listingFull.getWashroomsType1Level());
				ppyPO.setWashroomsType1Level(listingFull.getWashroomsType1Level());
				ppyPO.setWashroomsType1Level(listingFull.getWashroomsType1Level());
				ppyPO.setWashroomsType1Level(listingFull.getWashroomsType1Level());
				
				ppyList.add(ppyPO);
				
				
				
				
			}	
		}
		
		repository.save(poList);
		
		add_repository.save(addList);
		
		extra_repository.save(extraList);
		
		property_repository.save(ppyList);
		
	}
	
}
