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
@Table (name = "property_details")
public class PropertyDetailsPO {
	
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

	@Column(name = "num_kit")
	private int Kitchens;

	@Column(name = "den_fr")
	private String FamilyRoom;
	
	@Column(name = "bsmt1_out")
	private String Basement1;
	
	@Column(name = "bsmt2_out")
	private String Basement2;

	@Column(name = "constr1_out")
	private String Exterior1;

	@Column(name = "constr2_out")
	private String Exterior2;


	@Column(name = "fpl_num")
	private String FireplaceStove;
	
	
	@Column(name = "heating")
	private String HeatType;
	
	@Column(name = "fuel")
	private String HeatSource;


	@Column(name = "a_c")
	private String AirConditioning;
	
	
	@Column(name = "Central_vac")
	private String CentralVac;

	@Column(name = "yr_built")
	private String ApproxAge;


	@Column(name = "sqft")
	private String ApproxSquareFootage;
	
	@Column(name = "tv")
	private int Assessment;
	
	@Column(name = "elevator")
	private String Elevator;
	
	@Column(name = "laundry_lev")
	private String LaundryLevel;


	@Column(name = "drive")
	private String Drive;
	
	
	@Column(name = "gar_type")
	private String GarageType;

	@Column(name = "gar_spaces", columnDefinition="Decimal(10,1)")
	private double GarageSpaces;


	@Column(name = "park_spcs")
	private int ParkingSpaces;
	
	@Column(name = "Pool")
	private String Pool;
	
	@Column(name = "Uffi")
	private String Uffi;
	
	@Column(name = "prop_feat1_out")
	private String PropertyFeatures1;

	@Column(name = "prop_feat2_out")
	private String PropertyFeatures2;

	@Column(name = "prop_feat3_out")
	private String PropertyFeatures3;
	
	@Column(name = "prop_feat4_out")
	private String PropertyFeatures4;
	
	@Column(name = "prop_feat5_out")
	private String PropertyFeatures5;
	
	@Column(name = "prop_feat6_out")
	private String PropertyFeatures6;
	
	
	@Column(name = "Zoning")
	private String Zoning;

	@Column(name = "cable")
	private String CableTVIncluded;

	@Column(name = "hydro_inc")
	private String HydroIncluded;
	
	@Column(name = "util_cable")
	private String UtilitiesCable;	
	
	@Column(name = "util_tel")
	private String UtilitiesTelephone;
	
	@Column(name = "water")
	private String Water;


	@Column(name = "water_inc")
	private String WaterIncluded;
	
	
	@Column(name = "wtr_suptyp")
	private String WaterSupplyTypes;

	@Column(name = "sewer")
	private String Sewers;

	@Column(name = "spec_des1_out")
	private String SpecialDesignation1;
	
	@Column(name = "spec_des2_out")
	private String SpecialDesignation2;
	
	@Column(name = "spec_des3_out")
	private String SpecialDesignation3;
	
	@Column(name = "spec_des4_out")
	private String SpecialDesignation4;
	
	@Column(name = "spec_des5_out")
	private String SpecialDesignation5;
	
	@Column(name = "spec_des6_out")
	private String SpecialDesignation6;
	
	@Column(name = "farm_agri")
	private String FarmAgriculture;	
	
	@Column(name = "Waterfront")
	private String Waterfront;
	
	@Column(name = "etirement")
	private String Retirement;

	@Column(name = "oth_struc1_out")
	private String OtherStructures1;

	@Column(name = "oth_struc2_out")
	private String OtherStructures2;

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

	public int getKitchens() {
		return Kitchens;
	}

	public void setKitchens(int kitchens) {
		Kitchens = kitchens;
	}

	public String getFamilyRoom() {
		return FamilyRoom;
	}

	public void setFamilyRoom(String familyRoom) {
		FamilyRoom = familyRoom;
	}

	public String getExterior1() {
		return Exterior1;
	}

	public void setExterior1(String exterior1) {
		Exterior1 = exterior1;
	}

	public String getExterior2() {
		return Exterior2;
	}

	public void setExterior2(String exterior2) {
		Exterior2 = exterior2;
	}

	public String getFireplaceStove() {
		return FireplaceStove;
	}

	public void setFireplaceStove(String fireplaceStove) {
		FireplaceStove = fireplaceStove;
	}

	public String getHeatType() {
		return HeatType;
	}

	public void setHeatType(String heatType) {
		HeatType = heatType;
	}

	public String getHeatSource() {
		return HeatSource;
	}

	public void setHeatSource(String heatSource) {
		HeatSource = heatSource;
	}

	public String getAirConditioning() {
		return AirConditioning;
	}

	public void setAirConditioning(String airConditioning) {
		AirConditioning = airConditioning;
	}

	public String getCentralVac() {
		return CentralVac;
	}

	public void setCentralVac(String centralVac) {
		CentralVac = centralVac;
	}

	public String getApproxAge() {
		return ApproxAge;
	}

	public void setApproxAge(String approxAge) {
		ApproxAge = approxAge;
	}

	public String getApproxSquareFootage() {
		return ApproxSquareFootage;
	}

	public void setApproxSquareFootage(String approxSquareFootage) {
		ApproxSquareFootage = approxSquareFootage;
	}

	public int getAssessment() {
		return Assessment;
	}

	public void setAssessment(int assessment) {
		Assessment = assessment;
	}

	public String getElevator() {
		return Elevator;
	}

	public void setElevator(String elevator) {
		Elevator = elevator;
	}

	public String getLaundryLevel() {
		return LaundryLevel;
	}

	public void setLaundryLevel(String laundryLevel) {
		LaundryLevel = laundryLevel;
	}

	public String getDrive() {
		return Drive;
	}

	public void setDrive(String drive) {
		Drive = drive;
	}

	public String getGarageType() {
		return GarageType;
	}

	public void setGarageType(String garageType) {
		GarageType = garageType;
	}

	public double getGarageSpaces() {
		return GarageSpaces;
	}

	public void setGarageSpaces(double garageSpaces) {
		GarageSpaces = garageSpaces;
	}

	public int getParkingSpaces() {
		return ParkingSpaces;
	}

	public void setParkingSpaces(int parkingSpaces) {
		ParkingSpaces = parkingSpaces;
	}

	public String getPool() {
		return Pool;
	}

	public void setPool(String pool) {
		Pool = pool;
	}

	public String getUffi() {
		return Uffi;
	}

	public void setUffi(String uffi) {
		Uffi = uffi;
	}

	public String getPropertyFeatures1() {
		return PropertyFeatures1;
	}

	public void setPropertyFeatures1(String propertyFeatures1) {
		PropertyFeatures1 = propertyFeatures1;
	}

	public String getPropertyFeatures2() {
		return PropertyFeatures2;
	}

	public void setPropertyFeatures2(String propertyFeatures2) {
		PropertyFeatures2 = propertyFeatures2;
	}

	
	public String getPropertyFeatures3() {
		return PropertyFeatures3;
	}

	public void setPropertyFeatures3(String propertyFeatures3) {
		PropertyFeatures3 = propertyFeatures3;
	}

	public String getPropertyFeatures4() {
		return PropertyFeatures4;
	}

	public void setPropertyFeatures4(String propertyFeatures4) {
		PropertyFeatures4 = propertyFeatures4;
	}

	public String getPropertyFeatures5() {
		return PropertyFeatures5;
	}

	public void setPropertyFeatures5(String propertyFeatures5) {
		PropertyFeatures5 = propertyFeatures5;
	}

	public String getPropertyFeatures6() {
		return PropertyFeatures6;
	}

	public void setPropertyFeatures6(String propertyFeatures6) {
		PropertyFeatures6 = propertyFeatures6;
	}

	public String getZoning() {
		return Zoning;
	}

	public void setZoning(String zoning) {
		Zoning = zoning;
	}

	public String getCableTVIncluded() {
		return CableTVIncluded;
	}

	public void setCableTVIncluded(String cableTVIncluded) {
		CableTVIncluded = cableTVIncluded;
	}

	public String getHydroIncluded() {
		return HydroIncluded;
	}

	public void setHydroIncluded(String hydroIncluded) {
		HydroIncluded = hydroIncluded;
	}

	public String getUtilitiesCable() {
		return UtilitiesCable;
	}

	public void setUtilitiesCable(String utilitiesCable) {
		UtilitiesCable = utilitiesCable;
	}

	public String getUtilitiesTelephone() {
		return UtilitiesTelephone;
	}

	public void setUtilitiesTelephone(String utilitiesTelephone) {
		UtilitiesTelephone = utilitiesTelephone;
	}

	public String getWater() {
		return Water;
	}

	public void setWater(String water) {
		Water = water;
	}

	public String getWaterIncluded() {
		return WaterIncluded;
	}

	public void setWaterIncluded(String waterIncluded) {
		WaterIncluded = waterIncluded;
	}

	public String getWaterSupplyTypes() {
		return WaterSupplyTypes;
	}

	public void setWaterSupplyTypes(String waterSupplyTypes) {
		WaterSupplyTypes = waterSupplyTypes;
	}

	public String getSewers() {
		return Sewers;
	}

	public void setSewers(String sewers) {
		Sewers = sewers;
	}

	public String getSpecialDesignation1() {
		return SpecialDesignation1;
	}

	public void setSpecialDesignation1(String specialDesignation1) {
		SpecialDesignation1 = specialDesignation1;
	}

	public String getSpecialDesignation2() {
		return SpecialDesignation2;
	}

	public void setSpecialDesignation2(String specialDesignation2) {
		SpecialDesignation2 = specialDesignation2;
	}

	public String getSpecialDesignation3() {
		return SpecialDesignation3;
	}

	public void setSpecialDesignation3(String specialDesignation3) {
		SpecialDesignation3 = specialDesignation3;
	}

	public String getSpecialDesignation4() {
		return SpecialDesignation4;
	}

	public void setSpecialDesignation4(String specialDesignation4) {
		SpecialDesignation4 = specialDesignation4;
	}

	public String getSpecialDesignation5() {
		return SpecialDesignation5;
	}

	public void setSpecialDesignation5(String specialDesignation5) {
		SpecialDesignation5 = specialDesignation5;
	}

	public String getSpecialDesignation6() {
		return SpecialDesignation6;
	}

	public void setSpecialDesignation6(String specialDesignation6) {
		SpecialDesignation6 = specialDesignation6;
	}

	public String getFarmAgriculture() {
		return FarmAgriculture;
	}

	public void setFarmAgriculture(String farmAgriculture) {
		FarmAgriculture = farmAgriculture;
	}

	public String getWaterfront() {
		return Waterfront;
	}

	public void setWaterfront(String waterfront) {
		Waterfront = waterfront;
	}

	public String getRetirement() {
		return Retirement;
	}

	public void setRetirement(String retirement) {
		Retirement = retirement;
	}

	public String getOtherStructures1() {
		return OtherStructures1;
	}

	public void setOtherStructures1(String otherStructures1) {
		OtherStructures1 = otherStructures1;
	}

	public String getOtherStructures2() {
		return OtherStructures2;
	}

	public void setOtherStructures2(String otherStructures2) {
		OtherStructures2 = otherStructures2;
	}

	public String getBasement1() {
		return Basement1;
	}

	public void setBasement1(String basement1) {
		Basement1 = basement1;
	}

	public String getBasement2() {
		return Basement2;
	}

	public void setBasement2(String basement2) {
		Basement2 = basement2;
	}
	

}
