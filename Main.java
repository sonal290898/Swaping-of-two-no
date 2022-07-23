# Swaping-of-two-no
 

import java.util.Scanner;
public class Main{
    public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    int a,b;
     
    System.out.print("Enter the No1=");
    a=sc.nextInt();
    System.out.print("Enter the No1=");
    b=sc.nextInt();
    int tam=a;
    a=b;
    b=tam;
     
    System.out.print("after the Swapint");
    System.out.println("after the Swapint"+a);
 
    System.out.println("after the Swping="+b);
    }
}
