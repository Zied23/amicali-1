package com.pfa.amicali.Service.Commuity;

import com.pfa.amicali.Entity.Community;

import java.util.List;
import java.util.Optional;

public interface CommunityService {

    void create(Community community);

    void update(Community community);

    void delete(Community community);

    void delete(Long id);

    Optional<Community> read(Long id);

    List<Community> read();

    String addMemberTOCommunity(long idCommunity, long idMember);
    void removeMemberTOCommunity(long idCommunity, long idMember);
}
