/**Date difference code
 * @author Swastika
 */
import java.time.*;
import java.util.*;

public class Exercise7{  
   public static void main(String[] args)
    {
        LocalDate randomdate = LocalDate.of(2021, 01, 11);
        LocalDate systemdate = LocalDate.now();
 
        Period diff = Period.between(randomdate, systemdate);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
  }
}