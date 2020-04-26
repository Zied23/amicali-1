package com.pfa.amicali.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfa.amicali.Entity.FeedBack;


@Repository
public interface FeedBackRepository extends JpaRepository<FeedBack, Long> {

}
