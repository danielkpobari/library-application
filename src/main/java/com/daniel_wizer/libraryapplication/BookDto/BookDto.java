package com.daniel_wizer.libraryapplication.BookDto;

import jakarta.persistence.Entity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class BookDto {
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private String year;
    private String category;
    private String image;


}
