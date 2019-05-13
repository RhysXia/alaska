package site.rhys.alaska.ioc

interface BeanDefinitionRegistry {
    fun addBeanDefinition(beanDefinition: BeanDefinition)

    fun getBeanDefinitions(): MutableList<BeanDefinition>
}