import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire una frase a scelta:");
        String str = sc.nextLine();
        str = str.replaceAll("\\s", "");
        StringBuilder solution = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    break;

                default:
                    solution.append(str.charAt(i));
            }
        }
        System.out.println(solution);
    }
}