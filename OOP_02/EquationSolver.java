import java.util.*;
public class EquationSolver
{
    public static void main(String[] args) 
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        double a,b,c,d,e,f,x,y;
        Scanner input = new Scanner(System.in);
        System.out.println("Equqtions are like ->   \n1) ax + by = e    \n2) cx + dy = f");
        System.out.println("Values for Equestion - 1 :");
        System.out.print("Enter value of a : ");
        a = input.nextDouble();
        System.out.print("Enter value of b : ");
        b = input.nextDouble();
        System.out.print("Enter value of e : ");
        e = input.nextDouble();
  
        System.out.println("Values for Equestion - 2 :");
        System.out.print("Enter value of c : ");
        c = input.nextDouble();
        System.out.print("Enter value of d : ");
        d = input.nextDouble();
        System.out.print("Enter value of f : ");
        f = input.nextDouble();

        x = ((e*d)-(b*f)) / ((a*d)-(b*c));
        y = ((a*f)-(e*c)) / ((a*d)-(b*c));

        System.out.println("Value of x is : "+x);
        System.out.println("Value of y is : "+y);
        input.close();
    }
}
