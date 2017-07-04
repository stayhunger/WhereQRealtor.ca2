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
//@Table (name = "fh_listing", uniqueConstraints={@UniqueConstraint(columnNames = {"ml_num" })})
@Table (name = "fh_listing")
public class ListingFullPO {
	
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

	@Column(name = "addr")
	private String Address;


	@Column(name = "s_r")
	private String SaleLease;
	
	
	@Column(name = "lp_dol", columnDefinition="Decimal(11)")
	private Double ListPrice;

	@Column(name = "lp_dol2", columnDefinition="Decimal(11)")
	private Double NewListPrice;
	

	@Column(name = "taxes", columnDefinition="Decimal(8,2)")
	private Double Taxes;
	

	@Column(name = "yr", columnDefinition="Decimal(4,0)")
	private Integer TaxYear;
	
	@Column(name = "Province")
	private String Province;
	
	@Column(name = "zip")
	private String PostalCode;
	
	@Column(name = "legal_desc")
	private String LegalDescription;
	
	@Column(name = "municipality_district")
	private String MunicipalityDistrict;
	
	@Column(name = "vend_pis")
	private String SellerPropertyInfoStatement;
	
	@Column(name = "timestamp_sql", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date  PixUpdtedDt;
	
	@Column(name = "rltr")
	private String ListBrokerage;
	
	@Column(name = "status")
	private String Status;	

//	@Lob
//	@Column(name = "ad_text",nullable = false, length = 655)
//	private byte[] RemarksForClients;	
//

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



	public String getListBrokerage() {
		return ListBrokerage;
	}



	public void setListBrokerage(String listBrokerage) {
		ListBrokerage = listBrokerage;
	}






//	public byte[] getRemarksForClients() {
//		return RemarksForClients;
//	}
//
//
//
//	public void setRemarksForClients(byte[] remarksForClients) {
//		RemarksForClients = remarksForClients;
//	}
//
//
//
//	public String getExtras() {
//		return Extras;
//	}
//
//
//
//	public void setExtras(String extras) {
//		Extras = extras;
//	}



	public Double getTaxes() {
		return Taxes;
	}



	public void setTaxes(Double taxes) {
		Taxes = taxes;
	}



	public Integer getTaxYear() {
		return TaxYear;
	}



	public void setTaxYear(Integer taxYear) {
		TaxYear = taxYear;
	}



	public String getProvince() {
		return Province;
	}



	public void setProvince(String province) {
		Province = province;
	}



	public String getPostalCode() {
		return PostalCode;
	}



	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}



	public String getLegalDescription() {
		return LegalDescription;
	}



	public void setLegalDescription(String legalDescription) {
		LegalDescription = legalDescription;
	}



	public String getMunicipalityDistrict() {
		return MunicipalityDistrict;
	}



	public void setMunicipalityDistrict(String municipalityDistrict) {
		MunicipalityDistrict = municipalityDistrict;
	}



	public String getSellerPropertyInfoStatement() {
		return SellerPropertyInfoStatement;
	}



	public void setSellerPropertyInfoStatement(String sellerPropertyInfoStatement) {
		SellerPropertyInfoStatement = sellerPropertyInfoStatement;
	}



	public Date getPixUpdtedDt() {
		return PixUpdtedDt;
	}



	public void setPixUpdtedDt(Date pixUpdtedDt) {
		PixUpdtedDt = pixUpdtedDt;
	}



	public void setListPrice(Double listPrice) {
		ListPrice = listPrice;
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



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}



	public String getSaleLease() {
		return SaleLease;
	}



	public void setSaleLease(String saleLease) {
		SaleLease = saleLease;
	}



	public double getListPrice() {
		return ListPrice;
	}



	public void setListPrice(double listPrice) {
		ListPrice = listPrice;
	}


	public Double getNewListPrice() {
		return NewListPrice;
	}



	public void setNewListPrice(Double newListPrice) {
		NewListPrice = newListPrice;
	}


}
