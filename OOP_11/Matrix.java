public class Matrix
{
    public static int [][] createfillmatrix()
    {
        int [][]matrix = new int[6][6];
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                matrix[i][j] = (int)((Math.random() * 5)%2);
            }
        }
        return matrix;
    }
    public static void displaymatrix(int [][]matrix)
    {
        System.out.println("\nMatrix Values : ");
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int mymatrix[][];
        int i,j,cnt;
        mymatrix = createfillmatrix();
        displaymatrix(mymatrix);
        System.out.println("\n:/~Rows having ODD number of 1s :~ ");
        for(i=0;i<6;i++)
        {
            cnt = 0;
            for(j=0;j<6;j++)
            {
                if(mymatrix[i][j] == 1)
                {
                    cnt++;
                }
            }
            if(cnt%2 != 0)
            {
                System.out.println("Row - "+(i+1)+" have ODD number of 1s.");
            }
        }
        System.out.println("\n:/~Column having ODD number of 1s :~ ");
        for(j=0;j<6;j++)
        {
            cnt = 0;
            for(i=0;i<6;i++)
            {
                if(mymatrix[i][j] == 1)
                {
                    cnt++;
                }
            }
            if(cnt%2 != 0)
            {
                System.out.println("Column - "+(j+1)+" have ODD number of 1s.");
            }
        }
    }
}
