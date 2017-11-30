import java.util.Random;

/**
 * Created by ioan on 11/29/17.
 */
public class StdGenerator implements Generator{

    private Random randomGenerator;
    private int max;

    StdGenerator(int valueofmax){
        randomGenerator= new Random();
        max=valueofmax;
    }
    @Override
    public int next() {
        int x=randomGenerator.nextInt(max);
        return x+1;
    }

}