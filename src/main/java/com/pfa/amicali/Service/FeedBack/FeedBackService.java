package com.pfa.amicali.Service.FeedBack;

import java.util.List;
import java.util.Optional;

import com.pfa.amicali.Entity.FeedBack;


public interface FeedBackService {
	
	
	void create(FeedBack feedBack);

    void update(FeedBack feedBack);

    void delete(FeedBack feedBack);

    void delete(Long id);

    Optional<FeedBack> read(Long id);

    List<FeedBack> read();

}