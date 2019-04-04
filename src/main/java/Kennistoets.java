import java.util.ArrayList;

public class Kennistoets {
    private String toetscode;
    private String titel;
    private ArrayList<Vraag> vragen = new ArrayList<Vraag>();

    public Kennistoets(String toetscode, String titel) {
        this.toetscode = toetscode;
        this.titel = titel;
    }

    public void voegVraagToe(Vraag vraag){
        vragen.add(vraag);
    }

    public Vraag getVraag(int vraagnummer){
        return vragen.get(vraagnummer);
    }

    public int getAantalVragen() {
        return vragen.size();
    }
}
