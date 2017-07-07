package com.whereq.realtor.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.whereq.realtor.batch.domain.PropertyPO;
import com.whereq.realtor.batch.domain.PropertyRoomsPO;

/**
 *
 * @author bacon
 */
@Component
public interface PropertyRoomsRepository extends JpaRepository<PropertyRoomsPO, Long> {
	
	@Query("select u from  PropertyRoomsPO u where u.MLS = ?1")
	PropertyRoomsPO findByMLS(String MLS);
}
