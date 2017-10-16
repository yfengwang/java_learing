public class Test {
    public static void main(String[] args){
        // 通过Lombok注解方式创建一个实体
        Person person = new Person();
        person.setName("张三");
        System.out.println("Lombok注解方式创建一个实体. Person name:" + person.getName());

        //  通过枚举创建一个单例类
        EnumSingleton.INSTANCE.getInstance().setName("Enum Singleton");
        System.out.println(EnumSingleton.INSTANCE.getInstance().GetPersonName());

        // Double check locking 创建一个单例对象
        DoubleCheckSingleton.getInstance().setName("Double check Singleton");
        System.out.println( DoubleCheckSingleton.getInstance().getName());

        // 创建一个构建器(Builder)模式实例
        PersonBulider builder = new PersonBulider();
        Person newPeerson = builder.CreatePerson("张三",20);
        System.out.println("创建一个构建器(Builder)模式实例. User name:" + newPeerson.getName());
    }
}