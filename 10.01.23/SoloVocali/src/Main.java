import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Inserisci una frase di cui vuoi solo le vocali");
        String str = "";

        do {
            System.out.println("Ricorda, no può essere una frase vuota:");
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
        }while (str.length() < 1);

        str = str.replaceAll("\\s", "");
        //str = str.toLowerCase();

        String solution = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                solution += str.charAt(i);
            else if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
                solution += str.charAt(i);
            continue;
        }
        System.out.println(solution);
    }
}