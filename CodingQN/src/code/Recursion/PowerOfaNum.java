package code.Recursion;

import java.util.Scanner;

public class PowerOfaNum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int n = in.nextInt();
        System.out.println(power(base,n));
    }

    public static int power(int base, int n){
        if(n == 0) return 1;
        return base * power(base, n-1);
    }
}
