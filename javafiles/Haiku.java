public class Haiku extends Poem
{
   private String title;
   
   //setter
   public Haiku(String title)
   {
      super("Haiku", 3);
      this.title = title;
   }
   
   //method override
   @Override
   public void whatru()
   {
      System.out.println("\nTitle : " + this.title);
      super.whatru();
   }
}