package com.whereq.realtor.xml.bind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CondoProperty")
@XmlAccessorType(XmlAccessType.FIELD)
public class FullCondoProperty 
{
	@XmlElement(name = "Listing")
	private FullListing listing ;

	public void setListing(FullListing listing) {
		this.listing = listing;
	}

	
	
	//no need for getter as it implement by default
	
    public FullListing getListing() {
		return listing;
	}



	@Override
    public String toString() {
        return listing ==null?"nothing":listing.toString();
    }
    
	
}
