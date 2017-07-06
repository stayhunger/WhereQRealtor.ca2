/*
 * this class listinging covers both freehold and condo properties, 
 * ideally it should separate as one freehold, one condo and one common
 */


package com.whereq.realtor.xml.bind;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.whereq.util.DateAdapter;



@XmlRootElement(name = "Listing")
@XmlAccessorType(XmlAccessType.FIELD)
public class FullListing {
	private Integer id;

	
	//common attributes shared between freehold and condo
	@XmlElement(name = "AirConditioning")
	private String airConditioning;


	@XmlElement(name = "RemarksForClients")
	private String remarksForClients;

	@XmlElement(name = "Address")
	private String address;

	@XmlElement(name = "AptUnit")
	private String aptUnit;
	

	@XmlElement(name = "Washrooms" )
	private int washrooms;

	@XmlElement(name = "Bedrooms" )
	private int bedrooms;
	
	@XmlElement(name = "BedroomsPlus" )
	private int bedroomPlus;
	
	@XmlElement(name = "Basement1")
	private String basement1;
	
	@XmlElement(name = "Basement2")
	private String basement2;
	

	@XmlElement(name = "CableTVIncluded")
	private String cableTVIncluded;
	
	@XmlElement(name = "CacIncluded")
	private String cacIncluded;
	

	
	@XmlElement(name = "Province")
	private String province;
	
	@XmlElement(name = "DirectionsCrossStreets")
	private String directionsCrossStreets;
	
	@XmlElement(name = "FamilyRoom")
	private String familyRoom;
	

	@XmlElement(name = "Drive")
	private String drive;
	
	@XmlElement(name = "UtilitiesHydro")
	private String utilitiesHydro;
	
	@XmlElement(name = "Elevator")
	private String elevator;
	
	@XmlElement(name = "Extras")
	private String extras;
	
	@XmlElement(name = "FireplaceStove")
	private String fireplaceStove;
	

	
	@XmlElement(name = "HeatSource")
	private String heatSource;
	
	@XmlElement(name = "GarageType")
	private String garageType;
	
	@XmlElement(name = "UtilitiesGas")
	private String utilitiesGas;
	
	@XmlElement(name = "HeatIncluded")
	private String heatIncluded;
	
	@XmlElement(name = "HeatType")
	private String heatType;
	
	@XmlElement(name = "HydroIncluded")
	private String hydroIncluded;
	
	@XmlElement(name = "LegalDescription")
	private String legalDescription;
	
	@XmlElement(name = "Level1")
	private String level_1;
	
	@XmlElement(name = "Level2")
	private String level_2;
	
	@XmlElement(name = "Level3")
	private String level_3;
	
	@XmlElement(name = "Level4")
	private String level_4;
	
	@XmlElement(name = "Level5")
	private String level_5;
	
	@XmlElement(name = "Level6")
	private String level_6;
	
	@XmlElement(name = "Level7")
	private String level_7;
	
	@XmlElement(name = "Level8")
	private String level_8;
	
	@XmlElement(name = "Level9")
	private String level_9;
	
	@XmlElement(name = "Level10")
	private String level_10;
	
	@XmlElement(name = "Level11")
	private String level_11;
	
	@XmlElement(name = "Level12")
	private String level_12;	
	

	
	@XmlElement(name = "ListPrice", type = Double.class)
	private double listPrice;
	
	@XmlElement(name = "MLS")
	private String mls;
	
	@XmlElement(name = "Kitchens" )
	private int kitchens;
	
	@XmlElement(name = "OutofAreaMunicipality")
	private String outOfAreaMunicipality;
	
	@XmlElement(name = "ParcelId")
	private String parcelId;
	
	@XmlElement(name = "ParkCostMo", type = Float.class)
	private float parkCostMo;
	
	@XmlElement(name = "ParkingSpaces" )
	private int parkingSpaces;
	
	@XmlElement(name = "Pool")
	private String pool;
	
	@XmlElement(name = "ParkingIncluded" )
	private String parckingIncluded;
	
	@XmlElement(name = "ListBrokerage")
	private String listBrokerage;
	
	@XmlElement(name = "Room1")
	private String room1;
	@XmlElement(name = "Room1Length", type = Float.class)
	private float room1Length;
	@XmlElement(name = "Room1Width", type = Float.class)
	private float room1Width;
	@XmlElement(name = "Room1Desc1")
	private String room1Desc1;
	@XmlElement(name = "Room1Desc2")
	private String room1Desc2;
	@XmlElement(name = "Room1Desc3")
	private String room1Desc3;
	
	@XmlElement(name = "Room2")
	private String room2;
	@XmlElement(name = "Room2Length", type = Float.class)
	private float room2Length;
	@XmlElement(name = "Room2Width", type = Float.class)
	private float room2Width;
	@XmlElement(name = "Room2Desc1")
	private String room2Desc1;
	@XmlElement(name = "Room2Desc2")
	private String room2Desc2;
	@XmlElement(name = "Room2Desc3")
	private String room2Desc3;

	@XmlElement(name = "Room3")
	private String room3;
	@XmlElement(name = "Room3Length", type = Float.class)
	private float room3Length;
	@XmlElement(name = "Room3Width", type = Float.class)
	private float room3Width;
	@XmlElement(name = "Room3Desc1")
	private String room3Desc1;
	@XmlElement(name = "Room3Desc2")
	private String room3Desc2;
	@XmlElement(name = "Room3Desc3")
	private String room3Desc3;

	@XmlElement(name = "Room4")
	private String room4;
	@XmlElement(name = "Room4Length", type = Float.class)
	private float room4Length;
	@XmlElement(name = "Room4Width", type = Float.class)
	private float room4Width;
	@XmlElement(name = "Room4Desc1")
	private String room4Desc1;
	@XmlElement(name = "Room4Desc2")
	private String room4Desc2;
	@XmlElement(name = "Room4Desc3")
	private String room4Desc3;

	@XmlElement(name = "Room5")
	private String room5;
	@XmlElement(name = "Room5Length", type = Float.class)
	private float room5Length;
	@XmlElement(name = "Room5Width", type = Float.class)
	private float room5Width;
	@XmlElement(name = "Room5Desc1")
	private String room5Desc1;
	@XmlElement(name = "Room5Desc2")
	private String room5Desc2;
	@XmlElement(name = "Room5Desc3")
	private String room5Desc3;

	@XmlElement(name = "Room6")
	private String room6;
	@XmlElement(name = "Room6Length", type = Float.class)
	private float room6Length;
	@XmlElement(name = "Room6Width", type = Float.class)
	private float room6Width;
	@XmlElement(name = "Room6Desc1")
	private String room6Desc1;
	@XmlElement(name = "Room6Desc2")
	private String room6Desc2;
	@XmlElement(name = "Room6Desc3")
	private String room6Desc3;

	@XmlElement(name = "Room7")
	private String room7;
	@XmlElement(name = "Room7Length", type = Float.class)
	private float room7Length;
	@XmlElement(name = "Room7Width", type = Float.class)
	private float room7Width;
	@XmlElement(name = "Room7Desc1")
	private String room7Desc1;
	@XmlElement(name = "Room7Desc2")
	private String room7Desc2;
	@XmlElement(name = "Room7Desc3")
	private String room7Desc3;

	@XmlElement(name = "Room8")
	private String room8;
	@XmlElement(name = "Room8Length", type = Float.class)
	private float room8Length;
	@XmlElement(name = "Room8Width", type = Float.class)
	private float room8Width;
	@XmlElement(name = "Room8Desc1")
	private String room8Desc1;
	@XmlElement(name = "Room8Desc2")
	private String room8Desc2;
	@XmlElement(name = "Room8Desc3")
	private String room8Desc3;

	@XmlElement(name = "Room9")
	private String room9;
	@XmlElement(name = "Room9Length", type = Float.class)
	private float room9Length;
	@XmlElement(name = "Room9Width", type = Float.class)
	private float room9Width;
	@XmlElement(name = "Room9Desc1")
	private String room9Desc1;
	@XmlElement(name = "Room9Desc2")
	private String room9Desc2;
	@XmlElement(name = "Room9Desc3")
	private String room9Desc3;

	@XmlElement(name = "Room10")
	private String room10;
	@XmlElement(name = "Room10Length", type = Float.class)
	private float room10Length;
	@XmlElement(name = "Room10Width", type = Float.class)
	private float room10Width;
	@XmlElement(name = "Room10Desc1")
	private String room10Desc1;
	@XmlElement(name = "Room10Desc2")
	private String room10Desc2;
	@XmlElement(name = "Room10Desc3")
	private String room10Desc3;

	@XmlElement(name = "Room11")
	private String room11;
	@XmlElement(name = "Room11Length", type = Float.class)
	private float room11Length;
	@XmlElement(name = "Room11Width", type = Float.class)
	private float room11Width;
	@XmlElement(name = "Room11Desc1")
	private String room11Desc1;
	@XmlElement(name = "Room11Desc2")
	private String room11Desc2;
	@XmlElement(name = "Room11Desc3")
	private String room11Desc3;

	@XmlElement(name = "Room12")
	private String room12;
	@XmlElement(name = "Room12Length", type = Float.class)
	private float room12Length;
	@XmlElement(name = "Room12Width", type = Float.class)
	private float room12Width;
	@XmlElement(name = "Room12Desc1")
	private String room12Desc1;
	@XmlElement(name = "Room12Desc2")
	private String room12Desc2;
	@XmlElement(name = "Room12Desc3")
	private String room12Desc3;

	@XmlElement(name = "RoomsPlus")
	private int roomsPlus;
	
	@XmlElement(name = "Rooms")
	private int rooms;
	
	@XmlElement(name = "SaleLease")
	private String saleLease;
	
	@XmlElement(name = "Sewers")
	private String sewers;
	
	@XmlElement(name = "ApproxSquareFootage")
	private String approxSquareFootage;
	
	@XmlElement(name = "StreetName")
	private String streetName;
	
	@XmlElement(name = "StreetDirection")
	private String streetDirection;
		
	@XmlElement(name = "Street")
	private String street;
	
	@XmlElement(name = "StreetAbbreviation")
	private String streetAbbreviation;
	
	@XmlElement(name = "Status")
	private String status;
	
	@XmlElement(name = "Style")
	private String style;
	
	@XmlElement(name = "Taxes", type = Double.class)
	private double taxes;
	
	@XmlElement(name = "VirtualTourURL")
	private String virtualTourURL;
	
	@XmlElement(name = "Assessment")
	private int assessment;
	
	@XmlElement(name = "Uffi")
	private String uffi;
	
	@XmlElement(name = "UtilitiesCable" )
	private String utilitiesCable;
	
	@XmlElement(name = "UtilitiesTelephone" )
	private String utilitiesTelephone;
	
	@XmlElement(name = "SellerPropertyInfoStatement")
	private String sellerPropertyInfoStatement;
	
	@XmlElement(name = "Water")
	private String water;
	
	@XmlElement(name = "WaterIncluded" )
	private String waterIncluded;
	
	@XmlElement(name = "WashroomsType1")
	private int washroomsType1;
	@XmlElement(name = "WashroomsType1Pcs")
	private int washroomsType1Pcs;
	@XmlElement(name = "WashroomsType1Level")
	private String washroomsType1Level;
	
	@XmlElement(name = "WashroomsType2" )
	private int washroomsType2;
	@XmlElement(name = "WashroomsType2Pcs" )
	private int washroomsType2Pcs;
	@XmlElement(name = "WashroomsType2Level")
	private String washroomsType2Level;
	
	@XmlElement(name = "WashroomsType3" )
	private int washroomsType3;
	@XmlElement(name = "WashroomsType3Pcs" )
	private int washroomsType3Pcs;
	@XmlElement(name = "WashroomsType3Level")
	private String washroomsType3Level;
	
	@XmlElement(name = "WashroomsType4" )
	private int washroomsType4;
	@XmlElement(name = "WashroomsType4Pcs" )
	private int washroomsType4Pcs;
	@XmlElement(name = "WashroomsType4Level")
	private String washroomsType4Level;
	
	@XmlElement(name = "WashroomsType5" )
	private int washroomsType5;
	@XmlElement(name = "WashroomsType5Pcs" )
	private int washroomsType5Pcs;
	@XmlElement(name = "WashroomsType5Level")
	private int washroomsType5Level;
	
	@XmlElement(name = "WaterSupplyTypes")
	private String waterSupplyTypes;
	
	@XmlElement(name = "TaxYear" )
	private int taxYear;
	
	@XmlElement(name = "ApproxAge")
	private String approxAge;
	
	@XmlElement(name = "PostalCode")
	private String postalCode;
	
	@XmlElement(name = "Zoning")
	private String zoning;
	
	@XmlElement(name = "TypeOwnSrch")
	private String typeOwnSreach;
	
	@XmlElement(name = "TypeOwn1Out")
	private String typeOwn1out;
	
	@XmlElement(name = "Exterior1")
	private String exterior1;
	
	@XmlElement(name = "Exterior2")
	private String exterior2;
	
	@XmlElement(name = "PropertyFeatures1")
	private String propertyFeatures1;
	
	@XmlElement(name = "PropertyFeatures2")
	private String propertyFeatures2;
	
	@XmlElement(name = "OtherStructures1")
	private String otherStructures1;
	
	@XmlElement(name = "OtherStructures2")
	private String otherStructures2;
	
	@XmlElement(name = "AssessmentYear" )
	private int assessmentYear;
	
	@XmlElement(name = "GarageSpaces" )
	private double garageSpaces;
	
	@XmlElement(name = "LeasedTerms")
	private String leasedTerms;
	
	@XmlElement(name = "VirtualTourUploadDate")
	private String virtualTourUploadDate;
	
	@XmlElement(name = "DisplayAddressOnInternet" )
	private String displayAddressOnInternet;
	
	@XmlElement(name = "Map" )
	private int map;
	
	@XmlElement(name = "MapColumn" )
	private int mapColumn;
	
	@XmlElement(name = "MapRow")
	private String mapRow;
	
	@XmlElement(name = "AllInclusive" )
	private String allInclusive;
	
	@XmlElement(name = "Furnished")
	private String furnished;
	
	@XmlElement(name = "LaundryAccess")
	private String laundryAccess;
	
	@XmlElement(name = "PrivateEntrance" )
	private String privateEntrance;
	
	@XmlElement(name = "AddlMonthlyFees", type = Long.class)
	private long addlMonthlyFees;
	
	@XmlElement(name = "CentralVac" )
	private String centralVac;
	
	@XmlElement(name = "KitchensPlus" )
	private int kitchensPlus;
	
	@XmlElement(name = "LaundryLevel")
	private String laundryLevel;
	
	@XmlElement(name = "PropertyFeatures3")
	private String propertyFeatures3;
	
	@XmlElement(name = "PropertyFeatures4")
	private String propertyFeatures4;
	
	@XmlElement(name = "PropertyFeatures5")
	private String propertyFeatures5;
	
	@XmlElement(name = "PropertyFeatures6")
	private String propertyFeatures6;
	
	@XmlElement(name = "Retirement" )
	private String retirement;
	
	@XmlElement(name = "Waterfront")
	private String waterfront;
	
	@XmlElement(name = "SpecialDesignation1")
	private String specialDesignation1;
	
	@XmlElement(name = "SpecialDesignation2")
	private String specialDesignation2;
	
	@XmlElement(name = "SpecialDesignation3")
	private String specialDesignation3;
	
	@XmlElement(name = "SpecialDesignation4")
	private String specialDesignation4;
	
	@XmlElement(name = "SpecialDesignation5")
	private String specialDesignation5;
	
	@XmlElement(name = "SpecialDesignation6")
	private String specialDesignation6;
	
	@XmlElement(name = "TimestampSql")
	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date timestampSql;
	
	@XmlElement(name = "AreaCode")
	private String areaCode;
	
	@XmlElement(name = "MunicipalityCode")
	private String municipalityCode;
	
	@XmlElement(name = "CommunityCode")
	private String communityCode;
	
	@XmlElement(name = "MunicipalityDistrict")
	private String municipalityDistrict;
	
	@XmlElement(name = "Area")
	private String area;
	
	@XmlElement(name = "Municipality")
	private String municipality;
	
	@XmlElement(name = "Community")
	private String community;
	
	@XmlElement(name = "IdxUpdtedDt")
	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date idxUpdatedDate;
	
	@XmlElement(name = "PixUpdtedDt")
	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date pixUpdatedDate;
	

	
	
	//freehold residential specific attributes
	@XmlElement(name = "Acreage")
	private String acreage;

	@XmlElement(name = "FrontingOnNSEW")
	private String fontingOnNSEW;

	@XmlElement(name = "LotDepth")
	private double lotDepth;
	
	@XmlElement(name = "LotFront")
	private double lotFront;
	
	@XmlElement(name = "LotIrregularities")
	private String lotIrregularities;

	@XmlElement(name = "FarmAgriculture")
	private String farmAgriculture;
	
	@XmlElement(name = "LotSizeCode")
	private String lotSizeCode;
	
	
	
	
	//Condo Specific attributes
	@XmlElement(name = "SharesPer")
	private String sharesPer;
	
	@XmlElement(name = "Balcony")
	private String balcony;
	
	@XmlElement(name = "BuildingInsuranceIncluded" )
	private String buildingInsuranceIncluded;
	
	@XmlElement(name = "BuildingAmenities1" )
	private String buildingAmenities1;
	
	@XmlElement(name = "BuildingAmenities2" )
	private String buildingAmenities2;
	

	@XmlElement(name = "BuildingAmenities3" )
	private String buildingAmenities3;
	
	@XmlElement(name = "BuildingAmenities4" )
	private String buildingAmenities4;
	
	@XmlElement(name = "BuildingAmenities5" )
	private String buildingAmenities5;

	@XmlElement(name = "BuildingAmenities6" )
	private String buildingAmenities6;
	
	@XmlElement(name = "CommonElementsIncluded")
	private String commonElementsIncluded;

	@XmlElement(name = "CondoCorp")
	private int condoCorp;
	
	@XmlElement(name = "CondoRegistryOffice")
	private String condoRegistryOffice;
	
	@XmlElement(name = "CondoTaxesIncluded")
	private String condoTaxesIncluded;
	
	@XmlElement(name = "EnsuiteLaundry")
	private String ensuiteLaundry;
	
	@XmlElement(name = "Exposure")
	private String exposure;
	
	@XmlElement(name = "Locker")
	private String locker;
	
	@XmlElement(name = "LockerNum")
	private int lockerNum;	
	
	@XmlElement(name = "LockerLevel")
	private String lockerLevel;

	@XmlElement(name = "LockerUnit")
	private String lockerUnit;

	@XmlElement(name = "ParkingLegalDescription" )
	private String parkingLegalDescription;
	
	@XmlElement(name = "ParkingLegalDescription2" )
	private String parkingLegalDescription2;
	
	@XmlElement(name = "ParkingSpot1" )
	private int parkingSpot1;
	
	@XmlElement(name = "ParkingSpot2" )
	private int parkingSpot2;
	
	@XmlElement(name = "ParkingType")
	private String parkingType;
	
	@XmlElement(name = "ParkingType2")
	private String parkingType2;
	
	@XmlElement(name = "ParkingDrive")
	private String parkingDrive;	
	
	@XmlElement(name = "ShorelineAllowance")
	private String ShorelineAllowance;
	
	@XmlElement(name = "ShorelineExposure")
	private String ShorelineExposure;
	
	@XmlElement(name = "WaterBodyName")
	private String waterBodyName;
	
	@XmlElement(name = "WaterBodyType" )
	private String waterBodyType;
	
	@XmlElement(name = "WaterFrontage" )
	private String waterFrontage;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAirConditioning() {
		return airConditioning;
	}

	public void setAirConditioning(String airConditioning) {
		this.airConditioning = airConditioning;
	}

	public String getAcreage() {
		return acreage;
	}

	public void setAcreage(String acreage) {
		this.acreage = acreage;
	}

	public String getRemarksForClients() {
		return remarksForClients;
	}

	public void setRemarksForClients(String remarksForClients) {
		this.remarksForClients = remarksForClients;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAptUnit() {
		return aptUnit;
	}

	public void setAptUnit(String aptUnit) {
		this.aptUnit = aptUnit;
	}

	public int getWashrooms() {
		return washrooms;
	}

	public void setWashrooms(int washRooms) {
		this.washrooms = washRooms;
	}


	public int getBedroomPlus() {
		return bedroomPlus;
	}

	public int getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(int beddrooms) {
		this.bedrooms = beddrooms;
	}

	public void setRoomsPlus(Integer roomsPlus) {
		this.roomsPlus = roomsPlus;
	}

	public void setBedroomPlus(int bedroomPlus) {
		this.bedroomPlus = bedroomPlus;
	}

	public String getBasement1() {
		return basement1;
	}

	public void setBasement1(String basement1) {
		this.basement1 = basement1;
	}

	public String getBasement2() {
		return basement2;
	}

	public void setBasement2(String basement2) {
		this.basement2 = basement2;
	}

	public String getCableTVIncluded() {
		return cableTVIncluded;
	}

	public void setCableTVIncluded(String cableTVIncluded) {
		this.cableTVIncluded = cableTVIncluded;
	}

	public String getCacIncluded() {
		return cacIncluded;
	}

	public void setCacIncluded(String cacIncluded) {
		this.cacIncluded = cacIncluded;
	}

	public String getCommonElementsIncluded() {
		return commonElementsIncluded;
	}

	public void setCommonElementsIncluded(String commonElementsIncluded) {
		this.commonElementsIncluded = commonElementsIncluded;
	}

	public String getFontingOnNSEW() {
		return fontingOnNSEW;
	}

	public void setFontingOnNSEW(String fontingOnNSEW) {
		this.fontingOnNSEW = fontingOnNSEW;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getDirectionsCrossStreets() {
		return directionsCrossStreets;
	}

	public void setDirectionsCrossStreets(String directionsCrossStreets) {
		this.directionsCrossStreets = directionsCrossStreets;
	}

	public String getFamilyRoom() {
		return familyRoom;
	}

	public void setFamilyRoom(String familyRoom) {
		this.familyRoom = familyRoom;
	}

	public double getLotDepth() {
		return lotDepth;
	}

	public void setLotDepth(double lotDepth) {
		this.lotDepth = lotDepth;
	}

	public String getDrive() {
		return drive;
	}

	public void setDrive(String drive) {
		this.drive = drive;
	}

	public String getUtilitiesHydro() {
		return utilitiesHydro;
	}

	public void setUtilitiesHydro(String utilitiesHydro) {
		this.utilitiesHydro = utilitiesHydro;
	}

	public String getElevator() {
		return elevator;
	}

	public void setElevator(String elevator) {
		this.elevator = elevator;
	}

	public String getExtras() {
		return extras;
	}

	public void setExtras(String extras) {
		this.extras = extras;
	}

	public String getFarmAgriculture() {
		return farmAgriculture;
	}

	public void setFarmAgriculture(String farmAgriculture) {
		this.farmAgriculture = farmAgriculture;
	}

	public String getFireplaceStove() {
		return fireplaceStove;
	}

	public void setFireplaceStove(String fireplaceStove) {
		this.fireplaceStove = fireplaceStove;
	}

	public double getLotFront() {
		return lotFront;
	}

	public void setLotFront(double lotFront) {
		this.lotFront = lotFront;
	}

	public String getHeatSource() {
		return heatSource;
	}

	public void setHeatSource(String heatSource) {
		this.heatSource = heatSource;
	}

	public String getGarageType() {
		return garageType;
	}

	public void setGarageType(String garageType) {
		this.garageType = garageType;
	}

	public String getUtilitiesGas() {
		return utilitiesGas;
	}

	public void setUtilitiesGas(String utilitiesGas) {
		this.utilitiesGas = utilitiesGas;
	}

	public String getHeatIncluded() {
		return heatIncluded;
	}

	public void setHeatIncluded(String heatIncluded) {
		this.heatIncluded = heatIncluded;
	}

	public String getHeatType() {
		return heatType;
	}

	public void setHeatType(String heatType) {
		this.heatType = heatType;
	}

	public String getHydroIncluded() {
		return hydroIncluded;
	}

	public void setHydroIncluded(String hydroIncluded) {
		this.hydroIncluded = hydroIncluded;
	}

	public String getLotIrregularities() {
		return lotIrregularities;
	}

	public void setLotIrregularities(String lotIrregularities) {
		this.lotIrregularities = lotIrregularities;
	}

	public String getLegalDescription() {
		return legalDescription;
	}

	public void setLegalDescription(String legalDescription) {
		this.legalDescription = legalDescription;
	}

	public String getLevel_1() {
		return level_1;
	}

	public void setLevel_1(String level_1) {
		this.level_1 = level_1;
	}

	public String getLevel_2() {
		return level_2;
	}

	public void setLevel_2(String level_2) {
		this.level_2 = level_2;
	}

	public String getLevel_3() {
		return level_3;
	}

	public void setLevel_3(String level_3) {
		this.level_3 = level_3;
	}

	public String getLevel_4() {
		return level_4;
	}

	public void setLevel_4(String level_4) {
		this.level_4 = level_4;
	}

	public String getLevel_5() {
		return level_5;
	}

	public void setLevel_5(String level_5) {
		this.level_5 = level_5;
	}

	public String getLevel_6() {
		return level_6;
	}

	public void setLevel_6(String level_6) {
		this.level_6 = level_6;
	}

	public String getLevel_7() {
		return level_7;
	}

	public void setLevel_7(String level_7) {
		this.level_7 = level_7;
	}

	public String getLevel_8() {
		return level_8;
	}

	public void setLevel_8(String level_8) {
		this.level_8 = level_8;
	}

	public String getLevel_9() {
		return level_9;
	}

	public void setLevel_9(String level_9) {
		this.level_9 = level_9;
	}

	public String getLevel_10() {
		return level_10;
	}

	public void setLevel_10(String level_10) {
		this.level_10 = level_10;
	}

	public String getLevel_11() {
		return level_11;
	}

	public void setLevel_11(String level_11) {
		this.level_11 = level_11;
	}

	public String getLevel_12() {
		return level_12;
	}

	public void setLevel_12(String level_12) {
		this.level_12 = level_12;
	}

	public String getLotSizeCode() {
		return lotSizeCode;
	}

	public void setLotSizeCode(String lotSizeCode) {
		this.lotSizeCode = lotSizeCode;
	}

	public double getListPrice() {
		return listPrice;
	}

	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	public String getMls() {
		return mls;
	}

	public void setMls(String mls) {
		this.mls = mls;
	}

	public int getKitchens() {
		return kitchens;
	}

	public void setKitchens(int kitchens) {
		this.kitchens = kitchens;
	}

	public String getOutOfAreaMunicipality() {
		return outOfAreaMunicipality;
	}

	public void setOutOfAreaMunicipality(String outOfAreaMunicipality) {
		this.outOfAreaMunicipality = outOfAreaMunicipality;
	}

	public String getParcelId() {
		return parcelId;
	}

	public void setParcelId(String parcelId) {
		this.parcelId = parcelId;
	}

	public float getParkCostMo() {
		return parkCostMo;
	}

	public void setParkCostMo(float parkCostMo) {
		this.parkCostMo = parkCostMo;
	}

	public int getParkingSpaces() {
		return parkingSpaces;
	}

	public void setParkingSpaces(int parkingSpaces) {
		this.parkingSpaces = parkingSpaces;
	}

	public String getPool() {
		return pool;
	}

	public void setPool(String pool) {
		this.pool = pool;
	}

	public String getParckingIncluded() {
		return parckingIncluded;
	}

	public void setParckingIncluded(String parckingIncluded) {
		this.parckingIncluded = parckingIncluded;
	}

	public String getListBrokerage() {
		return listBrokerage;
	}

	public void setListBrokerage(String listBrokerage) {
		this.listBrokerage = listBrokerage;
	}

	public String getRoom1() {
		return room1;
	}

	public void setRoom1(String room1) {
		this.room1 = room1;
	}

	public float getRoom1Length() {
		return room1Length;
	}

	public void setRoom1Length(float room1Length) {
		this.room1Length = room1Length;
	}

	public float getRoom1Width() {
		return room1Width;
	}

	public void setRoom1Width(float room1Width) {
		this.room1Width = room1Width;
	}

	public String getRoom1Desc1() {
		return room1Desc1;
	}

	public void setRoom1Desc1(String room1Desc1) {
		this.room1Desc1 = room1Desc1;
	}

	public String getRoom1Desc2() {
		return room1Desc2;
	}

	public void setRoom1Desc2(String room1Desc2) {
		this.room1Desc2 = room1Desc2;
	}

	public String getRoom1Desc3() {
		return room1Desc3;
	}

	public void setRoom1Desc3(String room1Desc3) {
		this.room1Desc3 = room1Desc3;
	}

	public String getRoom2() {
		return room2;
	}

	public void setRoom2(String room2) {
		this.room2 = room2;
	}

	public float getRoom2Length() {
		return room2Length;
	}

	public void setRoom2Length(float room2Length) {
		this.room2Length = room2Length;
	}

	public float getRoom2Width() {
		return room2Width;
	}

	public void setRoom2Width(float room2Width) {
		this.room2Width = room2Width;
	}

	public String getRoom2Desc1() {
		return room2Desc1;
	}

	public void setRoom2Desc1(String room2Desc1) {
		this.room2Desc1 = room2Desc1;
	}

	public String getRoom2Desc2() {
		return room2Desc2;
	}

	public void setRoom2Desc2(String room2Desc2) {
		this.room2Desc2 = room2Desc2;
	}

	public String getRoom2Desc3() {
		return room2Desc3;
	}

	public void setRoom2Desc3(String room2Desc3) {
		this.room2Desc3 = room2Desc3;
	}

	public String getRoom3() {
		return room3;
	}

	public void setRoom3(String room3) {
		this.room3 = room3;
	}

	public float getRoom3Length() {
		return room3Length;
	}

	public void setRoom3Length(float room3Length) {
		this.room3Length = room3Length;
	}

	public float getRoom3Width() {
		return room3Width;
	}

	public void setRoom3Width(float room3Width) {
		this.room3Width = room3Width;
	}

	public String getRoom3Desc1() {
		return room3Desc1;
	}

	public void setRoom3Desc1(String room3Desc1) {
		this.room3Desc1 = room3Desc1;
	}

	public String getRoom3Desc2() {
		return room3Desc2;
	}

	public void setRoom3Desc2(String room3Desc2) {
		this.room3Desc2 = room3Desc2;
	}

	public String getRoom3Desc3() {
		return room3Desc3;
	}

	public void setRoom3Desc3(String room3Desc3) {
		this.room3Desc3 = room3Desc3;
	}

	public String getRoom4() {
		return room4;
	}

	public void setRoom4(String room4) {
		this.room4 = room4;
	}

	public float getRoom4Length() {
		return room4Length;
	}

	public void setRoom4Length(float room4Length) {
		this.room4Length = room4Length;
	}

	public float getRoom4Width() {
		return room4Width;
	}

	public void setRoom4Width(float room4Width) {
		this.room4Width = room4Width;
	}

	public String getRoom4Desc1() {
		return room4Desc1;
	}

	public void setRoom4Desc1(String room4Desc1) {
		this.room4Desc1 = room4Desc1;
	}

	public String getRoom4Desc2() {
		return room4Desc2;
	}

	public void setRoom4Desc2(String room4Desc2) {
		this.room4Desc2 = room4Desc2;
	}

	public String getRoom4Desc3() {
		return room4Desc3;
	}

	public void setRoom4Desc3(String room4Desc3) {
		this.room4Desc3 = room4Desc3;
	}

	public String getRoom5() {
		return room5;
	}

	public void setRoom5(String room5) {
		this.room5 = room5;
	}

	public float getRoom5Length() {
		return room5Length;
	}

	public void setRoom5Length(float room5Length) {
		this.room5Length = room5Length;
	}

	public float getRoom5Width() {
		return room5Width;
	}

	public void setRoom5Width(float room5Width) {
		this.room5Width = room5Width;
	}

	public String getRoom5Desc1() {
		return room5Desc1;
	}

	public void setRoom5Desc1(String room5Desc1) {
		this.room5Desc1 = room5Desc1;
	}

	public String getRoom5Desc2() {
		return room5Desc2;
	}

	public void setRoom5Desc2(String room5Desc2) {
		this.room5Desc2 = room5Desc2;
	}

	public String getRoom5Desc3() {
		return room5Desc3;
	}

	public void setRoom5Desc3(String room5Desc3) {
		this.room5Desc3 = room5Desc3;
	}

	public String getRoom6() {
		return room6;
	}

	public void setRoom6(String room6) {
		this.room6 = room6;
	}

	public float getRoom6Length() {
		return room6Length;
	}

	public void setRoom6Length(float room6Length) {
		this.room6Length = room6Length;
	}

	public float getRoom6Width() {
		return room6Width;
	}

	public void setRoom6Width(float room6Width) {
		this.room6Width = room6Width;
	}

	public String getRoom6Desc1() {
		return room6Desc1;
	}

	public void setRoom6Desc1(String room6Desc1) {
		this.room6Desc1 = room6Desc1;
	}

	public String getRoom6Desc2() {
		return room6Desc2;
	}

	public void setRoom6Desc2(String room6Desc2) {
		this.room6Desc2 = room6Desc2;
	}

	public String getRoom6Desc3() {
		return room6Desc3;
	}

	public void setRoom6Desc3(String room6Desc3) {
		this.room6Desc3 = room6Desc3;
	}

	public String getRoom7() {
		return room7;
	}

	public void setRoom7(String room7) {
		this.room7 = room7;
	}

	public float getRoom7Length() {
		return room7Length;
	}

	public void setRoom7Length(float room7Length) {
		this.room7Length = room7Length;
	}

	public float getRoom7Width() {
		return room7Width;
	}

	public void setRoom7Width(float room7Width) {
		this.room7Width = room7Width;
	}

	public String getRoom7Desc1() {
		return room7Desc1;
	}

	public void setRoom7Desc1(String room7Desc1) {
		this.room7Desc1 = room7Desc1;
	}

	public String getRoom7Desc2() {
		return room7Desc2;
	}

	public void setRoom7Desc2(String room7Desc2) {
		this.room7Desc2 = room7Desc2;
	}

	public String getRoom7Desc3() {
		return room7Desc3;
	}

	public void setRoom7Desc3(String room7Desc3) {
		this.room7Desc3 = room7Desc3;
	}

	public String getRoom8() {
		return room8;
	}

	public void setRoom8(String room8) {
		this.room8 = room8;
	}

	public float getRoom8Length() {
		return room8Length;
	}

	public void setRoom8Length(float room8Length) {
		this.room8Length = room8Length;
	}

	public float getRoom8Width() {
		return room8Width;
	}

	public void setRoom8Width(float room8Width) {
		this.room8Width = room8Width;
	}

	public String getRoom8Desc1() {
		return room8Desc1;
	}

	public void setRoom8Desc1(String room8Desc1) {
		this.room8Desc1 = room8Desc1;
	}

	public String getRoom8Desc2() {
		return room8Desc2;
	}

	public void setRoom8Desc2(String room8Desc2) {
		this.room8Desc2 = room8Desc2;
	}

	public String getRoom8Desc3() {
		return room8Desc3;
	}

	public void setRoom8Desc3(String room8Desc3) {
		this.room8Desc3 = room8Desc3;
	}

	public String getRoom9() {
		return room9;
	}

	public void setRoom9(String room9) {
		this.room9 = room9;
	}

	public float getRoom9Length() {
		return room9Length;
	}

	public void setRoom9Length(float room9Length) {
		this.room9Length = room9Length;
	}

	public float getRoom9Width() {
		return room9Width;
	}

	public void setRoom9Width(float room9Width) {
		this.room9Width = room9Width;
	}

	public String getRoom9Desc1() {
		return room9Desc1;
	}

	public void setRoom9Desc1(String room9Desc1) {
		this.room9Desc1 = room9Desc1;
	}

	public String getRoom9Desc2() {
		return room9Desc2;
	}

	public void setRoom9Desc2(String room9Desc2) {
		this.room9Desc2 = room9Desc2;
	}

	public String getRoom9Desc3() {
		return room9Desc3;
	}

	public void setRoom9Desc3(String room9Desc3) {
		this.room9Desc3 = room9Desc3;
	}

	public String getRoom10() {
		return room10;
	}

	public void setRoom10(String room10) {
		this.room10 = room10;
	}

	public float getRoom10Length() {
		return room10Length;
	}

	public void setRoom10Length(float room10Length) {
		this.room10Length = room10Length;
	}

	public float getRoom10Width() {
		return room10Width;
	}

	public void setRoom10Width(float room10Width) {
		this.room10Width = room10Width;
	}

	public String getRoom10Desc1() {
		return room10Desc1;
	}

	public void setRoom10Desc1(String room10Desc1) {
		this.room10Desc1 = room10Desc1;
	}

	public String getRoom10Desc2() {
		return room10Desc2;
	}

	public void setRoom10Desc2(String room10Desc2) {
		this.room10Desc2 = room10Desc2;
	}

	public String getRoom10Desc3() {
		return room10Desc3;
	}

	public void setRoom10Desc3(String room10Desc3) {
		this.room10Desc3 = room10Desc3;
	}

	public String getRoom11() {
		return room11;
	}

	public void setRoom11(String room11) {
		this.room11 = room11;
	}

	public float getRoom11Length() {
		return room11Length;
	}

	public void setRoom11Length(float room11Length) {
		this.room11Length = room11Length;
	}

	public float getRoom11Width() {
		return room11Width;
	}

	public void setRoom11Width(float room11Width) {
		this.room11Width = room11Width;
	}

	public String getRoom11Desc1() {
		return room11Desc1;
	}

	public void setRoom11Desc1(String room11Desc1) {
		this.room11Desc1 = room11Desc1;
	}

	public String getRoom11Desc2() {
		return room11Desc2;
	}

	public void setRoom11Desc2(String room11Desc2) {
		this.room11Desc2 = room11Desc2;
	}

	public String getRoom11Desc3() {
		return room11Desc3;
	}

	public void setRoom11Desc3(String room11Desc3) {
		this.room11Desc3 = room11Desc3;
	}

	public String getRoom12() {
		return room12;
	}

	public void setRoom12(String room12) {
		this.room12 = room12;
	}

	public float getRoom12Length() {
		return room12Length;
	}

	public void setRoom12Length(float room12Length) {
		this.room12Length = room12Length;
	}

	public float getRoom12Width() {
		return room12Width;
	}

	public void setRoom12Width(float room12Width) {
		this.room12Width = room12Width;
	}

	public String getRoom12Desc1() {
		return room12Desc1;
	}

	public void setRoom12Desc1(String room12Desc1) {
		this.room12Desc1 = room12Desc1;
	}

	public String getRoom12Desc2() {
		return room12Desc2;
	}

	public void setRoom12Desc2(String room12Desc2) {
		this.room12Desc2 = room12Desc2;
	}

	public String getRoom12Desc3() {
		return room12Desc3;
	}

	public void setRoom12Desc3(String room12Desc3) {
		this.room12Desc3 = room12Desc3;
	}

	public int getRoomsPlus() {
		return roomsPlus;
	}

	public void setRoomsPlus(int roomsPlus) {
		this.roomsPlus = roomsPlus;
	}

	public String getSaleLease() {
		return saleLease;
	}

	public void setSaleLease(String saleLease) {
		this.saleLease = saleLease;
	}

	public String getSewers() {
		return sewers;
	}

	public void setSewers(String sewers) {
		this.sewers = sewers;
	}

	public String getApproxSquareFootage() {
		return approxSquareFootage;
	}

	public void setApproxSquareFootage(String approxSquareFootage) {
		this.approxSquareFootage = approxSquareFootage;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getStreetDirection() {
		return streetDirection;
	}

	public void setStreetDirection(String streetDirection) {
		this.streetDirection = streetDirection;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetAbbreviation() {
		return streetAbbreviation;
	}

	public void setStreetAbbreviation(String streetAbbreviation) {
		this.streetAbbreviation = streetAbbreviation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public double getTaxes() {
		return taxes;
	}

	public void setTaxes(float taxes) {
		this.taxes = taxes;
	}

	public String getVirtualTourURL() {
		return virtualTourURL;
	}

	public void setVirtualTourURL(String virtualTourURL) {
		this.virtualTourURL = virtualTourURL;
	}

	public int getAssessment() {
		return assessment;
	}

	public void setAssessment(int assessment) {
		this.assessment = assessment;
	}

	public String getUffi() {
		return uffi;
	}

	public void setUffi(String uffi) {
		this.uffi = uffi;
	}

	public String getUtilitiesCable() {
		return utilitiesCable;
	}

	public void setUtilitiesCable(String utilitiesCable) {
		this.utilitiesCable = utilitiesCable;
	}

	public String getUtilitiesTelephone() {
		return utilitiesTelephone;
	}

	public void setUtilitiesTelephone(String utilitiesTelephone) {
		this.utilitiesTelephone = utilitiesTelephone;
	}

	public String getSellerPropertyInfoStatement() {
		return sellerPropertyInfoStatement;
	}

	public void setSellerPropertyInfoStatement(String sellerPropertyInfoStatement) {
		this.sellerPropertyInfoStatement = sellerPropertyInfoStatement;
	}

	public String getWater() {
		return water;
	}

	public void setWater(String water) {
		this.water = water;
	}

	public String getWaterIncluded() {
		return waterIncluded;
	}

	public void setWaterIncluded(String waterIncluded) {
		this.waterIncluded = waterIncluded;
	}

	public int getWashroomsType1() {
		return washroomsType1;
	}

	public void setWashroomsType1(int washroomsType1) {
		this.washroomsType1 = washroomsType1;
	}

	public int getWashroomsType1Pcs() {
		return washroomsType1Pcs;
	}

	public void setWashroomsType1Pcs(int washroomsType1Pcs) {
		this.washroomsType1Pcs = washroomsType1Pcs;
	}

	public String getWashroomsType1Level() {
		return washroomsType1Level;
	}

	public void setWashroomsType1Level(String washroomsType1Level) {
		this.washroomsType1Level = washroomsType1Level;
	}

	public int getWashroomsType2() {
		return washroomsType2;
	}

	public void setWashroomsType2(int washroomsType2) {
		this.washroomsType2 = washroomsType2;
	}

	public int getWashroomsType2Pcs() {
		return washroomsType2Pcs;
	}

	public void setWashroomsType2Pcs(int washroomsType2Pcs) {
		this.washroomsType2Pcs = washroomsType2Pcs;
	}

	public String getWashroomsType2Level() {
		return washroomsType2Level;
	}

	public void setWashroomsType2Level(String washroomsType2Level) {
		this.washroomsType2Level = washroomsType2Level;
	}

	public int getWashroomsType3() {
		return washroomsType3;
	}



	public void setWashroomsType3(int washroomsType3) {
		this.washroomsType3 = washroomsType3;
	}

	public int getWashroomsType3Pcs() {
		return washroomsType3Pcs;
	}

	public void setWashroomsType3Pcs(int washroomsType3Pcs) {
		this.washroomsType3Pcs = washroomsType3Pcs;
	}

	public String getWashroomsType3Level() {
		return washroomsType3Level;
	}

	public void setWashroomsType3Level(String washroomsType3Level) {
		this.washroomsType3Level = washroomsType3Level;
	}

	public int getWashroomsType4() {
		return washroomsType4;
	}

	public void setWashroomsType4(int washroomsType4) {
		this.washroomsType4 = washroomsType4;
	}

	public int getWashroomsType4Pcs() {
		return washroomsType4Pcs;
	}

	public void setWashroomsType4Pcs(int washroomsType4Pcs) {
		this.washroomsType4Pcs = washroomsType4Pcs;
	}

	public String getWashroomsType4Level() {
		return washroomsType4Level;
	}

	public void setWashroomsType4Level(String washroomsType4Level) {
		this.washroomsType4Level = washroomsType4Level;
	}

	public int getWashroomsType5() {
		return washroomsType5;
	}

	public void setWashroomsType5(int washroomsType5) {
		this.washroomsType5 = washroomsType5;
	}

	public int getWashroomsType5Pcs() {
		return washroomsType5Pcs;
	}

	public void setWashroomsType5Pcs(int washroomsType5Pcs) {
		this.washroomsType5Pcs = washroomsType5Pcs;
	}

	public int getWashroomsType5Level() {
		return washroomsType5Level;
	}

	public void setWashroomsType5Level(int washroomsType5Level) {
		this.washroomsType5Level = washroomsType5Level;
	}

	public String getWaterSupplyTypes() {
		return waterSupplyTypes;
	}

	public void setWaterSupplyTypes(String waterSupplyTypes) {
		this.waterSupplyTypes = waterSupplyTypes;
	}

	public int getTaxYear() {
		return taxYear;
	}

	public void setTaxYear(int taxYear) {
		this.taxYear = taxYear;
	}

	public String getApproxAge() {
		return approxAge;
	}

	public void setApproxAge(String approxAge) {
		this.approxAge = approxAge;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getZoning() {
		return zoning;
	}

	public void setZoning(String zoning) {
		this.zoning = zoning;
	}

	public String getTypeOwnSreach() {
		return typeOwnSreach;
	}

	public void setTypeOwnSreach(String typeOwnSreach) {
		this.typeOwnSreach = typeOwnSreach;
	}

	public String getTypeOwn1out() {
		return typeOwn1out;
	}

	public void setTypeOwn1out(String typeOwn1out) {
		this.typeOwn1out = typeOwn1out;
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

	public String getPropertyFeatures1() {
		return propertyFeatures1;
	}

	public void setPropertyFeatures1(String propertyFeatures1) {
		this.propertyFeatures1 = propertyFeatures1;
	}

	public String getPropertyFeatures2() {
		return propertyFeatures2;
	}

	public void setPropertyFeatures2(String propertyFeatures2) {
		this.propertyFeatures2 = propertyFeatures2;
	}

	public String getOtherStructures1() {
		return otherStructures1;
	}

	public void setOtherStructures1(String otherStructures1) {
		this.otherStructures1 = otherStructures1;
	}

	public String getOtherStructures2() {
		return otherStructures2;
	}

	public void setOtherStructures2(String otherStructures2) {
		this.otherStructures2 = otherStructures2;
	}

	public int getAssessmentYear() {
		return assessmentYear;
	}

	public void setAssessmentYear(int assessmentYear) {
		this.assessmentYear = assessmentYear;
	}

	public double getGarageSpaces() {
		return garageSpaces;
	}

	public void setGarageSpaces(double garageSpaces) {
		this.garageSpaces = garageSpaces;
	}

	public String getLeasedTerms() {
		return leasedTerms;
	}

	public void setLeasedTerms(String leasedTerms) {
		this.leasedTerms = leasedTerms;
	}

	public String getVirtualTourUploadDate() {
		return virtualTourUploadDate;
	}

	public void setVirtualTourUploadDate(String virtualTourUploadDate) {
		this.virtualTourUploadDate = virtualTourUploadDate;
	}

	public String getDisplayAddressOnInternet() {
		return displayAddressOnInternet;
	}

	public void setDisplayAddressOnInternet(String displayAddressOnInternet) {
		this.displayAddressOnInternet = displayAddressOnInternet;
	}

	public int getMap() {
		return map;
	}

	public void setMap(int map) {
		this.map = map;
	}

	public int getMapColumn() {
		return mapColumn;
	}

	public void setMapColumn(int mapColumn) {
		this.mapColumn = mapColumn;
	}

	public String getMapRow() {
		return mapRow;
	}

	public void setMapRow(String mapRow) {
		this.mapRow = mapRow;
	}

	public String getAllInclusive() {
		return allInclusive;
	}

	public void setAllInclusive(String allInclusive) {
		this.allInclusive = allInclusive;
	}

	public String getFurnished() {
		return furnished;
	}

	public void setFurnished(String furnished) {
		this.furnished = furnished;
	}

	public String getLaundryAccess() {
		return laundryAccess;
	}

	public void setLaundryAccess(String laundryAccess) {
		this.laundryAccess = laundryAccess;
	}

	public String getPrivateEntrance() {
		return privateEntrance;
	}

	public void setPrivateEntrance(String privateEntrance) {
		this.privateEntrance = privateEntrance;
	}

	public long getAddlMonthlyFees() {
		return addlMonthlyFees;
	}

	public void setAddlMonthlyFees(long addlMonthlyFees) {
		this.addlMonthlyFees = addlMonthlyFees;
	}

	public String getCentralVac() {
		return centralVac;
	}

	public void setCentralVac(String centralVac) {
		this.centralVac = centralVac;
	}

	public int getKitchensPlus() {
		return kitchensPlus;
	}

	public void setKitchensPlus(int kitchensPlus) {
		this.kitchensPlus = kitchensPlus;
	}

	public String getLaundryLevel() {
		return laundryLevel;
	}

	public void setLaundryLevel(String laundryLevel) {
		this.laundryLevel = laundryLevel;
	}

	public String getPropertyFeatures3() {
		return propertyFeatures3;
	}

	public void setPropertyFeatures3(String propertyFeatures3) {
		this.propertyFeatures3 = propertyFeatures3;
	}

	public String getPropertyFeatures4() {
		return propertyFeatures4;
	}

	public void setPropertyFeatures4(String propertyFeatures4) {
		this.propertyFeatures4 = propertyFeatures4;
	}

	public String getPropertyFeatures5() {
		return propertyFeatures5;
	}

	public void setPropertyFeatures5(String propertyFeatures5) {
		this.propertyFeatures5 = propertyFeatures5;
	}

	public String getPropertyFeatures6() {
		return propertyFeatures6;
	}

	public void setPropertyFeatures6(String propertyFeatures6) {
		this.propertyFeatures6 = propertyFeatures6;
	}

	public String getRetirement() {
		return retirement;
	}

	public void setRetirement(String retirement) {
		this.retirement = retirement;
	}

	public String getWaterfront() {
		return waterfront;
	}

	public void setWaterfront(String waterfront) {
		this.waterfront = waterfront;
	}

	public String getSpecialDesignation1() {
		return specialDesignation1;
	}

	public void setSpecialDesignation1(String specialDesignation1) {
		this.specialDesignation1 = specialDesignation1;
	}

	public String getSpecialDesignation2() {
		return specialDesignation2;
	}

	public void setSpecialDesignation2(String specialDesignation2) {
		this.specialDesignation2 = specialDesignation2;
	}

	public String getSpecialDesignation3() {
		return specialDesignation3;
	}

	public void setSpecialDesignation3(String specialDesignation3) {
		this.specialDesignation3 = specialDesignation3;
	}

	public String getSpecialDesignation4() {
		return specialDesignation4;
	}

	public void setSpecialDesignation4(String specialDesignation4) {
		this.specialDesignation4 = specialDesignation4;
	}

	public String getSpecialDesignation5() {
		return specialDesignation5;
	}

	public void setSpecialDesignation5(String specialDesignation5) {
		this.specialDesignation5 = specialDesignation5;
	}

	public String getSpecialDesignation6() {
		return specialDesignation6;
	}

	public void setSpecialDesignation6(String specialDesignation6) {
		this.specialDesignation6 = specialDesignation6;
	}

	public Date getTimestampSql() {
		return timestampSql;
	}

	public void setTimestampSql(Date timestampSql) {
		this.timestampSql = timestampSql;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getMunicipalityCode() {
		return municipalityCode;
	}

	public void setMunicipalityCode(String municipalityCode) {
		this.municipalityCode = municipalityCode;
	}

	public String getCommunityCode() {
		return communityCode;
	}

	public void setCommunityCode(String communityCode) {
		this.communityCode = communityCode;
	}

	public String getMunicipalityDistrict() {
		return municipalityDistrict;
	}

	public void setMunicipalityDistrict(String municipalityDistrict) {
		this.municipalityDistrict = municipalityDistrict;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public Date getIdxUpdatedDate() {
		return idxUpdatedDate;
	}

	public void setIdxUpdatedDate(Date idxUpdatedDate) {
		this.idxUpdatedDate = idxUpdatedDate;
	}

	public Date getPixUpdatedDate() {
		return pixUpdatedDate;
	}

	public void setPixUpdatedDate(Date pixUpdatedDate) {
		this.pixUpdatedDate = pixUpdatedDate;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}


	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}
	
	//Condo specific attributes
	
	
	
	
    public String getBalcony() {
		return balcony;
	}

	public void setBalcony(String balcony) {
		this.balcony = balcony;
	}


	public String getBuildingInsuranceIncluded() {
		return buildingInsuranceIncluded;
	}

	public void setBuildingInsuranceIncluded(String buildingInsuranceIncluded) {
		this.buildingInsuranceIncluded = buildingInsuranceIncluded;
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

	public String getSharesPer() {
		return sharesPer;
	}

	public void setSharesPer(String sharesPer) {
		this.sharesPer = sharesPer;
	}

	public int getCondoCorp() {
		return condoCorp;
	}

	public void setCondoCorp(int condoCorp) {
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

	public String getEnsuiteLaundry() {
		return ensuiteLaundry;
	}

	public void setEnsuiteLaundry(String ensuiteLaundry) {
		this.ensuiteLaundry = ensuiteLaundry;
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
		return ShorelineAllowance;
	}

	public void setShorelineAllowance(String shorelineAllowance) {
		ShorelineAllowance = shorelineAllowance;
	}

	public String getShorelineExposure() {
		return ShorelineExposure;
	}

	public void setShorelineExposure(String shorelineExposure) {
		ShorelineExposure = shorelineExposure;
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



	@Override
    public String toString() {
        return "Listing: [MLS=" + mls + ", Address = " + address + ", listprice=" + listPrice + "]";
    }
	
	
}
