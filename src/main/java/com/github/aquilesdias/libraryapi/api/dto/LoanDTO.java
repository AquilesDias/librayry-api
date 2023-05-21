package com.github.aquilesdias.libraryapi.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LoanDTO {

    private Long id;
    private String isbn;
    private String customer;
    private BookDTO book;
}
