public class Meerkeuzevraag extends Vraag{

    public Meerkeuzevraag(String vraag) {
        setVraag(vraag);
    }

    public void voegAlternatiefToe(String antwoord, boolean juist){
        Antwoord alternatief = new Antwoord(antwoord, juist);
        setAntwoord(alternatief);
    }
}