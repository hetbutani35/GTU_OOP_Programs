import java.util.Scanner;

public class FactorOfNumber 
{
    public static void main(String[] args)
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int dividor=2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        while(n > 1)
        {
            if(n%dividor == 0)
            {
                System.out.print(dividor);
                n /= dividor;
                if(n>1)
                {
                    System.out.print(", ");
                }
                else
                {
                    System.out.print(".");
                }
            }
            else
            {
                dividor++;
            }
        }
    }
}
