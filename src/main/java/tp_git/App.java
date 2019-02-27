package tp_git;

import org.apache.commons.math3.analysis.function.Add;
import org.apache.commons.math3.analysis.function.Divide;
import org.apache.commons.math3.analysis.function.Multiply;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    static final int NORMAL_MODE=1;
    static final int SCIENTIFIC_MODE=2;
    static final int ADDITION=1;
    static final int SUBTRACTION=2;
    static final int MULTIPLY=3;
    static final int DIVIDE=4;

    public static void main( String[] args )
    {
        Scanner in=new Scanner(System.in);
        int mode;

        System.out.println("Select mode : \n 1-Normal \n 2-Scientific");
        mode = in.nextInt();
        if(mode==NORMAL_MODE) normalMode(in);
        if(mode==SCIENTIFIC_MODE) scientificMode(in);
        System.out.println("End");
    }

    public static void normalMode(Scanner in){
        System.out.println("Action normal mode : " +
                "\n "+ADDITION+"-Addition " +
                "\n "+SUBTRACTION+"-Subtraction " +
                "\n "+MULTIPLY+"-Multiply " +
                "\n "+DIVIDE+"-Divide");

        int action = in.nextInt();
        System.out.println("****");
        double a = in.nextDouble();
        double b= in.nextDouble();

        if(action==ADDITION) System.out.println("="+new Add().value(a,b));
        if(action==SUBTRACTION) System.out.println("="+new Add().value(a,b));
        if(action==MULTIPLY) System.out.println("="+new Multiply().value(a,b));
        if(action==DIVIDE) System.out.println("="+new Divide().value(a,b));

    }

    public static void scientificMode(Scanner in){

    }


}
