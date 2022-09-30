package com.autography.service;

import com.autography.model.Author;
import com.autography.model.Book;
import com.autography.model.Publisher;

import com.autography.repository.AuthorRepository;
import com.autography.repository.BookRepository;
import com.autography.repository.PublisherRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StaticData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public StaticData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Report:");
        System.out.println("Static Data Set running");

        Publisher publisher = new Publisher();
        publisher.setName("Toronto Publishing");
        publisher.setAddress("67 Pringdale Gardens CIR");
        publisher.setCity("Scarborough");
        publisher.setProvince("ON");
        publisher.setPostalCode("A1A1A1");

        publisherRepository.save(publisher);

        System.out.println("Publisher Count: "+ publisherRepository.count());

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123","https://images-na.ssl-images-amazon.com/images/I/51HUSM3jtsL._SX371_BO1,204,203,200_.jpg");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459","https://img.thriftbooks.com/api/images/m/57a8e2ee5562b98f55e5667cba745456ff818fc4.jpg");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);

        Author Robert = new Author("Robert", "Martin");
        Book CleanCode = new Book("A Handbook of Agile Software Craftsmanship", "9780132350884","https://images-na.ssl-images-amazon.com/images/I/41xShlnTZTL._SX376_BO1,204,203,200_.jpg");
        Robert.getBooks().add(CleanCode);
        CleanCode.getAuthors().add(Robert);

        CleanCode.setPublisher(publisher);
        publisher.getBooks().add(CleanCode);

        authorRepository.save(Robert);
        bookRepository.save(CleanCode);
        publisherRepository.save(publisher);


        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());


    }
}
