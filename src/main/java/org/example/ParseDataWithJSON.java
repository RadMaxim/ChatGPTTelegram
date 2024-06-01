package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class ParseDataWithJSON {
    public static JSONArray  getData() throws Exception{
        FileReader fileReader = new FileReader("Json.json");
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(fileReader);
        return jsonArray;



    }
}
