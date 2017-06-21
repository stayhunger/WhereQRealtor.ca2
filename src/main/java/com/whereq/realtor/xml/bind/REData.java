package com.whereq.realtor.xml.bind;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "REData")
@XmlAccessorType (XmlAccessType.FIELD)
public class REData 
{
	@XmlElement(name = "REProperties")
	private REProperties reProperties = null;

	public REProperties getReProperties() {
		return reProperties;
	}

	public void setReProperties(REProperties reProperties) {
		this.reProperties = reProperties;
	}

}
