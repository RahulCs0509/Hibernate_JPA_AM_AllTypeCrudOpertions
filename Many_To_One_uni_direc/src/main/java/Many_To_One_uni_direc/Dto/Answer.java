package Many_To_One_uni_direc.Dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String answer;
	private String answerBY;
	@ManyToOne(cascade = CascadeType.ALL)
	private Question qestion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnswerBY() {
		return answerBY;
	}
	public void setAnswerBY(String answerBY) {
		this.answerBY = answerBY;
	}
	public Question getQestion() {
		return qestion;
	}
	public void setQestion(Question qestion) {
		this.qestion = qestion;
	}
	

}
