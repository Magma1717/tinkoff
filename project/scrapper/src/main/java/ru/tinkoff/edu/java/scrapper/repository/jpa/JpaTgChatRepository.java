package src.main.java.ru.tinkoff.edu.java.scrapper.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import src.main.java.ru.tinkoff.edu.java.scrapper.domain.entity.Chat;

public interface JpaTgChatRepository extends JpaRepository<Chat, Long> {
}