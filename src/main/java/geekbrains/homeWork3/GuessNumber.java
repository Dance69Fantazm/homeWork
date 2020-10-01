package geekbrains.homeWork3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        numberRandoms();
    }

    public static void numberRandoms() {
        int score = 3;
        int maxCount = 3;
        Random random = new Random();
        int numberRand = random.nextInt(10);
        System.out.println("Угадайте число от 0 до 9, у вас " + maxCount + " попытки!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        for (int tryCount = 1; tryCount <= maxCount; tryCount++) {
            int youNumber = scanner.nextInt();

            if (youNumber == numberRand) {
                System.out.println("Вы угадали!");
                break;
            } else if (youNumber > numberRand){
                score--;
                System.out.println("Вы не угадали!" + "\n У вас осталась " + score + " попыток" + "\n  Вы ввели слишком большое число");
            } else {
                score--;
                System.out.println("Вы не угадали!" + "\n У вас осталась " + score + " попыток" + "\n  Вы ввели слишком маленькое число");
            }
            if (tryCount == maxCount)
                System.out.println("Вы проиграли!");
        }

        System.out.println("Повторить игру еще раз? 1 - да хочу. / 0 - нет устал!");
        int yesNo = scanner.nextInt();
        while (true){
            if (yesNo == 1){
                numberRandoms();
                break;
            } else if (yesNo == 0){
                System.out.println("Конец игры!");
                break;
            }
        }
    }
}