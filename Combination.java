import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
public class Combination
{

    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k= input.nextInt();
        int subArr []=new int[k];
        List<int []> result = new ArrayList<>();
        getNext(0,0,n,k,subArr,result);
        result.forEach((I)-> System.out.println(Arrays.toString(I)));
    }


    private static void getNext(int i, int count, int n, int k, int[] subArr, List<int []> result)
    {
        if(k==0)
        {
            int arrg[]= {subArr[0],subArr[1]};
            result.add(arrg);
        }
        else
        {
            for (int j = i + 1; j <= n; j++)
            {
                subArr[count] = j;
                getNext(j, count + 1, n, k - 1, subArr, result);
            }
        }

    }

}