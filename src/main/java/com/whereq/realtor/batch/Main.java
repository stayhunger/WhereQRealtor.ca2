package com.whereq.realtor.batch;

import java.util.concurrent.TimeUnit;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.common.util.concurrent.Uninterruptibles;

public class Main {

	public static void main(String[] args) {
		final ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		try {
			//active runner to update all active lstings
			//context.getBean("active_runner",ActiveListingRunner.class).run();
			
			//to load all freehold listings
			context.getBean("runner",Runner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Uninterruptibles.sleepUninterruptibly(20, TimeUnit.SECONDS);
	}
}