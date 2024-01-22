package org.example

import com.fasterxml.jackson.databind.json.JsonMapper
import com.typicode.jsonplaceholder.client.TodosClient
import okhttp3.OkHttpClient

private val objectMapper = JsonMapper
    .builder()
    .build()

fun main() {
    println(TodosClient(objectMapper, "https://jsonplaceholder.typicode.com/", OkHttpClient()).getTodo(1))
}
