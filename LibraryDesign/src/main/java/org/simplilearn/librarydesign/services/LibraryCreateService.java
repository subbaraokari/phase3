package org.simplilearn.librarydesign.services;

import java.util.List;

import org.simplilearn.librarydesign.entities.Library;

public interface LibraryCreateService {
	String addSingleLibrary(Library library);
	String addAllLibraries(List<Library> libraries);
	String addLibraryWithSaveAndFlush(Library library);
}
