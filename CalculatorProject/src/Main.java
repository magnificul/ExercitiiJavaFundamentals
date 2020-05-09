

import java.util.Scanner;

public class Main {

    //Vrem sa se modeleze comportamentul unui calculator simplu (adunare, scadere, inmultire si impartire)
    //Calculatorul sa fie reprezentat folosind programarea orientata obiect.

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Rezultatul adunarii este: " + calculator.adunare(5,10));

        System.out.println("Rezultatul scaderii este: " + calculator.scadere(10,5));

        int inmultire = calculator.inmultire(2,2);
        System.out.println("Rezultatul inmultirii este: " + inmultire);

        int impartire = calculator.impartire(10,2);
        System.out.println("Rezultatul impartirii este: " + impartire);
        
        //De aici citim valorile de la tastatura
        //Obiectul care ne ajuta sa facem asta se numeste "Scanner"

        Scanner scanner = new Scanner(System.in);

        //Citeste primul numar de la tastatura
        System.out.println("Va rugam introduceti primul numar: ");
        int primulNumar = scanner.nextInt();

        //Citeste al doilea numar de la tastatura
        System.out.println("Va rugam introduceti al doilea numar: ");
        int alDoileaNumar = scanner.nextInt();

        //Afisam numerele introduse
        System.out.println("Numerele introduse de dvs sunt: " + primulNumar + " si " + alDoileaNumar);

        int adunare = calculator.adunare(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul adunarii este: " + adunare);

        int scadere = calculator.scadere(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul scaderii este: " + scadere);

        inmultire = calculator.inmultire(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul inmultirii este: " + inmultire);

        impartire = calculator.impartire(primulNumar, alDoileaNumar);
        System.out.println("Rezultatul impartirii este: " + impartire);

    }





}
