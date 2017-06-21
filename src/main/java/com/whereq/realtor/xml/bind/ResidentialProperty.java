package com.whereq.realtor.xml.bind;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ResidentialProperty")
@XmlAccessorType (XmlAccessType.FIELD)
public class ResidentialProperty 
{
	@XmlElement(name = "Listing")
	private Listing listings = null;

	public Listing getListings() {
		return listings;
	}

	public void setListings(Listing listings) {
		this.listings = listings;
	}

}
