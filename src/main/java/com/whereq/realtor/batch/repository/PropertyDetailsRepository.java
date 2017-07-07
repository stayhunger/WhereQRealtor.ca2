package com.whereq.realtor.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.whereq.realtor.batch.domain.ListingExtraPO;
import com.whereq.realtor.batch.domain.PropertyDetailsPO;

/**
 *
 * @author bacon
 */
@Component
public interface PropertyDetailsRepository extends JpaRepository<PropertyDetailsPO, Long> {
	
	@Query("select u from  PropertyDetailsPO u where u.MLS = ?1")
	PropertyDetailsPO findByMLS(String MLS);
}
