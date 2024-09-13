public class Couplet extends Poem
{
   private String title;
   
   //setter
   public Couplet(String title)
   {
      super("Couplet", 2);
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