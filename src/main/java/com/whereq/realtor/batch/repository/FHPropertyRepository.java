package com.whereq.realtor.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.whereq.realtor.batch.domain.FH_PropertyPO;

/**
 *
 * @author bacon
 */
@Component
public interface FHPropertyRepository extends JpaRepository<FH_PropertyPO, Long> {
	
	
}
