package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 * @author Matthew Cardona at ZenOfProgramming.com
 */
public class TestUserprofile
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner(System.in);
      UserProfile user = new UserProfile("Matt", "Action");

      System.out.println(user.list());
      System.out.println(user.getUserID() + " You chose " + user.getGenre());

   }

}
