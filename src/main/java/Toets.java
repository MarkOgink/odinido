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
        //Get de antwoorden van de vraag met het bijbehorende vraagnummer.
        ArrayList<Antwoord> antwoorden = vragen.get(vraagnummer).getAntwoord();

        for(int j = 0; j < antwoorden.size(); j++) {
            if (vragen.get(vraagnummer) instanceof Meerkeuzevraag) {

                if (antwoorden.get(j).isCorrect() && Integer.parseInt(antwoord) == j + 1) {
                    System.out.println(antwoord);
                    System.out.println(j);
                    System.out.println("lekker gast meerkeuze");
                    return vragen.get(vraagnummer).getPunten();
                }

                // && antwoord.equals(""+j)
            } else {
                if (antwoorden.get(j).getAntwoord().equals(antwoord) && antwoorden.get(j).isCorrect()) {
                    System.out.println("lekker gast");
                    return vragen.get(vraagnummer).getPunten();
                }
            }
        }

        return 0;
    }

    public int getAantalVragen() {
        return vragen.size();
    }
}
