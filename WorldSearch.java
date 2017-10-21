import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jorge on 8/22/2017.
 * Given a 2D board and a word, find if the word exists in the grid.
 */
public class WorldSearch
{
    static boolean [][] Visits;
    static String [] Wordss;
    public static void main(String args[])
    {
        long startTime = System.nanoTime();
        Wordss=new String[]{"acc","bdf","ddd","fea"};
        char[][] Letters={{'a','b','f'},{'c','d','e'},{'c','f','a'}};
        List<String> Result = new ArrayList<>();
        for (int i = 0; i < Wordss.length ; i++)
        {
            SearchWord(Letters,Wordss[i],Result);
        }
        Result.forEach((I->System.out.println(I)));
        System.out.println(System.nanoTime()-startTime);

    }
    public static void SearchWord(char[][] Letters,String Word,List<String>Result)
    {
        for (int i = 0; i <Letters.length ; i++)
        {
            for (int j = 0; j <Letters[0].length ; j++)
            {
                Visits =new boolean [Letters.length][Letters[0].length];
                if(Letters[i][j]==Word.charAt(0)&&Checker(Word,Letters,i,j,1))
                    Result.add(Word);
            }
        }
    }
    public static boolean Checker(String Word,char[][]Letters,int i,int j,int L)
    {
        if(L==Word.length())
            return true;
        Visits[i][j]=true;
        if(j>0&& Letters[i][j-1]==Word.charAt(L)&&Visits[i][j-1]== false)
            if(Checker(Word,Letters,i,j-1,L+1))
                return true;
        if(j<Letters[0].length-1&&Letters[i][j+1]==Word.charAt(L)&&Visits[i][j+1]== false)
            if(Checker(Word,Letters,i,j+1,L+1))
                return true;
        if(i>0&& Letters[i-1][j]==Word.charAt(L)&&Visits[i-1][j]== false)
            if(Checker(Word,Letters,i-1,j,L+1))
                return true;
        if(i<Letters.length-1&&Letters[i+1][j]==Word.charAt(L)&&Visits[i+1][j]== false)
            if(Checker(Word,Letters,i+1,j,L+1))
                return true;
        return false;

    }
}
