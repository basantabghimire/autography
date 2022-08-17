package com.autography.home;

import com.autography.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {



   public List<Product> getProducts(){
      List <Product> products=new ArrayList<>();

      Product product1= new Product("1","Leo Pant","https://images.lululemon.com/is/image/lululemon/LM5ADBT_032476_1?wid=1080&op_usm=0.5,2,10,0&fmt=webp&qlt=80,1&fit=constrain,0&op_sharpen=0&resMode=sharp2&iccEmbed=0&printRes=72",55.99,"Boot Fitting",10,"Man","Cap","S","abc.png","abc.png","abc.png","Sale");
      Product product2= new Product("2","Cotton Shirt","https://silverbobbin.com/wp-content/uploads/Best-Fabric-For-Shirts-735x441.jpg",12.99,"Boot Fitting",10,"Man","Cap","S","abc.png","abc.png","abc.png","Sale");
      Product product3= new Product("3","Cap", "https://cdn.shopify.com/s/files/1/0005/1445/7658/products/SIMMS_OIL_CLOTH_CAP_BLACK.jpg?v=1645224829",15.99,"Boot Fitting",10,"Kids","Cap","S","abc.png","abc.png","abc.png","Sale");

      products.add(product1);
      products.add(product2);
      products.add(product3);
      return products;
   }

   public List<Product> searchProducts(String productName){
      List <Product> products=new ArrayList<>();

      //Product product1= new Product(1,productName,"https://images.lululemon.com/is/image/lululemon/LM5ADBT_032476_1?wid=1080&op_usm=0.5,2,10,0&fmt=webp&qlt=80,1&fit=constrain,0&op_sharpen=0&resMode=sharp2&iccEmbed=0&printRes=72",55.99,"Boot Fitting",10,"Man");
      //Product product2= new Product(2,"Cotton Shirt","https://silverbobbin.com/wp-content/uploads/Best-Fabric-For-Shirts-735x441.jpg",12.99,"Boot Fitting",10,"Man");
      Product product3= new Product("3","Cap", "https://cdn.shopify.com/s/files/1/0005/1445/7658/products/SIMMS_OIL_CLOTH_CAP_BLACK.jpg?v=1645224829",15.99,"Boot Fitting",10,"Kids","Cap","S","abc.png","abc.png","abc.png","Sale");

      //products.add(product1);
      //products.add(product2);
      products.add(product3);
      return products;
   }



}
