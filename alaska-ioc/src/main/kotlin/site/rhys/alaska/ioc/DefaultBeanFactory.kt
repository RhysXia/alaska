package site.rhys.alaska.ioc

open class DefaultBeanFactory(
    private val beanDefinitionRegistry: BeanDefinitionRegistry
) : BeanFactory {



    override fun <T> getBean(name: String): T {

    }

    override fun <T> getBean(clazz: Class<T>): T {
    }

    override fun containsBean(name: String): Boolean {
    }

    override fun <T> containsBean(clazz: Class<T>): Boolean {
    }

    protected fun <T> createBean(name:String): T {

    }

    protected fun <T> createBean(clazz: Class<T>): T {

    }
}