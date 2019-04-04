import java.util.Scanner;

public class App {
    public static void main(String[] args){
        OdinidoToetsbank odinidoToetsbank = new OdinidoToetsbank();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Typ uw naam in.");
        String naam = scanner.nextLine();
        Student student = new Student(naam);
        System.out.println("Typ hier de toetscode in van de toets die u wilt maken.");
        kiesKennisToets(odinidoToetsbank, student, scanner);
        student.voerKennistoetsUit();
    }

    public static void kiesKennisToets(OdinidoToetsbank odinidoToetsbank, Student student, Scanner scanner){
        String toetscode = scanner.nextLine();
        if(odinidoToetsbank.selecteerToets(toetscode) != null){
            student.setKennistoets(odinidoToetsbank.selecteerToets(toetscode));
        }
        else{
            System.out.println("Ongeldige toetscode, probeer opnieuw:");
            kiesKennisToets(odinidoToetsbank, student, scanner);
        }
    }
}
