package com.codeography.copyValues;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.codeography.core.Task;

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
				doc.getDocumentElement().normalize();
				searchaddElement(doc, task);
				
				doc.getDocumentElement().normalize();
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
				System.out.println("-----------CopyValue added-----------");
		        StreamResult consoleResult = new StreamResult(file);
		        transformer.transform(source, consoleResult);
		    }

		} catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 private static void searchaddElement(Document doc,CopyValueStatement task) {
		
		 /*
		  * Copy value Node
		  * <item name="SPND_FSYR_CODE" businessObject="SPND_CTRL"/>
		  */
		 
		 NodeList itemslst = doc.getElementsByTagName("item");

	        //loop for each employee
	        for(int i=0; i<itemslst.getLength();i++){
	        	Element item = (Element) itemslst.item(i);
	        	if (item.getAttribute("name").equals(task.getItemCopyTo())) {
	        		Element valElement = doc.createElement("value");
		        	Element copyValueItemElement = doc.createElement("item");
		        	copyValueItemElement.setAttribute("businessObject", task.blockCopyFrom );
		        	copyValueItemElement.setAttribute("name", task.itemCopyFrom);
		        	

		        	item.appendChild(valElement);
		        	valElement.appendChild(copyValueItemElement);
	        		
	        	}
	        	
	        }
	 
	 }
}
