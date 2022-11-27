package pro.sky.telegrambot.Models;


import com.pengrad.telegrambot.model.File;

public final class Shelter {

    private final String info = "Мы волонтеры кожуховского муниципального приюта. Наша главная цель, чтобы собаки покидали это место и обретали своих хозяев. Каким бы ни был хорошим или плохим приют, но это не дом для животных, чье основное предназначение – быть другом человека. Тем не менее, к сожалению, иногда это место становится пожизненным пребываниемМы часто слышим, что мы молодцы, что мы герои и так далее. Это не так. У нас нет суперспособностей и накидки за плечами, мы тоже ходим на работу, общаемся с друзьями, смотрим кино и даже делаем маникюр. У многих из нас есть семьи, дети и у нас тоже мало свободного времени. Но в какой-то момент каждый из нас почувствовал, что пройти мимо невозможно. Независимо от возраста и состояния здоровья каждая собака имеет право быть домашней и любимой и это является нашей конечной целью нашей деятельности в приюте. Мы занимаемся социализацией собак, приучаем ходить на поводке, общаться с человеком и другими собаками и, самое главное, не бояться и доверять людям. У каждой собаки своя история, и каждая может стать настоящим другом в правильных руках.";
    private final String schedule = "Время посещения приюта: с 9:40 до 18:00\n" +
            "\n" +
            "Четверг - Санитарный день. Приют не работает.";
    private final String adress = "город Москва, ул. Пехорская 1Б";
    private File map = new File();

    public String getRules() {
        return rules;
    }

    private String rules = "При общении с собакой из приюта нужно стараться совершать как можно меньше резких движений. Пока питомец привыкает к вам, ведите себя сдержанно, не давайте повода для стресса.";

    public Shelter() {
    }

    public String getInfo() {
        return info;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getAdress() {
        return adress;
    }

}
