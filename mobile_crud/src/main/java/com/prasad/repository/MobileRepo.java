package com.prasad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prasad.model.Mobile;

@Repository
public interface MobileRepo extends JpaRepository<Mobile, Integer> {

}
