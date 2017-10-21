/**
 * Created by jorge on 7/10/2017.
 */
public class ListH
{
    int n;
    int m;
    ListH next;

    ListH(int n,int m,ListH next)
    {
        this.n=n;
        this.m=m;
        this.next=next;

    }
    ListH(int n,int m)
    {
        this.n=n;
        this.m=m;

    }
    public void Print()
    {
        System.out.print(n+" "+m);
    }
}
