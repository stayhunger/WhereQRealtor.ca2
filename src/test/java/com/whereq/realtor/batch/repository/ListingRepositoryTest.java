package com.whereq.realtor.batch.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.whereq.realtor.batch.domain.Listing;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration (locations = {"classpath*:**/testContext.xml"})
public class ListingRepositoryTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired 
	ListingRepository listingRepository;
	
	@Test
	public void test() {
		Listing listing = new Listing();
		listing.setMls("mls");
		listingRepository.save(listing);
	}

}
