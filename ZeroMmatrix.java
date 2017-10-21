import java.util.Scanner;

/**
 * Created by jorge on 7/10/2017.
 */
//Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.

public class ZeroMmatrix
{
    public static void main(String arg[])
    {
        Scanner input = new Scanner(System.in);
        int[][] Matrix = new int[input.nextInt()][input.nextInt()];
        for (int i = 0; i < Matrix.length; i++)
        {
            for (int j = 0; j < Matrix[i].length; j++)
            {
                Matrix[i][j] = input.nextInt();

            }
        }
        MatrixToZero(Matrix);
        Print(Matrix);
    }

    public static void MatrixToZero(int[][] matrix)
    {
        ListH list = null;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (matrix[i][j] == 0)
                {
                    list = new ListH(i, j, list);

                }
            }
        }
        System.out.println(matrix.length);
        while (list != null)
        {

            for (int i = 0; i < matrix[list.n].length; i++)
            {

                System.out.println(list.n);
                matrix[list.n][i] = 0;
            }
            for (int i = 0; i < matrix.length; i++)
            {
                matrix[i][list.m] = 0;
            }
            list = list.next;
        }
    }

    public static void Print(int[][] matrix)
    {
        System.out.println("");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public static void LinkPrint(ListH list)
    {
        while (list != null)
        {
            System.out.print(list.n + " " + list.m);
            System.out.println(" ");
            list = list.next;
        }
    }
}
