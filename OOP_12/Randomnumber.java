import java.util.*;
public class Randomnumber
{
    public static void main(String[] args) throws java.lang.Exception
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Random r = new Random(1000);
        for(int i=0;i<100;i++)
        {
            System.out.format("%5d", r.nextInt(49));
            if((i+1)%10 == 0)
            {
                System.out.println();
            }
        }
    }
}
