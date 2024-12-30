package com.webdev.website.repo;

import com.webdev.website.model.SampleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepo extends JpaRepository<SampleModel, Integer> {
}
