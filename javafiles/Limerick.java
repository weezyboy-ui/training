public class Limerick extends Poem
{
   private String title;
   
   //setter
   public Limerick(String title)
   {
      super("Limerick", 5);
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