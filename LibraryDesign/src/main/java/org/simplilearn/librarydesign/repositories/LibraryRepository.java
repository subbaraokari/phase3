package org.simplilearn.librarydesign.repositories;

import org.simplilearn.librarydesign.entities.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Integer>{

}
