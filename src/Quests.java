import java.util.Locale;
import java.util.Scanner;

public class Quests {
    Scanner in = new Scanner(System.in);
    Lyrics lyrics = new Lyrics();

    Characters Clara = new Characters(50, 20);
    Characters Jack = new Characters(80, 50);

    boolean clara = true;
    boolean jack = true;
    boolean river = false;


    String ans = "";
    int var, var1, var2, var3, tar1, tar2, tar3, enemies, attempts, counter;
    int time = 220, kol = 0;
    int answ, pansw;
    int Way[] = new int[15];

    public void Fighting () {
        lyrics.Fight();
        Waiter3();
        System.out.println("Орды врага все прибывают, наполняя местные леса страшным воплем и жаждой крови");
        Waiter2();
        System.out.println("        У вас есть выбор - биться с ними, сдаться в плен, либо бежать!");
        ans = in.nextLine().toLowerCase(Locale.ROOT);
        if (ans.equals("бежать")) {
            System.out.println("                                                    Хороший выбор! Наверно...");
            int var = (int)(Math.random() * 2);
            if (var == 1) {
                Hiding();
            }

        }
        if (ans.equals("сдаться в плен")) {
            Captured();
        }
        if (ans.equals("биться")) {
            System.out.println("Джонни, они на деревьях!");
            Waiter2();
            System.out.println("Враг научился хорошо маскироваться!");
            Waiter2();
            System.out.println("У вас есть 8 возможных вариантов местонахождения врага! Какие 3 из них вы проверите!?");
            var1 = (int)(Math.random() * 8);
            var2 = (int)(Math.random() * 8);
            var3 = (int)(Math.random() * 8);
            tar1 = in.nextInt();
            tar2 = in.nextInt();
            tar3 = in.nextInt();
            enemies = (int)(Math.random() * 6);
            attempts = 0;
            kol = 0;
            while(kol < enemies) {
                counter = kol;
                if (tar1 == var1 || tar1 == var2 || tar1 == var3) {
                    System.out.println("Один из недругов ликвидирован!");
                    kol++;
                    Waiter2();
                    lyrics.ClaraFighting();
                }
                if (tar2 == var1 || tar2 == var2 || tar2 == var3) {
                    System.out.println("Один из недругов ликвидирован!");
                    kol++;
                    Waiter2();
                    lyrics.JackFighting();
                }
                if (tar3 == var1 || tar3 == var2 || tar3 == var3) {
                    System.out.println("Один из недругов ликвидирован!");
                    kol++;
                    Waiter2();
                }
                if(kol == counter) {
                    attempts++;
                    System.out.println("Ваши попытки провалились и вам пришлось отступить, и враг продолжил наступление!");
                    if (attempts == 3) {
                        Waiter3();
                        System.out.println("Вы не смогли отразить нападение и были взяты в плен!");
                        Captured();
                        break;
                    }
                }
                if (kol == enemies - 1) {
                    lyrics.JackWinning();
                    lyrics.ClaraWinning();
                    System.out.println("Это была грандиозная победа!");
                    System.out.println("Но не всегда может так повезти...");

                }
            }

        }


    }

    public void Hiding () {
        System.out.println("        Их слишком много! Вам надо оставаться в тени!");
        Waiter3();
        System.out.println("        К счастью, вы нашли удобную лазейку");
        Waiter2();
        System.out.println("        Держитесь в полной тишине, как бы ни хотелось кричать!");Waiter2();
        System.out.println("        На вашем пути лежит множество веток, листьев," +
                " и прочих предметов, которые могут вас выдать!");Waiter2();
        System.out.println("        Вам необходимо пройти их так, чтобы издать как можно меньше шума!");Waiter2();
        System.out.println("        (наличие пути спасения не гарантируется)");Waiter2();
        System.out.println("        Вы начинаете с точки -1");Waiter2();
        for (int i = 0; i < 15; i++) {
            Way[i] = (int)(Math.random() * 10);
            System.out.print(Way[i] + " ");
        }
        kol = 0;
        Waiter2();
        System.out.println("Введите координату,перемещение на которую покажется вам самым тихим. Максимальный уровень шума - 30.");Waiter2();
        System.out.println("Перемещаться можно на любое расстояние от 1 до 3 клеток");
        pansw = -1;
        answ = -1;
        while (answ != 15) {
            lyrics.JackHiding();
            lyrics.ClaraHiding();
            pansw = answ;
            answ = in.nextInt();
            if (Math.abs(answ - pansw) > 3) {
                System.out.println("Ход невозможен!");
                answ = pansw;
            }
            kol += Way[answ - 1];
            if(kol > 50) {
                System.out.println("Вас обнаружили!");Waiter2();
                System.out.println("Больше от них не скроешься!");Waiter2();
                System.out.println("Вы можете сражаться, или сдаться в плен!");Waiter2();
                ans = in.nextLine();
                if (ans.equals("Сражаться")) {
                    Fighting();
                } else {
                    Captured();
                }
            }
        }
        System.out.println("Вы успешно ушли!");Waiter2();

    }

    public void Solving () {
        System.out.println("        Вы нашли старый механизм. Числа, уравнения, загадки - работа для вас!");
        Waiter2();
        while (true) {
            var = (int)(Math.random() * 5);
            if (var == 1) {
                System.out.println("        Сумма цифр от одного до тринадцати (вкл)?");
                answ = in.nextInt();
                if (answ == 5) {
                    System.out.println("        Вы решили задачку!");
                    break;
                } else {
                    System.out.println("Nein");
                }
            }
            if (var == 2) {
                System.out.println("        Высота эвереста в см?");
                answ = in.nextInt();
                if (answ == 884800) {
                    System.out.println("        Вы решили задачку!");
                    break;
                }else {
                    System.out.println("        Nein");
                }
            }
            if (var == 3) {
                System.out.println("        КРЫМ?");
                ans = in.nextLine();
                if (ans == "НАШ" || ans == "наш" || ans == "Наш")  {
                    System.out.println("        Вы решили задачку!");
                    break;
                }else {
                    System.out.println("        НiТ!");
                }
            }
            if (var == 4) {
                System.out.println("        1024 * 512 * 32 * 4 * 2048");
                Waiter2();
                System.out.println("        _ _ _ _ _ _ _ _ _ _ _ _ _ ");
                Waiter2();
                System.out.println("        4096 * 256 * 16 * 4096 * 8");
                Waiter2();
                System.out.println("        Ответ в обыкновенной дроби, ex. '2/7''");
                ans = in.nextLine();
                if (ans == "1/4") {
                    System.out.println("        Вы решили задачку!");
                    break;
                }else {
                    System.out.println("        Nein");
                }
            }
            if (var == 0) {
                System.out.println("        ВГААА + БВАБА?");
                ans = in.nextLine();
                if (ans == "ДЖАВА" || ans == "джава") {
                    System.out.println("        Вы решили задачку!");
                    break;
                }else {
                    System.out.println("    Nein!");
                }
            }

        }
    }

    public void Captured() {
        lyrics.Capture();
        Waiter5();
        System.out.println("Для побега необходимо сломать наручники! ");
        Waiter2();
        System.out.println("Оковы раскованы!");
        kol = 0;
        attempts = 0;
        var1 = 1;
        var2 = 2;
        var3 = 3;
        System.out.println("Вы свободны! Хотя, не совсем");
        System.out.println("Враг бдит и мечет, и вам необходимо сторонится его взгляда!");
        System.out.println("Чтобы добраться до выхода, вам необходимо предугадать его поведение");
        System.out.println("Вы сейчас на позиции 11, куда свет не падает никогда. Вы можете проследить" +
                " замысловатый ход движений врага, находясь здесь");
        System.out.println("Переместиться можно только на 3 позиции, выход - в точке -1");
        while(attempts != -1){
            System.out.println("Позиции врага:");
            System.out.println(var1 + " " +  var2 + " " + var3);
            if (var1 == attempts || var2 == attempts || var3 == attempts) {
                System.out.println("Бегом назад!");
                attempts = 11;
                continue;
            }
            System.out.println("Ваша позиция: " + attempts);
            int oldatt = attempts;
            attempts = in.nextInt();
            if (attempts > 11 || attempts < -1 || (Math.abs(attempts - oldatt) > 3)) {
                attempts = oldatt;
                System.out.println("Невозможный ход!");
                continue;
            }
            var1 = var2;
            var2 = var3;
            var3 = var1 + var2;
            if (var3 > 10) {
                var3 = var3 - 10;
            }
            Waiter2();
        }
        System.out.println("Запах свободы!");
    }

    public void Repairing() {
        lyrics.Repair();
        Waiter5();
        System.out.println("        Вы нашли Тардис, но она разбита! Необходимо время, чтобы ее починить!");
        Waiter2();
        if (jack) {
            time -= Jack.IQ;
        }
        if (clara) {
            time -= Clara.IQ;
        }
        String taber = "";
        for (int i = 0; i < time; i++) {
            System.out.println(taber + "Вжик-Вжик");
            taber += "      ";
        }
        Waiter2();
        System.out.println("                                                    Готово! Вы победили!");
    }


    public void Waiter5() {
        try {
            Thread.sleep((long)5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void Waiter2() {
        try {
            Thread.sleep((long)2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void Waiter3() {
        try {
            Thread.sleep((long)3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
