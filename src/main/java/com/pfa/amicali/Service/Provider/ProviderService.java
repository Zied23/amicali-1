package com.pfa.amicali.Service.Provider;

import java.util.List;
import java.util.Optional;

import com.pfa.amicali.Entity.Provider;



public interface ProviderService {

	
	
	void create(Provider provider);

    void update(Provider provider);

    void delete(Provider provider);

    void delete(Long id);

    Optional<Provider> read(Long id);

    List<Provider> read();
}