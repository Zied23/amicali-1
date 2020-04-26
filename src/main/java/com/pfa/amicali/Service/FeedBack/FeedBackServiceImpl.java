package com.pfa.amicali.Service.FeedBack;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.amicali.Entity.FeedBack;
import com.pfa.amicali.Repository.FeedBackRepository;


@Service
public class FeedBackServiceImpl implements FeedBackService {

	
	
	@Autowired
	private FeedBackRepository  feedBackRepository;
	
	@Override
	public void create(FeedBack feedBack) {
		feedBackRepository.save(feedBack);
		
	}

	@Override
	public void update(FeedBack feedBack) {
		feedBackRepository.save(feedBack);
		
	}

	@Override
	public void delete(FeedBack feedBack) {
		feedBackRepository.delete(feedBack);
		
	}

	@Override
	public void delete(Long id) {
		feedBackRepository.deleteById(id);
		
	}

	@Override
	public Optional<FeedBack> read(Long id) {
		
		return feedBackRepository.findById(id);
	}

	@Override
	public List<FeedBack> read() {
		
		return feedBackRepository.findAll();
	}

}
