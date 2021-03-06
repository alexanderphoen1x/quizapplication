package pojo;

import i.pojo.Answer;

public class MultipleChoiceAnswer implements Answer {
	private String answer;
	private boolean isTrue;

	public MultipleChoiceAnswer(String answer, boolean isTrue) {
		super();
		this.answer = answer;
		this.isTrue = isTrue;
	}

	@Override
	public String getAnswer() {
		return answer;
	}

	public boolean isTrue() {
		return isTrue;
	}

	@Override
	public String toString() {
		return "Answer [answer=" + answer + ", isTrue=" + isTrue + "]";
	}
}
