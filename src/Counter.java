public class Counter {
    private int counter = 0;
    private static int staticCounter;
    public void incrementCounter(){
         ++counter;
         ++staticCounter;
    }

    public void decrementCounter(){
         --counter;
         -- staticCounter;
    }

    public void printCounters(){
        System.out.println("counter = " + counter);
        System.out.println("staticCounter = " + staticCounter);
    }
}
