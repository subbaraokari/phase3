package org.simplilearn.librarydesign.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LibraryExistsServiceImplTest {
	@Autowired
	private LibraryExistService libraryExistService;
	@Test
	void testCheckLibraryExistsById() {
		assertTrue(libraryExistService.checkLibraryExistsById(1));
	}
	@Test
	void testCheckLibraryExistsWithTheseBooks() {
		String commaSeperatedBookNames="Learn Java,learn .net,learn scala";
		assertTrue(libraryExistService.checkLibraryExistsWithTheseBooks(commaSeperatedBookNames));
	}

}
