import java.util.*;
public class DesendingOrder
{
    public static void main(String[] args)
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int a,b,c,temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        a = input.nextInt();
        System.out.print("Enter the 2nd number : ");
        b = input.nextInt();
        if(a < b)
        {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.print("Enter the 3rd number : ");
        c = input.nextInt();
        input.close();
        if(c > b)
        {
            if(c > a)
            {
                temp = c;
                c = b;
                b = a;
                a = temp;
            }
            else
            {
                temp = c;
                c = b;
                b = temp;
            }
        }
        System.out.println("Decreasing order is : "+a+" "+b+" "+c);
    }
}    
