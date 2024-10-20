package com.uoons.india.data.remote.error

import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
open class Failure(open val data : Any? = null, open val statusCode: Int, open val message : String)