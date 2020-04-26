package com.pfa.amicali.Service.Provider;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.amicali.Entity.Provider;
import com.pfa.amicali.Repository.ProviderRepository;


@Service
public class ProviderServiceImpl implements ProviderService {

	
	
	@Autowired
	private ProviderRepository providerRepository;
	@Override
	public void create(Provider provider) {
		providerRepository.save(provider);
	}

	@Override
	public void update(Provider provider) {
		providerRepository.save(provider);
		
	}

	@Override
	public void delete(Provider provider) {
		providerRepository.delete(provider);
		
	}

	@Override
	public void delete(Long id) {
		providerRepository.deleteById(id);
		
	}

	@Override
	public Optional<Provider> read(Long id) {
		
		return providerRepository.findById(id);
	}

	@Override
	public List<Provider> read() {
		
		return providerRepository.findAll();
	}

}
