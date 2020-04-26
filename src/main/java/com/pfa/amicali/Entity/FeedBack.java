package com.pfa.amicali.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "FeedBack")

public class FeedBack implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;    
 
    @Column(name = "provider_name", nullable = false, length = 100)
    private String provider_name;
 
    @Column(name = "email_address", nullable = false, length = 100)
    private String provider_Email;    
 
    @Column(name = "comment", nullable = false, length = 1000)
    private String comment;
 
    @Column(name = "rating", nullable = true)
    private int rating;
 
    @ManyToOne
    @JoinColumn(name = "Product", nullable = false)
    private Product Product;
    
    @ManyToOne
    @JoinColumn(name = "Provider", nullable = false)
    private Provider Providers;
 
 
    public Provider getProviders() {
		return Providers;
	}

	public void setProviders(Provider Providers) {
		this.Providers = Providers;
	}

	@Column(name = "created", nullable = true)
    private Date created;    
 
    @PrePersist
      protected void onCreate() {
        created = new Date();
      }

	public FeedBack(Long id, String provider_name, String provider_Email, String comment, int rating,
			Product Product, Date created) {
		super();
		this.id = id;
		this.provider_name = provider_name;
		this.provider_Email = provider_Email;
		this.comment = comment;
		this.rating = rating;
		this.Product = Product;
		this.created = created;
	}

	public FeedBack() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProvider_name() {
		return provider_name;
	}

	public void setProvider_name(String provider_name) {
		this.provider_name = provider_name;
	}

	public String getProvider_Email() {
		return provider_Email;
	}

	public void setProvider_Email(String provider_Email) {
		this.provider_Email = provider_Email;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Product getProduct() {
		return Product;
	}

	public void setProduct(Product Product) {
		this.Product = Product;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "FeedBack [id=" + id + ", provider_name=" + provider_name + ", provider_Email=" + provider_Email
				+ ", comment=" + comment + ", rating=" + rating + ", Product=" + Product + ", created=" + created + "]";
	}
 

 
}