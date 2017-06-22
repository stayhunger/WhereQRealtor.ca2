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
 
public class JaxbRETSFullResPropertyTest {
 
    private static final String XML_FILE_IN = "c:\\tmp\\full_xpath_in.xml";
    //private static final String XML_FILE_IN = "c:\\tmp\\crea\\treb_feed\\full\\gta_residential36.xml";
    private static final String XML_FILE_OUT = "c:\\tmp\\full_xpath_out.xml";
    public static void main(String[] args) throws JAXBException,
            FileNotFoundException {
 
    	//to tell if we use the MOXY jar eclipselink.jar in your classpath
       // System.out.println(JAXBContext.newInstance(RETS.class).getClass());
 
        FullResListing l1 = new FullResListing();
        l1.setAddress("21 Pineway Ave");;
        l1.setArea("York");
        l1.setListPrice(649900.0F);
        
        List<FullResidentialProperty> reProperties = new ArrayList<FullResidentialProperty>();
        FullResidentialProperty rp = new FullResidentialProperty();
 
        rp.setListing(l1);
        reProperties.add(rp);
        
        FullResListing l2 = new FullResListing();
        l2.setAddress("23 Pineway Ave");;
        l2.setArea("Toronto");
        l2.setListPrice(589900.0F);
        FullResidentialProperty rp2 = new FullResidentialProperty();
        rp2.setListing(l2);
        reProperties.add(rp2);
        
        
        FullResidentialPropertyWrapper wrapper = new FullResidentialPropertyWrapper();
        wrapper.setActResProperties(reProperties);

        
 
        // create JAXB context
        JAXBContext context = JAXBContext.newInstance(FullResidentialPropertyWrapper.class);
 
        System.out.println("<!----------Generating the XML Output-------------->");
        // Marshalling [Generate XML from JAVA]
        // create Marshaller using JAXB context
        Marshaller m = context.createMarshaller();
        // To format the [to be]generated XML output
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // Marshall it and write output to System.out or to a file
        //m.marshal(wrapper, System.out);
        m.marshal(wrapper, new File(XML_FILE_OUT));
 
        System.out.println("<!---------------Generating the Java objects from XML Input-------------->");
        // UnMarshalling [Generate JAVA from XML]
        // Instantiate Unmarshaller via context
        
        //TODO
        JAXBContext context2 = JAXBContext.newInstance(FullResidentialPropertyWrapper.class);
        Unmarshaller um = context2.createUnmarshaller();
        // Unmarshall the provided XML into an object
        FullResidentialPropertyWrapper response = (FullResidentialPropertyWrapper) um.unmarshal(new FileReader(XML_FILE_IN));
        System.out.println("Listing: " + response.getActResProperties().size());
        //System.out.println("details: " + response.getActResProperties());
        List<FullResidentialProperty> frp = response.getActResProperties();
        for (FullResidentialProperty onerp: frp)
        {
        	System.out.println(onerp.toString());
        }
        
    }
 
}