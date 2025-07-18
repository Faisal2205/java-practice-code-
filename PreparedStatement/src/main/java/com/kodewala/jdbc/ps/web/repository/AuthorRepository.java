package com.kodewala.jdbc.ps.web.repository;

import java.util.Set;

import com.kodewala.jdbc.ps.support.jpa.CustomJpaRepository;
import com.kodewala.jdbc.ps.web.entity.Author;

/**
 * <b>Author Repository</b><br>
 * You can use NamedQuery or Query annotation here.
 * 
 * @author Wenbo Wang (jackie-1685@163.com)
 */
public interface AuthorRepository extends CustomJpaRepository<Author, Long> {

	public Author findByAuthorName(String authorName);

	public Set<Author> findByAuthorBooks_Book_Id(Long bookId);
}
