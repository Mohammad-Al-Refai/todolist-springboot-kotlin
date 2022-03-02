package com.mohammad.TodoList

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing

@SpringBootApplication
class TodoListApplication

fun main(args: Array<String>) {
    runApplication<TodoListApplication>(*args)
}
