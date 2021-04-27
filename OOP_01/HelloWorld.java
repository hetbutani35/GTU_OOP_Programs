// TO Print text in Terminal

class HelloWorld
{
    public static void main(String args[])
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Welcome to Java, Learning Java Now and Programming is fun.");
    }
}
