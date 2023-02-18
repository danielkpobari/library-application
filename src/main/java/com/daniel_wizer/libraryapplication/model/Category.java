package com.daniel_wizer.libraryapplication.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import com.daniel_wizer.libraryapplication.model.Books;

import java.util.List;

@Entity
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
private List<Books> Books;


}
