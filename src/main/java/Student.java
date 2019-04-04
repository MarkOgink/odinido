import java.util.Scanner;

public class Student {
    private String naam;
    private KennistoetsPerStudent kennistoetsPerStudent;

    public Student(String naam){
        this.naam = naam;
    }

    public void voerKennistoetsUit(){
        for (int i = 0; i < kennistoetsPerStudent.getKennistoets().getAantalVragen(); i++) {

            kennistoetsPerStudent.toonVraag(i);
            kennistoetsPerStudent.geefAntwoord(i);

        }
        System.out.println("Einde toets.");
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }


    public KennistoetsPerStudent getKennistoets() {
        return kennistoetsPerStudent;
    }

    public void setKennistoets(Kennistoets kennistoets) {
        this.kennistoetsPerStudent = new KennistoetsPerStudent(kennistoets);
    }
}
