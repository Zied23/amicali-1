package com.pfa.amicali.Service.Product;

import java.util.List;
import java.util.Optional;

import com.pfa.amicali.Entity.Product;


public interface ProductService {
	void create(Product product);

    void update(Product product);

    void delete(Product product);

    void delete(Long id);
    
    Product getOne(long id);
    	
    Optional<Product> read(Long id);

    List<Product> read();
    
    //public PageProduct getProducts(long id,int page,int size );
}
