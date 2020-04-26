package com.pfa.amicali.Controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.pfa.amicali.Entity.Product;
import com.pfa.amicali.Service.Product.PageProduct;
import com.pfa.amicali.Service.Product.ProductServiceImpl;

@RestController
@RequestMapping(path = "/Product")
public class ProductController {
	@Autowired 
	private ProductServiceImpl productService;
	
	
	@GetMapping(value = "/products")
	public List<Product>getProducts(){
		
		List<Product> products= productService.read();
		return products;
	}
	 
	
	@GetMapping(value = "/products/{id}")
	 public Optional<Product>getProducts(@PathVariable Long id){
		Optional<Product> products = productService.read(id);
	  return products;
	}
	
	
	
	
	@PostMapping(path= "/add/pruduct", consumes = "application/json", produces = "application/json")
    public void creatProduct(@RequestBody Product product){
       productService.create(product);
	
	}
	
	
	@RequestMapping(value = "/product/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateProduct(@PathVariable("id") long id, @RequestBody Product product) {
        
 
        Product currentProduct = productService.getOne(id);
       
        currentProduct.setProduct_name(product.getProduct_name());
        currentProduct.setProduct_price(product.getProduct_price());
        currentProduct.setDiscription_price(product.getDiscription_price());
 
        productService.update(currentProduct);
        return new ResponseEntity<>(currentProduct, HttpStatus.OK);
    }

	
	
	
	
	
	
	
	
	
	
	/*
	 * @RequestMapping(value="/Product",method = RequestMethod.GET) public
	 * PageProduct getProducts(@RequestParam long id,
	 * 
	 * @RequestParam int page,
	 * 
	 * @RequestParam int size) { return productService.getProducts(id, page, size);
	 * 
	 * }
	 */
}
