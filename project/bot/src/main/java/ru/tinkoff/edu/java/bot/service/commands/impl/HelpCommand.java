package ru.tinkoff.edu.java.bot.service.commands.impl;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import org.springframework.stereotype.Component;
import ru.tinkoff.edu.java.bot.service.commands.Command;

@Component
public class HelpCommand implements Command {
    @Override
    public String command() {
        return "/help";
    }

    @Override
    public String description() {
        return "Вывести окно с командами";
    }

    @Override
    public SendMessage handle(Update update) {
        return new SendMessage(update.message().chat().id(),"/start -- Зарегистрировать пользователя\uD83D\uDC8B\n" +
                "/help -- Вывести окно с командами\uD83E\uDEF6\n" +
                "/track -- Начать отслеживание ссылки\uD83D\uDC85\n" +
                "/untrack -- Прекратить отслеживание ссылки✨\n" +
                "/list -- Показать список отслеживаемых ссылок\uD83D\uDCA6");
    }
}
