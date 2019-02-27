package tp_git;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in=new Scanner(System.in);
        final int NORMAL_MODE=1;
        final int SCIENTIFIC_MODE=2;
        int mode;
        do {
            System.out.println("Select mode : \n 1-Normal \n 2-Scientific");
            mode = in.nextInt();
       }while(mode!=NORMAL_MODE && mode!=SCIENTIFIC_MODE);

    }
}
