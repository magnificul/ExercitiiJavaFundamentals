public class Main {

    //Se da un array de 7 cuvinte: sa se concateneze si sa se afiseze cuvintele de pe pozitiile divizibile cu 3 si mai mari decat 0

    public static void main(String[] args) {


        String[] arrayCuvinte = new String[7];
        arrayCuvinte[0] = "uneltele";
        arrayCuvinte[1] = "ocupațiile";
        arrayCuvinte[2] = "organizarea";
        arrayCuvinte[3] = "oamenilor";
        arrayCuvinte[4] = "creațiile";
        arrayCuvinte[5] = "creațiile";
        arrayCuvinte[6] = "artistice";

        concatenare(arrayCuvinte);

    }

    public static void concatenare(String[] arrayCuvinte){
         String cuvinte = " ";
        for(int cursor = 1; cursor < arrayCuvinte.length; cursor++){
            if(cursor % 3 == 0){
               cuvinte = cuvinte.concat(arrayCuvinte[cursor]);

            }
        }
        System.out.println("Rezultat: " + cuvinte);
    }

}
