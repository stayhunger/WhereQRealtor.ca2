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
@Table (name = "property_rooms")
public class PropertyRoomsPO {
	
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

	@Column(name = "rm1_len", columnDefinition="Decimal(10,2)")
	private double Room1Length;

	@Column(name = "rm1_wth", columnDefinition="Decimal(10,2)")
	private double Room1Width;

	@Column(name = "rm1_out")
	private String Room1;
	
	@Column(name = "rm1_dc1_out")
	private String Room1Desc1;

	@Column(name = "rm1_dc2_out")
	private String Room1Desc2;

	@Column(name = "rm1_dc3_out")
	private String Room1Desc3;
	
	@Column(name = "rm2_len", columnDefinition="Decimal(10,2)")
	private double Room2Length;

	@Column(name = "rm2_wth", columnDefinition="Decimal(10,2)")
	private double Room2Width;

	@Column(name = "rm2_out")
	private String Room2;
	
	@Column(name = "rm2_dc1_out")
	private String Room2Desc1;

	@Column(name = "rm2_dc2_out")
	private String Room2Desc2;


	@Column(name = "rm2_dc3_out")
	private String Room2Desc3;
	
	@Column(name = "rm3_len", columnDefinition="Decimal(10,2)")
	private double Room3Length;

	@Column(name = "rm3_wth", columnDefinition="Decimal(10,2)")
	private double Room3Width;

	@Column(name = "rm3_out")
	private String Room3;
	
	@Column(name = "rm3_dc1_out")
	private String Room3Desc1;

	@Column(name = "rm3_dc2_out")
	private String Room3Desc2;


	@Column(name = "rm3_dc3_out")
	private String Room3Desc3;
	
	@Column(name = "rm4_len", columnDefinition="Decimal(10,2)")
	private double Room4Length;

	@Column(name = "rm4_wth", columnDefinition="Decimal(10,2)")
	private double Room4Width;

	@Column(name = "rm4_out")
	private String Room4;
	
	@Column(name = "rm4_dc1_out")
	private String Room4Desc1;

	@Column(name = "rm4_dc2_out")
	private String Room4Desc2;


	@Column(name = "rm4_dc3_out")
	private String Room4Desc3;
	
	@Column(name = "rm5_len", columnDefinition="Decimal(10,2)")
	private double Room5Length;

	@Column(name = "rm5_wth", columnDefinition="Decimal(10,2)")
	private double Room5Width;

	@Column(name = "rm5_out")
	private String Room5;
	
	@Column(name = "rm5_dc1_out")
	private String Room5Desc1;

	@Column(name = "rm5_dc2_out")
	private String Room5Desc2;


	@Column(name = "rm5_dc3_out")
	private String Room5Desc3;
	
	@Column(name = "rm6_len", columnDefinition="Decimal(10,2)")
	private double Room6Length;

	@Column(name = "rm6_wth", columnDefinition="Decimal(10,2)")
	private double Room6Width;

	@Column(name = "rm6_out")
	private String Room6;
	
	@Column(name = "rm6_dc1_out")
	private String Room6Desc1;

	@Column(name = "rm6_dc2_out")
	private String Room6Desc2;


	@Column(name = "rm6_dc3_out")
	private String Room6Desc3;
	
	@Column(name = "rm7_len", columnDefinition="Decimal(10,2)")
	private double Room7Length;

	@Column(name = "rm7_wth", columnDefinition="Decimal(10,2)")
	private double Room7Width;

	@Column(name = "rm7_out")
	private String Room7;
	
	@Column(name = "rm7_dc1_out")
	private String Room7Desc1;

	@Column(name = "rm7_dc2_out")
	private String Room7Desc2;


	@Column(name = "rm7_dc3_out")
	private String Room7Desc3;
	
	@Column(name = "rm8_len", columnDefinition="Decimal(10,2)")
	private double Room8Length;

	@Column(name = "rm8_wth", columnDefinition="Decimal(10,2)")
	private double Room8Width;

	@Column(name = "rm8_out")
	private String Room8;
	
	@Column(name = "rm8_dc1_out")
	private String Room8Desc1;

	@Column(name = "rm8_dc2_out")
	private String Room8Desc2;


	@Column(name = "rm8_dc3_out")
	private String Room8Desc3;
	
	@Column(name = "rm9_len", columnDefinition="Decimal(10,2)")
	private double Room9Length;

	@Column(name = "rm9_wth", columnDefinition="Decimal(10,2)")
	private double Room9Width;

	@Column(name = "rm9_out")
	private String Room9;
	
	@Column(name = "rm9_dc1_out")
	private String Room9Desc1;

	@Column(name = "rm9_dc2_out")
	private String Room9Desc2;


	@Column(name = "rm9_dc3_out")
	private String Room9Desc3;
	
	@Column(name = "rm10_len", columnDefinition="Decimal(10,2)")
	private double Room10Length;

	@Column(name = "rm10_wth", columnDefinition="Decimal(10,2)")
	private double Room10Width;

	@Column(name = "rm10_out")
	private String Room10;
	
	@Column(name = "rm10_dc1_out")
	private String Room10Desc1;

	@Column(name = "rm10_dc2_out")
	private String Room10Desc2;


	@Column(name = "rm10_dc3_out")
	private String Room10Desc3;
	
	@Column(name = "rm11_len", columnDefinition="Decimal(10,2)")
	private double Room11Length;

	@Column(name = "rm11_wth", columnDefinition="Decimal(10,2)")
	private double Room11Width;

	@Column(name = "rm11_out")
	private String Room11;
	
	@Column(name = "rm11_dc1_out")
	private String Room11Desc1;

	@Column(name = "rm11_dc2_out")
	private String Room11Desc2;


	@Column(name = "rm11_dc3_out")
	private String Room11Desc3;
	
	@Column(name = "rm12_len", columnDefinition="Decimal(10,2)")
	private double Room12Length;

	@Column(name = "rm12_wth", columnDefinition="Decimal(10,2)")
	private double Room12Width;

	@Column(name = "rm12_out")
	private String Room12;
	
	@Column(name = "rm12_dc1_out")
	private String Room12Desc1;

	@Column(name = "rm12_dc2_out")
	private String Room12Desc2;


	@Column(name = "rm12_dc3_out")
	private String Room12Desc3;
	
	@Column(name = "level1")
	private String Level1;

	@Column(name = "level2")
	private String Level2;

	@Column(name = "level3")
	private String Level3;
	
	@Column(name = "level4")
	private String Level4;
	
	@Column(name = "level5")
	private String Level5;
	
	@Column(name = "level6")
	private String Level6;
	
	@Column(name = "level7")
	private String Level7;
	
	@Column(name = "level8")
	private String Level8;
	
	@Column(name = "level9")
	private String Level9;
	
	@Column(name = "level10")
	private String Level10;
	
	@Column(name = "level11")
	private String Level11;
	
	@Column(name = "level12")
	private String Level12;

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

	public double getRoom1Length() {
		return Room1Length;
	}

	public void setRoom1Length(double room1Length) {
		Room1Length = room1Length;
	}

	public double getRoom1Width() {
		return Room1Width;
	}

	public void setRoom1Width(double room1Width) {
		Room1Width = room1Width;
	}

	public String getRoom1() {
		return Room1;
	}

	public void setRoom1(String room1) {
		Room1 = room1;
	}

	public String getRoom1Desc1() {
		return Room1Desc1;
	}

	public void setRoom1Desc1(String room1Desc1) {
		Room1Desc1 = room1Desc1;
	}

	public String getRoom1Desc2() {
		return Room1Desc2;
	}

	public void setRoom1Desc2(String room1Desc2) {
		Room1Desc2 = room1Desc2;
	}

	public String getRoom1Desc3() {
		return Room1Desc3;
	}

	public void setRoom1Desc3(String room1Desc3) {
		Room1Desc3 = room1Desc3;
	}

	public double getRoom2Length() {
		return Room2Length;
	}

	public void setRoom2Length(double room2Length) {
		Room2Length = room2Length;
	}

	public double getRoom2Width() {
		return Room2Width;
	}

	public void setRoom2Width(double room2Width) {
		Room2Width = room2Width;
	}

	public String getRoom2() {
		return Room2;
	}

	public void setRoom2(String room2) {
		Room2 = room2;
	}

	public String getRoom2Desc1() {
		return Room2Desc1;
	}

	public void setRoom2Desc1(String room2Desc1) {
		Room2Desc1 = room2Desc1;
	}

	public String getRoom2Desc2() {
		return Room2Desc2;
	}

	public void setRoom2Desc2(String room2Desc2) {
		Room2Desc2 = room2Desc2;
	}

	public String getRoom2Desc3() {
		return Room2Desc3;
	}

	public void setRoom2Desc3(String room2Desc3) {
		Room2Desc3 = room2Desc3;
	}

	public double getRoom3Length() {
		return Room3Length;
	}

	public void setRoom3Length(double room3Length) {
		Room3Length = room3Length;
	}

	public double getRoom3Width() {
		return Room3Width;
	}

	public void setRoom3Width(double room3Width) {
		Room3Width = room3Width;
	}

	public String getRoom3() {
		return Room3;
	}

	public void setRoom3(String room3) {
		Room3 = room3;
	}

	public String getRoom3Desc1() {
		return Room3Desc1;
	}

	public void setRoom3Desc1(String room3Desc1) {
		Room3Desc1 = room3Desc1;
	}

	public String getRoom3Desc2() {
		return Room3Desc2;
	}

	public void setRoom3Desc2(String room3Desc2) {
		Room3Desc2 = room3Desc2;
	}

	public String getRoom3Desc3() {
		return Room3Desc3;
	}

	public void setRoom3Desc3(String room3Desc3) {
		Room3Desc3 = room3Desc3;
	}

	public double getRoom4Length() {
		return Room4Length;
	}

	public void setRoom4Length(double room4Length) {
		Room4Length = room4Length;
	}

	public double getRoom4Width() {
		return Room4Width;
	}

	public void setRoom4Width(double room4Width) {
		Room4Width = room4Width;
	}

	public String getRoom4() {
		return Room4;
	}

	public void setRoom4(String room4) {
		Room4 = room4;
	}

	public String getRoom4Desc1() {
		return Room4Desc1;
	}

	public void setRoom4Desc1(String room4Desc1) {
		Room4Desc1 = room4Desc1;
	}

	public String getRoom4Desc2() {
		return Room4Desc2;
	}

	public void setRoom4Desc2(String room4Desc2) {
		Room4Desc2 = room4Desc2;
	}

	public String getRoom4Desc3() {
		return Room4Desc3;
	}

	public void setRoom4Desc3(String room4Desc3) {
		Room4Desc3 = room4Desc3;
	}

	public double getRoom5Length() {
		return Room5Length;
	}

	public void setRoom5Length(double room5Length) {
		Room5Length = room5Length;
	}

	public double getRoom5Width() {
		return Room5Width;
	}

	public void setRoom5Width(double room5Width) {
		Room5Width = room5Width;
	}

	public String getRoom5() {
		return Room5;
	}

	public void setRoom5(String room5) {
		Room5 = room5;
	}

	public String getRoom5Desc1() {
		return Room5Desc1;
	}

	public void setRoom5Desc1(String room5Desc1) {
		Room5Desc1 = room5Desc1;
	}

	public String getRoom5Desc2() {
		return Room5Desc2;
	}

	public void setRoom5Desc2(String room5Desc2) {
		Room5Desc2 = room5Desc2;
	}

	public String getRoom5Desc3() {
		return Room5Desc3;
	}

	public void setRoom5Desc3(String room5Desc3) {
		Room5Desc3 = room5Desc3;
	}

	public double getRoom6Length() {
		return Room6Length;
	}

	public void setRoom6Length(double room6Length) {
		Room6Length = room6Length;
	}

	public double getRoom6Width() {
		return Room6Width;
	}

	public void setRoom6Width(double room6Width) {
		Room6Width = room6Width;
	}

	public String getRoom6() {
		return Room6;
	}

	public void setRoom6(String room6) {
		Room6 = room6;
	}

	public String getRoom6Desc1() {
		return Room6Desc1;
	}

	public void setRoom6Desc1(String room6Desc1) {
		Room6Desc1 = room6Desc1;
	}

	public String getRoom6Desc2() {
		return Room6Desc2;
	}

	public void setRoom6Desc2(String room6Desc2) {
		Room6Desc2 = room6Desc2;
	}

	public String getRoom6Desc3() {
		return Room6Desc3;
	}

	public void setRoom6Desc3(String room6Desc3) {
		Room6Desc3 = room6Desc3;
	}

	public double getRoom7Length() {
		return Room7Length;
	}

	public void setRoom7Length(double room7Length) {
		Room7Length = room7Length;
	}

	public double getRoom7Width() {
		return Room7Width;
	}

	public void setRoom7Width(double room7Width) {
		Room7Width = room7Width;
	}

	public String getRoom7() {
		return Room7;
	}

	public void setRoom7(String room7) {
		Room7 = room7;
	}

	public String getRoom7Desc1() {
		return Room7Desc1;
	}

	public void setRoom7Desc1(String room7Desc1) {
		Room7Desc1 = room7Desc1;
	}

	public String getRoom7Desc2() {
		return Room7Desc2;
	}

	public void setRoom7Desc2(String room7Desc2) {
		Room7Desc2 = room7Desc2;
	}

	public String getRoom7Desc3() {
		return Room7Desc3;
	}

	public void setRoom7Desc3(String room7Desc3) {
		Room7Desc3 = room7Desc3;
	}

	public double getRoom8Length() {
		return Room8Length;
	}

	public void setRoom8Length(double room8Length) {
		Room8Length = room8Length;
	}

	public double getRoom8Width() {
		return Room8Width;
	}

	public void setRoom8Width(double room8Width) {
		Room8Width = room8Width;
	}

	public String getRoom8() {
		return Room8;
	}

	public void setRoom8(String room8) {
		Room8 = room8;
	}

	public String getRoom8Desc1() {
		return Room8Desc1;
	}

	public void setRoom8Desc1(String room8Desc1) {
		Room8Desc1 = room8Desc1;
	}

	public String getRoom8Desc2() {
		return Room8Desc2;
	}

	public void setRoom8Desc2(String room8Desc2) {
		Room8Desc2 = room8Desc2;
	}

	public String getRoom8Desc3() {
		return Room8Desc3;
	}

	public void setRoom8Desc3(String room8Desc3) {
		Room8Desc3 = room8Desc3;
	}

	public double getRoom9Length() {
		return Room9Length;
	}

	public void setRoom9Length(double room9Length) {
		Room9Length = room9Length;
	}

	public double getRoom9Width() {
		return Room9Width;
	}

	public void setRoom9Width(double room9Width) {
		Room9Width = room9Width;
	}

	public String getRoom9() {
		return Room9;
	}

	public void setRoom9(String room9) {
		Room9 = room9;
	}

	public String getRoom9Desc1() {
		return Room9Desc1;
	}

	public void setRoom9Desc1(String room9Desc1) {
		Room9Desc1 = room9Desc1;
	}

	public String getRoom9Desc2() {
		return Room9Desc2;
	}

	public void setRoom9Desc2(String room9Desc2) {
		Room9Desc2 = room9Desc2;
	}

	public String getRoom9Desc3() {
		return Room9Desc3;
	}

	public void setRoom9Desc3(String room9Desc3) {
		Room9Desc3 = room9Desc3;
	}

	public double getRoom10Length() {
		return Room10Length;
	}

	public void setRoom10Length(double room10Length) {
		Room10Length = room10Length;
	}

	public double getRoom10Width() {
		return Room10Width;
	}

	public void setRoom10Width(double room10Width) {
		Room10Width = room10Width;
	}

	public String getRoom10() {
		return Room10;
	}

	public void setRoom10(String room10) {
		Room10 = room10;
	}

	public String getRoom10Desc1() {
		return Room10Desc1;
	}

	public void setRoom10Desc1(String room10Desc1) {
		Room10Desc1 = room10Desc1;
	}

	public String getRoom10Desc2() {
		return Room10Desc2;
	}

	public void setRoom10Desc2(String room10Desc2) {
		Room10Desc2 = room10Desc2;
	}

	public String getRoom10Desc3() {
		return Room10Desc3;
	}

	public void setRoom10Desc3(String room10Desc3) {
		Room10Desc3 = room10Desc3;
	}

	public double getRoom11Length() {
		return Room11Length;
	}

	public void setRoom11Length(double room11Length) {
		Room11Length = room11Length;
	}

	public double getRoom11Width() {
		return Room11Width;
	}

	public void setRoom11Width(double room11Width) {
		Room11Width = room11Width;
	}

	public String getRoom11() {
		return Room11;
	}

	public void setRoom11(String room11) {
		Room11 = room11;
	}

	public String getRoom11Desc1() {
		return Room11Desc1;
	}

	public void setRoom11Desc1(String room11Desc1) {
		Room11Desc1 = room11Desc1;
	}

	public String getRoom11Desc2() {
		return Room11Desc2;
	}

	public void setRoom11Desc2(String room11Desc2) {
		Room11Desc2 = room11Desc2;
	}

	public String getRoom11Desc3() {
		return Room11Desc3;
	}

	public void setRoom11Desc3(String room11Desc3) {
		Room11Desc3 = room11Desc3;
	}

	public double getRoom12Length() {
		return Room12Length;
	}

	public void setRoom12Length(double room12Length) {
		Room12Length = room12Length;
	}

	public double getRoom12Width() {
		return Room12Width;
	}

	public void setRoom12Width(double room12Width) {
		Room12Width = room12Width;
	}

	public String getRoom12() {
		return Room12;
	}

	public void setRoom12(String room12) {
		Room12 = room12;
	}

	public String getRoom12Desc1() {
		return Room12Desc1;
	}

	public void setRoom12Desc1(String room12Desc1) {
		Room12Desc1 = room12Desc1;
	}

	public String getRoom12Desc2() {
		return Room12Desc2;
	}

	public void setRoom12Desc2(String room12Desc2) {
		Room12Desc2 = room12Desc2;
	}

	public String getRoom12Desc3() {
		return Room12Desc3;
	}

	public void setRoom12Desc3(String room12Desc3) {
		Room12Desc3 = room12Desc3;
	}

	public String getLevel1() {
		return Level1;
	}

	public void setLevel1(String level1) {
		Level1 = level1;
	}

	public String getLevel2() {
		return Level2;
	}

	public void setLevel2(String level2) {
		Level2 = level2;
	}

	public String getLevel3() {
		return Level3;
	}

	public void setLevel3(String level3) {
		Level3 = level3;
	}

	public String getLevel4() {
		return Level4;
	}

	public void setLevel4(String level4) {
		Level4 = level4;
	}

	public String getLevel5() {
		return Level5;
	}

	public void setLevel5(String level5) {
		Level5 = level5;
	}

	public String getLevel6() {
		return Level6;
	}

	public void setLevel6(String level6) {
		Level6 = level6;
	}

	public String getLevel7() {
		return Level7;
	}

	public void setLevel7(String level7) {
		Level7 = level7;
	}

	public String getLevel8() {
		return Level8;
	}

	public void setLevel8(String level8) {
		Level8 = level8;
	}

	public String getLevel9() {
		return Level9;
	}

	public void setLevel9(String level9) {
		Level9 = level9;
	}

	public String getLevel10() {
		return Level10;
	}

	public void setLevel10(String level10) {
		Level10 = level10;
	}

	public String getLevel11() {
		return Level11;
	}

	public void setLevel11(String level11) {
		Level11 = level11;
	}

	public String getLevel12() {
		return Level12;
	}

	public void setLevel12(String level12) {
		Level12 = level12;
	}
	
	

}
