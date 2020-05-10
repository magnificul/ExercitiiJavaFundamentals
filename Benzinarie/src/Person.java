public class Person {
    private String name;
    private int money;

    public Person(String name, int money) {
        this.money = money;
        this.name = name;
    }

    public String tranzactiiBenzina(int baniDePlatit) {
        if (baniDePlatit > this.money) {
            return "Nu avem destui bani";
        } else {
            money -= baniDePlatit;
            return "Mai avem atatia bani " + this.money;
        }
    }

    public String tranzactieMotorina(int baniDePlatit) {
        if (baniDePlatit > this.money) {
            return "Nu avem destui bani";
        } else {
            money -= baniDePlatit;
            return "Mai avem atatia bani " + this.money;
        }
    }

}