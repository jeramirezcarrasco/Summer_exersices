/**
 * Created by jorge on 8/4/2017.
 * Given a digit string, return all possible letter combinations that the number could represent.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneLetter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[][] Letters= {{"N"},{"N"},{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
        int[] Arr = new int[input.nextInt()];
        System.out.println("Input Array values");
        for (int i = 0; i < Arr.length; i++)
        {
            Arr[i] = input.nextInt();
        }
        List<List<String>> Result=new ArrayList<>();
        List<String> Temp=new ArrayList<>();
        NumberPhone(Arr,Letters,Temp,Result,0);
        Result.forEach((I->System.out.println(I)));

    }
    public static void NumberPhone(int[] Numbers,String[][] Letters,List<String> Temp,List<List<String>> Result,int count)
    {

        if(count >=Numbers.length)
        {
            List<String> temp=new ArrayList<>(Temp);
//            for(int i=0;i<Temp.size();i++)
//            {
//                temp.add(Temp.get(i));
//            }
            Result.add(temp);
        }
        else
        {
            for(int i=0;i<Letters[Numbers[count]].length;i++)
            {
                Temp.add(Letters[Numbers[count]][i]);
                NumberPhone(Numbers,Letters,Temp,Result,count+1);
                Temp.remove(Temp.size()-1);
            }
        }
    }
}
