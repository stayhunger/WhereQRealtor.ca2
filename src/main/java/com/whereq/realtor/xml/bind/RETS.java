package com.whereq.realtor.xml.bind;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RETS")
@XmlAccessorType (XmlAccessType.FIELD)
public class RETS 
{
	@XmlElement(name = "REData")
	private REData redata = null;

	public REData getRedata() {
		return redata;
	}

	public void setRedata(REData redata) {
		this.redata = redata;
	}



}
