package com.mohammad.TodoList.Util

class Routes {
    object Todo {
        const val TODO_CONTROLLER_ENDPOINT = "/api/todo"
        const val GET_ITEMS = "/all/{id}"
        const val ADD_ITEM = "/add"
        const val UPDATE_ITEM = "/update"
    }

    object User {
        const val USER_CONTROLLER_ENDPOINT = "/api/user"
        const val CREATE = "/create"

    }
}