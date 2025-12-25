package com.ecom.productcatalog.repository;

import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.model.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
