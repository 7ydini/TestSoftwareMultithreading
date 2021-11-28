import java.util.ArrayList;
import java.util.List;

public class FactorizeThread implements Runnable {
    public long number;
    public int startDivider = 2;
    public List<Integer> result = new ArrayList<>();

    public FactorizeThread(long number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Множетели числа " + number + " : " + factorize());
    }
    public String factorize(){
        if (number == 1) return String.valueOf(number);
        while (number != 1) {
            if (number % startDivider == 0) {
                result.add(startDivider);
                number /= startDivider;
            } else if (startDivider == 2) {
                startDivider++;
            } else {
                startDivider += 2;
            }
        }
        return result.toString();
    }
}
