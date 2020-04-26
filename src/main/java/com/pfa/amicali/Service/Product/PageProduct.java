package com.pfa.amicali.Service.Product;

import java.io.Serializable;
import java.util.List;

import com.pfa.amicali.Entity.Product;



public class PageProduct implements Serializable {
	private List<Product> products;
	private int page;
	private int totalPages;
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	
	
}
