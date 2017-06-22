package com.whereq.realtor.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.whereq.realtor.batch.domain.ListingActivePO;

/**
 *
 * @author bacon
 */
@Component
public interface ListingActiveRepository extends JpaRepository<ListingActivePO, Long> {
	
	
}
