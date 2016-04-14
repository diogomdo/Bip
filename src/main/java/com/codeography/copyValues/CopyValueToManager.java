package com.codeography.copyValues;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;

public class CopyValueToManager {
	
	private  File dir;
	
	static void run(List<CopyValueStatement> listOfCopyValues, File dir) {
		
//		path.getCanonicalPath().concat("\\").concat(task.getManagerFileName())
		try {
			
			for (CopyValueStatement task : listOfCopyValues){
				
				File file = new File(dir.getCanonicalPath().concat("\\model\\").concat(task.getManagerFileName()));
				JAXBContext jaxbContext = JAXBContext.newInstance(Manager.class);
				
//				XMLInputFactory xif = XMLInputFactory.newFactory();
//				StreamSource xml = new StreamSource(file);
//		        XMLStreamReader xsr = xif.createXMLStreamReader(xml);
		        
		        /*
		         * TODO
		         * implementar os adaptars como deve ser
		         * http://ashisharya2003.blogspot.pt/2012/07/jaxb-xmladapter-customized-marshaling.html
		         * 
		         * Importante para o conflito de namespaces e schemas
		         * http://www.cubearticle.com/articles/core-java/jaxb/generate-namespace-schema-with-jaxb
		         * http://theopentutorials.com/tutorials/java/jaxb/jaxb-marshalling-and-unmarshalling-list-of-objects/
		         * https://dzone.com/articles/custom-spring-namespaces-made
		         * http://stackoverflow.com/questions/19199995/parse-nested-elements-in-an-xml-using-jaxb
		         * 
		         */
				
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				Manager jb = (Manager) jaxbUnmarshaller.unmarshal(file);
				System.out.println(jb);
		        
				/*
				 * TODO 
				 * http://blog.bdoughan.com/2012/08/handle-middle-of-xml-document-with-jaxb.html
				 */

			}
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
	}
}
