package com.whereq.realtor.batch.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.whereq.realtor.batch.domain.Listing;

/**
 * Spring Data JPA repository for the Listing entity.
 */
@Component
@SuppressWarnings("unused")
public interface ListingRepository extends JpaRepository<Listing,Long> {

}
