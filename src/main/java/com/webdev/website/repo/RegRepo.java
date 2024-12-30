package com.webdev.website.repo;

import com.webdev.website.model.RegModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegRepo extends JpaRepository<RegModel, String> {
}
