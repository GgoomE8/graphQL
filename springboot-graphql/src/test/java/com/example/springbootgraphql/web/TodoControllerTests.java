package com.example.springbootgraphql.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureGraphQlTester;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.graphql.test.tester.GraphQlTester;

@SpringBootTest
@AutoConfigureGraphQlTester
public class TodoControllerTests {
    @Autowired
    private GraphQlTester graphQlTester;


    @DisplayName("1. 게시글 1개 가져오기")
    @Test
    void test_1(){
        this.graphQlTester.documentName("todo")
                .variable("id", 1L)
                .execute()
                .path("todo.title")
                .entity(String.class)
                .isEqualTo("어제부터시작");
    }
//    @DisplayName("2. 게시글 전체 가져오기")
//    @Test
//    void test_2(){
//        this.graphQlTester.documentName("todo")
//                .variable("id", 2L)
//                .execute()
//                .path("todo.title")
//                .entity(String.class)
//                .isEqualTo("오늘부터시작");
//    }

}
