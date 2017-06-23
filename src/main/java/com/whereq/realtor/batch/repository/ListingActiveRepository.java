package com.whereq.realtor.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.whereq.realtor.batch.domain.ListingActivePO;

/**
 *
 * @author bacon
 */
@Component
public interface ListingActiveRepository extends JpaRepository<ListingActivePO, Long> {
	
	@Query("select u from  ListingActivePO u where u.MLS = ?1")
	//@Query(value = "SELECT FROM listing_active WHERE ML_NUM = ?1", nativeQuery = true)
	ListingActivePO findByMLS(String MLS);
}
