/*package com.training.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyHelper {

	private static Properties CONFIG = null;

	/**
	 * Gets the config - Returns CONFIG file as properties object.
	 *
	 * @param fileName
	 *            the file name
	 * @return the config
	 */
/*	public static Properties getConfig(String fileName) {

		synchronized (PropertyHelper.class) {
			if (null != CONFIG) {
				return CONFIG;
			}

			String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\configFiles\\" + fileName;
			FileInputStream f;
			try {
				f = new FileInputStream(filePath);
				CONFIG = new Properties();
				CONFIG.load(f);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return CONFIG;
		}
	}

}
*/