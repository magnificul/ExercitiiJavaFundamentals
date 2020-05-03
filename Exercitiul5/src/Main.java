public class Main {

    //Se da un text
    //Sa se afiseze toate cuvintele care incep cu litera "s" SAU cu litera "d",
    // Apoi sa se afiseze litera de la pozitia 3 din fiecare cuvant

    public static void main(String[] args) {

        String text = "Spre deosebire de povestirea ficțională, specia de povestire numită istorie nu este construită prin intuiție intelectuală, ci pornind de la surse: documente scrise, istorie orală, obiecte etc.";

    afisareCuvinte(text);
    literaPozitie3(text);


    }

    public static void afisareCuvinte(String text){
        String[] sirText = text.split(" ");

        for(int cursor = 0; cursor < sirText.length; cursor++){
            sirText[cursor] = sirText[cursor].toLowerCase();

            if(sirText[cursor].startsWith("s") || sirText[cursor].startsWith("d")){
                System.out.println(sirText[cursor]);
            }
        }

    }
    public static void literaPozitie3(String text){
        String[] sirText = text.split(" ");

        for(int cursor = 0; cursor <sirText.length; cursor++){
            if(sirText[cursor].length() > 3){
                System.out.println("Litera de pe pozitia 3 a cuvantului " + sirText[cursor] + " este: " + sirText[cursor].charAt(3));
            }

        }
    }

}
