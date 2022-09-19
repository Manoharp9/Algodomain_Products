package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {
 
    @Autowired
    private UserRepository repo;
     
    public List<User> listAll() {
        return (List<User>) repo.findAll();
    }
     
    public void save(User product) {
        repo.save(product);
    }
     
    public User get(Integer id) {
		return repo.findById(id).get();
	}
    
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}

