import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        //first array in
        System.out.println("Inserire 10 numeri interi, possono essere anche minori di zero o 0.");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            int j = i + 1;
            System.out.println("Numero " + j);
            arr[i] = sc.nextInt();
        }

        for (int j : arr) System.out.println(j);

        System.out.println();

        //generating second array

        int len = 0;
        for(int i = 0; i < 10; i++) {
            if(arr[i] >= 0)
                len ++;
        }
        int[] sndarr = new int[len];

        int k = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] >= 0) {
                sndarr[k] = arr[i];
                k++;
            }
        }
        System.out.println();
        for (int j : sndarr) System.out.println(j);
    }
}