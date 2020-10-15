package com.demo.jullia.springApp.dao.julliaWeb;

import com.demo.jullia.springApp.model.julliaWeb.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {
    List<Product> findAll();
}
