package com.whereq.realtor.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.whereq.realtor.batch.domain.PropertyDetailsPO;
import com.whereq.realtor.batch.domain.PropertyPO;

/**
 *
 * @author bacon
 */
@Component
public interface PropertyRepository extends JpaRepository<PropertyPO, Long> {
	
	@Query("select u from  PropertyPO u where u.MLS = ?1")
	PropertyPO findByMLS(String MLS);
}
