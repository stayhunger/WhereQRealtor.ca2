package com.whereq.realtor.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.whereq.realtor.batch.domain.FH_PropertyRoomsPO;

/**
 *
 * @author bacon
 */
@Component
public interface FHPropertyRoomsRepository extends JpaRepository<FH_PropertyRoomsPO, Long> {
	
	
}
