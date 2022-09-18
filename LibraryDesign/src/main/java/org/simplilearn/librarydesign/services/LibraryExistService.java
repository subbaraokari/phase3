package org.simplilearn.librarydesign.services;

public interface LibraryExistService {
	boolean checkLibraryExistsById(int id);
	boolean checkLibraryExistsWithTheseBooks(String commaSeperatedBookNames);
}
