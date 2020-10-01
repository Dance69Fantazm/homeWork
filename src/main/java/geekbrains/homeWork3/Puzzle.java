package geekbrains.homeWork3;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Puzzle {
    public  static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        issueName();
    }
    public static void issueName(){
        int score = 99;
        String[] words = new String[]
                {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                        "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                        "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                        "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int nameRandomWords = random.nextInt(words.length);
        System.out.println("Угадайте загаданное слово");

        /*
        char data[] = {'a', 'b', 'c', 'd', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's','t', 'u', 'v', 'w', 'x', 'y', 'z'};
        String str = new String(data);
        */
        
        System.out.println("Напишите ваше слово: ");

        for (int i = 0; i < 10; i++) {
            String myWord = scanner.next();

            if (myWord.equals(nameRandomWords)) {
                System.out.println("Вы угадали слово! Поздравляю! " + "\nПравильное слово: " + nameRandomWords);
                break;
            } else {
                System.out.println("Попробуйте снова!  " + score + nameRandomWords);
                score --;
            }
        }
        scanner.close();

    }
}