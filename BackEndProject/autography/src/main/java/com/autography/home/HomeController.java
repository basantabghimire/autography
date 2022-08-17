package com.autography;

import com.autography.model.Inquiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AutographController {

    @Autowired
    private AutographService autographService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("inquiry", new Inquiry());
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @GetMapping("/products")
    public String products(Model model){
        model.addAttribute("products",autographService.getProducts());
        return "products";
    }

    @PostMapping("/products")
    public String searchProducts(Model model, @ModelAttribute Inquiry inquiry){
        String name=(inquiry.getSearchString());
        model.addAttribute("products",autographService.searchProducts(name));
        return "products";
    }

    @GetMapping("/singleProduct")
    public String singleProduct(){
        return "singleProduct";
    }

    /*@GetMapping("/inventory")
    public String index(){
        return "inventory";
    }*/

    @GetMapping("/report")
    public String report(Model model){
        model.addAttribute("product",new ProductService());
        return "report";
    }
}
