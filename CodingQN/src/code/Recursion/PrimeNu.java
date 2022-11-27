package code.Recursion;

import java.util.Scanner;

public class PrimeNu {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(isPrime(num,2)){
            System.out.println("Yes it is Prime");
        }
        else{
            System.out.println("Its not a Prime");
        }

    }

    public static boolean isPrime(int num , int i){
        if(num <= 2)
            return num == 2 ? true : false;
        if(num % i == 0) return false;
        if(i * i > num) return true;
        return isPrime(num, i+1);
    }
}
