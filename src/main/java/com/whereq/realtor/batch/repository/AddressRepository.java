package com.whereq.realtor.batch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.whereq.realtor.batch.domain.ListingAddrPO;
import com.whereq.realtor.batch.domain.ListingFullPO;

/**
 *
 * @author bacon
 */
@Component
public interface AddressRepository extends JpaRepository<ListingAddrPO, Long> {
	
	@Query("select u from  ListingAddrPO u where u.MLS = ?1")
	ListingAddrPO findByMLS(String MLS);
	
	
}
