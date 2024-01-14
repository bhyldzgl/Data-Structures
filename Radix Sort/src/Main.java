import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] d = {178, 12, 9, 199, 354, 17, 23, 453, 170, 20, 30};
        System.out.println(Arrays.toString(d));
        Main.radixSort(d);
        System.out.println(Arrays.toString(d));
    }

    public static void countSort(int[] Array, int e) {
        int n = Array.length;
        int[] t = new int[n];
        int[] c = new int[10];
        int i = 0;

        for ( i = 0 ;  i < n ; i++ ) {
            c[(Array[i]/e)%10]++;
        }
        for ( i = 1 ; i < 10 ; i++ ) {
            c[i] += c[i-1];
        }

        for ( i = n-1 ; i >= 0 ; i-- ) {
            t[--c[(Array[i]/e)%10]] = Array[i];
        }

        for ( i = 0 ; i < n ; i++ ) {
            Array[i] = t[i];
        }
    }
    public static void radixSort(int[] Array) {
        int max = Main.findMax(Array);
        for ( int e = 1; (max/e) > 0 ; e *= 10 ) {
            Main.countSort(Array, e);
        }
    }

    public static int findMax(int[] Array) {
        int max = Array[0];
        for ( int i = 1 ; i < Array.length ; i++ ) {
            if ( Array[i] > max ) max = Array[i];
        }
        return max;
    }
}