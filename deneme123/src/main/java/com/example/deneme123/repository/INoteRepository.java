package com.example.deneme123.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.deneme123.entity.Note;

public interface INoteRepository extends JpaRepository<Note, Integer>{


}
