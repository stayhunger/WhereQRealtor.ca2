package com.whereq.realtor.batch;

import javax.inject.Inject;
import javax.xml.bind.JAXBException;

import org.springframework.stereotype.Component;

import com.whereq.realtor.batch.domain.ListingFullPO;
import com.whereq.realtor.batch.repository.ListingRepository;

@Component(value="runnerTest")
public class RunnerTest {

	@Inject
	private ListingRepository listingRepository;

	
	public void run() throws JAXBException{
		
		ListingFullPO listing = new ListingFullPO();
		listing.setMLS("mls");
		listingRepository.save(listing);
		
	}
	
}
