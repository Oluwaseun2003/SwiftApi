package com.Ecommece.product.controller;


import com.Ecommece.product.dto.ProductDto;
import com.Ecommece.product.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping(value = "/create")
    public Object createProduct(@RequestBody ProductDto productDto){
        return productService.createProduct(productDto);
    }

    @PutMapping("/{id}")
    public Object updateProduct(@RequestBody ProductDto productDto, @PathVariable Long id){
        return productService.updateProduct(productDto, id);
    }

    @GetMapping("/get/{id}")
    public Object fetchProductId(@PathVariable Long id){
        return productService.fetchProductId(id);
    }

    @GetMapping("/get")
    public Object fetchProducts(){
        return productService.fetchProducts();
    }

    @DeleteMapping("/{id}")
    public Object deleteProduct(@PathVariable Long id){
        return productService.deleteProduct(id);
    }

}
