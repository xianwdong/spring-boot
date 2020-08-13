```java
public static void main(String[] args) {
	SpringApplication springApplication = new SpringApplication(TestApplication.class);
	springApplication.addInitializers(new FirstInitializer());
	springApplication.run(args);
}
```

会输出
ThirdInitializer
FirstInitializer
SecondInitializer

虽然ThirdInitializer的Order是3，但是ThirdInitializer是通过在application.properties文件中配置的，有一个DelegatingApplicationContextInitializer，它的Order是0，它的initialize方法是获取配置文件中的context.initializer.classes配置，然后调用initialize方法，所以ThirdInitializer会先执行

实现自定义的ApplicationContextInitializer的有三种方法：
1.在META-INF中添加对应的KV
2.在application.properties中添加对应的KV
3.在代码里调用addInitializers方法