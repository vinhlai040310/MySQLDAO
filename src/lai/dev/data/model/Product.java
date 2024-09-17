package lai.dev.data.model;

import java.util.Date;

public class Product {

	private int id;
    private String name;
    private String description;
    private String thumbnail;
    private double price;
    private double quantity;
    private double category_id;
    private Date created_at;
    
	public Product(String name, String description, String thumbnail, double price, double quantity,
			double category_id, Date created_at) {
		super();
		this.name = name;
		this.description = description;
		this.thumbnail = thumbnail;
		this.price = price;
		this.quantity = quantity;
		this.category_id = category_id;
		this.created_at = created_at;
	}
	public Product(int id, String name, String description, String thumbnail, double price, double quantity,
			double category_id, Date created_at) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.thumbnail = thumbnail;
		this.price = price;
		this.quantity = quantity;
		this.category_id = category_id;
		this.created_at = created_at;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getCategory_id() {
		return category_id;
	}
	public void setCategory_id(double category_id) {
		this.category_id = category_id;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
}
