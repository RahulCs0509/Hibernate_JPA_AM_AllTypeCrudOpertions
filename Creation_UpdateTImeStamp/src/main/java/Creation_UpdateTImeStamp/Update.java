package Creation_UpdateTImeStamp;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class Update {
	public static void main(String[] args) {
		EntityManager em=Persistence.createEntityManagerFactory("rai").createEntityManager();
		EntityTransaction et=em.getTransaction();
		FoodOrder o=em.find(FoodOrder.class, 2);
		o.setItem("Mutton Biryani");
		o.setCost(120.0);
		et.begin();
		et.commit();
	}

}
