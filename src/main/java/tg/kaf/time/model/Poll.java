package tg.kaf.time.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Poll {

	@Id @GeneratedValue
	private int id;
	@ManyToMany
	private List<Restaurant> restaurants;
	private UserApp admin;
	@ManyToMany(targetEntity = UserApp.class)
	private List<UserApp> eaters;
	private LocalDateTime startDate;
	private LocalDateTime endDateTime;
	private Status status;

	public UserApp getAdmin() {
		return admin;
	}

	public void setAdmin(UserApp admin) {
		this.admin = admin;
	}

	public List<UserApp> getEaters() {
		return eaters;
	}

	public void setEaters(List<UserApp> eaters) {
		this.eaters = eaters;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}

	public LocalDateTime getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(LocalDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}
}
