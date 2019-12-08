package com.ejs.main;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.ejs.soapws.BicicletasWebService;
import com.ejs.soapws.BicicletasWebServiceService;


public class MainCliente {

	public static void main(String[] args) {

		try {
		
			BicicletasWebServiceService biciService = new BicicletasWebServiceService();
		    BicicletasWebService pservice = biciService.getBicicletasWebServicePort();
		
			System.out.println(pservice.getBicicleta());
			
			System.out.println(pservice.getBicicletasXML());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
