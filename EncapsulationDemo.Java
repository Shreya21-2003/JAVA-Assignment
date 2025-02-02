// Person class with encapsulation
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Error: Age cannot be negative or zero.");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class (REMOVED public)
class EncapsulationDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Shreya Rajesh", 25);

        System.out.println("Initial details:");
        person1.displayInfo();

        person1.setName("Madhav");
        person1.setAge(30);

        System.out.println("\nUpdated details:");
        person1.displayInfo();

        person1.setAge(-5);
    }
}
