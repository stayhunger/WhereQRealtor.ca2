package com.whereq.realtor.xml.bind;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlPath;

/*
 * Full Condo XML format
	<RETS>
	   <REData>
	      <REProperties>
	         <CondoProperty>
	            <Listing>
					<Address>46 Dearbourne Blvd</Address>
					<AirConditioning>Central Air</AirConditioning>
					<AllInclusive>null</AllInclusive>
					<ApproxAge>null</ApproxAge>
					<ApproxSquareFootage>1400-1599</ApproxSquareFootage>
 * 
 */

@XmlRootElement(name="RETS")
@XmlAccessorType(XmlAccessType.FIELD)
public class FullCondoPropertyWrapper{
    @XmlPath("REData/REProperties/CondoProperty")
    List<FullCondoProperty> fullCndProperties;

	public List<FullCondoProperty> getFullCndProperties() {
		return fullCndProperties;
	}

	public void setFullCndProperties(List<FullCondoProperty> fullCndProperties) {
		this.fullCndProperties = fullCndProperties;
	}


}