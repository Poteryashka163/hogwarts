import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запросить у пользователя количество элементов в массиве
        System.out.print("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();

        // Создать пустой массив нужной длины
        int[] arr = new int[n];

        // Заполнить массив элементами, введенными пользователем
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите элемент %d: ", i+1);
            arr[i] = scanner.nextInt();
        }

        // Вывести массив на экран для проверки
        System.out.println("Массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
