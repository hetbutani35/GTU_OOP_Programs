import java.util.*;
public class BMI 
{
    public static void main(String[] args)
    {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        double weight,height,kg,meter,BMI;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in pound : ");
        weight = input.nextDouble();
        System.out.print("Enter your height in inches : ");
        height = input.nextDouble();
        input.close();

        kg = weight * 0.45359237;
        meter = height * 0.0254;
        BMI = (kg) / (meter * meter);

        System.out.println("Your BMI is : "+BMI);
    }
}
