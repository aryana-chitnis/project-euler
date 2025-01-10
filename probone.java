public class probone {
    
    public static void main (String[] args) {
    int y = 0; 
    
    for (int x =0; x < 1000;x++ ) {
    if (x % 3 == 0 || x % 5 == 0) {
    y += x;
    }

    }
    System.out.println("The sum of all natural numbers below 1000 is " + y );
} 
}
