package com.whereq.realtor.batch.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.whereq.realtor.batch.domain.ListingFullPO;

/**
 * Spring Data JPA repository for the Listing entity.
 */
@Component
@SuppressWarnings("unused")
public interface ListingRepository extends JpaRepository<ListingFullPO,Long> {
	
	
	@Query("select u from  ListingFullPO u where u.MLS = ?1")
	ListingFullPO findByMLS(String MLS);
	
	
	@Query(value = "SELECT * FROM listing WHERE zip = ?1", nativeQuery = true)
	List<ListingFullPO> findByZipcode(String postalCode);
	
	@Modifying
	@Query("update ListingFullPO u set u.ListPrice = ?1 where u.MLS = ?2")
	public int setNewPrice(Double newPrice, String MLS);
	
	@Query("select u from ListingFullPO u where  u.Status = :Status")
	List<ListingFullPO> findByStatus(@Param("Status") String status);

}
