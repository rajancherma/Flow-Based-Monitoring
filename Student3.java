
  
import java.util.*;
public class Student3
{
   public static void spStudent3() throws Exception
   {
      try
      {
         Spinsert_student.spSpinsert_student(6,"kumar","civil");
      }
      catch(Exception e)
      {
         e.printStackTrace();
         throw e;
      }
      finally
      {
      }
   }
}