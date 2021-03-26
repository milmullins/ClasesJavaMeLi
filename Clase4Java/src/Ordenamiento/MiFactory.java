package Ordenamiento;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class MiFactory {

    public static Object getInstance(String objName) {

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(new File("MiFactory.properties")));

            Object obj = Class.forName(properties.getProperty(objName)).newInstance();
            return obj;
        } catch (Exception e) {
            return null;
        }

    }
}
