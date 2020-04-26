package com.pfa.amicali.Controller;

import com.pfa.amicali.Entity.Community;
import com.pfa.amicali.Service.Commuity.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/community")
public class CommunityController {


    @Autowired
    private CommunityService communityService;

    @GetMapping(value = "/show")
    public List<Community> getCommunity() {

        List<Community> communities = communityService.read();

        return communities;
    }


    @GetMapping(value = "/show/{id}")
    public Optional<Community> getCommunity(@PathVariable Long id) {

        Optional<Community> community = communityService.read(id);

        return community;
    }

    @PostMapping(path= "/add", consumes = "application/json", produces = "application/json")
    public void creatCommunity(@RequestBody Community community){
        communityService.create(community);

    }

    @DeleteMapping("/delete/{id}")
    public List<Community> cancelCommunity(@PathVariable long id) {
        communityService.delete(id);
        return communityService.read();
    }

    @PostMapping("/add/member/{idMember}/community/{idCommunity}")
    public String addMember(@PathVariable("idCommunity") Long idCommunity, @PathVariable("idMember") Long idMember ){



        return communityService.addMemberTOCommunity(idCommunity,idMember);
    }

    @DeleteMapping("/delete/member/{idMember}/community/{idCommunity}")
    public Optional<Community> removeMember(@PathVariable("idCommunity") Long idCommunity,@PathVariable("idMember") Long idMember ){

        communityService.removeMemberTOCommunity(idCommunity,idMember);

        return communityService.read(idCommunity);
    }

}
