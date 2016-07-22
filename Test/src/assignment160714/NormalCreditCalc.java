package assignment160714;

public class NormalCreditCalc implements ICreditCalculator {

	@Override
	public String calculateCredit(int score) {
		if(score > 100 || score < 0){
			System.out.println("Error! Wrong score input.");
			return null;
		} 
		else if (score >= 90 && score <=100)
			return "A";
		else if(score >= 80)
			return "B";
		else if(score >= 70)
			return "C";
		else if(score >= 55)
			return "D";
		else
			return "F";
	}

}
