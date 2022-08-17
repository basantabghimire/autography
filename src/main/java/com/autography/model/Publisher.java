
package com.autography.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long publisherId;

    private String name;
    private String address;
    private String city;
    private String province;
    private String postalCode;

   @OneToMany
   @JoinColumn(name="publisher")
    private Set<Book>books=new HashSet<>();

    public Publisher() {

    }

    public Publisher(Long publisherId, String name, String address, String city, String province, String postalCode) {
        this.publisherId = publisherId;
        this.name = name;
        this.address = address;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherId=" + publisherId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return publisherId !=0 ? publisherId.equals(publisher.publisherId):publisherId==null;
    }

    @Override
    public int hashCode() {
        return publisherId != null ? publisherId.hashCode():0;
    }

    public Long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}

