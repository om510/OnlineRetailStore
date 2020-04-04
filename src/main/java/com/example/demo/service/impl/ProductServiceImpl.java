package com.example.demo.service.impl;

import com.example.demo.entity.ProductEntity;
import com.example.demo.model.ProductDTO;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Integer addProduct(ProductDTO productDTO) {
        ProductEntity product = new ProductEntity();
        product.setPrice(productDTO.getPrice());
        product.setCategory(productDTO.getCategory());
        product.setProdName(productDTO.getProdName());
        product.setQuantity(productDTO.getQuantity());
        ProductEntity prod1 = productRepository.save(product);

        return prod1.getId();
    }
}
