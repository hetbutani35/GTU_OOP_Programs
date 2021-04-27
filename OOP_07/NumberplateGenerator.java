public class NumberplateGenerator
{
    public static void main(String[] args)
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int l1,l2,l3,n1,n2,n3,n4;
        l1 = 65 + (int)(Math.random() * (90 - 65));
        l2 = 65 + (int)(Math.random() * (90 - 65));
        l3 = 65 + (int)(Math.random() * (90 - 65));

        n1 = (int)(Math.random() * 10);
        n2 = (int)(Math.random() * 10);
        n3 = (int)(Math.random() * 10);
        n4 = (int)(Math.random() * 10);

        System.out.println(""+(char)(l1)+((char)(l2))+((char)(l3))+" "+n1+n2+n3+n4);
    }
}
