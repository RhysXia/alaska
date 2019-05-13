package site.rhys.alaska.ioc

interface BeanFactory {

    fun <T> getBean(name: String): T

    fun <T> getBean(clazz: Class<T>): T

    fun containsBean(name: String): Boolean

    fun <T> containsBean(clazz: Class<T>): Boolean
}