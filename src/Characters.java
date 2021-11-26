public class Characters {
    int lifepoints;
    int IQ;
    int strength;

    public Characters(int IQ, int strength) {
        this.lifepoints = lifepoints;
        this.IQ = IQ;
        this.strength = strength;
    }
    public static String newEnemy() {
        int variants = (int)(Math.random() * 4);
        if (variants == 1) {
            return "Далеки";
        }
        if (variants == 2) {
            return "Киберлюди";
        }
        if (variants == 3) {
            return "Зеленые Эльфы";
        }
        if (variants == 4) {
            return "Сонтаранцы";
        }
        return "Крекеры-мутанты";
    }
}
