import java.util.*;

public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st no:");
        float a = sc.nextFloat();

        System.out.println("enter the 1st no:");
        float b = sc.nextFloat();

        System.out.println("enter the option:");
        int option = sc.nextInt();
        sc.close();


        if(option == 1){
            System.out.println(a+b);
        }
        else if(option == 2){
            System.out.println(a-b);
        }
        else if(option == 3){
            System.out.println(a*b);
        }
        else if (option == 4) {
            System.out.println(a/b);
        }
        else if (option == 5){
            System.out.println();
        }
        else{
            System.out.println("invalid option, please enter valid option number 1-5");
        }
    }
}
