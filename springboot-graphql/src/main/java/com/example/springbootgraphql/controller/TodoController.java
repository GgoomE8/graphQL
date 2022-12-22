package com.example.springbootgraphql.controller;

import com.example.springbootgraphql.dto.TodoResponseDto;
import com.example.springbootgraphql.entity.Todo;
import com.example.springbootgraphql.repository.TodoRepository;
import com.example.springbootgraphql.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class TodoController {

    private final TodoService todoService;

    @QueryMapping
    public TodoResponseDto todo(@Argument Long id) {
        System.out.println("호출되었습니다.");
        return todoService.todo(id);
    }

    @QueryMapping
    public List<TodoResponseDto> todoList() {
        return Collections.emptyList();
    }
}
