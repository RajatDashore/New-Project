package com.uoons.india.data.remote.error

import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class UnknownHostError(override val data: Any? = null, override val statusCode: Int, override val message: String) : Failure(data, statusCode, message)