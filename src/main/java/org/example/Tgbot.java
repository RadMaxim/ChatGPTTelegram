package org.example;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Tgbot extends TelegramLongPollingBot {
    static String state = "start";


    @Override
    public void onUpdateReceived(Update update) {
        String msg = update.getMessage().getText();
        String id = update.getMessage().getChatId().toString();
        if (state.equals("answer")){
            try {
                execute(new SendMessage(id,Analize.analitic(msg).toString()));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        try {
            System.out.println(Analize.analitic(msg));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (update.hasMessage() && update.getMessage().hasText()) {
            if (update.getMessage().getText().equals("/start")) {
                SendMessage message = new SendMessage();
                message.setChatId(update.getMessage().getChatId());
                message.setText("Приветствую тебя! Я помощник в поиске работы по качествам. Если ты ищешь идеальное сочетание профессии с твоими уникальными навыками, характеристиками и интересами, то ты попал по адресу. Давай вместе откроем мир возможностей и найдем работу, которая подчеркнет твои сильные стороны и принесет удовлетворение.");
                state = "answer";
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    @Override
    public String getBotUsername() {
        return "Les18_1OpenCv_Radchuk_bot";
    }

    @Override
    public String getBotToken() {
        return "6567440090:AAGC0oKTz-R9jKOxQUDmevEmvKc7r_RT8m0";
    }
}
