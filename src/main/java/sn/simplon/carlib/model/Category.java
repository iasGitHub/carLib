package sn.simplon.carlib.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorie")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "categorie_id")
	private int categorieId;
	@Column(name = "nom")
	private String name;
	
	@ManyToMany(
			fetch = FetchType.LAZY,
			cascade = { 
						CascadeType.PERSIST, 
						CascadeType.MERGE 
					}	
			)
	@JoinTable(
	name = "categorie_produit",
	joinColumns = @JoinColumn(name = "categorie_id"), 	
	inverseJoinColumns = @JoinColumn(name = "produit_id")
	)
	private List<Product> products = new ArrayList<>();
	
	public Category() {
		//TODO Auto-generated constructor stub
	}

	public Category(int categorieId, String name) {
		super();
		this.categorieId = categorieId;
		this.name = name;
	}

	public int getCategorieId() {
		return categorieId;
	}

	public void setCategorieId(int categorieId) {
		this.categorieId = categorieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
}
