package com.karan.app.service;
import com.karan.app.repo.LaptopRepository;
import com.karan.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        System.out.println("Laptop added");
        repo.save(lap);
    }

    public boolean isGoodForCoding(Laptop lap) {
        return true;
    }
}
