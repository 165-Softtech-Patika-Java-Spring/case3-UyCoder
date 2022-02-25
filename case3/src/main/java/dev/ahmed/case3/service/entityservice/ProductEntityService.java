package dev.ahmed.case3.service.entityservice;

import com.fasterxml.jackson.annotation.OptBoolean;
import dev.ahmed.case3.dao.ProductDao;
import dev.ahmed.case3.entity.Product;
import dev.ahmed.case3.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * @Author Ahmed Bughra
 * @Created 2/25/2022 - 4:52 PM
 * @Project case3-UyCoder
 */

@Service
@RequiredArgsConstructor
public class ProductEntityService {


    private final ProductDao productDao;

    public List<Product> findAllProduct() {
        return productDao.findAll();
    }

    public Product saveProduct(Product product) {
        return productDao.save(product);
    }

    public Product findAllProductById(Long id) {
        return productDao.getById(id);
    }

    public void deleteProduct(Long id) {
        productDao.deleteById(id);
    }

    public Product updatePrice(Long id, Long price) {
        Optional<Product> productOptional = productDao.findById(id);
        Product product;

        if (productOptional.isPresent()){
            product = productOptional.get();
        } else {
            throw new NotFoundException("Item not found!");
        }

        product.setPrice(price);
        return productDao.save(product);
    }
}
