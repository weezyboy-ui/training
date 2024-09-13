import java.util.*;

public class demojava
{
   public static void main(String[]args)
   { 
      Scanner s = new Scanner(System.in);
      
      //putting values
      System.out.print("Enter a couplet poem : ");
      String d = s.nextLine();
      
      System.out.print("Enter a Limerick poem : ");
      String e = s.nextLine();
      
      System.out.print("Enter a Haiku poem : ");
      String f = s.nextLine();
      
      //object making
      Poem a = new Couplet(d);
      Poem b = new Limerick(e);
      Poem c = new Haiku(f);
      
      
      //method calling
      a.whatru();
      
      b.whatru();
      
      c.whatru();
   }
}