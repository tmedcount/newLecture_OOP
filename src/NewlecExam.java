import part3.ex4.separatingUI_code.Exam;

public class NewlecExam extends Exam { // is a 상속
	
	private int com;
	
	public NewlecExam() {
		this(0,0,0,0);
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);		
		this.com = com;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	@Override
	public int total() {
		
		return super.total()+com;
	}

	
	@Override
	public float avg() {
		
		return total()/4.0f;
	}
}
