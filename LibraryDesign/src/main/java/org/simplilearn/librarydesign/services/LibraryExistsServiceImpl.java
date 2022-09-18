package org.simplilearn.librarydesign.services;

import org.simplilearn.librarydesign.entities.Library;
import org.simplilearn.librarydesign.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.stereotype.Service;

@Service
public class LibraryExistsServiceImpl implements LibraryExistService{
	@Autowired
	private LibraryRepository libraryRepository;
	@Override
	public boolean checkLibraryExistsById(int id) {
		return libraryRepository.existsById(id);
	}

	@Override
	public boolean checkLibraryExistsWithTheseBooks(String commaSeperatedBookNames) {
		Library library=new Library();
		library.setCommaSeperatedBookNames(commaSeperatedBookNames);
		ExampleMatcher matcher=ExampleMatcher.matching()
				.withMatcher("commaSeperatedBookNames", GenericPropertyMatchers.exact())
				.withIgnorePaths("id","name");
		Example<Library> example=Example.of(library,matcher);
		return libraryRepository.exists(example);
	}

}
