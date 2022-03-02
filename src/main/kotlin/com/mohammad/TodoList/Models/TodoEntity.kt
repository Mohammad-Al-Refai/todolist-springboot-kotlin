package com.mohammad.TodoList.Models


import org.jetbrains.annotations.NotNull
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.util.UUID


@Table("todo")
data class TodoTable(
    @Id
    var id: UUID? = null,
    @NotNull
    @Column("userid")
    var userid: UUID? = null,
    @NotNull
    @Column("title")
    var title: String = "",
    @NotNull
    @Column("description")
    var description: String = ""
)