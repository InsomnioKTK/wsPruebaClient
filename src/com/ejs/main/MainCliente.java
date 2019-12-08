package com.ejs.main;

import java.net.URL;

import com.ejs.Bicicleta;
import com.ejs.Service;
import com.ejs.ServiceService;

public class MainCliente {

	public static void main(String[] args) {
		URL url;
		try {
			
			
			Bicicleta person = new Bicicleta();
		
			
			//1º Versión artesanal
			/*
			url = new URL("http://localhost:8080/SoapWsSimple/services/PersonServiceImplPort?wsdl");
			QName qname = new QName("http://service.ejs.com/", "PersonServiceImplService");
			Service service = Service.create(url, qname);
			PersonService pservice = service.getPort(PersonService.class);
			pservice.addPerson(person);
			System.out.println(pservice.getAllPersons());
			*/

			//2º Versión wsimport
			ServiceService BiciService = new ServiceService();
		    Service pservice = BiciService.getServicePort();
		
		    
			System.out.println(pservice.getBicicleta());
			
			System.out.println(pservice.getBicicletasXML());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
