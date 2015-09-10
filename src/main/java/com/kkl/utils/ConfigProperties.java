/**
 * 
 */
package com.kkl.utils;

import java.net.URL;
import java.util.Properties;
import java.io.IOException;

/**
 * @author paxa1887
 *
 */
public class ConfigProperties {

	private static Properties PROPERTIES;

	static {
		PROPERTIES = new Properties();
		URL props = ClassLoader.getSystemResource("config.properties");
		try {
			PROPERTIES.load(props.openStream());
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public static String getProperty(String key) {
		return PROPERTIES.getProperty(key);

	}

}
