package com.github.aquilesdias.libraryapi.model;

import com.github.aquilesdias.libraryapi.model.entity.Book;
import com.github.aquilesdias.libraryapi.model.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LoanRepository extends JpaRepository<Loan, Long> {

    @Query("select case when (count(l.id) > 0) then true else false end " +
            "from Loan l where l.book =:book and (l.returned is null or l.returned is false)")
    boolean existsByBookAndNotReturned(Book book );
}
