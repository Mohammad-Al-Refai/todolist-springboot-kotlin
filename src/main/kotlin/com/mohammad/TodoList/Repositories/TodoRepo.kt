package com.mohammad.TodoList.Repositories


import com.mohammad.TodoList.Models.TodoTable
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.data.repository.kotlin.CoroutineSortingRepository
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import java.util.*


interface TodoRepo : CoroutineSortingRepository<TodoTable, UUID>