package src.main.java.ru.tinkoff.edu.java.scrapper.mapper;

import org.mapstruct.Mapper;
import ru.tinkoff.edu.java.scrapper.model.response.TgChatResponse;
import src.main.java.ru.tinkoff.edu.java.scrapper.domain.entity.Chat;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChatMapper {
    TgChatResponse chatToTgChatResponse(Chat chat);

    List<TgChatResponse> chatListToTgChatResponseList(List<Chat> chatList);
}