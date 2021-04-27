import java.util.Scanner;
class Fraction
{
    private int real;
    private int imaginary;

    Fraction(int r,int img)
    {
        real = r;
        imaginary = img;
    }
    public long gcm(long a, long b)
    {
        return b == 0 ? a : gcm(b, a % b);
    }
    public String toString()
    {
        long gcm = gcm(real,imaginary);
        return real/gcm+"/"+imaginary/gcm;
    }
}

public class decimalTOfraction
{
    public static void main(String[] args)
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number : ");
        String decimal = sc.nextLine();
        sc.close();
        int indexofdecimal = decimal.indexOf(".");
        int len = decimal.substring(indexofdecimal).length();
        int imag_part = (int) Math.pow(10, len-1);
        int real_part = (int) (Double.parseDouble(decimal)*imag_part);
        Fraction fr = new Fraction(real_part,imag_part);
        System.out.println("The Fraction Number is : "+fr);
    }
}
