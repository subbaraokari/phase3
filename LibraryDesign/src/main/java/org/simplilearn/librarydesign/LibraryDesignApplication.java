package org.simplilearn.librarydesign;

import org.simplilearn.librarydesign.entities.Library;
import org.simplilearn.librarydesign.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryDesignApplication {
	@Autowired
	private LibraryRepository libraryRepository;
	public static void main(String[] args) {
		SpringApplication.run(LibraryDesignApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner()
	{
		CommandLineRunner runner=new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				Library l1=new Library();
				l1.setName("Technology Library");
				l1.setCommaSeperatedBookNames("Learn Java,learn .net,learn scala");
				Library l2=new Library();
				l2.setName("Space Library");
				l2.setCommaSeperatedBookNames("Red Planet,Star Library");
				Library l3=new Library();
				l3.setName("Dogs Library");
				l3.setCommaSeperatedBookNames("");
				Library l4=new Library();
				l4.setName("Animal Library");
				l4.setCommaSeperatedBookNames("");
				Library l5=new Library();
				l5.setName("A Library");
				l5.setCommaSeperatedBookNames("abc,xyz,efg");
				libraryRepository.save(l1);
				libraryRepository.save(l2);
				libraryRepository.save(l3);
				libraryRepository.save(l4);
				libraryRepository.save(l5);
			}
		};
		return runner;
	}

}
