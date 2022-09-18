package org.simplilearn.librarydesign.services;

import java.util.List;

import org.simplilearn.librarydesign.entities.Library;

public interface LibraryDeleteService {
	String deleteOneLibrary(Library library);
	String deleteAllLibraries();
	String deleteAllThese(List<Library> libraries);
	String deleteAllInBatch();
	String deleteLibraryById(int id);
	String deleteAllLibrariesInBatch(List<Library> libraries);
}
