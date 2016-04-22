package com.codeography.copyValues;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import com.codeography.copyValues.mappingObj.Beans;
import com.codeography.copyValues.mappingObj.CopyValueItem;
import com.codeography.copyValues.mappingObj.Item;
import com.codeography.copyValues.mappingObj.Manager;

public class CopyValueToManager {
	
	private  File dir;
	
	static void run(List<CopyValueStatement> listOfCopyValues, File dir) {
		
//		path.getCanonicalPath().concat("\\").concat(task.getManagerFileName())
		try {
			
			for (CopyValueStatement task : listOfCopyValues){
				
				File file = new File(dir.getCanonicalPath().concat("\\model\\").concat(task.getManagerFileName()));
				JAXBContext jaxbContext = JAXBContext.newInstance(Beans.class);
				
				
				
				try {
					SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); 
					Schema schema = sf.newSchema(file);

				
				Marshaller marshallerObj = jaxbContext.createMarshaller();
				marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
				
				/*
				 * Marshalling test
				 */
					Item a = new Item("name", "dd");
					
					a.setItemCopyValue(new CopyValueItem("testname"));
					
					Manager man = new Manager(a);
					Beans b = new Beans();
					
					man.setName("SVBCIMP");
					man.setId("SVBCIMP.Manager.Config");
					
					b.setBeans(man);
					
					marshallerObj.marshal(b, new FileOutputStream("C:\\otherSpace\\Bip\\sandbox\\question.xml"));  
				/*
				 * Marshalling test end
				 */
					
					
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
		         * 
		         * 
		         * latest <namespace>
		         * http://blog.bdoughan.com/2010/12/jaxb-and-marshalunmarshal-schema.html
		         * http://www.eclipse.org/eclipselink/documentation/2.6/moxy/runtime006.htm
		         */
				
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				jaxbUnmarshaller.setSchema(schema);
				jaxbUnmarshaller.setEventHandler(new MyValidationEventHandler());
				Beans jb = (Beans) jaxbUnmarshaller.unmarshal(file);
				System.out.println(jb.getBeans().getName());
				
				} catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
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
