public class GradedActivity
{
   protected double score;  //score

   /**
    *  The setScore method stores its argument in  
    *  the score field.
    */

   public void setScore(double s)
   {
      score = s;
   }

   /**
    *  The getScore method returns the score field.
    */

   public double getScore()
   {
      return score;
   }

   /**
    *  The getGrade method returns a letter grade  
    *  determined from the score field.
    */
   
  
   public char getGrade()
   {
      char letterGrade = 'z';   // To hold the grade

      if (score >= 90)
         letterGrade = 'A';
      else if (score >= 80)
         letterGrade = 'B';
      else if (score >= 70)
         letterGrade = 'C';
      else if (score >= 60)
         letterGrade = 'D';
      else
         letterGrade = 'F';

      return letterGrade;
   }
}