package objects2.accumulator;

/**
 * Created by evami on 21.10.17.
 */
public class Divide extends Operation{

    @Override
    public int doOperation(int a, int b){
        if (b == 0){
            System.out.println("Divide on 0");
            return a;
        }
        return a / b;
    }
}
