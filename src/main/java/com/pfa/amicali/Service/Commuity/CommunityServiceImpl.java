package com.pfa.amicali.Service.Commuity;

import com.pfa.amicali.Entity.Community;
import com.pfa.amicali.Entity.Subscriber;
import com.pfa.amicali.Repository.CommunityRepository;
import com.pfa.amicali.Repository.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommunityServiceImpl implements CommunityService {


    @Autowired
    private CommunityRepository communityRepository;
    @Autowired
    private SubscriberRepository subscriberRepository;


    @Override
    public void create(Community community) {
        communityRepository.save(community);

    }

    @Override
    public void update(Community community) {
        communityRepository.save(community);

    }

    @Override
    public void delete(Community community) {
        communityRepository.delete(community);
    }

    @Override
    public void delete(Long id) {
        communityRepository.deleteById(id);

    }

    @Override
    public Optional<Community> read(Long id) {
        return communityRepository.findById(id);
    }

    @Override
    public List<Community> read() {
        return communityRepository.findAll();
    }
    @Override
    public String addMemberTOCommunity(long idCommunity, long idMember){


        Community community = communityRepository.getOne(idCommunity);
        Subscriber subscriber = subscriberRepository.getOne(idMember);
        List<Subscriber> list = community.getCommunityMember();

        if (list.contains(subscriber)) {
            return "Subsriber already in ";
        }else {
            list.add(subscriber);
            community.setCommunityMember(list);
            communityRepository.save(community);
        }
        return "Done";

    }

    @Override
    public void removeMemberTOCommunity(long idCommunity, long idMember){

        Community community = communityRepository.getOne(idCommunity);
        Subscriber subscriber = subscriberRepository.getOne(idMember);
        List<Subscriber> list = community.getCommunityMember();
        list.remove(subscriber);
        community.setCommunityMember(list);

        communityRepository.save(community);
    }

}
