package com.pfa.amicali.Entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Product")
public class Product  implements Serializable{
	
	
	
	
	
	


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	@Column(name = "product_name", nullable = false)
    private String product_name;
	
	@Column(name = "product_price", nullable = false)
    private float product_price;
	
	@Column(name = "discription_price", nullable = false)
    private String discription_price;

	private String pictureUrl;

	
	
	@Column(name = "created_at", nullable = true)
    @CreatedDate
    private Date createdAt;
    
    
    @Column(name = "updated_at", nullable = true)
    @LastModifiedDate
    private Date updatedAt;

	@ManyToOne
	@JoinColumn(name = "Providers", nullable = false)
	private Provider Providers;

	@OneToMany(mappedBy = "Product", fetch = FetchType.LAZY)
	private List<FeedBack> feedback;

	@Column(name="rating", columnDefinition = "int default 0")
	private int rating;





	public Product() {
		
	}

	
	

	public Product(String product_name, float product_price, String discription_price, String pictureUrl,
			Date createdAt, Date updatedAt) {
		super();
		this.product_name = product_name;
		this.product_price = product_price;
		this.discription_price = discription_price;
		this.pictureUrl = pictureUrl;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}






	
	
	public Provider getProviders() {
		return Providers;
	}




	public void setProviders(Provider Providers) {
		this.Providers = Providers;
	}
	
	
	
	

	
	
	
	public long getId() {
		return id;
	}




	
	public void setId(long id) {
		this.id = id;
	}




	
	public String getProduct_name() {
		return product_name;
	}




	
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}




	public float getProduct_price() {
		return product_price;
	}




	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}





	public String getDiscription_price() {
		return discription_price;
	}




	
	public void setDiscription_price(String discription_price) {
		this.discription_price = discription_price;
	}





	public String getPictureUrl() {
		return pictureUrl;
	}




	
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}





	public Date getCreatedAt() {
		return createdAt;
	}




	
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}




	public Date getUpdatedAt() {
		return updatedAt;
	}




	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}




	
    
    
    
    

    
    
    
    
    
    
    
	
	public List<FeedBack> getFeedback() {
		return feedback;
	}





	public void setFeedback(List<FeedBack> feedback) {
		this.feedback = feedback;
	}




	
	public int getRating() {
		return rating;
	}





	public void setRating(int rating) {
		this.rating = rating;
	}




	@Override
	public String toString() {
		return "Product [id=" + id + ", product_name=" + product_name + ", product_price=" + product_price
				+ ", discription_price=" + discription_price + ", pictureUrl=" + pictureUrl + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}
    
    
    
	
	

}
