import java.util.Scanner;

public class ReverseANumber
{
    public static void reverse(int numbers[])
    {
        int j=0,temp;
        while(j+1<=(numbers.length/2))
        {
            temp = numbers[j];
            numbers[j] = numbers[numbers.length-1-j];
            numbers[numbers.length-1-j] = temp;
            j++;
        }
    }
    public static void main(String[] args)
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int i;
        int numarray[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            System.out.print("Enter at position "+(i+1)+" : ");
            numarray[i] = sc.nextInt();
            if(i == 9)
            {
                sc.close();
            }
        }
        reverse(numarray);
        System.out.println("After reversing number in an Array :");
        for(i=0;i<10;i++)
        {
            System.out.println("Value at position "+(i+1)+" : "+numarray[i]);
        }
    }
}
