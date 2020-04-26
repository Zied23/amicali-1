package com.pfa.amicali.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.amicali.Entity.FeedBack;
import com.pfa.amicali.Service.FeedBack.FeedBackServiceImpl;

@RestController
@RequestMapping(path = "/FeedBack")

public class FeedbackController {

	@Autowired 
	private FeedBackServiceImpl feedBackService;
	
	
	
	@GetMapping(value = "/feedBacks")
	public List<FeedBack>getFeedBacks(){
		List<FeedBack> feedBacks =feedBackService.read();
		return feedBacks;
		
	}
	
	
	
	@GetMapping(value = "/feedBacks/{id}")
	 public Optional<FeedBack>getFeedBacks(@PathVariable Long id){
		Optional<FeedBack> feedBacks = feedBackService.read(id);
	  return feedBacks;
	}
	
	
	@PostMapping(path= "/add/feedBack", consumes = "application/json", produces = "application/json")
    public void creatFeedBack(@RequestBody FeedBack feedBack){
		feedBackService.create(feedBack);
	
	}
	
}
