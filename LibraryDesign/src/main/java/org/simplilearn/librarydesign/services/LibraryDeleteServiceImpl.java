package org.simplilearn.librarydesign.services;

import java.util.List;

import org.simplilearn.librarydesign.entities.Library;
import org.simplilearn.librarydesign.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryDeleteServiceImpl implements LibraryDeleteService{
	@Autowired
	private LibraryRepository libraryRepository;
	@Override
	public String deleteOneLibrary(Library library) {
		libraryRepository.delete(library);
		return "Library Deleted";
	}

	@Override
	public String deleteAllLibraries() {
		libraryRepository.deleteAll();
		return "All Libraries are Delete";
	}

	@Override
	public String deleteAllThese(List<Library> libraries) {
		libraryRepository.deleteAll(libraries);
		return "Deleted All Libraries";
	}

	@Override
	public String deleteAllInBatch() {
		libraryRepository.deleteAllInBatch();
		return "Deleted all libraries in batch";
	}

	@Override
	public String deleteLibraryById(int id) {
		libraryRepository.deleteById(id);
		return "Library deleted by id";
	}

	@Override
	public String deleteAllLibrariesInBatch(List<Library> libraries) {
		libraryRepository.deleteInBatch(libraries);
		return "Deleted all the libraries in batch mode";
	}

}
