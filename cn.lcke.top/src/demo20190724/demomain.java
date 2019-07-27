package demo20190724;

public class demomain {
    public static void main(String[] args) {
        Woan woan = new Woan();
        woan.setName("大保健");
        woan.setZhaung("剑");

        Hero hero = new Hero("盖伦",23,woan);
        hero.methom();
    }
}
