package task3;

public class Fact {
    public static long factCycle(long n){
        long fact = 1;
        for (; n > 0; fact *= n--);
        return fact;
    }

    public static long factRec(long n){
        if  (n == 1) return 1;
        else return factRec(n-1) * n;
    }
}
