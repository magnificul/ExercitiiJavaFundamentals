import org.w3c.dom.ls.LSOutput;

public class GasStation {
    int motorina;
    int benzina;
    int pretM;
    int pretB;

    public GasStation(int motorina, int pretM, int benzina, int pretB) {
        this.motorina = motorina;
        this.pretB = pretB;
        this.pretM = pretM;
        this.benzina = benzina;
    }

    public int getMotorina() {
        return motorina;
    }

    public int getBenzina() {
        return benzina;
    }

    public int getPretM() {
        return motorina;
    }

    public int getPretB() {
        return pretB;
    }

    public int sellM(int motorinaDeVandut) {
        int pretTotal = 0;
        if (this.motorina < 10) {
            System.out.println("Nu avem motorina in stoc");
        } else {
            if (motorinaDeVandut > this.motorina) {
                System.out.println("Nu avem atata motorina!");
            }
            this.motorina -= motorinaDeVandut;
            pretTotal = motorinaDeVandut * pretM;
        }
        return pretTotal;
    }

    public int sellB(int benzinaDeVandut) {
        int pretTotal = 0;
        if (this.motorina < 10) {
            System.out.println("Nu avem benzina in stoc");
        } else {
            if (benzinaDeVandut > this.benzina) {
                System.out.println("Nu avem atata benzina!");
            }
            this.benzina -= benzinaDeVandut;
            pretTotal = benzinaDeVandut * pretB;
        }

        return pretTotal;
    }

    public String incaseazaBani(int bani, int pretTotal) {
        if (bani == pretTotal) {
            return "Multumim va mai asteptam.";
        } else if (bani > pretTotal) {
            return "Multumim, poftiti restul" + (bani - pretTotal);
        } else {
            return "Chem politia";
        }
    }
}
