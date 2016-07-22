package assignment160714;

public class MajorCreditCalc implements ICreditCalculator {

	@Override
	public String calculateCredit(int score) {
		if(score > 100 || score < 0){
			System.out.println("Error! Wrong score input.");
			return null;
		} 
		else if (score >= 95 && score <=100)
			return "S";
		else if(score >= 90)
			return "A";
		else if(score >= 80)
			return "B";
		else if(score >= 70)
			return "C";
		else if(score >= 60)
			return "D";
		else
			return "F";
	}

}
