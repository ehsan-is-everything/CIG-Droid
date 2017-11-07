package parser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Manifest extends DefaultHandler {

	private String location;

	public String getPackageLocation() {
		// TODO Auto-generated method stub
		return location;
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if (qName.equalsIgnoreCase("manifest")) {
			String rollNo = attributes.getValue("package");
			System.out.println(rollNo);
			location = rollNo.replaceAll("\\.", "/");
		}
		
	}


}
