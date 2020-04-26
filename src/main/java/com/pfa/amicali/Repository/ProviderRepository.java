package com.pfa.amicali.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfa.amicali.Entity.Provider;


@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {

}
