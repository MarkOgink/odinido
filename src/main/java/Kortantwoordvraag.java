public class Kortantwoordvraag extends Vraag {

    public Kortantwoordvraag(String vraag){
        setVraag(vraag);
    }

    public void voegAntwoordToe(String antwoord){
        Antwoord nieuwAntwoord = new Antwoord(antwoord, true);
        setAntwoord(nieuwAntwoord);
    }
}
