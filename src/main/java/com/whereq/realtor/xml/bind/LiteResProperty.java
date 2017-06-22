package com.whereq.realtor.xml.bind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlPath;


@XmlRootElement(name="ResidentialProperty")
@XmlAccessorType(XmlAccessType.FIELD)
public class LiteResProperty {

    @XmlPath("Listing/MLS/text()")
    String mls;

    @XmlPath("Listing/Status/text()")
    String status;

	public String getMls() {
		return mls;
	}

	public void setMls(String mls) {
		this.mls = mls;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
    @Override
    public String toString() {
        return "Listing: [MLS=" + mls + ", Status=" + status + "]";
    }
	
}
