package com.whereq.realtor.xml.bind;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlPath;

/*
 * Active XML format
		<RETS ReplyCode="0" ReplyText="">
		<COUNT Records="17534"/>
		<REData>
		<REProperties>
			<ResidentialProperty>
				<Listing>
					<MLS>S3840465</MLS>
					<Status>A</Status>
				</Listing>
			</ResidentialProperty>
			<ResidentialProperty>
				<Listing>
					<MLS>W3838640</MLS>
					<Status>A</Status>
				</Listing>
			</ResidentialProperty>
		</REProperties>
		</REData>
		<MAXROWS/>
		</RETS>
 * 
 */

@XmlRootElement(name="RETS")
@XmlAccessorType(XmlAccessType.FIELD)
public class LiteResPropertyWrapper{
    @XmlPath("REData/REProperties/ResidentialProperty")
    List<LiteResProperty> activeProperties;

	public List<LiteResProperty> getActiveProperties() {
		return activeProperties;
	}

	public void setActiveProperties(List<LiteResProperty> actResProperties) {
		this.activeProperties = actResProperties;
	}
    
}