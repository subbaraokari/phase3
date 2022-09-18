package org.simplilearn.librarydesign.services;

import java.util.List;

import org.simplilearn.librarydesign.entities.Library;
import org.simplilearn.librarydesign.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryCreateServiceImpl implements LibraryCreateService{
	@Autowired
	private LibraryRepository libraryRepository;
	@Override
	public String addSingleLibrary(Library library) {
		libraryRepository.save(library);
		libraryRepository.flush();
		return "Library Saved";
	}

	@Override
	public String addAllLibraries(List<Library> libraries) {
		libraryRepository.saveAll(libraries);
		libraryRepository.flush();
		return "All Libraries Saved";
	}

	@Override
	public String addLibraryWithSaveAndFlush(Library library) {
		libraryRepository.saveAndFlush(library);
		return null;
	}

}
