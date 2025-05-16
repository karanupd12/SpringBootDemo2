package com.karan.app.repo;
import com.karan.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap) {
        System.out.println("Laptop saved in database");
    }

}
