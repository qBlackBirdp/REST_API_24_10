package com.hys.exam.rest_24_10.boundedContext.repository;

import com.hys.exam.rest_24_10.boundedContext.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username);
}
