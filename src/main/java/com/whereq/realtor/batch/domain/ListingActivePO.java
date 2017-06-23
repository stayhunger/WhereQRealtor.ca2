package com.whereq.realtor.batch.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * @author bacon
 *
 */
@Entity
@Table (name = "listing_active", uniqueConstraints={@UniqueConstraint(columnNames = {"ml_num" })})
public class ListingActivePO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(generator = "generator")
	@GenericGenerator(name = "generator", strategy = "increment")
	private long id;
	
	
	@Column(name = "ml_num", unique=true)
	private String MLS;

	
	@Column(name = "status")
	private String Status;	


	@Column(name = "type")
	private String Type;	
	
	
	
	public String getType() {
		return Type;
	}



	public void setType(String type) {
		Type = type;
	}



	public String getStatus() {
		return Status;
	}



	public void setStatus(String status) {
		Status = status;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getMLS() {
		return MLS;
	}



	public void setMLS(String mLS) {
		MLS = mLS;
	}

	

}
