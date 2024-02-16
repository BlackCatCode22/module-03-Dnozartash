public class Cat {
    public static final int MAX_LIVES = 9;

    private static int catCount = 0;
    String Name;
    String Color;
    int Age;
    int LivesRemaining;
    public void Meow(){
        System.out.println("Meow");
    }


    public Cat () {
        catCount++;
        LivesRemaining = MAX_LIVES;
    }

    public static int getCatCount(){
        return catCount;

    }



}
