public class Main {
    public static void main(String[] args) {
        System.out.println(Cat.getCatCount());

        Cat myCat = new Cat();
        myCat.Meow();
        myCat.Name = "Cheese";
        myCat.Color = "Orange";
        myCat.Age = 1;
        System.out.println(Cat.MAX_LIVES);
        System.out.println(myCat.getClass()); }
}
