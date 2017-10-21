
import java.util.Scanner;

/**
 * Created by jorge on 7/11/2017.
 * Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).
 */
public class ThirdMax
{
    public static void main(String arg[])
    {
        Scanner input = new Scanner(System.in);
        int[] Arr = new int[input.nextInt()];
        for (int i = 0; i < Arr.length; i++)
        {
            Arr[i] = input.nextInt();
        }

        int Max[] = MaxThird(Arr);
        if (Max[2] == Integer.MIN_VALUE)
            System.out.println(Max[0]);
        else
            System.out.println(Max[2]);

    }

    public static int[] MaxThird(int[] Arr)
    {
        int[] Max = {0, 0, Integer.MIN_VALUE};
        for (int i = 0; i < Arr.length; i++)
        {
            if (Arr[i] == Max[0] || Arr[i] == Max[1] || Arr[i] == Max[2])
                continue;
            if (Arr[i] > Max[0])
            {
                Max[2] = Max[1];
                Max[1] = Max[0];
                Max[0] = Arr[i];
            } else if (Arr[i] > Max[1])
            {
                Max[2] = Max[1];
                Max[1] = Arr[i];
            } else if (Arr[i] > Max[2])
            {
                Max[2] = Arr[i];
            }
        }
        return Max;
    }


}
