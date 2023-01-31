package com.healthcrad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.healthcrad.entity.RequestCall;

@EnableJpaRepositories
public interface RequestCallRepository extends JpaRepository<RequestCall, Integer>{

}
