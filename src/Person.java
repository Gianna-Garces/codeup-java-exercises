public class Person {

    private String name;

    public String getName() {
//TODO: return the person's name
        return name;
    }

    public void setName(String name) {
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
    }

    public static void main(String[] args) {
        Person Gianna = new Person();

        Gianna.setName("Gigi");
        System.out.println(Gianna.getName());

        Person lily = new Person();
        lily.setName("Lily");
        System.out.println(lily.getName());
    }
}