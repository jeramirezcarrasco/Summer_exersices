import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jorge on 8/11/2017.
 */
/*
Given a collection of distinct numbers, return all possible permutations.
For example,
[1,2,3] have the following permutations:
[
[1,2,3],
[1,3,2],
[2,1,3],
[2,3,1],
[3,1,2],
[3,2,1]
]
*/
public class Permutatons
{
    public static void main(String potato[])
    {
        Scanner Input = new Scanner(System.in);
        int[] Numbers = new int[Input.nextInt()];
        for(int i=0;i<Numbers.length;i++)
        {
            Numbers[i]=Input.nextInt();
        }
        List<int[]> Result = new ArrayList<>();
        Per(Numbers,0,Result);
        Result.forEach((I->System.out.println(Arrays.toString(I))));
    }
    public static void Per(int[] Nums, int count, List<int []> Result)
    {
        if(count==Nums.length)
        {
            int[] temp=new int[Nums.length];
            for (int i = 0; i <temp.length ; i++)
            {
                temp[i]=Nums[i];
            }
            Result.add(temp);
        }
        else
        {
            for(int i = count;i<Nums.length;i++)
            {
                if(count == i || Nums[count] != Nums[i])
                {
                    int temp = Nums[count];
                    Nums[count] = Nums[i];
                    Nums[i] = temp;
                    Per(Nums, count + 1, Result);
                    temp = Nums[count];
                    Nums[count] = Nums[i];
                    Nums[i] = temp;
                }
            }

        }
    }
    public static void Swap(List<Integer>Temp,int i,int j)
    {
        int temp = Temp.get(i);
        Temp.add(i,Temp.get(j));
        Temp.add(j,temp);
    }
}
