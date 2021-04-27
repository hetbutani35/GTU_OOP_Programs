import java.util.Scanner;

public class GCDOfNumber
{
    public static int gcd(int n1, int n2)
    {
        while(n1 != n2)
        {
            if(n1 > n2)
            {
                n1 = n1 -n2;
            }
            else
            {
                n2 = n2 -n1;
            }
        }
        return n1;
    }
    public static void main(String[] args)
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int n2 = sc.nextInt();
        sc.close();
        System.out.println("GCD of number "+n1+" and "+n2+" is : "+gcd(n1, n2));
    }
}
