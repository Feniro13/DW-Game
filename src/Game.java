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
        quests.Waiter3();
        planet1.Landscape1();
        quests.Waiter5();
        planet1.Landscape2();
        quests.Waiter5();
        planet1.Landscape3();
        quests.Waiter5();
        planet1.Landscape4();
        planet1.Landscape5();
        planet1.Landscape6();
        planet1.Landscape7();
        planet1.Landscape8();
    }
    public void Events() {
        var = (int)(Math.random() * 3);
        if (var == 1) {
            quests.Fighting();
        }
        if (var == 2) {
            quests.Hiding();
        }
        if (var == 3) {
            quests.Solving();
        }
    }
}
