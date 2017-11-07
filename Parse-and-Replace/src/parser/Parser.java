package parser;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Parser {

	public static void main(String[] args) {

		try {
			
			File dir = new File(args[0] + "/app/src/main/res/layout/");
			File[] inpFiles = dir.listFiles(new FilenameFilter() {

				@Override
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
					return name.endsWith(".xml");
				}
			});
			for (int i = 0; i < inpFiles.length; i++) {

				SAXParserFactory factory = SAXParserFactory.newInstance();
				SAXParser saxParser = factory.newSAXParser();
				UserHandler userhandler = new UserHandler(inpFiles[i].getPath());
				saxParser.parse(inpFiles[i], userhandler);
				userhandler.getLayout().show();
				RandomAccessFile raf = new RandomAccessFile(
						args[0]
								+ "/app/src/main/java/"+ReadManifestXmlPackageLocation(args[0])+"/"
								+ userhandler.getActivity(), "rw");

				String line = " ";

				// System.out.println(line);
				int counter = 0;
				int lineCounter = 0;
				while (raf.getFilePointer() < raf.length() && line != null) {
					lineCounter++;
					line = new String(raf.readLine().getBytes(
							StandardCharsets.ISO_8859_1),
							StandardCharsets.UTF_8);
					if(lineCounter == 1){
						int pos = (int) raf.getFilePointer();
						
						byte[] b = new byte[(int) (raf.length() - pos)];
						raf.readFully(b);
						raf.seek(pos);
						System.out.println(new String(b));
						raf.write(("import gov.nasa.jpf.symbc.Debug;\n"+new String(b)).getBytes());
						raf.seek(pos+new String("import gov.nasa.jpf.symbc.Debug;\n").getBytes().length);
						
					}
					for (int i1 = 0; i1 < userhandler.getLayout()
							.getViewLength(); i1++) {
						System.out.println(userhandler.getLayout().getView(i1)
								.getId());
						String replacement = "findViewById(R.id."
								+ userhandler.getLayout().getView(i1).getId()
								+ ");";
						if (line.indexOf(replacement) > 0) {
							System.out.println("t");
							int pos = (int) raf.getFilePointer();
							byte[] b = new byte[(int) (raf.length() - pos)];
							raf.readFully(b);
							System.out.println(new String(b));
							raf.seek(pos - ((replacement+"\n").getBytes().length));
							raf.write(("Debug.makeSymbolicRef(\"et"
									+ counter
									+ "\",new "
									+ userhandler.getLayout().getView(i1)
											.getId() + "());\n"+new String(b)).getBytes());
							raf.seek(pos-new String(replacement+"\n").getBytes().length+new String("Debug.makeSymbolicRef(\"et"
									+ counter
									+ "\",new "
									+ userhandler.getLayout().getView(i1)
											.getId() + "());\n").getBytes().length);
							// System.out.println(new String(raf.readLine()
							// .getBytes(StandardCharsets.ISO_8859_1),
							// StandardCharsets.UTF_8));
						}
						// raf.seek(raf.getFilePointer());
						// //raf.readUTF().toString();
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String ReadManifestXmlPackageLocation(String string) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		String location = string+"/app/src/main/AndroidManifest.xml";
		File dir = new File(location);
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		Manifest userhandler = new Manifest();
		saxParser.parse(dir, userhandler);
		System.out.println(userhandler.getPackageLocation());
		return userhandler.getPackageLocation();
		
	}
}

class UserHandler extends DefaultHandler {
	private String location;
	private LayoutInfo layout;

	public LayoutInfo getLayout() {
		return layout;
	}

	public String getActivity() {
		// TODO Auto-generated method stub
		return layout.getActivity();
	}

	public void startDocument() throws SAXException {
		layout = new LayoutInfo(location);

	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if (qName.equalsIgnoreCase("RelativeLayout")) {
			String rollNo = attributes.getValue("tools:context");
			int index = rollNo.indexOf(".");
			String activity = rollNo.substring(index + 1);
			layout.setActivity(activity + ".java");
		}
		if (qName.equalsIgnoreCase("Button")) {
			String rollNo = attributes.getValue("android:id");
			int index = rollNo.indexOf("/");
			String id = rollNo.substring(index + 1);
			// ViewInfo view = new ViewInfo("Button", id);
			System.out.println("Button id : " + id);
			layout.addViews("Button", id);
			System.out.println("Button id : " + id);
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {

		if (qName.equalsIgnoreCase("Button")) {
			System.out.println("End Element :" + qName);
		}
	}

	@Override
	public void characters(char ch[], int start, int length)
			throws SAXException {

	}

	public UserHandler(String location) {
		this.location = location;
	}
}
