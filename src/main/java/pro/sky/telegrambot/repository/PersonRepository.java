package pro.sky.telegrambot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.telegrambot.model.DogReport;
import pro.sky.telegrambot.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
    /**
     * ищет пользователя из таблицы person в базе данных aaktdjun
     *
     * @param id - уникальный идентификатор пользователя в приложении telegram
     * @return возвращает пользователя
     */
    Person findByChatId(Long id);

}
