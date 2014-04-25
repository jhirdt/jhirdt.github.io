import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Fibonacci 
{
    static long[] values = new long[100];
	static DecimalFormat formatter = new DecimalFormat("#,###");
    
    public static void main(String[] args) 
    {
    
        String input = JOptionPane.showInputDialog("Please enter element of Fibonacci sequence");
        long x = Integer.parseInt(input);
    	long y = (fibRecursive(x));	
    	System.out.println(formatter.format(y));
    	values[1] = 1;
    
    }

    
      	public static long fibRecursive(long n) 
      				{
                    long previous1=0, previous2=1;
                    for(long i=0; i<n; i++) {
                        long savePrev1 = previous1;
                        previous1 = previous2;
                        previous2 = savePrev1 + previous2;
                    }
                    return previous1;
    	}
}
