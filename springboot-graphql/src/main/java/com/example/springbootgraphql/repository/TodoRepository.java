package com.example.springbootgraphql.repository;

import com.example.springbootgraphql.dto.TodoResponseDto;
import com.example.springbootgraphql.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface TodoRepository extends JpaRepository<Todo, Long> {
    Optional<Todo> findById(Long id);
}
