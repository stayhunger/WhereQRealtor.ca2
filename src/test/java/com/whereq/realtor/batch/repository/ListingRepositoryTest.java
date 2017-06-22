package com.whereq.realtor.batch.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.whereq.realtor.batch.domain.ListingFullPO;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration (locations = {"classpath*:**/testContext.xml"})
public class ListingRepositoryTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired 
	ListingRepository listingRepository;
	
	@Test
	public void test() {
		ListingFullPO listing = new ListingFullPO();
		listing.setMLS("mls");
		listingRepository.save(listing);
	}

}
