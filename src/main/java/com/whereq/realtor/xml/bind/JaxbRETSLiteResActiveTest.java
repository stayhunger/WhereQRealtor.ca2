package com.whereq.realtor.xml.bind;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
 
public class JaxbRETSLiteResActiveTest {
 
    private static final String XML_FILE_IN1 = "c:\\tmp\\active_freehold.xml";
    private static final String XML_FILE_IN2 = "c:\\tmp\\active_condo.xml";
    private static final String XML_FILE_IN3 = "c:\\tmp\\active_commercial.xml";
    
    private static final String XML_FILE_OUT = "c:\\tmp\\xpath_test.xml";
    public static void main(String[] args) throws JAXBException,
            FileNotFoundException {
 
    	//to tell if we use the MOXY jar eclipselink.jar in your classpath
       // System.out.println(JAXBContext.newInstance(RETS.class).getClass());
 
    	List<LiteResProperty> actResProperties = new ArrayList<LiteResProperty>();
    	
    	LiteResProperty rp1 = new LiteResProperty();
        rp1.setMls("M12345");
        rp1.setStatus("A");
        actResProperties.add(rp1);
        
    	LiteResProperty rp2 = new LiteResProperty();
        rp2.setMls("M23456");
        rp2.setStatus("U");
        actResProperties.add(rp2);
        
        
        LiteResPropertyWrapper al = new LiteResPropertyWrapper();
        al.setActiveProperties(actResProperties);
        
        
        
        // create JAXB context
        JAXBContext context0 = JAXBContext.newInstance(LiteResPropertyWrapper.class);
 
        System.out.println("<!Step 1: ----------Generating the XML Output-------------->");
        // Marshalling [Generate XML from JAVA]
        // create Marshaller using JAXB context
        Marshaller m = context0.createMarshaller();
        // To format the [to be]generated XML output
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // Marshall it and write output to System.out or to a file
        //m.marshal(al, System.out);
        m.marshal(al, new File(XML_FILE_OUT));
 
        System.out.println("<!Step 2: ---------------Generating the Java objects from XML Input-------------->");
        // UnMarshalling [Generate JAVA from XML]
        // Instantiate Unmarshaller via context
        
        //Test Freehold Active Residential Propertye xml input
        JAXBContext context1 = JAXBContext.newInstance(LiteResPropertyWrapper.class);
        Unmarshaller um1 = context1.createUnmarshaller();
        // Unmarshall the provided XML into an object
        LiteResPropertyWrapper response1 = (LiteResPropertyWrapper) um1.unmarshal(new FileReader(XML_FILE_IN1));
        List<LiteResProperty>  activeResListings = response1.getActiveProperties();
        System.out.println("active freehold listings : " + activeResListings.size());
        //System.out.println("active listings : " + activeResListings);
        for (LiteResProperty arl : activeResListings) {
            System.out.println("MLS : " + arl.getMls());
            System.out.println("Status : " + arl.getStatus());
        }
        
        //Test  Active condo Propertye xml input
        JAXBContext context2 = JAXBContext.newInstance(LiteCondoPropertyWrapper.class);
        Unmarshaller um2 = context2.createUnmarshaller();
        // Unmarshall the provided XML into an object
        LiteCondoPropertyWrapper response2 = (LiteCondoPropertyWrapper) um2.unmarshal(new FileReader(XML_FILE_IN2));
        List<LiteCondoProperty>  activeResListings2 = response2.getActiveProperties();
        System.out.println("active condo listings : " + activeResListings2.size());
        for (LiteCondoProperty arl : activeResListings2) {
            //System.out.println("MLS : " + arl.getMls());
            //System.out.println("Status : " + arl.getStatus());
        }
        
        
    }
 
}