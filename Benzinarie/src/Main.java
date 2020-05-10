import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Sa se modeleze o benzinarie
        //Obiectele:
        // Gas Station
        //O sa  aiba benzina si motorina
        // 1000 L bezina, 2000 l motorona
        //pret/l
        //cand cineva cumpara scade din cantitate
        //cand cantitatea e mai mica de 10 litri afisam un mesaj
        //cand cineva cumpara calculam pretul
        //obiect person cu o suma de bani
        //el o sa poata sa plateasca pentru benzina sau motorina
        //suma platita se scade din suma de bani
        //persoana poate sa plateasca cu o suma rotunda si benzinaria trebuie sa dea rest
        //daca utilizatorul nu are destui bani afisam un mesaj

        GasStation omv = new GasStation(5, 5, 5, 4);
        Scanner scannerPersoana = new Scanner(System.in);
        System.out.println("Va rugam sa introduceti numele persoanei: ");
        String name = scannerPersoana.nextLine();
        Person cumparator = new Person(name, 300);
        Scanner menu = new Scanner(System.in);
        System.out.println("Va rugam alegeti o optiune");
        System.out.println("1. Motorina");
        System.out.println("2. Benzina");
        int optiune = 0;
        optiune = menu.nextInt();
        Scanner cantitate = new Scanner(System.in);
        System.out.println("Introduceti cantitatea:");
        int litri = cantitate.nextInt();
        System.out.println("Ati introdus cantitatea " + litri);

        while (optiune != 9) {
            if (optiune == 1) { //prima optiune
                System.out.println("Ati ales sa cumparati motorina");
                int pretTotal = omv.sellM(litri); //stocam pretul motorinei de cumparat in variabila
                System.out.println("Aveti de platit: " + pretTotal);
                String rezultatTranzactie = cumparator.tranzactieMotorina(pretTotal);
                //verificam daca clientul are bani
                if (rezultatTranzactie.startsWith("Nu avem destui bani")) {
                    String incasare = omv.incaseazaBani(pretTotal / 2, pretTotal);
                    System.out.println("Rezultatul tranzactiei este: " + incasare);
                } else {
                    String incasare = omv.incaseazaBani(pretTotal, pretTotal);
                    System.out.println("Rezultatul tranzactiei este: " + incasare);
                    System.out.println("A mai ramas atata motorina" + omv.getMotorina());
                }

            } else if (optiune == 2) { //a doua optiune
                System.out.println("Ati ales sa cumparati benzina");
                int pretTotal = omv.sellB(litri);
                System.out.println("Aveti de platit: " + pretTotal);
                String rezultatTranzactie = cumparator.tranzactiiBenzina(pretTotal);
                if (rezultatTranzactie.startsWith("Nu avem destuli bani")) {
                    String incasare = omv.incaseazaBani(pretTotal / 2, pretTotal);
                    System.out.println("Rezultatul tranzactiei este:" + incasare);
                } else {
                    String incasare = omv.incaseazaBani(pretTotal, pretTotal);
                    System.out.println("Rezultatul tranzactiei este" + incasare);
                    System.out.println("A mai ramas atata benzina" + omv.getBenzina());
                }
            } else {
                System.out.println("Nu gasim optiunea");
            }
        }
    }
}
