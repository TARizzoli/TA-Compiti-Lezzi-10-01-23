public class Main {
    public static void main(String[] args) {

        System.out.println("Il programma controlla, per un vettore di 10 posti, se ");
        System.out.println("la somma dei numeri in posizioni con indice pari è uguale ");
        System.out.println("alla somma di numeri in posizione dispari.");

        int[] arr = new int[10];

        //inizilizzo array
        arr[0] = 0;
        arr[1] = 2;
        arr[2] = 2;
        arr[3] = 0;
        arr[4] = 7;
        arr[5] = 5;
        arr[6] = 5;
        arr[7] = 7;
        arr[8] = 3;
        arr[9] = 0;

        int sum1 = 0;
        for(int i = 0; i < arr.length; i += 2)
            sum1 += arr[i];

        int sum2 = 0;
        for(int i = 1; i < arr.length; i += 2)
            sum2 += arr[i];

        //check
        if(sum1 == sum2)
            System.out.println("Pari e dispari uguali.");
        else
            System.out.println("Pari e dispari diversi.");
    }
}