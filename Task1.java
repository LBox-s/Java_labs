package JavaProject.Lab1_Java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Вариант 9 задание1(1, 2, 5, 7, 9)
public class Task1 {
    // 1
     public double fraction(double x) {
        int IntegerPart = (int) x; // int полоностью стирает дробную часть без округления
        double result = x - IntegerPart;
        return result;

    }

    // 2
    public int sumLastNums(int x) {
        int last_digit = x % 10;
        int second_last_digit = (x / 10) % 10;
        return last_digit + second_last_digit;

    }
    // 5
    public boolean is2Digits(int x) {
        return (x >= 10 && x <= 99) || (x >= -99 && x <= -10);
    }

    //7
    public boolean isinRange(int a, int b, int num) {
        int minDigit = Math.min(a, b);
        int maxDigit = Math.max(a, b);

        return num  >= minDigit &&  num <= maxDigit;

    }
    //9
     public boolean isEqual(int a, int b, int c) {
        return (a == b) && (b == c);
     }
//Task2
     public double safeDiv (int x, int y) {
        if (y != 0) {
            return (double) x / y;
        } else {
            return 0.0;
        } 
    }
    //3
    public boolean is35 (int x){
        if (x % 5 == 0 && x % 3 == 0) {
            return false;
        } else if (x % 5 == 0 || x % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
    //6
    public boolean sum3(int x, int y, int z) {
    return (x + y == z) || (x + z == y) || (y + z == x);
    }
    //8
    public boolean isDivisor (int a, int b) {
        if (a == 0 || b == 0) {
            return false; 
        }
        return (b % a == 0) || (a % b == 0);
    }
    //10
    public int lastNumSum(int a, int b) {
        return Math.abs(a % 10) + Math.abs(b % 10);
    }
//Task3
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
    
    System.out.println("Вы отгадали число, кол-во попыток: " + attempts);
    scanner.close(); 
    }
//Task4
    public int maxAbs(int[] arr) {
        int maxElement = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(maxElement)) {
                maxElement = arr[i];
            }
        }
        
        return maxElement;
        }
    //5
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];

        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }

        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }

        for (int i = pos; i < arr.length; i++) {
            result[i + ins.length] = arr[i];
        }
        
        return result;
    }
    //6
    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            
            // Индекс противоположного элемента с конца массива
            int swapIndex = arr.length - 1 - i;
            
            // Меняем элементы местами
            arr[i] = arr[swapIndex];
            arr[swapIndex] = temp;
        }
    }
    //8
    public int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        // эл. первого
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        // эл. воторого
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        
        return result;
    }


    public static void main(String[] args) {
        Task1 program = new Task1();

        double input_data = 6.25;
        double output_data = program.fraction(input_data);
        int input2 = 1235;
        int output2 = program.sumLastNums(input2);
        int input3 = 45;
        int input3_2 = 345;
        int at1 = 5;
        int bt1 = 10;
        int num1 = 8;
        int num2 = 33;
        boolean result3 = program.is2Digits(input3);
        boolean result3_2 = program.is2Digits(input3_2);
        boolean result4 = program.isinRange(at1, bt1, num1);
        boolean result4_2 = program.isinRange(at1, bt1, num2);

        
        System.out.printf("Исходное число: %f\n", input_data );
        System.out.printf("Остаток числа: %f\n", output_data);
        System.out.println();
        System.out.println("Сумма последних двух знаков числа " + input2 + ": " + output2);
        System.out.println();
        System.out.printf("Число %d двузначное? : %b\n", input3, result3);
        System.out.printf("Число %d двузначное? : %b\n", input3_2, result3_2);
        System.out.println();
        System.out.printf("a = %d b = %d num = %d\n", at1, bt1, num1);
        System.out.println("результат: " + result4);
        System.out.printf("a = %d b = %d num = %d\n", at1, bt1, num2);
        System.out.println("результат: " + result4_2);
        System.out.println();
        System.out.println("a = 2, b = 2, c = 2\nрезультат: " + program.isEqual(2, 2, 2));
        System.out.println("a = 10, b = 2, c = 3\nрезультат: " + program.isEqual(10, 2, 3));

        //Task2
        System.out.println("TASK2: \n");
        int x = 5;
        int y = 2;
        int y2 = 0;
        int num_2 = 15;
        int num2_2 = 35;
        int a = 3;
        int b = 6;
        int a2 = 2;
        int b2 = 15;
        int c = 5;
        int d = 123;


        double result = program.safeDiv(x, y);
        double result2 = program.safeDiv(x, y2);
        boolean r = program.is35(num_2);
        boolean r2 = program.is35(num2_2);
        boolean res = program.sum3(5, 7, 2);
        boolean res2 = program.sum3(8, -1, 4);
        boolean res3 = program.isDivisor(a, b);
        boolean res4 = program.isDivisor(a2, b2);
        

        System.out.printf("%d / %d = %f\n", x, y, result);
        System.out.println(result2);
        System.out.println();
        System.out.println("Проверка деления на 3 ИЛИ на 5: ");
        System.out.println("Число " + num_2);
        System.out.println(r);
        System.out.println("Число " + num2_2);
        System.out.println(r2);
        System.out.println();
        System.out.println("x=5, y=7, z=2 " + res);
        System.out.println("x=8, y=-1, z=4 " + res2);
        System.out.println();
        System.out.printf("Одно из чисел делиться нацело на другое для (%d, %d): %b\n", a, b, res3);
        System.out.printf("Одно из чисел делиться нацело на другое для (%d, %d): %b\n", a2, b2, res4);
        System.out.println();
        System.out.println("Сложение разрядов единиц чисел " + c +  " и " + d + " : " + program.lastNumSum(c, d));

        //Task3
        System.out.println("TASK3: \n");
        int num = 10;
        int x2 = 2;
        int y2_3 =5;
        int longNum = 12345678;

        int resultxy = program.pow(2, 5);
        int resultlong = program.numLen(longNum);

        System.out.println("вывод до x:\n" + program.listNums(num));
        System.out.printf("%d в степени %d = %d\n",x2 ,y2_3 ,resultxy);
        System.out.println("Длинна числа " + longNum + " : "+ resultlong);
        program.square(4);
        program.guessGame();

        //Task4
        System.out.println("TASK4: \n");
        int[] arr3 = {1,-2,-7,4,2,2,5};
        int[] arr5 = {1,2,3,4,5};
        int[] ins5 = {7,8,9};
        int x5 = 3;
        int[] arr6 = {1,2,3,4,5};
        int[] arr8_1 = {1,2,3};
        int[] arr8_2 = {7,8,9};
        

        int result3_4 = program.maxAbs(arr3);
        int[] result5 = program.add(arr5, ins5, x5);
        int[] result8 = program.concat(arr8_1, arr8_2);

        System.out.println("Большее по модулю из массива" +" : " + result3_4);
        System.out.println(Arrays.toString(result5));
        System.out.println(Arrays.toString(arr6));
        program.reverse(arr6);
        System.out.println(Arrays.toString(arr6));
        System.out.println(Arrays.toString(result8));

    }

   
}
