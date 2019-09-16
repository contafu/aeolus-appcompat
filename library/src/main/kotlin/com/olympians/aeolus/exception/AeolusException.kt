package com.olympians.aeolus.exception

class AeolusException(val code: Int, val businessCode: Int? = 0, val msg: String? = null) : Throwable()