package Many_To_One_uni_direc.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Many_To_One_uni_direc.Dto.Answer;
import Many_To_One_uni_direc.Dto.Question;

public class SaveQuestionAnswers {
	public static void main(String[] args) {
		Question q=new Question();
		q.setQuestion("What is Java?");
		q.setQuestionBy("Rahul Kumar");
		
		Question q1=new Question();
		q1.setQuestion("What is Hibernate?");
		q1.setQuestionBy("Rahul Kumar");
		
		Answer a=new Answer();
		a.setAnswer("java is high level progarming lanaguage");
		a.setAnswerBY("sai");
		a.setQestion(q);
		
		Answer a1=new Answer();
		a1.setAnswer("java is object oriended progarming lanaguage");
		a1.setAnswerBY("rai");
		a1.setQestion(q);
		
		Answer a2=new Answer();
		a2.setAnswer("java is paltfrom independed ");
		a2.setAnswerBY("pk");
		a2.setQestion(q);
		
		Answer a3=new Answer();
		a3.setAnswer("hibernate is non-invasive");
		a3.setAnswerBY("rkr");
		a3.setQestion(q1);
		
		Answer a4=new Answer();
		a4.setAnswer("hibernate is light weight");
		a4.setAnswerBY("urk");
		a4.setQestion(q1);
		
		Answer a5=new Answer();
		a5.setAnswer("hibernate is per-defined words");
		a5.setAnswerBY("rkr");
		a5.setQestion(q1);
		
		EntityManager em=Persistence.createEntityManagerFactory("rai").createEntityManager();
		EntityTransaction et=em.getTransaction();
		em.persist(a);em.persist(a1);em.persist(a2);em.persist(a3);em.persist(a4);em.persist(a5);
		et.begin();
		et.commit();
		
		
		
	}

}
