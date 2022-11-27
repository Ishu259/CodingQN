package code.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Subarray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        ArrayList<Integer> ans = Subarraysum(arr,n,s);
        System.out.println(ans);

    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s){
        ArrayList<Integer> subarray = new ArrayList<>();
        int sum = 0;
      //  int inc = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += arr[j];
               // System.out.println(sum);
                if(sum == s){
                    subarray.add(i+1,j+1);
                    break;
                }
                if(!subarray.isEmpty()) break;
            }
            sum = 0;
        }
        if(subarray.isEmpty()) subarray.add(-1);

        return subarray;
    }


    static ArrayList<Integer> Subarraysum(int[] arr, int n , int s){
        ArrayList<Integer> subarray = new ArrayList<>();
        int sum = 0;
        int inc = 0;
        for (int i = 0; i < n; i++){
            sum += arr[i];
            if(sum > s & inc < i){
                sum -= arr[inc];
                inc++;
            }
            if(sum == s){
                subarray.add(inc+1);
                subarray.add(i+1);
            }
        }

        if(subarray.isEmpty()) subarray.add(-1);
        return subarray;
    }
}

