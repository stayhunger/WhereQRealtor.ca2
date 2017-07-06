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
//@Table (name = "address", uniqueConstraints={@UniqueConstraint(columnNames = {"ml_num" })})
@Table (name = "address")
public class ListingAddrPO {
	
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

	@Column(name = "mmap_page")
	private Integer Map;


	@Column(name = "mmap_col")
	private Integer MapColumn;
	

	@Column(name = "mmap_row")
	private String MapRow;


	@Column(name = "st")
	private String StreetName;
	
	@Column(name = "st_dir")
	private String StreetDirection;


	@Column(name = "st_num")
	private String Street;
	

	@Column(name = "st_sfx")
	private String StreetAbbreviation;


	@Column(name = "area_code")
	private String AreaCode;
	
	@Column(name = "municipality_code")
	private String MunicipalityCode;
	
	@Column(name = "community_code")
	private String CommunityCode;
	
	@Column(name = "area")
	private String Area;
	
	@Column(name = "municipality_district")
	private String MunicipalityDistrict;
	
	@Column(name = "municipality")
	private String Municipality;
	
	@Column(name = "community")
	private String Community;	

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



	public Integer getMap() {
		return Map;
	}

	public void setMap(Integer map) {
		Map = map;
	}

	public Integer getMapColumn() {
		return MapColumn;
	}

	public void setMapColumn(Integer mapColumn) {
		MapColumn = mapColumn;
	}

	public String getMapRow() {
		return MapRow;
	}

	public void setMapRow(String mapRow) {
		MapRow = mapRow;
	}

	public String getStreetName() {
		return StreetName;
	}

	public void setStreetName(String streetName) {
		StreetName = streetName;
	}

	public String getStreetDirection() {
		return StreetDirection;
	}

	public void setStreetDirection(String streetDirection) {
		StreetDirection = streetDirection;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getStreetAbbreviation() {
		return StreetAbbreviation;
	}

	public void setStreetAbbreviation(String streetAbbreviation) {
		StreetAbbreviation = streetAbbreviation;
	}

	public String getAreaCode() {
		return AreaCode;
	}

	public void setAreaCode(String areaCode) {
		AreaCode = areaCode;
	}

	public String getMunicipalityCode() {
		return MunicipalityCode;
	}

	public void setMunicipalityCode(String municipalityCode) {
		MunicipalityCode = municipalityCode;
	}

	public String getCommunityCode() {
		return CommunityCode;
	}

	public void setCommunityCode(String communityCode) {
		CommunityCode = communityCode;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getMunicipalityDistrict() {
		return MunicipalityDistrict;
	}

	public void setMunicipalityDistrict(String municipalityDistrict) {
		MunicipalityDistrict = municipalityDistrict;
	}

	public String getMunicipality() {
		return Municipality;
	}

	public void setMunicipality(String municipality) {
		Municipality = municipality;
	}

	public String getCommunity() {
		return Community;
	}

	public void setCommunity(String community) {
		Community = community;
	}
	
	


	

}
