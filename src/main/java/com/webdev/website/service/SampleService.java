package com.webdev.website.service;

import com.webdev.website.model.SampleModel;
import com.webdev.website.repo.SampleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SampleService {

    @Autowired
    SampleRepo repo;

    @Bean
    public List<SampleModel> getProd() {
       return repo.findAll();
   }

    public SampleModel getOneProd(int id) {
        return repo.findById(id).orElse(new SampleModel());
    }
}
