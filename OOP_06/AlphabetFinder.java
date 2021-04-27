import java.util.*;
public class AlphabetFinder 
{
    public static void main(String[] args)
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one letter : ");
        ch = input.next().charAt(0);
        input.close();

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u')
        {
            System.out.println(ch+" is vowel.");
        }
        else
        {
            System.out.println(ch+" is constant.");
        }
    }
}
