package com.codeography.copyValues;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.codeography.copyValues.mappingObj.Beans;

public class Executor {

	static void run(List<CopyValueStatement> listOfCopyValues, File dir) {

		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder;
		
		try {
		
			docBuilder = docFactory.newDocumentBuilder();
		
			
			
	//		path.getCanonicalPath().concat("\\").concat(task.getManagerFileName())
				
			for (CopyValueStatement task : listOfCopyValues){
				
				File file = new File(dir.getCanonicalPath().concat("\\model\\").concat(task.getManagerFileName()));
				Document doc = docBuilder.parse(file);
				// Get the root element
				Node company = doc.getFirstChild();
				Node staff = doc.getElementsByTagName("item").item(0);
			
			}
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
