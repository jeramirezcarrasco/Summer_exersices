import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jorge on 7/24/2017.
 * Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
 */
public class SumCombination
{
    public static void main(String arg[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Array size");
        int[] Arr = new int[input.nextInt()];
        System.out.println("Input Array values");
        for (int i = 0; i < Arr.length; i++)
        {
            Arr[i] = input.nextInt();
        }
        int Sum=10;
        List<List<Integer>> Result = new ArrayList<>();
        List<Integer> Temp = new ArrayList<>();
        Combination(Sum,Arr,Temp,Result,0);
        Result.forEach((I)->System.out.println(I));
    }
    public static void Combination(int Sum,int[] Numbers,List<Integer> temp,List<List<Integer>> Result,int i)
    {
        if(SUm(temp)==Sum)
        {
            List<Integer> subList = new ArrayList<>();
            for(int k = 0; k < temp.size(); k ++)
                subList.add(temp.get(k));

            Result.add(subList);

        }
        else if(SUm(temp) < Sum)
        {
            for(int j=i;j<Numbers.length;j++)
            {

                temp.add(Numbers[j]);
                Combination(Sum, Numbers, temp, Result, j + 1);
                temp.remove(temp.size() - 1);
                while (j!=Numbers.length-1&&Numbers[j]==Numbers[j+1])
                    j++;

            }
        }
    }
    public static int SUm(List<Integer> temp)
    {

        int Sum=0;
        for(int i=0;i<temp.size();i++)
        {
            Sum=Sum + temp.get(i);
        }
        return Sum;
    }
}
