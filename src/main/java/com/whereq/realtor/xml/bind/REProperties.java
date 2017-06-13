package com.whereq.realtor.xml.bind;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "REProperties")
@XmlAccessorType (XmlAccessType.FIELD)
public class REProperties 
{
	@XmlElement(name = "ResidentialProperty")
	private List<ResidentialProperty> residentialProperties = null;

	public List<ResidentialProperty> getResidentialProperties() {
		return residentialProperties;
	}

	public void setResidentialProperties(List<ResidentialProperty> residentialProperties) {
		this.residentialProperties = residentialProperties;
	}

}
