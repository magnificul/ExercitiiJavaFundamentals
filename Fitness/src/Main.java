import java.util.Scanner;

public class Main {

    //Sa se modeleze o sedinta de training
    //Vom avea: Trainee (cel care face sport)
    //Stamina
    //Strenght
    //O sa se antreneze Lunea, Miercurea si Vinerea
    //O sa porneasca cu stamina 1000
    //De fiecare data stamina o sa ii scada
    //De fiecare data puterea o sa ii scada
    //Porneste cu puterea 50
    //Lunea cardio
    //Miercurea body pump
    //Vineri box
    //Cardio scade stamina cu 30
    //Body pump scade stamina cu 50
    //Box scade stamina cu 70
    //stamina > 0

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numele Traineeului: ");
        String name = scanner.nextLine();
        Trainee ion = new Trainee(name);

        System.out.println("Introduceti ziua curenta: ");

        String ziCurenta = scanner.nextLine();

        while ((scanner.equals("Luni") || scanner.equals("Miercuri") || scanner.equals("Vineri")) && ion.getStamina() > 0) {
            switch (ziCurenta) {
                case "Luni":
                    ion.cardio();
                    System.out.println("Stamina a ajuns la " + ion.getStamina());
                    break;
                case "Miercuri":
                    ion.bodyPump();
                    System.out.println("Stamina a ajuns la " + ion.getStamina());
                    break;
                case "Vineri":
                    ion.box();
                    System.out.println("Stamina a ajuns la " + ion.getStamina());
                    break;
                default:
                    System.out.println("Nu am gasit ziua curenta");
                    break;
            }
            ziCurenta = scanner.nextLine();
        }
        if (!ziCurenta.equals("Luni") || !ziCurenta.equals("Miercuri") || !ziCurenta.equals("Vineri")) {
            System.out.println("In ziua de " + ziCurenta + " nu se antreneaza");
        }
        if (ion.getStamina() <= 0) {
            System.out.println("Trainee-ul" + ion.getName() + " a obosit");
        }
        System.out.println("Stamina trainee-ului " + ion.getName() + " a ajuns la " + ion.getStamina());

    }
}
