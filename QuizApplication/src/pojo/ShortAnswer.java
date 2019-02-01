package pojo;

import i.pojo.Answer;

public class ShortAnswer implements Answer {
	private String answer;

	public ShortAnswer(String answer) {
		super();
		this.answer = answer;
	}

	@Override
	public String getAnswer() {
		return answer;
	}
	
	
}