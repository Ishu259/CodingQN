package code.arrays;

import java.util.ArrayList;

public class CountTheTripplets {
    public static void main(String[] args) {

    }
    public  static int countTriplets(int[] arr, int n){
        int count = 0;
      //  ArrayList<Integer> arrayList = new ArrayList<>();

        int[] freq = new int[10^5];
//        for (int i = 0; i < n; i++) {
//            arrayList.add(arr[i]);
//        }

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        if(arr.length <= 2) return 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
//                if(arrayList.contains(arr[i] + arr[j])){
//                    count++;
//                }
                if(arr[i] + arr[j] <= 100000 && freq[arr[i] + arr[j]] > 0) count++;
            }
        }

        return count;
    }

}
