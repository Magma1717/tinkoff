package src.main.java.ru.tinkoff.edu.java.scrapper.configuration;

import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;
import ru.tinkoff.edu.java.scrapper.service.shedule.Schedule;
import src.main.java.ru.tinkoff.edu.java.scrapper.configuration.access.AccessType;

@Validated
@ConfigurationProperties(prefix = "app", ignoreUnknownFields = false)
public record ApplicationConfig(@NotNull String test, @NotNull Schedule scheduler,
                                @NotNull AccessType databaseAccessType) {
}