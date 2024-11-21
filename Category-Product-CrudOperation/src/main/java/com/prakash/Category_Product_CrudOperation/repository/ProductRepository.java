package com.prakash.Category_Product_CrudOperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakash.Category_Product_CrudOperation.model.Product;

public interface ProductRepository  extends JpaRepository<Product,Long>{

}
