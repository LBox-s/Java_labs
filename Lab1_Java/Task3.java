package JavaProject.Lab1_Java;

import java.util.Random;
import java.util.Scanner;

//1, 4, 5, 7, 10


public class Task3 {
    //1
    public String listNums (int x) {
        int i = 0;
        String result = " ";

        while (i <= x) {
            result += i;
            if (i < x) {
                result += " ";
            }
            i++;
        }
        return result;
    }
    //4
    public int pow(int x, int y) {
        int result = 1;
        
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
    //5
     public int numLen(long x){
        int count = 0;

        if (x == 0) {
            return 1;
        }

        while (x != 0) {
            count += 1;
            x /= 10;
        }
        return count;
     }
     //7 
      public void square (int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
      }
    //10
    public void guessGame() {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    
    int targetNumber = random.nextInt(10);
    int attempts = 0;
    int userGuess = -1;
    
    System.out.println("Введите число от 0 до 9:");
    

    while (userGuess != targetNumber) {
        userGuess = scanner.nextInt();     
        attempts++;

        if (userGuess == targetNumber) {
            System.out.println("Вы угадали!");
        } else {
            System.out.println("Вы не угадали, введите число от 0 до 9:");
        }
    }
    
    System.out.println("Вы отгадали число за " + attempts + " попытки");
    scanner.close(); 
}


    public static void main(String[] args) {
        Task3 program = new Task3();

        int num = 10;
        int x = 2;
        int y =5;
        int longNum = 12345678;

        int resultxy = program.pow(2, 5);
        int resultlong = program.numLen(longNum);

        System.out.println("вывод до x:\n" + program.listNums(num));
        System.out.printf("%d в степени %d = %d\n",x ,y ,resultxy);
        System.out.println("Длинна числа " + longNum + " : "+ resultlong);
        program.square(4);
        program.guessGame();

        
    }
}
