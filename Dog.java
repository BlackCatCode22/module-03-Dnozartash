public class Dog {
    final String name;
    private final String breed;
    int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Dog{" +
                "Bandit='" + name + '\'' +
                ", Border Collie ='" + breed + '\'' +
                ", 11 =" + age +
                '}';
    }

    public static void main(String[] args) {
        Dog myDog;
        myDog = new Dog("Bandit",
                "Border Collie",
                11);
        System.out.println("My dog's name is " + myDog.getName() + ", and it is a " + myDog.getBreed() + " that is " + myDog.getAge() + " years old.");
    }
}