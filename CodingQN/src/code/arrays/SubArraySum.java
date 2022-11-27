//package code.arrays;
//
//import java.util.ArrayList;
//
//public class SubArraySum {
//    public static void main(String[] args) {
//        findSubarraySum();
//    }
//
//    public static ArrayList<Integer> findSubarraySum(int[] arr, int n, int s) {
//        int currStart = 0, sum = 0;
//        ArrayList<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < n; ++i) {
//            if (sum > s) {
//                sum -= arr[currStart];
//                ++currStart;
//            }
//
//            if (sum == s) {
//               ans.add(currStart);
//               ans.add(i);
//               return ans;
//            }
//
//            sum += arr[i];
//
//        }
//        ans.add(-1);
//        return ans;
//    }
//}
