package com.mohammad.TodoList.Repositories

import com.mohammad.TodoList.Models.UsersTable
import org.springframework.data.repository.kotlin.CoroutineSortingRepository
import java.util.UUID


interface UsersRepo : CoroutineSortingRepository<UsersTable, UUID>