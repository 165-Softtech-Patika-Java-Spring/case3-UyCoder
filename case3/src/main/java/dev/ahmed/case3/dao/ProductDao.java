package dev.ahmed.case3.dao;

import dev.ahmed.case3.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author Ahmed Bughra
 * @Created 2/25/2022 - 4:30 PM
 * @Project case3-UyCoder
 */

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {

}
