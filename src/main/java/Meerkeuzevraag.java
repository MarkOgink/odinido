public class Meerkeuzevraag extends Vraag{

    public Meerkeuzevraag(String vraag) {
        setVraag(vraag);
        setVraagnummer(getVraagnummer());
    }

    public void voegAlternatiefToe(String antwoord, boolean correct){
        Antwoord alternatief = new Antwoord(antwoord, correct);
        setAntwoord(alternatief);
    }
}
