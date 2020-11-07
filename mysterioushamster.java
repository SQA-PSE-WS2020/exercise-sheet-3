import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;

public class mysterioushamster
{
    private Integer stepCounter = 0;
    private Hamster hamster;

    // Ignore
    public mysterioushamster(Hamster hamster)
    {
        this.hamster = hamster;
    }

    void doSomething1(){
        hamster.turnLeft();
    }

    void doSomething2()
    {
        hamster.move();
        stepCounter++;
        boolean hadGrain = !hamster.mouthEmpty();
        while(!hamster.mouthEmpty()){
            hamster.putGrain();
        }
        hamster.move();
        stepCounter++;
        if(hadGrain){
            hamster.write("Ups! Da war ich wohl zu schnell!");
        }
    }

    void doSomething3()
    {
        hamster.move();
        stepCounter++;
        hamster.write("Ich bin schon " + stepCounter + " Schritte gelaufen");
    }
    
    void doSomething4(){
        hamster.turnLeft();
        hamster.turnLeft();
        hamster.turnLeft();
    }

    void doSomething5(){
        hamster.turnLeft();
        hamster.turnLeft();
    }

    int doSomething6(){
        return stepCounter;
    }

    void doSomething7(){
        hamster.write(stepCounter.toString());
    }

    void doSomething8(){
        hamster.pickGrain();
    }

    void doSomething9(){
        hamster.write("Geschafft! :)");
    }
    //ignore
    void write(String text){
        hamster.write(text);
    }
}
