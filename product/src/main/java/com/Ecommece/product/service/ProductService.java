package com.Ecommece.product.service;

import com.Ecommece.product.dto.ProductDto;
import com.Ecommece.product.model.Product;
import com.Ecommece.product.repository.ProductRepo;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
    private ProductRepo productRepo;

    public ProductService(ProductRepo productRepo){
        this.productRepo = productRepo;
    }

    public Object createProduct(ProductDto productDto){
        Product product = new Product();

        product.setProductName(productDto.getProductName());
        product.setProductDescrip(productDto.getProductDescrip());
        product.setProductAmount(productDto.getProductAmount());
        product.setStockQuantity(productDto.getStockQuantity());

        return productRepo.save(product);

    }

    public Object updateProduct(ProductDto productDto, Long id){
        Product product = productRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found, Try again"));

        product.setProductName(productDto.getProductName());
        product.setProductDescrip(productDto.getProductDescrip());
        product.setProductAmount(productDto.getProductAmount());
        product.setStockQuantity(productDto.getStockQuantity());

        return productRepo.save(product);
    }

    public Object fetchProductId(Long id){

        return productRepo.findById(id);
    }

    public  Object fetchProducts(){
        return productRepo.findAll();
    }

    public Object deleteProduct(Long id){
        Product product = productRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found, please try again"));
        productRepo.delete(product);

        return "Product deleted successfully";
    }
}
