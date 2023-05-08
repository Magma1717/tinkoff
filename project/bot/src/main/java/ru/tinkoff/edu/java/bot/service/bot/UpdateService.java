package ru.tinkoff.edu.java.bot.service.bot;


import ru.tinkoff.edu.java.bot.model.request.LinkUpdateRequest;

public interface UpdateService {
    void receiver(LinkUpdateRequest update);
}