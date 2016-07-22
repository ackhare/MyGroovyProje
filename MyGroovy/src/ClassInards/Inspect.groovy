package ClassInards

import org.apache.commons.logging.Log

/**
 * Created by chetan on 22/7/16.
 */
/**
 * Simple Groovy class used in demonstration of Groovy detecting methods with
 * explicitly overridden inspect() method but without explicitly overridden
 * dump() method.
 *
 * @author Dustin
 */

class PersonWithInspect
{
   String lastName

   String firstName

   PersonWithInspect(final String newLastName, final String newFirstName)
   {
      this.lastName = newLastName
      this.firstName = newFirstName
   }

   @Override
   String toString()
   {
      return this.firstName + " " + this.lastName
   }


   String inspect()
   {
      return "new Person(" + this.lastName + ", " + this.firstName + ")"
   }
}

PersonWithInspect personWithInspect = new PersonWithInspect('jon','doe')
println personWithInspect.inspect()