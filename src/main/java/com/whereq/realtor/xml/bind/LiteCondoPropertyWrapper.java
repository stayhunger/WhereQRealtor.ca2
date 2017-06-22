package com.whereq.realtor.xml.bind;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlPath;

/*
 * Active XML format
		<RETS ReplyCode="0" ReplyText="">
		<COUNT Records="6512"/>
		<REData>
		<REProperties>
			<CondoProperty>
				<Listing>
					<MLS>C3838319</MLS>
					<Status>A</Status>
				</Listing>
			</CondoProperty>
			<CondoProperty>
				<Listing>
					<MLS>C3840527</MLS>
					<Status>A</Status>
				</Listing>
			</CondoProperty>
		</REProperties>
		</REData>
		<MAXROWS/>
		</RETS>
 * 
 */

@XmlRootElement(name="RETS")
@XmlAccessorType(XmlAccessType.FIELD)
public class LiteCondoPropertyWrapper{
    @XmlPath("REData/REProperties/CondoProperty")
    List<LiteCondoProperty> activeProperties;

	public List<LiteCondoProperty> getActiveProperties() {
		return activeProperties;
	}

	public void setActiveProperties(List<LiteCondoProperty> activeProperties) {
		this.activeProperties = activeProperties;
	}


    
}