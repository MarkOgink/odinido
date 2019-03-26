import java.util.ArrayList;

public class Toets {
    private String toets;
    private String requirements;
    private ArrayList<Vraag> vragen = new ArrayList<Vraag>();

    public Toets(String toets, String requirements) {
        this.toets = toets;
        this.requirements = requirements;
    }

    public void voegVraagToe(Vraag vraag){
        vragen.add(vraag);
    }

    public Vraag getVraag(int vraagnummer){
        return vragen.get(vraagnummer);
    }

    public int checkAntwoord(String antwoord, int vraagnummer){
        ArrayList<Antwoord> antwoorden = vragen.get(vraagnummer).getAntwoord();
        for (int i = 0; i < antwoorden.size(); i++) {
            if(antwoorden.get(i).getAntwoord().equals(antwoord) && antwoorden.get(i).isCorrect()){
                System.out.println("lekker gast");
                return vragen.get(vraagnummer).getPunten();
            }
        }
        return 0;
    }

    public int getAantalVragen() {
        return vragen.size();
    }
}
