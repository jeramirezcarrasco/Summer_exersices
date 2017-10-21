import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jorge on 8/15/2017.
 * Given a set of distinct integers, nums, return all possible subsets.
 */
public class Subset
{
    /**
     * Main method
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        int[] Num = new int[input.nextInt()];
        for (int i = 0; i <Num.length ; i++)
        {
            Num[i]=input.nextInt();
        }
        List<List<Integer>> Result=Set(Num);
        Result.forEach((I->System.out.println(I)));
    }
    public static List<List<Integer>> Set(int[] Num)
    {
        List<List<Integer>> Result = new ArrayList<>();
        List<Integer> Temp= new ArrayList<>();
        Result.add(Temp);
        for (int i = 0; i <Num.length ; i++)
        {
            for (int j = 0,l = Result.size(); j < l; j++)
            {
                Temp = new ArrayList<>(Result.get(j));
                Temp.add(Num[i]);
                Result.add(Temp);
            }
        }
        return Result;
    }
}