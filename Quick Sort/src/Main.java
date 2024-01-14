import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] d = {8,1,4,7,2,6,9,3,14,20,10};
        System.out.println(Arrays.toString(d));
        Main.quickSort(d, 0, d.length-1);
        System.out.println(Arrays.toString(d));
    }

    public static void quickSort(int[] Array, int l, int r) {
        if ( l < r ) {
            int pi = partition(Array, l, r);
            quickSort(Array, l, pi-1);
            quickSort(Array, pi+1, r);
        }
    }

    public static int partition(int[] Array, int l, int r) {
        int pi = r; // d[r]
        int i = l;
        int j = r-1;

        do {
            while ( Array[i] < Array[pi] && i < r ) i++;
            while ( Array[j] > Array[pi] && j > 0 ) j--;
            if ( i < j ) swap(Array, i, j);
        } while(i < j);
        swap(Array, i, pi);

        return i;
    }

    public static void swap(int[] Array, int i, int j) {
        int tmp = Array[i];
        Array[i] = Array[j];
        Array[j] = tmp;
    }
}