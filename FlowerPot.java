import java.util.Scanner;

/**
 * Created by jorge on 7/12/2017.
 * Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.
 * Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.
 */

public class FlowerPot
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
        System.out.println("Input flowers number");
        System.out.println(PotFlower(Arr,1));

    }
    public static boolean PotFlower(int[] Arr,int n)
    {
        for(int i=0;i<Arr.length;i++)
        {
            if((i==0&&Arr[i]==0&&Arr[i+1]==0)||(i==(Arr.length-1)&& Arr[i]==0&&Arr[i-1]==0)||(Arr[i]==0&&Arr[i-1]==0&&Arr[i+1]==0))
                n-=1;
        }
        return n==0;
    }

}

