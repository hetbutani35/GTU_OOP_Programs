import java.util.Scanner;

public class Recursive
{
    public static int findmin(int D[], int a)
    {
        if(a == 1)
        {
            return D[0];
        }
        return Math.min(D[a-1], findmin(D, a-1));
    }
    public static void main(String[] args)
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        System.out.print("Enter how many number you want to insert in Array : ");
        int a = sc.nextInt(); 
        int[] D = new int[a];
        for(int i=0;i<D.length;i++)
        {
            System.out.print("Enter the value for integers "+(i+1)+" : ");
            D[i] = sc.nextInt();
            flag *= D[i];
        }
        sc.close();
        System.out.println("Minimun number in the Array is : "+findmin(D, a));
        System.out.print("Product of element is : "+flag);
    }
}
