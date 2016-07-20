
  
import java.util.*;
public class Student2
{
   public static void spStudent2() throws Exception
   {
      try
      {
         Insert_student.spInsert_student(7,"aruna","manufacturing");
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