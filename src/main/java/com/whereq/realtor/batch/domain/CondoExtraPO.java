package com.whereq.realtor.batch.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlElement;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * @author bacon
 *
 */
@Entity
@Table (name = "condo_extra", uniqueConstraints={@UniqueConstraint(columnNames = {"ml_num" })})
public class CondoExtraPO {
	
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

	
	@Column(name = "balcony")
	private String balcony;	


	@Column(name = "bldg_amen1_out")
	private String buildingAmenities1;	
	
	@Column(name = "bldg_amen2_out")
	private String buildingAmenities2;	

	@Column(name = "bldg_amen3_out")
	private String buildingAmenities3;	

	@Column(name = "bldg_amen4_out")
	private String buildingAmenities4;	

	@Column(name = "bldg_amen5_out")
	private String buildingAmenities5;	
	
	@Column(name = "bldg_amen6_out")
	private String buildingAmenities6;	
	
	@Column(name = "insur_bldg")
	private String buildingInsuranceIncluded;
	
	@Column(name = "corp_num")
	private Integer condoCorp;
	
	@Column(name = "condo_corp")
	private String condoRegistryOffice;
	
	@Column(name = "cond_txinc")
	private String condoTaxesIncluded;
	
	
	@Column(name = "share_perc")
	private String sharesPer;
	
	@Column(name = "ens_lndry")
	private String ensuiteLaundry;
	
	@Column(name = "constr1_out")
	private String exterior1;
	
	@Column(name = "constr2_out")
	private String exterior2;
	
	@Column(name = "condo_exp")
	private String exposure;
	
	@Column(name = "locker")
	private String locker;
	
	@Column(name = "locker_num")
	private int lockerNum;	
	
	@Column(name = "locker_level")
	private String lockerLevel;

	@Column(name = "locker_unit")
	private String lockerUnit;

	@Column(name = "park_lgl_desc1" )
	private String parkingLegalDescription;
	
	@Column(name = "park_lgl_desc2" )
	private String parkingLegalDescription2;
	
	@Column(name = "park_spc1" )
	private int parkingSpot1;
	
	@Column(name = "park_spc2" )
	private int parkingSpot2;
	
	@Column(name = "park_desig")
	private String parkingType;
	
	@Column(name = "park_desig_2")
	private String parkingType2;
	
	@Column(name = "park_fac")
	private String parkingDrive;	
	
	@Column(name = "shoreline_allow")
	private String shorelineAllowance;
	
	@Column(name = "shoreline_expo")
	private String shorelineExposure;
	
	@Column(name = "water_bd_name")
	private String waterBodyName;
	
	@Column(name = "water_bd_type" )
	private String waterBodyType;
	
	@Column(name = "WaterFrontage" )
	private String waterFrontage;
	
	
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date")
	private Date createDate;
	
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
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

	public String getBalcony() {
		return balcony;
	}

	public void setBalcony(String balcony) {
		this.balcony = balcony;
	}

	public String getBuildingAmenities1() {
		return buildingAmenities1;
	}

	public void setBuildingAmenities1(String buildingAmenities1) {
		this.buildingAmenities1 = buildingAmenities1;
	}

	public String getBuildingAmenities2() {
		return buildingAmenities2;
	}

	public void setBuildingAmenities2(String buildingAmenities2) {
		this.buildingAmenities2 = buildingAmenities2;
	}

	public String getBuildingAmenities3() {
		return buildingAmenities3;
	}

	public void setBuildingAmenities3(String buildingAmenities3) {
		this.buildingAmenities3 = buildingAmenities3;
	}

	public String getBuildingAmenities4() {
		return buildingAmenities4;
	}

	public void setBuildingAmenities4(String buildingAmenities4) {
		this.buildingAmenities4 = buildingAmenities4;
	}

	public String getBuildingAmenities5() {
		return buildingAmenities5;
	}

	public void setBuildingAmenities5(String buildingAmenities5) {
		this.buildingAmenities5 = buildingAmenities5;
	}
	
	

	public String getBuildingAmenities6() {
		return buildingAmenities6;
	}

	public void setBuildingAmenities6(String buildingAmenities6) {
		this.buildingAmenities6 = buildingAmenities6;
	}

	public String getBuildingInsuranceIncluded() {
		return buildingInsuranceIncluded;
	}

	public void setBuildingInsuranceIncluded(String buildingInsuranceIncluded) {
		this.buildingInsuranceIncluded = buildingInsuranceIncluded;
	}

	public Integer getCondoCorp() {
		return condoCorp;
	}

	public void setCondoCorp(Integer condoCorp) {
		this.condoCorp = condoCorp;
	}

	public String getCondoRegistryOffice() {
		return condoRegistryOffice;
	}

	public void setCondoRegistryOffice(String condoRegistryOffice) {
		this.condoRegistryOffice = condoRegistryOffice;
	}

	public String getCondoTaxesIncluded() {
		return condoTaxesIncluded;
	}

	public void setCondoTaxesIncluded(String condoTaxesIncluded) {
		this.condoTaxesIncluded = condoTaxesIncluded;
	}

	public String getSharesPer() {
		return sharesPer;
	}

	public void setSharesPer(String sharesPer) {
		this.sharesPer = sharesPer;
	}

	public String getEnsuiteLaundry() {
		return ensuiteLaundry;
	}

	public void setEnsuiteLaundry(String ensuiteLaundry) {
		this.ensuiteLaundry = ensuiteLaundry;
	}

	public String getExterior1() {
		return exterior1;
	}

	public void setExterior1(String exterior1) {
		this.exterior1 = exterior1;
	}

	public String getExterior2() {
		return exterior2;
	}

	public void setExterior2(String exterior2) {
		this.exterior2 = exterior2;
	}

	public String getExposure() {
		return exposure;
	}

	public void setExposure(String exposure) {
		this.exposure = exposure;
	}

	public String getLocker() {
		return locker;
	}

	public void setLocker(String locker) {
		this.locker = locker;
	}

	public int getLockerNum() {
		return lockerNum;
	}

	public void setLockerNum(int lockerNum) {
		this.lockerNum = lockerNum;
	}

	public String getLockerLevel() {
		return lockerLevel;
	}

	public void setLockerLevel(String lockerLevel) {
		this.lockerLevel = lockerLevel;
	}

	public String getLockerUnit() {
		return lockerUnit;
	}

	public void setLockerUnit(String lockerUnit) {
		this.lockerUnit = lockerUnit;
	}

	public String getParkingLegalDescription() {
		return parkingLegalDescription;
	}

	public void setParkingLegalDescription(String parkingLegalDescription) {
		this.parkingLegalDescription = parkingLegalDescription;
	}

	public String getParkingLegalDescription2() {
		return parkingLegalDescription2;
	}

	public void setParkingLegalDescription2(String parkingLegalDescription2) {
		this.parkingLegalDescription2 = parkingLegalDescription2;
	}

	public int getParkingSpot1() {
		return parkingSpot1;
	}

	public void setParkingSpot1(int parkingSpot1) {
		this.parkingSpot1 = parkingSpot1;
	}

	public int getParkingSpot2() {
		return parkingSpot2;
	}

	public void setParkingSpot2(int parkingSpot2) {
		this.parkingSpot2 = parkingSpot2;
	}

	public String getParkingType() {
		return parkingType;
	}

	public void setParkingType(String parkingType) {
		this.parkingType = parkingType;
	}

	public String getParkingType2() {
		return parkingType2;
	}

	public void setParkingType2(String parkingType2) {
		this.parkingType2 = parkingType2;
	}

	public String getParkingDrive() {
		return parkingDrive;
	}

	public void setParkingDrive(String parkingDrive) {
		this.parkingDrive = parkingDrive;
	}

	public String getShorelineAllowance() {
		return shorelineAllowance;
	}

	public void setShorelineAllowance(String shorelineAllowance) {
		this.shorelineAllowance = shorelineAllowance;
	}

	public String getShorelineExposure() {
		return shorelineExposure;
	}

	public void setShorelineExposure(String shorelineExposure) {
		this.shorelineExposure = shorelineExposure;
	}

	public String getWaterBodyName() {
		return waterBodyName;
	}

	public void setWaterBodyName(String waterBodyName) {
		this.waterBodyName = waterBodyName;
	}

	public String getWaterBodyType() {
		return waterBodyType;
	}

	public void setWaterBodyType(String waterBodyType) {
		this.waterBodyType = waterBodyType;
	}

	public String getWaterFrontage() {
		return waterFrontage;
	}

	public void setWaterFrontage(String waterFrontage) {
		this.waterFrontage = waterFrontage;
	}

	

}
