import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Введите числа для разложения через пробел >>");
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        String[] arr = Arrays.stream(in.split(" ")).toArray(String[]::new);
        for (int i = 0; i < arr.length; i++) {
            Thread factorizeThread = new Thread(new FactorizeThread(Long.parseLong(arr[i])));
            System.out.println("Запускается разложение на множетели данного числа:" + arr[i]);
            factorizeThread.start();
        }
    }
}
