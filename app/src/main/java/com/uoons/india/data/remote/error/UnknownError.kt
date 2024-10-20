package com.uoons.india.data.remote.error


data class UnknownError(override val data: Any? = null, override val statusCode: Int, override val message: String) : Failure(data, statusCode, message)