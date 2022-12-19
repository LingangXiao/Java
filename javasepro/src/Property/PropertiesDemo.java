package Property;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("Sean", "123");
        properties.setProperty("Lingang", "234");
        properties.setProperty("Xiao", "345");
        System.out.println(properties);

        properties.store(new FileWriter("src/Property/users.properties"), "this is user");

        //接下来要学习如何读取
        properties.load(new FileReader("src/Property/users.properties"));
        System.out.println(properties);

        //也可以通过键来取值
        String rs = properties.getProperty("Lingang");
        System.out.println(rs);
    }
}
