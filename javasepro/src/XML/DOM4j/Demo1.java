package XML.DOM4j;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.io.InputStream;
import java.util.List;

/*学会使用dom4j解析xml文件中的数据*/
public class Demo1 {
    @Test
    public void parseXMLDataI() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new File("src/XML/contacts.xml"));
        //但是靠路径并不是十分的靠谱
        /*InputStream is = Demo1.class.getResourceAsStream("/contacts.xml");
        Document document = saxReader.read(is);*/

        Element root = document.getRootElement();
        System.out.println(root.getName());

        List<Element> someEles = root.elements("contact");
        for (Element someEle : someEles) {
            System.out.println(someEle.getName());
        }
        Element user = root.element("user");
        System.out.println(user.getName());

        Element contact = root.element("contact");
        System.out.println(contact.elementText("name"));
        System.out.println(contact.attribute("id"));
    }
}
