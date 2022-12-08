package pro.sky.telegrambot.reply;

import com.pengrad.telegrambot.model.request.*;


/**
 * класс для хранения раздичных видов клавиатур, используемых при ответах бота
 */
public final class Keyboards {

    /**
     * Начальная клавитаура после /start
     */
    private final Keyboard initialKeyboard = new ReplyKeyboardMarkup(
            new String[]{"Узнать о приюте", "Как взять собаку из приюта?", "Прислать отчет о питомце"},
            new String[]{"Позвать волонтера"}
    );

    /**
     * клавиатура с запросами информации о приюте (константы ид класса Shelter)
     */
    private final Keyboard infoKeyboard = new ReplyKeyboardMarkup(
            new String[]{"Расскзать о приюте", "График работы приюта"},
            new String[]{"Показать адрес приюта", "Как вести себя в приюте"},
            new String[]{"Поделитесь контактными данными"},
            new String[]{"Позвать волонтера"}
    );

    /**
     * клавиатура с ссылками на карты Гугл и Яндекс
     */
    private final InlineKeyboardMarkup showOnMap = new InlineKeyboardMarkup(
            new InlineKeyboardButton("Google-карты").url("https://goo.gl/maps/Eb8FvemYc7RyCAnG6"),
            new InlineKeyboardButton("Яндекс-карты").url("https://yandex.ru/maps/-/CCUfBUVkCC"));



    // Геттеры для клавиатур

    public Keyboard getAutoReply() {
        return new ForceReply();
    }

    public Keyboard getInitialKeyboard() {
        return initialKeyboard;
    }

    public Keyboard getInfoKeyboard() {
        return infoKeyboard;
    }

    public InlineKeyboardMarkup getShowOnMap() {
        return showOnMap;
    }

}



