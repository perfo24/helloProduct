package kr.ac.hansung.cse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name="product_table")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4577239542252345341L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private long id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "category")
	private String category;

	@Column(name = "price")
	private int price;

	@Column(name = "manufacturer")
	private String manufacturer;

	@Column(name = "unit_in_stock")
	private int unitInStock;

	@Column(name = "description")
	private String description;

	public Product(String name, String category, int price, String manufacturer, int unitInStock, String description) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.manufacturer = manufacturer;
		this.unitInStock = unitInStock;
		this.description = description;
	}
}