package com.muslim.examplecoroutineflowforxml.example

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

val scope = CoroutineScope(Dispatchers.IO)

suspend fun main() {

    val job1 = scope.launch {
        val flow = getFlow()
        flow.collect {
            println(it)
        }
    }

    delay(5000)

    val job2 = scope.launch {
        val flow = getFlow()
        flow.collect {
            println(it)
        }
    }

    job1.join()
    job2.join()

}

fun getFlow(): Flow<Int> = flow {

    repeat(100) {
        println("Emitted: $it")
        emit(it)
        delay(1000)
    }
}
