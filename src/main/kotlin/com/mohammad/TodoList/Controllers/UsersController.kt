package com.mohammad.TodoList.Controllers

import com.mohammad.TodoList.Models.UsersTable
import com.mohammad.TodoList.Repositories.UsersRepo
import com.mohammad.TodoList.Util.Routes
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(Routes.User.USER_CONTROLLER_ENDPOINT)
class UsersController {
    @Autowired
    lateinit var usersRepo: UsersRepo

    @PostMapping(Routes.User.CREATE)
    suspend fun createUser(@RequestBody body: Map<String, String>): UsersTable {
        val userName = body["username"].toString()
        usersRepo.save(UsersTable(username = userName))
        return usersRepo.save(UsersTable(username = userName))
    }
}