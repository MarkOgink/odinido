import java.util.ArrayList;

public abstract class Vraag {
    private int vraagnummer = 0;
    private String vraag;
    private ArrayList<Antwoord> antwoorden = new ArrayList<Antwoord>();
    private int punten;

    public int getVraagnummer() {
        return vraagnummer;
    }

    public void setVraagnummer(int vraagnummer) {
        this.vraagnummer = vraagnummer;
    }

    public String getVraag() {
        return vraag;
    }

    public void setVraag(String vraag) {
        this.vraag = vraag;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }

    public ArrayList<Antwoord> getAntwoord() {
        return antwoorden;
    }

    public void setAntwoord(Antwoord antwoord) {
        antwoorden.add(antwoord);
    }
}
