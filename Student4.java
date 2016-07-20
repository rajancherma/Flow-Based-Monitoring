
  
import java.util.*;
public class Student4
{
   public static void spStudent4() throws Exception
   {
      try
      {
         Spinsert_student.spSpinsert_student(7,"aruna","manufacturing");
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