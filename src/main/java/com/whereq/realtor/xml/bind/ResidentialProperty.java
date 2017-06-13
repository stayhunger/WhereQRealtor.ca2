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
	private List<ListingFull> listings = null;

	public List<ListingFull> getListings() {
		return listings;
	}

	public void setListings(List<ListingFull> listings) {
		this.listings = listings;
	}

}
