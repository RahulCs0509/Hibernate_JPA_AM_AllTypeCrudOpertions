package Creation_UpdateTImeStamp;
import java.time.LocalDateTime;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class SaveFoodOrder {
	public static void main(String[] args) {
		FoodOrder o=new FoodOrder();
		o.setId(2);
		o.setItem("Egg Biryani");
		o.setCost(180.00);
		o.setOrdTime(LocalDateTime.now());
		o.setDelTime(LocalDateTime.now());
		EntityManager em=Persistence.createEntityManagerFactory("rai").createEntityManager();
		EntityTransaction et=em.getTransaction();
		em.persist(o);
		et.begin();
		et.commit();
	}

}
