package com.pfa.amicali.Service.Product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.pfa.amicali.Entity.Product;
import com.pfa.amicali.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	
	
	@Autowired
	private ProductRepository  productRepository ;
	
	@Override
	public void create(Product product) {
		productRepository.save(product);
		
	}

	@Override
	public void update(Product product) {
		productRepository.save(product);	
	}

	@Override
	public void delete(Product product) {
		productRepository.delete(product);
		
	}

	@Override
	public void delete(Long id) {
		productRepository.deleteById(id);
		
	}

	@Override
	public Optional<Product> read(Long id) {
		
		return productRepository.findById(id);
	}

	@Override
	public List<Product> read() {
		
		return productRepository.findAll();
	}

	@Override
	public Product getOne(long id) {
		 return productRepository.getOne(id);
		
	}

	
		
	




	

	/*
	 * @Override public PageProduct getProducts(long id, int page, int size) {
	 * Page<Product> prods=productRepository.getProducts( id, PageRequest.of(page,
	 * size)); PageProduct Pprod= new PageProduct();
	 * Pprod.setProducts(prods.getContent());
	 * Pprod.setTotalPages(prods.getTotalPages()); return Pprod;
	 * 
	 * }
	 */


}
