package com.example.springbootgraphql.controller;

import com.example.springbootgraphql.dto.TodoResponseDto;
import com.example.springbootgraphql.entity.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class TodoController {

    @QueryMapping
    public TodoResponseDto todoResponseDto(@Argument Long id) {
        return null;
    }

    @QueryMapping
    public List<TodoResponseDto> todoList() {
        return Collections.emptyList();
    }
}
