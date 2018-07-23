package tg.kaf.time.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Review {

	@Id @GeneratedValue
	private int id;
	private UserApp reviewer;
	@ManyToOne(targetEntity = Restaurant.class)
	private Restaurant restaurant;
	private int note;
	private String comment;
	private LocalDate date;

	public Review(){

	}

	public Review(UserApp reviewer, int note, String comment, LocalDate date) {
		this.reviewer = reviewer;
		this.note = note;
		this.comment = comment;
		this.date = date;
	}

	public UserApp getReviewer() {
		return reviewer;
	}

	public void setReviewer(UserApp reviewer) {
		this.reviewer = reviewer;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
}
