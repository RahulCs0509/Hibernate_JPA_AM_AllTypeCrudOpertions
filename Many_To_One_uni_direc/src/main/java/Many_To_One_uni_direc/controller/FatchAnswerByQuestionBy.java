package Many_To_One_uni_direc.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Many_To_One_uni_direc.Dto.Answer;

public class FatchAnswerByQuestionBy {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Questionby ??");
		String qes=sc.nextLine();
		String qry="select a from Answer a where a.qestion.questionBy=:questionBy";
		EntityManager em=Persistence.createEntityManagerFactory("rai").createEntityManager();
		Query q=em.createQuery(qry);
		q.setParameter("questionBy", qes);
		List<Answer> answers=q.getResultList();
		for(Answer a:answers) {
			System.out.println(a.getAnswer()+"------"+a.getAnswerBY());
		}
	}

}
