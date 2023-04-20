package Many_To_One_uni_direc.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Many_To_One_uni_direc.Dto.Answer;

public class FatchAnswerBYouestionId {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Question id ??");
		int qid=sc.nextInt();
		String qry="select a from Answer a where a.qestion.id=:id";
		EntityManager em=Persistence.createEntityManagerFactory("rai").createEntityManager();
		Query q=em.createQuery(qry);
		q.setParameter("id", qid);
		List<Answer> answers=q.getResultList();
		for(Answer a:answers) {
			System.out.println(a.getAnswer()+"------"+a.getAnswerBY());
		}
	}

}
