package code.Recursion;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[0] = in.nextInt();
        }
        System.out.println(largestele(n, arr));

    }

    public static int largestele(int n, int[] arr){
        //System.out.println(arr.toString());
        if(n == 1) return arr[0];
        return Math.min(arr[n-1], largestele(n-1, arr));
    }
}
