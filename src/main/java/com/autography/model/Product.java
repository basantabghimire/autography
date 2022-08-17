package com.autography.model;


import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;


public class Product {

   // @Id
    public String productId;

    public String name;
    public String productPictureUrl;
    public double price;
    public String description;
    public int quantity;
    public String section;
    public String category;
    public String size;
    public String picture1;
    public String picture2;
    public String picture3;
    public String offer;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductPictureUrl() {
        return productPictureUrl;
    }

    public void setProductPictureUrl(String productPictureUrl) {
        this.productPictureUrl = productPictureUrl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPicture1() {
        return picture1;
    }

    public void setPicture1(String picture1) {
        this.picture1 = picture1;
    }

    public String getPicture2() {
        return picture2;
    }

    public void setPicture2(String picture2) {
        this.picture2 = picture2;
    }

    public String getPicture3() {
        return picture3;
    }

    public void setPicture3(String picture3) {
        this.picture3 = picture3;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public Product(String productId, String name, String productPictureUrl, double price, String description, int quantity, String section, String category, String size, String picture1, String picture2, String picture3, String offer) {
        this.productId = productId;
        this.name = name;
        this.productPictureUrl = productPictureUrl;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.section = section;
        this.category = category;
        this.size = size;
        this.picture1 = picture1;
        this.picture2 = picture2;
        this.picture3 = picture3;
        this.offer = offer;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", productPictureUrl='" + productPictureUrl + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", section='" + section + '\'' +
                ", category='" + category + '\'' +
                ", size='" + size + '\'' +
                ", picture1='" + picture1 + '\'' +
                ", picture2='" + picture2 + '\'' +
                ", picture3='" + picture3 + '\'' +
                ", offer='" + offer + '\'' +
                '}';
    }
}
