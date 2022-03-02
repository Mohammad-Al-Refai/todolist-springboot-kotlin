package com.mohammad.TodoList.Controllers


import com.mohammad.TodoList.Models.TodoTable
import com.mohammad.TodoList.Repositories.TodoRepo
import com.mohammad.TodoList.Repositories.UsersRepo
import com.mohammad.TodoList.Util.HttpResponseUtil
import com.mohammad.TodoList.Util.Routes
import com.mohammad.TodoList.Util.UUIDUtil
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.kotlin.core.publisher.toFlux
import reactor.kotlin.core.publisher.toMono
import java.util.*

@RestController
@RequestMapping(Routes.Todo.TODO_CONTROLLER_ENDPOINT)
class TodoController {
    @Autowired
    lateinit var todoRepo: TodoRepo

    @Autowired
    lateinit var userRepo: UsersRepo

    @GetMapping("/")
    fun getALL(): Flow<TodoTable> {
        return todoRepo.findAll()
    }

    @PostMapping(Routes.Todo.ADD_ITEM)
    suspend fun addTodo(@RequestBody body: Map<String, String>): Any {
        val uid = body["userid"]
        val title = body["title"]
        val description = body["description"]
        if (UUIDUtil.UUID.isUUID(uid.toString())) {
            val isUserExists = userRepo.existsById(UUID.fromString(uid))
            if (isUserExists) {
                val todo = todoRepo.save(
                    TodoTable(
                        userid = UUID.fromString(uid),
                        title = title.toString(),
                        description = description.toString()
                    )
                )
                return HttpResponseUtil.response.ok(todo)
            }
        }
        return HttpResponseUtil.response.notFound("uid is not found")
    }

    @GetMapping(Routes.Todo.GET_ITEMS)
    suspend fun getTodosByUserUID(@PathVariable id: UUID): Flow<TodoTable> {
       var data=todoRepo.findAll().filter {
           it.userid==id
       }
        return data

    }

}