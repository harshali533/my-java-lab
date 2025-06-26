/* 
public class Febo{
    public static void main(String args[]){
        int a = 1;
        int b = 2;
        int c = 3;

        if(a+b==c){
            System.out.println("Fibonacci series");
        }
        else{
            System.out.println("Not Fibonacci series");
        }
    }
} 
*/

/*
 public class Febo{
    public static void main(String args[]){
        int a = 1;
        int b = 2;
        int c = 3;

        if((a-1)+(a-2)==a){
            System.out.println("Fibonacci series");
        }
        
        else{
            System.out.println("Not Fibonacci series");
        }
    }
} */

import java.util.Scanner;

public class Febo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.close();

        int a = 0, b = 1, c;

    
        System.out.print(a+" ");
        System.out.print(b);

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
    }
}
