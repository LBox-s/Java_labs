package JavaProject.Lab1_Java;
// 2, 3, 6, 8, 10
public class Task2 {
    //2 
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



    public static void main(String[] args) {

        Task2 program = new Task2();

        int x = 5;
        int y = 2;
        int y2 = 0;
        int num = 15;
        int num2 = 35;
        int a = 3;
        int b = 6;
        int a2 = 2;
        int b2 = 15;
        int c = 5;
        int d = 123;


        double result = program.safeDiv(x, y);
        double result2 = program.safeDiv(x, y2);
        boolean r = program.is35(num);
        boolean r2 = program.is35(num2);
        boolean res = program.sum3(5, 7, 2);
        boolean res2 = program.sum3(8, -1, 4);
        boolean res3 = program.isDivisor(a, b);
        boolean res4 = program.isDivisor(a2, b2);
        

        System.out.printf("%d / %d = %f\n", x, y, result);
        System.out.println(result2);
        System.out.println();
        System.out.println("Проверка деления на 3 ИЛИ на 5: ");
        System.out.println("Число " + num);
        System.out.println(r);
        System.out.println("Число " + num2);
        System.out.println(r2);
        System.out.println();
        System.out.println("x=5, y=7, z=2 " + res);
        System.out.println("x=8, y=-1, z=4 " + res2);
        System.out.println();
        System.out.printf("Одно из чисел делиться нацело на другое для (%d, %d): %b\n", a, b, res3);
        System.out.printf("Одно из чисел делиться нацело на другое для (%d, %d): %b\n", a2, b2, res4);
        System.out.println();
        System.out.println("Сложение разрядов единиц чисел " + c +  " и " + d + " : " + program.lastNumSum(c, d));
    }
}
