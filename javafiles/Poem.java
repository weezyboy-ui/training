public class Poem
{
   
   private String namepoem;
   private int poemlines;
   
   //getters
   public Poem(String namepoem, int poemlines)
   {
     this.namepoem = namepoem;
     this.poemlines = poemlines;
   }
   
   //setters
   public String getname()
   {
      return this.namepoem;
   }
   
   public int getplines()
   {
      return this.poemlines;
   }
   
   //methods
   public void whatru()
   {
      System.out.println("Poem name : " + getname() + "\nLines : " + getplines());
   }
}