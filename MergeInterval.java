import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jorge on 7/14/2017.
 * Given a collection of intervals, merge all overlapping intervals.
 */
public class MergeInterval
{
    public static void main(String arg[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("insert number of intervals");
        int Number = input.nextInt();
        System.out.println("insert intervals");
        List<ListH> Lists = new ArrayList<ListH>();
        for(int i=0;i<Number;i++)
            Lists.add(new ListH(input.nextInt(),input.nextInt()));
        List<ListH> Result= merge(Lists);
        PrintList(Lists);
        System.out.println("------------------------");
        PrintList(Result);

    }
    public static void PrintList(List<ListH> Lists)
    {
        for(int i=0;i<Lists.size();i++)
            System.out.println("[" + Lists.get(i).n + "," + Lists.get(i).m + "]");
    }
    public static List<ListH> merge(List<ListH> M)
    {
        List<ListH> Result = new ArrayList<ListH>();
        Result.add(M.get(0));
        for(int i =1,j=0;i<M.size();i++)
        {
            if(M.get(i).n<Result.get(j).m)
            {
                Result.get(j).m= M.get(i).m>Result.get(j).m?M.get(i).m : Result.get(j).m;
            }
            else
            {
                Result.add(M.get(i));
                j++;
            }
        }
        return Result;

    }
}
