package ClassInards;

/**
 * Created by chetan on 22/7/16.
 */
public class JavaPerson
{
   private final String lastName;

   private final String firstName;

   public JavaPerson(final String newLastName, final String newFirstName)
   {
      this.lastName = newLastName;
      this.firstName = newFirstName;
   }

   public String getLastName()
   {
      return this.lastName;
   }

   public String getFirstName()
   {
      return this.firstName;
   }
}