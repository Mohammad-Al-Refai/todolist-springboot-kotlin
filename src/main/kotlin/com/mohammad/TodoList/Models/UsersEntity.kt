package com.mohammad.TodoList.Models

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.util.*


@Table("users")
data class UsersTable(
    @Id
    var id: UUID? = null,
    @Column("username")
    var username: String = ""
)