package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static{

        try{
            String path = "configuration.properties";
            FileInputStream input = new FileInputStream(path);

            properties = new Properties();
            properties.load(input);

            input.close();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    public static String getConfPropCredentials(String keyName){return properties.getProperty(keyName);}
}

