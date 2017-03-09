import java.util.Scanner;
public class TestScoresLauncher
{
	public static void main(String[] args)
	{
		int[] scoresArray = getArray(getIntInput("How many tests would you like to enter?"));
		try
		{
			TestScores theseScores = new TestScores(scoresArray);
			System.out.println("\nAverage score for test: " + theseScores.getAverage());
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("invalid test score\n" + e.getMessage());
		}
	}

    /*
     * @param intIn
     * @return int[]
     */
	public static int[] getArray(int intIn)
	{
		int[] scores = new int[intIn];
		for (int i = 0; i < scores.length; i++)
		{
			scores[i] = getIntInput("Enter score for test #" + (i+1));
		}
		return scores;
	}

    /*
     * @param stringIn
     * @return int
     */
	public static int getIntInput(String stringIn)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println(stringIn);
		return keyboard.nextInt();
	}
}
