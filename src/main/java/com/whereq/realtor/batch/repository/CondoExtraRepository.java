package com.whereq.realtor.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.whereq.realtor.batch.domain.CondoExtraPO;
import com.whereq.realtor.batch.domain.ListingAddrPO;

/**
 *
 * @author bacon
 */
@Component
public interface CondoExtraRepository extends JpaRepository<CondoExtraPO, Long> {
	
	@Query("select u from  CondoExtraPO u where u.MLS = ?1")
	CondoExtraPO findByMLS(String MLS);
}
