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
 
public class JaxbRETSFullCondoPropertyTest {
 
    private static final String XML_FILE_IN = "c:\\tmp\\full_condo.xml";
    //private static final String XML_FILE_IN = "c:\\tmp\\crea\\treb_feed\\full\\gta_residential36.xml";
    private static final String XML_FILE_OUT = "c:\\tmp\\full_condo_out.xml";
    public static void main(String[] args) throws JAXBException,
            FileNotFoundException {
 
    	//to tell if we use the MOXY jar eclipselink.jar in your classpath
        System.out.println(JAXBContext.newInstance(FullCondoPropertyWrapper.class).getClass());
 
        FullListing l1 = new FullListing();
        l1.setAddress("21 Pineway Ave");;
        l1.setArea("York");
        l1.setListPrice(649900.0F);
        
        List<FullCondoProperty> reProperties = new ArrayList<FullCondoProperty>();
        FullCondoProperty rp = new FullCondoProperty();
 
        //rp.setListing(l1);
        reProperties.add(rp);
        
        FullListing l2 = new FullListing();
        l2.setAddress("23 Pineway Ave");;
        l2.setArea("Toronto");
        l2.setListPrice(589900.0F);
        FullCondoProperty rp2 = new FullCondoProperty();
        //rp2.setListing(l2);
        reProperties.add(rp2);
        
        
        FullCondoPropertyWrapper wrapper = new FullCondoPropertyWrapper();
        wrapper.setFullCndProperties(reProperties);

        
 
        // create JAXB context
        JAXBContext context = JAXBContext.newInstance(FullCondoPropertyWrapper.class);
 
        System.out.println("<!----------Generating the XML Output-------------->");
        // Marshalling [Generate XML from JAVA]
        // create Marshaller using JAXB context
        Marshaller m = context.createMarshaller();
        // To format the [to be]generated XML output
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // Marshall it and write output to System.out or to a file
        m.marshal(wrapper, System.out);
        m.marshal(wrapper, new File(XML_FILE_OUT));
 
        System.out.println("<!---------------Generating the Java objects from XML Input-------------->");
        // UnMarshalling [Generate JAVA from XML]
        // Instantiate Unmarshaller via context
        
        //TODO
        JAXBContext context2 = JAXBContext.newInstance(FullCondoPropertyWrapper.class);
        Unmarshaller um = context2.createUnmarshaller();
        // Unmarshall the provided XML into an object
        FullCondoPropertyWrapper response = (FullCondoPropertyWrapper) um.unmarshal(new FileReader(XML_FILE_IN));
        System.out.println("Listing: " + response.getFullCndProperties().size());
        //System.out.println("details: " + response.getActResProperties());
        List<FullCondoProperty> frp = response.getFullCndProperties();
        for (FullCondoProperty onerp: frp)
        {
        	System.out.println(onerp.toString());
        }
        
    }
 
}