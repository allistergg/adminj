
package com.smoothstack.lms.administrator.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.lms.administrator.model.Author;

@Repository
public interface AuthorDAO extends JpaRepository<Author, Integer> {
	

	

}
