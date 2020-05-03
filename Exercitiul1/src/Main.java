public class Main {

    //Cerinte:
    //O functie care primeste 2 stringuri ca parametru si verifica daca al doilea string exista in primul string
    // (daca primul string il contine pe al doilea)

    public static void main(String[] args) {

        String string1 = "Ana are pere de aceasta data.";
        String string2 = "Ana are pere.";

        verificaIncludere(string1, string2);
    }

    public static void verificaIncludere(String string1, String string2){

        if(string1.contains(string2)){
            System.out.println("Primul string il contine pe al doilea");

            }else{
            System.out.println("Primul string nu il contine pe al doilea");
        }


    }


}
