public class LoopTest
{
  public static void main(String[] args) 
  {
   Scanner scanner = new Scanner(System.in);
   int room;   
   do 
   {
      System.out.println("What room are you in? ");
      room = scanner.nextInt();
   } 

   while(!isValid(room));
   { 

   //if else or switch
    }
   public boolean isValid(int room);
   {
   if(room > 4 || room  < 1);
   {
    System.out.println("Try again ;)" );
       return false;
       else return true;
     }
   }
 } 
}