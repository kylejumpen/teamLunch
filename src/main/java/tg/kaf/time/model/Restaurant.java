package tg.kaf.time.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Restaurant {

	@Id @GeneratedValue
	private Integer id;
	private String nom;
	private String address;

	@OneToMany(targetEntity = Review.class, mappedBy = "restaurant")
    private List<Review> reviews;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Restaurant{" +
				"id=" + id +
				", nom='" + nom + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
