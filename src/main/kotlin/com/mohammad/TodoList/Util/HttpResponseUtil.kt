package com.mohammad.TodoList.Util

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

class HttpResponseUtil {
    object response {
        fun<T> notFound(payload: T): ResponseEntity<Map<String, T>> {
            return ResponseEntity(mapOf("error" to payload),HttpStatus.NOT_FOUND)
        }
        fun ok (payload: Any): ResponseEntity<Any> {
            return ResponseEntity(payload,HttpStatus.OK)
        }
    }
}