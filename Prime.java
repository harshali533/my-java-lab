import java.util.*;

public class Prime {
    public static void main(String[] args)
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
            System.out.println(n + "%" + i + "=" + n%i);
            System.out.println("count" + count);
        }
        if(count==2)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not a prime");
        }
    } 
}
