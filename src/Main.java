/*Write a code fragment that prints the contents of a two-dimensional boolean array,
using * to represent true and a space to represent false. Include row and column numbers.*/

public class Main
{
    public static void main(String[] args)
    {
        boolean[][] array =
        { { true, false,true },
        { false, true, false },
        {true,false,true}};

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] ? "*" : " ");
            }
            System.out.println();
        }

    }//end main
}//end class