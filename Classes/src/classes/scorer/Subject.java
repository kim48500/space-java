package classes.scorer;

public class Subject {
	private String subjectName; //과목명
	private int scorePoint;// 점수

	//setter,getter
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectName() { return setSubjectName;}
	
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	public String getScorePoint() { return getScorePoint;}
	
}
