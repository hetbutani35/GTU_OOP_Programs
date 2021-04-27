import java.util.*;
class MeterTOFeet
{
    public static void main(String[] args)
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        double foot,meter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter meter : ");
        meter = input.nextDouble();
        input.close();
        foot = meter * 3.28084;
        System.out.println(meter+" meter = "+foot+" foot.");
    }
}
