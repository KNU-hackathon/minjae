package com.spring.login.repository;

import com.spring.login.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Member, Long> {
}
