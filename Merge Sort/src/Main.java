import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3,7,1,8,2,6,4,5,9};
        System.out.println(Arrays.toString(array));
        Main.mergeSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int l, int r) {
        if ( l < r ) {
            int m = l+(r-l)/2;
            mergeSort(array, l, m);
            mergeSort(array, m+1, r);
            merge(array, l, m, r);
        }
    }
    public static void merge(int[] array, int l, int m, int r) {
        int i = l;
        int j= m+1;

        int[] array1 = new int[r-l+1];
        int k = 0;

        while ( i <= m && j <= r ) {
            if ( array[i] < array[j] ) {
                array1[k] = array[i];
                i++;
            } else {
                array1[k] = array[j];
                j++;
            }
            k++;
        }

        while ( i <= m ) {
            array1[k] = array[i];
            i++;
            k++;
        }

        while ( j <= r ) {
            array1[k] = array[j];
            j++;
            k++;
        }

        for ( i = 0 ; i < array1.length ; i++ ) {
            array[l++] = array1[i];
        }


    }
}