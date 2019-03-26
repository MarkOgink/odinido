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

    public String getVraag(int vraagnummer){
        return vragen.get(vraagnummer-1).getVraag();
    }

    public String getAntwoord(int vraagnummer){
        if(vragen.get(vraagnummer).getAntwoord())
    }

    public int getAantalVragen() {
        return vragen.size();
    }
}
