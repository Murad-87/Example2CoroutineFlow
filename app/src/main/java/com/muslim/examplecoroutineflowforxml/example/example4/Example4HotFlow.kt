package com.muslim.examplecoroutineflowforxml.example.example4

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

val scope = CoroutineScope(Dispatchers.IO)

//suspend fun main() {
//
//    val flow = MutableSharedFlow<Int>()
//
//    scope.launch {
//        repeat(100) {
//            println("Emitted: $it")
//            flow.emit(it)
//            delay(1000)
//        }
//    }
//
//    val job1 = scope.launch {
//        flow.collect {
//            println("Got form 1st collector: $it")
//        }
//    }
//
//    delay(5000)
//
//    val job2 = scope.launch {
//        flow.collect {
//            println("Got form 2nd collector: $it")
//        }
//    }
//
//    job1.join()
//    job2.join()
//
//}
//
//fun getFlow(): Flow<Int> = flow {
//
//    repeat(100) {
//        println("Emitted: $it")
//        emit(it)
//        delay(1000)
//    }
//}
