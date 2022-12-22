package com.example.springbootgraphql.dto;

import com.example.springbootgraphql.entity.Todo;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TodoResponseDto {
    private Long id;
    private String title;
    private String content;
    private boolean isCheck;

    public Todo toEntity() {
        return Todo.builder()
                .id(id)
                .title(title)
                .content(content)
                .isCheck(isCheck)
                .build();
    }

    public TodoResponseDto(Todo todo) {
        this.id = todo.getId();
        this.title = todo.getTitle();
        this.content = todo.getContent();
        this.isCheck = todo.isCheck();
    }
}
