package code;

public class amcat {
    static int[] solution(int[] arr, int days){
        int[] res = new int[arr.length];

        for (int j = 0; j < days; j++) {

            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    if (arr[i + 1] == 0) res[i] = 0;
                    else if (arr[i + 1] == 1) res[i] = 1;
                } else if (i == arr.length -1){
                    if(arr[i-1] == 0) res[i] = 0;
                    else if(arr[i-1] == 1) res[i] = 1;
                }else if((arr[i-1] == 0 && arr[i+1] == 0) ||(arr[i-1] == 1 && arr[i+1] == 1) ) res[i] = 0;
                else res[i] = 1;
            }
        }
    }
}
