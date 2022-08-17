package com.autography;

import com.autography.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public String saveProduct(@RequestBody Product product, Model model){
       model.addAttribute(productService.saveProduct(product));
        return "inventory";
    }

    @GetMapping
    public List <Product>getAllProduct(){
        return productService.findAll();
    }

    @GetMapping("/{name}")
    public List<Product> findAllByProduct(@RequestParam("name") String name){
       return productService.findAllByProduct(name);
    }



}
