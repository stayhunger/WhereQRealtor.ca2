package com.whereq.realtor.xml.bind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ResidentialProperty")
@XmlAccessorType(XmlAccessType.FIELD)
public class FullResidentialProperty 
{
	@XmlElement(name = "Listing")
	private FullResListing listing ;

	public void setListing(FullResListing listing) {
		this.listing = listing;
	}

	
	
	//no need for getter as it implement by default
	
    @Override
    public String toString() {
        return listing ==null?"nothing":listing.toString();
    }
    
	
}
