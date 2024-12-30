package com.webdev.website.service;

import com.webdev.website.model.RegModel;
import com.webdev.website.repo.RegRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class RegService {

    @Autowired
    RegRepo repo;

    public RegModel addUser(RegModel reg) {
        return repo.save(reg);
    }

    public boolean login(@RequestBody RegModel d) {
        Optional<RegModel> login = repo.findById(d.getEmail());

        if (login == null) {
            return false;
        }

        RegModel data = login.get();

        if (!data.getPswd().equals(d.getPswd())) {
            return false;
        }
        return true;
    }

}
