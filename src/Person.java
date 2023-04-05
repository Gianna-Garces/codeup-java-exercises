public class Person {

    private String name;

    public Person(){}

    public Person (String name){
        this.name = name;
    }
    public String getName() {
//TODO: return the person's name
        return name;
    }

    public void setName(String name) {
//TODO: change the name field to the passed value
        this.name = name;
    }

    public String sayHello() {
//TODO: print a message to the console using the person's name
        return String.format("Hello, %s", this.name);
    }

    public static void main(String[] args) {
        Person Gianna = new Person();

        Gianna.setName("Gigi");
        System.out.println(Gianna.getName());

        Person lily = new Person();
        lily.setName("Lily");
        System.out.println(lily.getName());

        //    Understanding References

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

    }


}