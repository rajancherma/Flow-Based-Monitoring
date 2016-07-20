
  
import java.util.*;
public class Student
{
   public static void spStudent() throws Exception
   {
      try
      {
         Insert_student.spInsert_student(6,"kumar","civil");
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