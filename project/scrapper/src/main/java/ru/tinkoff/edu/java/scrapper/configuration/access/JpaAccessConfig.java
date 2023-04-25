package src.main.java.ru.tinkoff.edu.java.scrapper.configuration.access;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.tinkoff.edu.java.scrapper.service.LinkService;
import ru.tinkoff.edu.java.scrapper.service.TgChatService;
import src.main.java.ru.tinkoff.edu.java.scrapper.mapper.ChatMapper;
import src.main.java.ru.tinkoff.edu.java.scrapper.mapper.LinkMapper;
import src.main.java.ru.tinkoff.edu.java.scrapper.repository.jpa.JpaGitHubUpdatesRepository;
import src.main.java.ru.tinkoff.edu.java.scrapper.repository.jpa.JpaLinkRepository;
import src.main.java.ru.tinkoff.edu.java.scrapper.repository.jpa.JpaStackOverflowUpdatesRepository;
import src.main.java.ru.tinkoff.edu.java.scrapper.repository.jpa.JpaTgChatRepository;
import src.main.java.ru.tinkoff.edu.java.scrapper.service.jpa.JpaLinkService;
import src.main.java.ru.tinkoff.edu.java.scrapper.service.jpa.JpaTgChatService;


@Configuration
@ConditionalOnProperty(prefix = "app", name = "database-access-type", havingValue = "jpa")
public class JpaAccessConfig {

    @Bean
    public LinkService linkService(JpaLinkRepository jpaLinkRepository,
                                   JpaTgChatRepository jpaTgChatRepository,
                                   LinkMapper linkMapper,
                                   JpaGitHubUpdatesRepository gitHubUpdatesRepository,
                                   JpaStackOverflowUpdatesRepository stackOverflowUpdatesRepository) {
        return new JpaLinkService(jpaLinkRepository,
                jpaTgChatRepository,
                linkMapper,
                gitHubUpdatesRepository,
                stackOverflowUpdatesRepository);
    }

    @Bean
    public TgChatService tgChatService(JpaTgChatRepository chatRepository,
                                       ChatMapper chatMapper) {
        return new JpaTgChatService(chatRepository, chatMapper);
    }
}