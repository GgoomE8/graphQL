package com.example.springbootgraphql.service;

import com.example.springbootgraphql.dto.TodoResponseDto;
import com.example.springbootgraphql.entity.Todo;
import com.example.springbootgraphql.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoResponseDto todo(Long id) {
        Optional<Todo> todoOpt = todoRepository.findById(id);
        if(!todoOpt.isPresent()) {
            return null;
        }
        TodoResponseDto todoResponseDto = new TodoResponseDto(todoOpt.get());
        return todoResponseDto;
    }
}
