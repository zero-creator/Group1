package com.group1.Group1Sprint.repositories;

import com.group1.Group1Sprint.models.HelloWorldModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloWorldRepository extends JpaRepository<HelloWorldModel, Long> {

}