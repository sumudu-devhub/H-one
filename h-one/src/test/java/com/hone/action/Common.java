package com.hone.action;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Common {
	public static String getData(String key) throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		JSONObject value = null;
		Object text  = null;
		try (FileReader reader = new FileReader("./data/data.json")) {
			// Read JSON file
			Object obj = jsonParser.parse(reader);

			value = (JSONObject) obj;
			text  = value.get(key);

			// Iterate over employee array

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return text.toString();
	}

}
