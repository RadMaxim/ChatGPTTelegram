package org.example;

import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) throws Exception {

            try {
                TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
                botsApi.registerBot(new Tgbot());
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }

//        //1
//        JSONObject newObject = new JSONObject();
//        newObject.put("question", "Frontend");
//        newObject.put("answers", Arrays.asList("    ",""));
//        //2
//
//        JSONObject newObject1 = new JSONObject();
//        newObject1.put("question", "Я очень люблю животных и хочу ухаживать за ними ");
//        newObject1.put("answers", Arrays.asList("",""));
//
//        JSONObject newObject2 = new JSONObject();
//        newObject2.put("question", "Я люблю помогать людям и лечить их");
//        newObject2.put("answers", Arrays.asList("",""));
//
//        JSONObject newObject3 = new JSONObject();
//        newObject3.put("question", "Я очень люблю строить и умею рисовать но не могу поднимать тяжести и не имею знаний о стройке");
//        newObject3.put("answers", Arrays.asList(" ",""));
//
//        JSONObject newObject4 = new JSONObject();
//        newObject.put("question", "Я очень ответственный человек и ");
//        newObject.put("answers", Arrays.asList(" ",""));
//
//
//
//        org.json.simple.JSONArray jsonArray = new org.json.simple.JSONArray();
//        jsonArray.add(newObject);
//        jsonArray.add(newObject1);
//        jsonArray.add(newObject2);
//        jsonArray.add(newObject3);
//
//
//        try {
//            FileWriter file = new FileWriter("myJsonFile.json");
//            file.write(jsonArray.toString());
//            file.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

}
