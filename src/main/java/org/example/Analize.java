package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Analize {
    public static StringBuilder analitic(String msg) throws Exception {
        JSONArray jsonArray =  ParseDataWithJSON.getData();
        StringBuilder stringBuilder = new StringBuilder(" ");
        for (Object obj: jsonArray) {
            JSONObject jsonObject = (JSONObject) obj;

            if (msg.contains(jsonObject.get("skills").toString())){
                stringBuilder.append(jsonObject.get("answer").toString());

            }
            System.out.println(stringBuilder);
        }
        System.out.println(stringBuilder);
        return stringBuilder;
    }
}
