package com.whereq.realtor.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.whereq.realtor.batch.domain.CondoExtraPO;

/**
 *
 * @author bacon
 */
@Component
public interface CondoExtraRepository extends JpaRepository<CondoExtraPO, Long> {
	
	
}
