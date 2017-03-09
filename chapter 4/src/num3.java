 class num3 {
	
		private double score1;
		private double score2;
		private double score3;
		private double Avg;
		
			public num3(){
				score1 = 0;
				score2 = 0;
				score3 = 0;
			}
		
			public num3(int s1, int s2, int s3){
				score1 = s1;
				score2 = s2;
				score3 = s3;
			}
			

			public double getScore1() {
				return score1;
			}

			public void setScore1(double userInput) {
				this.score1 = userInput;
			}

			public double getScore2() {
				return score2;
			}

			public void setScore2(double userInput) {
				this.score2 = userInput;
			}

			public double getScore3() {
				return score3;
			}

			public void setScore3(double userInput) {
				this.score3 = userInput;
			}	
			public double getAvg(){
				this.Avg = (score1 + score2 + score3)/3;
				return Avg;
			}
			
			
		
				
}


