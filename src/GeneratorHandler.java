import java.util.Random;

public class GeneratorHandler {
    private static Random random;

    static{
        random = new Random();
    }

    public int getRandomNumber(){
        return random.nextInt(101);
    }

}
