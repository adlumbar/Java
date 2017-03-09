public class TestScores
{
	private int[] scores;
	private int avg;

	public TestScores(int[] scores)   throws IllegalArgumentException
	{    		
		avg = validateScoresCreateAverage(scores);
	}

    /**
     * @param scores
     * @return
     */
	private int validateScoresCreateAverage(int[] scores)
	{
		int avg = 0;
		for(int i =0; i < scores.length; i++)
		{
			if(scores[i] < 0 || scores[i] > 100)
				throw new IllegalArgumentException("Score for test #"+ (i+1) + " out of range.");
			avg += scores[i];
		}
        return (avg / scores.length);
	}

    /**
     * getter method 
     * @return
     */
	public int getAverage()
	{
		return avg;
	}
}
