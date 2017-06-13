package com.whereq.realtor.batch.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * @author bacon
 *
 */
@Entity
@Table (name = "listing_main")
public class Listing {
	
	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "generator")
	@GenericGenerator(name = "generator", strategy = "increment")
	private long id;
	
	
	@Column(name = "mls", unique=false)
	private String mls;

	@Column(name = "address")
	private String address;


	@Column(name = "sale_or_lease")
	private String saleOrLease;
	
	
	@Column(name = "list_price", columnDefinition="Decimal(11)")
	private Double listPrice;

	
	@Column(name = "taxes", columnDefinition="Decimal(8,2)")
	private Double taxes;
	

	@Column(name = "tax_year", columnDefinition="Decimal(4,0)")
	private Integer taxYear;
	
	@Column(name = "province")
	private String province;
	
	@Column(name = "postal_code")
	private String postalCode;
	
	@Column(name = "legal_description")
	private String LegalDescription;
	
	@Column(name = "municipality_district")
	private String municipalityDistrict;
	
	@Column(name = "seller_property_info_statement")
	private String SellerPropertyInfoStatement;
	
	@Column(name = "timestamp_sql", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date pixUpdtedDt;
	
	@Column(name = "list_brokerage")
	private String listBrokerage;
	
	@Column(name = "status")
	private String status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMls() {
		return mls;
	}

	public void setMls(String mls) {
		this.mls = mls;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSaleOrLease() {
		return saleOrLease;
	}

	public void setSaleOrLease(String saleOrLease) {
		this.saleOrLease = saleOrLease;
	}

	public Double getListPrice() {
		return listPrice;
	}

	public void setListPrice(Double listPrice) {
		this.listPrice = listPrice;
	}

	public Double getTaxes() {
		return taxes;
	}

	public void setTaxes(Double taxes) {
		this.taxes = taxes;
	}

	public Integer getTaxYear() {
		return taxYear;
	}

	public void setTaxYear(Integer taxYear) {
		this.taxYear = taxYear;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getLegalDescription() {
		return LegalDescription;
	}

	public void setLegalDescription(String legalDescription) {
		LegalDescription = legalDescription;
	}

	public String getMunicipalityDistrict() {
		return municipalityDistrict;
	}

	public void setMunicipalityDistrict(String municipalityDistrict) {
		this.municipalityDistrict = municipalityDistrict;
	}

	public String getSellerPropertyInfoStatement() {
		return SellerPropertyInfoStatement;
	}

	public void setSellerPropertyInfoStatement(String sellerPropertyInfoStatement) {
		SellerPropertyInfoStatement = sellerPropertyInfoStatement;
	}

	public Date getPixUpdtedDt() {
		return pixUpdtedDt;
	}

	public void setPixUpdtedDt(Date pixUpdtedDt) {
		this.pixUpdtedDt = pixUpdtedDt;
	}

	public String getListBrokerage() {
		return listBrokerage;
	}

	public void setListBrokerage(String listBrokerage) {
		this.listBrokerage = listBrokerage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}	
	
	
}
