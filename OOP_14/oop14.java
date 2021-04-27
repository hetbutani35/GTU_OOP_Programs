import java.util.ArrayList;
import java.util.Date;

public class oop14
{
    public static void main(String[] args)
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        ArrayList<Object> arr_list = new ArrayList<>();
        arr_list.add(new Loan(50000));
        arr_list.add(new Date());
        arr_list.add(new String("Practical 14......"));
        arr_list.add(new Circle(3.5));

        for(int i=0;i<arr_list.size();i++)
        {
            System.out.println((arr_list.get(i)).toString());
        }
    }
}

class Circle
{
    double radius;
    Circle(double r)
    {
        this.radius = r;
    }
    public String toString()
    {
        return "Circle with Radius "+this.radius;
    }
}

class Loan
{
    double amount;
    Loan(double amt)
    {
        this.amount = amt;
    }
    public String toString()
    {
        return "Loan with Amount "+this.amount;
    }
}
