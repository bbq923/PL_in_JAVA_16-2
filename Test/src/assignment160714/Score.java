package assignment160714;

public class Score {
	private int studentCode;
	private int majorCode;
	int sessionID;
	private int rawScore;
	private String credit;
	
	public Score(int studentCode, int majorCode, int sessionID, int rawScore){
		this.studentCode = studentCode;
		this.majorCode = majorCode;
		this.sessionID = sessionID;
		this.rawScore = rawScore;
		setCredit(); //sessionID와 majorCode를 비교해 적절한 정책에 따라 credit을 set해주는 메서드
	}
	
	public void setCredit(){
		if(majorCode == sessionID){
			MajorCreditCalc mc = new MajorCreditCalc();
			credit = mc.calculateCredit(rawScore);
		} else {
			NormalCreditCalc nc = new NormalCreditCalc();
			credit = nc.calculateCredit(rawScore);
		}
	}
	
	public String getCredit(){
		return credit;
	}
	
}
