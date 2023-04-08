import java.util.Arrays;
import java.util.Scanner;

public class Prp1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        s1=s1.toLowerCase();
        char a[]=s1.toCharArray();
        String s2=sc.next();
        s2=s2.toLowerCase();
        char b[]=s1.toCharArray();
        int count=0;
        
        int acount[]=new int[26];
        int bcount[]=new int[26];

        for(Character ch:s1.toCharArray()){
            int index=ch-'a';
            acount[index]++;
        }
        for(Character ch:s2.toCharArray()){
            int index=ch-'a';
            bcount[index]++;
        }

        for(int i=0;i<26;i++){
            if(acount[i]>=1 && bcount[i]>=1){
                count++;
            }
        }
        int resA=0;
        int resB=0;
        for(int i=0;i<26;i++){
            if(acount[i]>=1 && bcount[i]>=1){
                continue;
            }
            if(acount[i]==1){
                resA=resA+i+1;
            }
            if(bcount[i]==1){
                resB+=i+1;
            }
        }
        String res="";
        if(count!=0){
            res=Integer.toString(count);
        }
        res=res+Integer.toString(resA)+Integer.toString(resB);
        System.out.println(res);

    }
}