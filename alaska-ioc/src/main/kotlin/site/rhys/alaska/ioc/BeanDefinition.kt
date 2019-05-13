package site.rhys.alaska.ioc

import java.lang.reflect.Constructor
import kotlin.reflect.KClass

interface BeanDefinition {

    fun getName(): String

    fun getDependsOn(): Array<BeanDefinition>

    fun getScope(): Int

    fun isLazyInit(): Boolean

    fun getDescription(): String

    /**
     * 获取bean的准确类型
     */
    fun getActualClass(): KClass<Any>

    fun getConstructor(): Constructor<Any>

}