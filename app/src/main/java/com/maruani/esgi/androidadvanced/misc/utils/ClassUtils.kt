package com.maruani.esgi.androidadvanced.misc.utils

import java.lang.reflect.ParameterizedType

@Suppress("UNCHECKED_CAST")
class ClassUtils {

    companion object {
        fun <T> instantiateTypeArgumentOf(clz: Class<*>): T {
            return getTypeParameterClass<Any>(clz).newInstance() as T
        }

        private fun <T> getTypeParameterClass(clz: Class<*>): Class<T> {
            val type = clz.genericSuperclass
            val paramType = type as ParameterizedType
            return paramType.actualTypeArguments[0] as Class<T>
        }
    }
}