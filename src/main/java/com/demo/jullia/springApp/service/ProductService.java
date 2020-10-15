package com.demo.jullia.springApp.service;

import com.demo.jullia.springApp.dao.julliaWeb.ProductDao;
import com.demo.jullia.springApp.model.julliaWeb.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDao productDao;

    public List<Product> getCartProducts(HashMap<Integer, Integer> mapCart){
        List<Product> list = new ArrayList<>();
        for (Integer id : mapCart.keySet()){
            list.add(productDao.findById(id).get());
        }
        return list;
    }
}
