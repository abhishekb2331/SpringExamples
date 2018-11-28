package com.springcode.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.springcode.model.Author;
import com.springcode.model.Book;
import com.springcode.model.Publisher;
import com.springcode.repository.AuthorRepository;
import com.springcode.repository.BookRepository;
import com.springcode.repository.PublisherRepository;

@Component
public class DevBootstrap  implements ApplicationListener<ContextRefreshedEvent>{

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;
	
	


	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		// TODO Auto-generated method stub
		initData();
	}
	
	private void initData(){
		Publisher publisher = new Publisher();
		publisher.setPublisher("Pub 1");
		
		Book book1 = new Book();
		book1.setIsbn("I123Q11");
		book1.setTitle("Intro To Spring");
		book1.setPublisher("Publisher 1");
		
		Author author = new Author();
		author.setFirstName("Abhishek");
		author.setLastName("Bhat");
		
		book1.getAuthors().add(author);
		book1.setPublisherDetail(publisher);
		//We need to save author first as book is using author and this author can't be in transient state when saving books
		authorRepository.save(author);
		//~ly save publisher first
		publisherRepository.save(publisher);
		bookRepository.save(book1);
		
		//2nd Scenario
		Book book2 = new Book();
		book2.setIsbn("I123Q11");
		book2.setTitle("Intro To Spring");
		book2.setPublisher("Publisher 1");
		
		Author author2 = new Author();
		author2.setFirstName("Abhishek");
		author2.setLastName("Bhat");
		
		//This doesn't save the relationship info when saving author
		//And Book Can't save it because it doean't have author
		author2.getBooks().add(book2);
		//So add it to book also
		book2.getAuthors().add(author2);
		authorRepository.save(author2);
		bookRepository.save(book2);
		
		
		
	}

}
