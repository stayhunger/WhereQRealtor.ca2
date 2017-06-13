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
@Table (name = "fh_property")
public class FH_PropertyPO {
	
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

	@Column(name = "type_own_srch")
	private String TypeOwn1Out;


	@Column(name = "style")
	private String Style;
	
	
	@Column(name = "comp_pts")
	private String FrontingOnNSEW;

	
	@Column(name = "front_ft", columnDefinition="Decimal(8,2)")
	private Double LotFront;
	

	@Column(name = "depth", columnDefinition="Decimal(8,2)")
	private Double LotDepth;
	

	
	@Column(name = "rms", columnDefinition="Decimal(4,0)")
	private Integer Rooms;
	
	@Column(name = "rooms_plus", columnDefinition="Decimal(4,0)")
	private Integer RoomsPlus;

	@Column(name = "bath_tot", columnDefinition="Decimal(4,0)")
	private Integer Washrooms;

	@Column(name = "br", columnDefinition="Decimal(4,0)")
	private Integer Bedrooms;

	@Column(name = "br_plus", columnDefinition="Decimal(4,0)")
	private Integer BedroomsPlus;

	@Column(name = "irreg")
	private String LotIrregularities;
	
	@Column(name = "cross_st")
	private String DirectionsCrossStreets;
	
	@Column(name = "wcloset_p1")
	private Integer WashroomsType1Pcs;
	
	@Column(name = "wcloset_p2")
	private Integer WashroomsType2Pcs;
	
	@Column(name = "wcloset_p3")
	private Integer WashroomsType3Pcs;
	
	@Column(name = "wcloset_p4")
	private Integer WashroomsType4Pcs;

	@Column(name = "wcloset_t1")
	private Integer WashroomsType1;
	
	@Column(name = "wcloset_t2")
	private Integer WashroomsType2;
	
	@Column(name = "wcloset_t3")
	private Integer WashroomsType3;
	
	@Column(name = "wcloset_t4")
	private Integer WashroomsType4;
	
	
	@Column(name = "wcloset_t1lvl")
	private String WashroomsType1Level;
	
	@Column(name = "wcloset_t1lv2")
	private String WashroomsType2Level;
	
	@Column(name = "wcloset_t1lv3")
	private String WashroomsType3Level;
	
	@Column(name = "wcloset_t1lv4")
	private String WashroomsType4Level;

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

	public String getTypeOwn1Out() {
		return TypeOwn1Out;
	}

	public void setTypeOwn1Out(String typeOwn1Out) {
		TypeOwn1Out = typeOwn1Out;
	}

	public String getStyle() {
		return Style;
	}

	public void setStyle(String style) {
		Style = style;
	}

	public String getFrontingOnNSEW() {
		return FrontingOnNSEW;
	}

	public void setFrontingOnNSEW(String frontingOnNSEW) {
		FrontingOnNSEW = frontingOnNSEW;
	}

	public Double getLotFront() {
		return LotFront;
	}

	public void setLotFront(Double lotFront) {
		LotFront = lotFront;
	}

	public Double getLotDepth() {
		return LotDepth;
	}

	public void setLotDepth(Double lotDepth) {
		LotDepth = lotDepth;
	}

	public Integer getRooms() {
		return Rooms;
	}

	public void setRooms(Integer rooms) {
		Rooms = rooms;
	}

	public Integer getRoomsPlus() {
		return RoomsPlus;
	}

	public void setRoomsPlus(Integer roomsPlus) {
		RoomsPlus = roomsPlus;
	}

	public Integer getWashrooms() {
		return Washrooms;
	}

	public void setWashrooms(Integer washrooms) {
		Washrooms = washrooms;
	}

	public Integer getBedrooms() {
		return Bedrooms;
	}

	public void setBedrooms(Integer bedrooms) {
		Bedrooms = bedrooms;
	}

	public Integer getBedroomsPlus() {
		return BedroomsPlus;
	}

	public void setBedroomsPlus(Integer bedroomsPlus) {
		BedroomsPlus = bedroomsPlus;
	}

	public String getLotIrregularities() {
		return LotIrregularities;
	}

	public void setLotIrregularities(String lotIrregularities) {
		LotIrregularities = lotIrregularities;
	}

	public String getDirectionsCrossStreets() {
		return DirectionsCrossStreets;
	}

	public void setDirectionsCrossStreets(String directionsCrossStreets) {
		DirectionsCrossStreets = directionsCrossStreets;
	}

	public Integer getWashroomsType1Pcs() {
		return WashroomsType1Pcs;
	}

	public void setWashroomsType1Pcs(Integer washroomsType1Pcs) {
		WashroomsType1Pcs = washroomsType1Pcs;
	}

	public Integer getWashroomsType2Pcs() {
		return WashroomsType2Pcs;
	}

	public void setWashroomsType2Pcs(Integer washroomsType2Pcs) {
		WashroomsType2Pcs = washroomsType2Pcs;
	}

	public Integer getWashroomsType3Pcs() {
		return WashroomsType3Pcs;
	}

	public void setWashroomsType3Pcs(Integer washroomsType3Pcs) {
		WashroomsType3Pcs = washroomsType3Pcs;
	}

	public Integer getWashroomsType4Pcs() {
		return WashroomsType4Pcs;
	}

	public void setWashroomsType4Pcs(Integer washroomsType4Pcs) {
		WashroomsType4Pcs = washroomsType4Pcs;
	}

	public Integer getWashroomsType1() {
		return WashroomsType1;
	}

	public void setWashroomsType1(Integer washroomsType1) {
		WashroomsType1 = washroomsType1;
	}

	public Integer getWashroomsType2() {
		return WashroomsType2;
	}

	public void setWashroomsType2(Integer washroomsType2) {
		WashroomsType2 = washroomsType2;
	}

	public Integer getWashroomsType3() {
		return WashroomsType3;
	}

	public void setWashroomsType3(Integer washroomsType3) {
		WashroomsType3 = washroomsType3;
	}

	public Integer getWashroomsType4() {
		return WashroomsType4;
	}

	public void setWashroomsType4(Integer washroomsType4) {
		WashroomsType4 = washroomsType4;
	}

	public String getWashroomsType1Level() {
		return WashroomsType1Level;
	}

	public void setWashroomsType1Level(String washroomsType1Level) {
		WashroomsType1Level = washroomsType1Level;
	}

	public String getWashroomsType2Level() {
		return WashroomsType2Level;
	}

	public void setWashroomsType2Level(String washroomsType2Level) {
		WashroomsType2Level = washroomsType2Level;
	}

	public String getWashroomsType3Level() {
		return WashroomsType3Level;
	}

	public void setWashroomsType3Level(String washroomsType3Level) {
		WashroomsType3Level = washroomsType3Level;
	}

	public String getWashroomsType4Level() {
		return WashroomsType4Level;
	}

	public void setWashroomsType4Level(String washroomsType4Level) {
		WashroomsType4Level = washroomsType4Level;
	}
	
	
	
	




}
