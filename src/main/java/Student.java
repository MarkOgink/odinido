public class Student {
    private String naam;
    private Toets toets;
    private int punten;

    public Student(String naam){
        this.naam = naam;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Toets getToets() {
        return toets;
    }

    public void setToets(Toets toets) {
        this.toets = toets;
    }
}
