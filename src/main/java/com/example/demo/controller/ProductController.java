package com.example.demo.controller;

import com.example.demo.model.ProductDTO;
import com.example.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @PostMapping(value = "/add",consumes = "application/json")
    public Integer addProduct(@RequestBody ProductDTO productDTO){
        final Integer productId = productService.addProduct(productDTO);
        return productId;
    }

}
