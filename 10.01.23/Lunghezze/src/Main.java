import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Inserisci una serie di parole e concludi con un invio a vuoto:");
        Scanner sc = new Scanner(System.in);
        int result = 0;
        String words = "";
        String word = " ";
        do {
            System.out.println("La prossima parola: ");
            word = sc.nextLine();
            words = words + word + " ";
        }while (word.length() > 1);
        String[] wrd = words.split(" ");
        for(int i = 0; i < wrd.length; i++)
            if(Character.isUpperCase(wrd[i].charAt(0)))
                result += wrd[i].length();
        System.out.println(result);
    }
}