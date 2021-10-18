package part3.ex5.abstract_;

public class NewlecExamConsole extends ExamConsole {

	@Override
	protected Exam makeExam() {
		
		return new NewlecExam();
	}

}
