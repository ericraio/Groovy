// Groovy code
import java.util.ArrayList;

public class Generics
{
  public static void main(String[] args)
  {
    ArrayList<Integer> lst = new ArrayList<Integer>();
    lst.add(1);
    lst.add(2);
    lst.add("hello");
    lst.add(4);
    lst.add(5);

    int total = 0;
    for(Integer i : lst)
    {
      System.out.println(i);
      total += i;
    }

    System.out.println("Total is " + total);
    try
    {
      for(Integer i : lst)
      {
        System.out.println(i.intValue());
      }
    }
    catch(Exception ex)
    {
      System.out.println(ex);
    }
  }
}
