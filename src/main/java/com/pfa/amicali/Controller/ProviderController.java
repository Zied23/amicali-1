package com.pfa.amicali.Controller;

import com.pfa.amicali.Entity.Provider;
import com.pfa.amicali.Service.Provider.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/Provider")
@CrossOrigin("*")
public class ProviderController {
	@Autowired 
	private ProviderServiceImpl providerService;
	
	
	@GetMapping(value = "/providers")
	public List<Provider>getProviders(){
		List<Provider> providers =providerService.read();
		return providers;
		
	}
	
	
	
	@GetMapping(value = "/providers/{id}")
	 public Optional<Provider>getProviders(@PathVariable Long id){
		Optional<Provider> providers = providerService.read(id);
	  return providers;
	}
	
	
	@PostMapping(path= "/add/provider", consumes = "application/json", produces = "application/json")
    public void creatProvider(@RequestBody Provider provider){
      providerService.create(provider);
	
	}
	
}
