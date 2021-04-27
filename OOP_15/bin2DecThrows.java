import java.util.Scanner;
public class bin2DecThrows
{
    public static int bin2Dec(String binarString) throws NumberFormatException
    {
        int decimal = 0;
        int strLength = binarString.length();
        for(int i=0;i<strLength;i++)
        {
            if(binarString.charAt(i) < '0' || binarString.charAt(i) > '1')
            {
                throw new NumberFormatException("The Input String is not Binary");
            }
            decimal += (binarString.charAt(i)-'0')*Math.pow(2, strLength-1-i);
        }
        return decimal;
    }
    public static void main(String[] args)
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary String : ");
        String string = sc.nextLine();
        sc.close();
        try
        {
            System.out.println("Value = "+bin2Dec(string));
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
    }
}
