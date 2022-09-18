package org.simplilearn.librarydesign.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class LibraryCountServiceImplTest {
	@Autowired
	private LibraryCountService libraryCountService;
	@Test
	void testCountLibraries() {
		System.out.println(libraryCountService.countLibraries());
		assertEquals(5, libraryCountService.countLibraries());
	}

	@Test
	void testCountLibrariesWithZeroBooks() {
		assertEquals(2, libraryCountService.countLibrariesWithZeroBooks());
	}

}
