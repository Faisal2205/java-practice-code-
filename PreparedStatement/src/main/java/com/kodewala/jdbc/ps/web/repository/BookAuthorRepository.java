package com.kodewala.jdbc.ps.web.repository;

import com.kodewala.jdbc.ps.support.jpa.CustomJpaRepository;
import com.kodewala.jdbc.ps.web.entity.Author;
import com.kodewala.jdbc.ps.web.entity.Book;
import com.kodewala.jdbc.ps.web.entity.BookAuthor;

/**
 * <b>BookAuthor Repository</b><br>
 * You can use NamedQuery or Query annotation here.<br>
 * 
 * 
 * @author Wenbo Wang (jackie-1685@163.com)
 */
public interface BookAuthorRepository extends CustomJpaRepository<BookAuthor, Long> {

	public BookAuthor findByBookAndAuthor(Book book, Author author);

	public void deleteByAuthor(Author author);

	public void deleteByBook(Book book);
}
