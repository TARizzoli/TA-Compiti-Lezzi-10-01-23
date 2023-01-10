import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi inserire?");
        int len = 0;
        int a = 0;
        len = sc.nextInt();
        //array creation
        int[] arr = new int[len];
        do {
            System.out.println("Inserisci il prossimo numero intero: ");
            arr[a] = sc.nextInt();
            a++;
            len--;
        }while (len > 0);
        //operations
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int ave = sum / arr.length;

        System.out.println(sum);
        System.out.println(ave);

        //esercizio dopo integrato
        int evensum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            evensum += arr[i];
        }
        System.out.println(evensum);
    }
}