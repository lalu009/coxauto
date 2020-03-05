package uk.co.coxauto.loadProperty;

import javafx.scene.chart.ScatterChart;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by  :  Gaurang Patel
 * since : Saturday  29/02/2020
 * TIME  : 14:27
 **/
public class LoadProperty {
    static Properties prop;
    static FileInputStream input;


    public String getProperty(String key) {

        prop = new Properties();

        try {

            input = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\resource\\propertiesfile\\config.properties");
            prop.load(input);

        } catch (IOException e) {
            e.printStackTrace();

        }
        return prop.getProperty(key);

    }
}
