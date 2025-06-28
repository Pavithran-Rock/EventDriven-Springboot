package com.pavithranApp.ProductsMicroservice.Controllers;

import com.pavithranApp.ProductsMicroservice.Models.CreateProductRestModel;
import com.pavithranApp.ProductsMicroservice.Service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    ProductService productservice;
    public ProductController(ProductService productservice){
        this.productservice = productservice;
    }
    public ResponseEntity<String> createProduct(@RequestBody CreateProductRestModel product){
        String productId = this.productservice.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(productId);

    }
}
