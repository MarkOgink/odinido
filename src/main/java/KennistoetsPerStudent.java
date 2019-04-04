import java.util.ArrayList;
import java.util.Scanner;

public class KennistoetsPerStudent {
    private Kennistoets kennistoets;
    private int punten;
    private boolean afgerond = false;
    private int bonus;
    private ArrayList<String> antwoorden = new ArrayList<>();

    public KennistoetsPerStudent(Kennistoets kennistoets){
        this.kennistoets = kennistoets;
    }

    public Kennistoets getKennistoets() {
        return kennistoets;
    }

    public void setKennistoets(Kennistoets kennistoets) {
        this.kennistoets = kennistoets;
    }

    public void geefAntwoord(int vraagnummer) {
        Scanner antwoord = new Scanner(System.in);
        if(kennistoets.getVraag(vraagnummer) instanceof Meerkeuzevraag){
            for (int j = 0; j <kennistoets.getVraag(vraagnummer).getAntwoorden().size() ; j++) {
                System.out.println((j+1) + " " + kennistoets.getVraag(vraagnummer).getAntwoorden().get(j).getAntwoord());
            }
        }
        this.antwoorden.add(antwoord.nextLine());
    }

    public void checkAntwoorden(){

    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }

    public void toonVraag(int vraagnummer) {
        System.out.println(kennistoets.getVraag(vraagnummer).getVraag());
    }
}
