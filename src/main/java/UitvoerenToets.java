import java.util.Scanner;

public class UitvoerenToets {
    public static void main(String[] args){
        OdinidoToetsbank toetsen = new OdinidoToetsbank();
        Student student = new Student("Klaas");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom " + student.getNaam() + " Kies een toets");
        Toets toets = toetsen.selecteerToets(scanner.nextLine());
        uitvoerenToets(toets, student.getPunten(), scanner);
    }

    private static void uitvoerenToets(Toets toets, int punten, Scanner scanner) {
        for (int i = 0; i < toets.getAantalVragen(); i++) {
            System.out.println(toets.getVraag(i).getVraag());
            if(toets.getVraag(i) instanceof Meerkeuzevraag){
                for (int j = 0; j <toets.getVraag(i).getAntwoord().size() ; j++) {
                    System.out.println((j+1) + " " + toets.getVraag(i).getAntwoord().get(j).getAntwoord());
                }
            }
            String antwoord = scanner.nextLine();
            punten = punten + toets.checkAntwoord(antwoord, i);
        }
        System.out.println("Lekker gewerkt pik. " + punten + " punten hedde gij gehaald");
    }

}
