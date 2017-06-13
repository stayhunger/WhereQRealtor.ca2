package com.whereq.realtor.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.whereq.realtor.batch.domain.FH_PropertyDetailsPO;

/**
 *
 * @author bacon
 */
@Component
public interface FHPropertyDetailsRepository extends JpaRepository<FH_PropertyDetailsPO, Long> {
	
	
}
