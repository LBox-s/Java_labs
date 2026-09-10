package JavaProject.Lab1_Java;
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


    public static void main(String[] args) {
        Task1 program = new Task1();

        double input_data = 6.25;
        double output_data = program.fraction(input_data);
        int input2 = 1235;
        int output2 = program.sumLastNums(input2);
        int input3 = 45;
        int input3_2 = 345;
        int a = 5;
        int b = 10;
        int num1 = 8;
        int num2 = 33;
        boolean result3 = program.is2Digits(input3);
        boolean result3_2 = program.is2Digits(input3_2);
        boolean result4 = program.isinRange(a, b, num1);
        boolean result4_2 = program.isinRange(a, b, num2);

        
        System.out.printf("Исходное число: %f\n", input_data );
        System.out.printf("Остаток числа: %f\n", output_data);
        System.out.println();
        System.out.println("Сумма последних двух знаков числа " + input2 + ": " + output2);
        System.out.println();
        System.out.printf("Число %d двузначное? : %b\n", input3, result3);
        System.out.printf("Число %d двузначное? : %b\n", input3_2, result3_2);
        System.out.println();
        System.out.printf("a = %d b = %d num = %d\n", a, b, num1);
        System.out.println("результат: " + result4);
        System.out.printf("a = %d b = %d num = %d\n", a, b, num2);
        System.out.println("результат: " + result4_2);
        System.out.println();
        System.out.println("a = 2, b = 2, c = 2\nрезультат: " + program.isEqual(2, 2, 2));
        System.out.println("a = 10, b = 2, c = 3\nрезультат: " + program.isEqual(10, 2, 3));
        
    }

   
}
