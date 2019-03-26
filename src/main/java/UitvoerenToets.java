import java.util.Scanner;

public class UitvoerenToets {
    public static void main(String[] args){
        OdinidoToetsbank toetsen = new OdinidoToetsbank();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kies een toets");
        Toets toets = toetsen.selecteerToets(scanner.nextLine());
        uitvoerenToets(toets, scanner);
    }

    private static void uitvoerenToets(Toets toets, Scanner scanner) {
        for (int i = 1; i < toets.getAantalVragen(); i++) {
            System.out.println(toets.getAantalVragen());
            System.out.println(toets.getVraag(i));
            String antwoord = scanner.nextLine();
            if(antwoord.equals(toets.getAntwoord(i))){

            }
        }
    }

}
