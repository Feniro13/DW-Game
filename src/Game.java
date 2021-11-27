import java.util.Scanner;

public class Game {
    Scanner in = new Scanner(System.in);

    Quests quests = new Quests();
    Lyrics lyrics = new Lyrics();
    Lyrics.Planet1  planet1 = lyrics.new Planet1();

    int kol = 0;
    int move;
    int var;
    String ans;

    public void startGame() {
        System.out.println("                                                    Добро пожаловать в текстовую игру по мотивам Doctor Who!");
        System.out.println("                                                        Вы будете в роли Доктора, который, как обычно, потерял Тардиc");
        System.out.println("                                                            С вами будут Клара и Джек, которые по стечению обстоятельств были рядом во время крушения");
        System.out.println("                                                                    Удачи!");
        quests.Waiter2();
        System.out.println("            Введите START чтобы начать игру");
        ans = in.nextLine();


    }
    public void mainGame() {
        planet1.Landscape1();Events();quests.Waiter3();
        planet1.Landscape2();Events();quests.Waiter3();
        planet1.Landscape3();Events();quests.Waiter3();
        planet1.Landscape4();Events();quests.Waiter3();
        planet1.Landscape5();Events();quests.Waiter3();
        planet1.Landscape6();Events();quests.Waiter3();
        planet1.Landscape7();Events();quests.Waiter3();
        planet1.Landscape8();Events();quests.Waiter3();
    }
    public void Events() {
        var = (int)(Math.random() * 3);
        if (var == 0) {
            quests.Fighting();
        }
        if (var == 1) {
            quests.Hiding();
        }
        if (var == 2) {
            quests.Solving();
        }
    }
}
