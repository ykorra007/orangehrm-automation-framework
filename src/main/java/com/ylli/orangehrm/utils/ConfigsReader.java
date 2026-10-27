 
package com.ylli.orangehrm.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

    private static Properties prop;

    public static void readProperties(String filePath) {

        prop = new Properties();

        try (FileInputStream fis = new FileInputStream(filePath)) {

            prop.load(fis);

        } catch (IOException e) {

            prop = null;

            throw new RuntimeException(
                    "Nuk u lexua skedari: " + filePath, e);
        }
    }

    public static String getProperty(String key) {

        if (prop == null) {
            throw new IllegalStateException(
                    "Duhet të thërrasësh readProperties() përpara getProperty().");
        }

        return prop.getProperty(key);
    }
} 
