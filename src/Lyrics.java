public class Lyrics {

    // Клара
    public void ClaraFighting() {
        int var = (int) (Math.random() * 4);
        if (var == 1) {
            System.out.println("Клара: да!");
        }
        if (var == 2) {
            System.out.println("Клара: так им!");
        }
        if (var == 3) {
            System.out.println("Клара: ура!");
        }
        System.out.println();
        System.out.println();
    }

    public void ClaraHiding() {
        int var = (int) (Math.random() * 4);
        if (var == 1) {
            System.out.println("Клара: док, мне страшно...");
        }
        if (var == 2) {
            System.out.println("Клара: когда кричать?...");
        }
        if (var == 3) {
            System.out.println("Клара: фу, тут воняет...");
        }
        System.out.println();
        System.out.println();
    }

    public void ClaraWinning() {
        int var = (int) (Math.random() * 4);
        if (var == 1) {
            System.out.println("    Клара: я в вас не сомневалась!");
        }
        if (var == 2) {
            System.out.println("    Клара: да, так их!");
        }
        if (var == 3) {
            System.out.println("    Клара: красотища...");
        }
        System.out.println();
        System.out.println();
    }

    // Джек
    public void JackFighting() {
        int var = (int) (Math.random() * 4);
        if (var == 1) {
            System.out.println("Джек: я скучал по такому!");
        }
        if (var == 2) {
            System.out.println("Джек: лузеры!");
        }
        if (var == 3) {
            System.out.println("Джек: да!");
        }
        System.out.println();
        System.out.println();
    }

    public void JackHiding() {
        int var = (int) (Math.random() * 4);
        if (var == 1) {
            System.out.println("       Джек: весело...");
        }
        if (var == 2) {
            System.out.println("        Джек: док, спина не ноет?");
        }
        if (var == 3) {
            System.out.println("        Джек: я прикрою, давай, шевелись!");
        }
        System.out.println();
        System.out.println();
    }

    public void JackWinning() {
        int var = (int) (Math.random() * 4);
        if (var == 1) {
            System.out.println("        Джек: мы им не по зубам!");
        }
        if (var == 2) {
            System.out.println("        Джек: меня не убить, глупцы!");
        }
        if (var == 3) {
            System.out.println("        Джек: получили, лузеры?!");
        }
        System.out.println();
        System.out.println();
    }

    public void Fight() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                  __      ");
        System.out.println("                /  /      ");
        System.out.println("               /  /       ");
        System.out.println("              /  /        ");
        System.out.println("             /  /         ");
        System.out.println("        0 _ /  / _ 0      ");
        System.out.println("            //            ");
        System.out.println("           //             ");
        System.out.println("          ()              ");
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void Repair() {
        char lol = 92;
        String mem = String.valueOf(lol);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("         _ _ _ _           ");
        System.out.println("        /  _ _  " + mem);
        System.out.println("        | | _ | |     ");
        System.out.println("        | | _ | |   ");
        System.out.println("        | |   | |   ");
        System.out.println("        | _ _ _ |    ");
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void Capture() {
        int var = (int)(Math.random() * 3);
        if (var == 1) {
            System.out.println("Клара: вот мы и попались...");
            System.out.println("Джек: этого прикончу первым. Ишь как смотрит.");
            System.out.println("Клара: как воняет...");
            System.out.println("Вы: да, система вентиляции у этих созданий не в почете");
        }
        if (var == 2) {
            System.out.println("Клара: куда теперь?");
            System.out.println("Джек: на волю?");
            System.out.println("Клара: хотелось бы");
            System.out.println("Джек: зачем мы им вообще? Смысл в каких то идиотах-путниках, которых нашли в задворье империи?");
            System.out.println("Вы: может, это их столица");
            System.out.println("Джек: тогда где их цивилизация?");
            System.out.println("Клара: уничтожена? А это - лишь остатки?");
            System.out.println("Вы: не думаю, слишком уж богато они живут для последних выживших");
        }
        if (var == 3) {
            System.out.println("Джек: я отвлеку их, вы бегите");
            System.out.println("Клара: что?");
            System.out.println("Джек: я-ж бессмертный");
            System.out.println("Вы: тем дольше будешь мучаться");
            System.out.println("Клара: молись, чтобы тебя не похоронили заживо.");
            System.out.println("Джек: бывало. Копал несколько дней.");
            System.out.println("Клара: страшно, наверно...");
            System.out.println("Вы: не знаю как вы, а я предпочитаю болтать о таком у костра с зефирком");
            System.out.println("Клара: тут не поспоришь. Планы?");
        }
    }

    class Planet1 {
        public void Landscape1() {
            System.out.println("Вы очутились на таинственной планете с двумя светилами - желтым, как злато, и синим, как море.");
            System.out.println("Видимо, они не очень стараются со своей работой, раз даже в полдень... дважды полдень. Или полдень в квадрате. Неважно");
            System.out.println("Вообщем, прохладно. Едва ли 15 градусов, судя по всему. ");
            System.out.println("В полкилометре от вас высится высокий лес, напоминающий земную Амазонию, выкрашенную в загадочно-синий оттенок");
            System.out.println("Темные проулки меж деревьями под широкой синей кроной не внушают доверия");
            System.out.println();
            System.out.println("Клара: где мы?");
            System.out.println("Джек: не знаю... далеко. Телепорт сломан. - парень выбросил футуристичный браслетик, грустно ударившийся о сероватую скалу");
            System.out.println("Вы: я не знаю этих звезд...");
            System.out.println("Клара: а должны?");
            System.out.println("Джек: где бы мы ни были, это чертовски красиво...");
            System.out.println("Вы: есть шанс, что эти звезды будут названы вашими именами... Если хотите.");
            System.out.println("Клара: да? Интересно");
            System.out.println("Вы: названия объектов унифицированы с 5249 года... БУДУТ унифированы. Или были.");
            System.out.println("Джек: и вращались они долго и счастливо...");
            System.out.println("Клара: забей");
        }

        public void Landscape2() {
            System.out.println("Клара: где мы?");
            System.out.println();
            System.out.println("Хороший вопрос. Деревья, и без того подходившие непристойно близко к заблудшим," +
                    " приблизились еще сильнее. Кажется, скоро они уже сдавят грудь и все погибнут страшной смертью от удушья...");
            System.out.println("");
            System.out.println("Джек: пахнет... странно - действительно, стоял стойкий, странный запах... мандаринов?");
            System.out.println("Вы: я не чую ничего...");
            System.out.println("Клара: жаль. Стоило бы");
            System.out.println("Вы: опиши...");
            System.out.println("Клара: ну...");
            System.out.println("Джек: представь себе синий запах? Вот это точно он.");
            System.out.println("Вы: синий запах? окей...");
            System.out.println("Клара: по мне, более исчерпывающий ответ и не придумаешь");
        }
        public void Landscape3 () {
            System.out.println("Издалека послышался грозный океанский прибой. Не такой, какой обычно слышишь летом на Гавайях - ");
            System.out.println("Сильнее. намного. Будто девятиэтажные волны моментально рушились о высокие скалы синего альбиона.");
            System.out.println("Надо быть внимательнее, свалиться камнем с такой скалы не входило в планы усталых путников.");
        }

        public void Landscape4 () {
            System.out.println("После отчаянной погони вы неожиданно очутились на широкой поляне," +
                    " наполненной яркими цветами, отдаленно похожими на земные васильки. ");
            System.out.println("Клара: как… красиво.");
            System.out.println("Вы: не могу не согласиться");
            System.out.println("Клара: сорвать бы один себе домой…");
            System.out.println("Вы: ни в коем случае");
            System.out.println("Джек: серьёзно?");
            System.out.println("Вы: про эффект бабочки слыхал?");
            System.out.println("Клара: межпространственной бабочки");
            System.out.println("Джек: бабочки, сломавшей четвертую стену…");
        }

        public void Landscape5 () {
            System.out.println("Высокие волны отчаянно бьют прибрежные скалы в надежде раскрошить их" + "\n" +
                    " в мелкие кусочки, которые заполнять невидимое дно бескрайнего синего океана,"  + "\n" +
                    " напоминающего незаправленное одеяло темно-синего, почти фиолетового цвета. ");
            System.out.println("Клара: ничего себе…");
            System.out.println("Джек: тут метров 40 будет, если не больше…");
            System.out.println("Вы: вон та, на три часа, будет наверно на все 50");
            System.out.println("Клара: гиганты...");
            System.out.println();
            System.out.println("Джек хотел что-то добавить, но его голос был заглушен очередным валом, напустившем на них бесконечный поток ледяных брызг");
            System.out.println("Место красивое. И освежающее. Но нет смысла задерживаться тут надолго.");
        }

        public void Landscape6 () {
            System.out.println("Звуки прибоя скрылись вдали, ограждаемые от тишины поляны" +
                    " гигансткими скалами, выглаженными яростными валами за миллионы лет бренного существования на этой таинственной планете");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }

        public void Landscape7 () {
            System.out.println("Вы: я чувствую небольшое напряжение в воздухе...");
            System.out.println("Джек: ты свою будку на расстоянии чуешь?");
            System.out.println("Клара: удобно, даже противоугонку не надо");
            System.out.println("Вы: я же говорил, как работает тардис");
            System.out.println("Джек: проще говоря, твои песочные весы разбились, и ты идешь по полоске песка?");
            System.out.println("Вы: ага. И полоска идет в... этом направлении!");
        }

        public void Landscape8 () {
            System.out.println("Вы: вот она, моя родная...");
            System.out.println("Синяя будка, нисколько не похожая на сверхвременной космический корабль, " +
                    "очутилась перед их глазами, побитая и расцарапанная");
            System.out.println("К счастью, как знал Док, когда она решит себя починить, она станет только лучше...");
            System.out.println("Джек: да, делов тут, конечно...");
            System.out.println("Клара: жуткое зрелище.");
        }
        public void Landscape9 () {
            System.out.println();
            System.out.println();
        }
    }
}

