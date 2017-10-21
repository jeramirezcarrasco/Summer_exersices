
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 Given a string s, partition s such that every substring of the partition is a palindrome.
 Return all possible palindrome partitioning of s.
 */
public class Palindrom
{

    public static void main(String[] args) throws Exception
    {
        Scanner input=new Scanner(System.in);
        String List = input.next();
        List<String> Temp=new ArrayList<>();
        List<List<String>> Result=new ArrayList<>();
        PalCheck(0,Temp,Result,List);
        Result.forEach((I->System.out.println(I)));

    }
    public static void PalCheck(int Count,List<String> Temp,List<List<String>> Result,String List)
    {
        if(List.length()== Count)
        {
            List<String> temp = new ArrayList<>(Temp);
            Result.add(temp);
        }
        else
        {
            for(int i=Count;i<List.length();i++)
            {
                String Word=List.substring(Count,i+1);
                if(IsPalindrom(Word))
                {
                    Temp.add(Word);
                    PalCheck(i+1,Temp,Result,List);
                    Temp.remove(Temp.size()-1);
                }
            }
        }

    }
    public static boolean IsPalindrom(String Word)
    {
        int i=0;
        int j=Word.length()-1;

        while(i<j)
        {
            if (Word.charAt(i)!=(Word.charAt(j)))
                return false;
            i++;
            j--;
        }
        return true;
    }

}