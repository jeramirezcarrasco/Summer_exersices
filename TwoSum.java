import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jorge on 7/11/2017.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 */
public class TwoSum
{
    public static void main (String arg[])
    {
        Scanner input = new Scanner(System.in);
        int[] Arr = new int[3];
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]=input.nextInt();
        }
        Arrays.sort(Arr);
        int result[] = SumTwo(Arr,10);
        System.out.println(Arrays.toString(SumTwo(Arr,10)));
        System.out.println(Arr[result[0]]+"+"+Arr[result[1]]);

    }
    public static int[] SumTwo (int[] Arr,int A)
    {

        int[] Result = {-1,-1};
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(i+",,,,"+(A-Arr[i]));
            int j=(Binary(Arr,A-Arr[i],i));
            System.out.println("--"+j);
            if(j==-1)
                continue;
            Result[0]=i;
            Result[1]=j;
            return Result;
        }
        return Result;
    }
    public static int Binary(int[] Arr,int A, int I)
    {
        int Min=0;
        int Max=Arr.length-1;
        while(Min<=Max)
        {
            int mid= Min+((Max-Min)/2);
            if(mid==I)
                return -1;
            if(A>Arr[mid])
                Min = mid+1;
            else if(A<Arr[mid])
                Max= mid-1;
            else
                return mid;
        }

        return -1;
    }
}
