package Creation_UpdateTImeStamp;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String item;
	private double cost;
	@CreationTimestamp
	private LocalDateTime ordTime;
	@UpdateTimestamp
	private LocalDateTime delTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public LocalDateTime getOrdTime() {
		return ordTime;
	}
	public void setOrdTime(LocalDateTime ordTime) {
		this.ordTime = ordTime;
	}
	public LocalDateTime getDelTime() {
		return delTime;
	}
	public void setDelTime(LocalDateTime delTime) {
		this.delTime = delTime;
	}
}
