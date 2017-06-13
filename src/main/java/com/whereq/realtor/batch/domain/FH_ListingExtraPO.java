package com.whereq.realtor.batch.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * @author bacon
 *
 */
@Entity
//@Table (name = "fh_listing_extra", uniqueConstraints={@UniqueConstraint(columnNames = {"ml_num" })})
@Table (name = "fh_listing_extra")
public class FH_ListingExtraPO {
	
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

 	@Lob
 	@Column(name = "ad_text",nullable = false, length = 655)
 	private byte[] RemarksForClients;	
 
 	@Column(name = "extras")
 	private String Extras;	

 	public byte[] getRemarksForClients() {
 		return RemarksForClients;
 	}
 
 
 
 	public void setRemarksForClients(byte[] remarksForClients) {
 		RemarksForClients = remarksForClients;
 	}
 
 
 
 	public String getExtras() {
 		return Extras;
 	}
 
 
 
 	public void setExtras(String extras) {
 		Extras = extras;
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
