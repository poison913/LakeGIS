package util;
import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlUtils {

    /**
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     *
     */
    public static String jdbcstring() throws ParserConfigurationException, SAXException, IOException {

    	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		Document document = builder.parse(new File("database.ini"));
		Element rootElement = document.getDocumentElement();

		NodeList list = rootElement.getElementsByTagName("jdbcstr");
		Element jdbcstr = (Element) list.item(0);

		String jdbcs = (String)jdbcstr.getChildNodes().item(0).getNodeValue();
		return jdbcs;
    }

    public static String jdbcusername() throws ParserConfigurationException, SAXException, IOException {
    	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		Document document = builder.parse(new File("database.ini"));
		Element rootElement = document.getDocumentElement();

		NodeList list1 = rootElement.getElementsByTagName("username");
		Element username = (Element) list1.item(0);

		String usernamestr = (String)username.getChildNodes().item(0).getNodeValue();
		return usernamestr;
    }

    public static String jdbcpassword() throws ParserConfigurationException, SAXException, IOException {
    	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		Document document = builder.parse(new File("database.ini"));
		Element rootElement = document.getDocumentElement();

		NodeList list2 = rootElement.getElementsByTagName("password");
		Element password = (Element) list2.item(0);
		String password11  =  (String)  password.getChildNodes().item(0).getNodeValue();
		return password11;
    }


	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
//		String str = jdbcstring();
//		String username = jdbcusername();
//		String password = jdbcpassword();
//		System.out.println(str);
//		System.out.println(username);
//		System.out.println(password);
		String classpath = System.getProperty("user.dir");
    	System.out.println(classpath);
    }


}
