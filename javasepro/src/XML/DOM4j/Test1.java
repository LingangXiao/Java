package XML.DOM4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    @Test
    public void parseToList() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/XML/contacts.xml"));

        Element root = document.getRootElement();
        List<Element> contactEles = root.elements("contact");
        List<Contact> contacts = new ArrayList<>();
        for (Element contactEle : contactEles) {
            Contact contact = new Contact();
            contact.setId(Integer.valueOf(contactEle.attributeValue("id")));
            contact.setVip(Boolean.valueOf(contactEle.attributeValue("vip")));
            contact.setName(contactEle.elementTextTrim("name"));
            contact.setGender(contactEle.elementTextTrim("gender"));
            contact.setEmail(contactEle.elementTextTrim("email"));
            contacts.add(contact);
        }
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
