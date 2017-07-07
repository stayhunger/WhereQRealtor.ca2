package com.whereq.realtor.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.whereq.realtor.batch.domain.ListingExtraPO;
import com.whereq.realtor.batch.domain.ListingFullPO;

/**
 *
 * @author bacon
 */
@Component
public interface ListingExtraRepository extends JpaRepository<ListingExtraPO, Long> {
	
	@Query("select u from  ListingExtraPO u where u.MLS = ?1")
	ListingExtraPO findByMLS(String MLS);
	
}
