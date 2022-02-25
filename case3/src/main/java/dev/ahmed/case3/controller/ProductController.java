package dev.ahmed.case3.controller;

import dev.ahmed.case3.entity.Product;
import dev.ahmed.case3.service.entityservice.ProductEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author Ahmed Bughra
 * @Created 2/25/2022 - 5:24 PM
 * @Project case3-UyCoder
 */

@Controller
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    public final ProductEntityService productEntityService;

    // Ürün kaydeden bir servis yazınız.
    @PostMapping
    public ResponseEntity saveProduct(@RequestBody Product product) {
        product = productEntityService.saveProduct(product);
        return ResponseEntity.ok(product);
    }

    //Ürünleri listeleyebilen bir servis yazınız.
    @GetMapping
    public ResponseEntity findAllProduct() {
        List<Product> products = productEntityService.findAllProduct();
        return ResponseEntity.ok(products);
    }

    //Ürün idsinden ürünü bulan bir servis yazınız.
    @GetMapping("/{id}")
    public ResponseEntity findAllProductById(@PathVariable Long id) {
        Product product = productEntityService.findAllProductById(id);
        return ResponseEntity.ok(product);
    }

    //Ürün silen bir metot yazınız.
    @DeleteMapping("/{id}")
    public ResponseEntity deleteProduct(@PathVariable Long id) {
        productEntityService.deleteProduct(id);
        return ResponseEntity.ok(Void.TYPE);
    }

    //Ürün fiyatı güncelleyen bir metot yazınız. (Sadece fiyat)
    @PatchMapping("/{id}")
    public ResponseEntity updatePrice(@PathVariable Long id, @RequestParam Long price) {
        Product product = productEntityService.updatePrice(id, price);
        return ResponseEntity.ok(product);
    }
}
