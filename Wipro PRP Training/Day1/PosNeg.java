package Day1;

import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Positive");
        }
        if(n<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }    
}