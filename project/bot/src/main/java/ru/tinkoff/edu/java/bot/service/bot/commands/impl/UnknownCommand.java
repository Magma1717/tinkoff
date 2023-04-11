package ru.tinkoff.edu.java.bot.service.bot.commands.impl;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import lombok.Getter;
import ru.tinkoff.edu.java.bot.service.bot.commands.Command;

public class UnknownCommand implements Command {
    @Getter
    private static final String UNKNOWN_COMMAND = """
            Я не знаю эту команду )
            Воспользуйся /help""";

    @Override
    public String command() {
        return "";
    }

    @Override
    public String description() {
        return "Неизвестная команда";
    }

    @Override
    public SendMessage handle(Update update) {
        return new SendMessage(update.message()
                .chat()
                .id(), UNKNOWN_COMMAND);
    }
}