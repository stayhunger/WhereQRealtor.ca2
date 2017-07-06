package com.whereq.realtor.xml.bind;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlPath;

/*
 * Full Residential XML format
	<RETS>
	   <REData>
	      <REProperties>
	         <ResidentialProperty>
	            <Listing>
	               <Address>21 Pineway Ave</Address>
	               <Washrooms>0</Washrooms>
	               <Bedrooms>0</Bedrooms>
	               <BedroomsPlus>0</BedroomsPlus
 * 
 */

@XmlRootElement(name="RETS")
@XmlAccessorType(XmlAccessType.FIELD)
public class FullResidentialPropertyWrapper{
    @XmlPath("REData/REProperties/ResidentialProperty")
    List<FullResidentialProperty> fullResProperties;

	public List<FullResidentialProperty> getActResProperties() {
		return fullResProperties;
	}

	public void setActResProperties(List<FullResidentialProperty> actResProperties) {
		this.fullResProperties = actResProperties;
	}
	

}