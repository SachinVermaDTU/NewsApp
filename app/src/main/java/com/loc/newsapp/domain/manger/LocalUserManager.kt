package com.loc.newsapp.domain.manger

import kotlinx.coroutines.flow.Flow

interface LocalUserManager {
    //   A suspend function is a function that can be paused and resumed at
    //   a later time . it is designed to work asynchronously and can be safely
    //   used in coroutine-based code without causing thread blocking or
    //   synchronization issues.
     suspend fun savedAppEntry()
//    A Flow in Kotlin represents a sequential, potentially asynchronous stream
//    of data that emits multiple values over time, facilitating
//    non-blocking operations and supporting cancellation and
//    backpressure handling
    fun readAppEntry() : Flow<Boolean>
}