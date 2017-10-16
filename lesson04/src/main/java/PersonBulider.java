public class PersonBulider {
    public Person CreatePerson(String name, int age){
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return person;
    }
}


