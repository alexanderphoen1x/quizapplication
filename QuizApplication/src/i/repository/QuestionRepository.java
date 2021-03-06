package i.repository;

import java.util.List;

import i.pojo.Question;

public interface QuestionRepository {
	List<? extends Question> getQuestions();
	void add(Question question);
	boolean delete(Question question);
	void listAll();
	void uploadQuestionFromUser();
	List<? extends Question> getRandomQuestion(int num);
}
