package com.kodewala.jdbc.JDBC.web.repository;

import com.kodewala.jdbc.JDBC.support.jpa.CustomJpaRepository;
import com.kodewala.jdbc.JDBC.web.entity.Author;
import com.kodewala.jdbc.JDBC.web.entity.Book;
import com.kodewala.jdbc.JDBC.web.entity.BookAuthor;

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
