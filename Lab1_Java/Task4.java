package JavaProject.Lab1_Java;
import java.util.Arrays;

//3, 5, 6, 8, 9

public class Task4{
    //3
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
        Task4 program = new Task4();
        int[] arr3 = {1,-2,-7,4,2,2,5};
        int[] arr5 = {1,2,3,4,5};
        int[] ins5 = {7,8,9};
        int x5 = 3;
        int[] arr6 = {1,2,3,4,5};
        int[] arr8_1 = {1,2,3};
        int[] arr8_2 = {7,8,9};
        

        int result3 = program.maxAbs(arr3);
        int[] result5 = program.add(arr5, ins5, x5);
        int[] result8 = program.concat(arr8_1, arr8_2);

        System.out.println("Большее по модулю из массива" +" : " + result3);
        System.out.println(Arrays.toString(result5));
        System.out.println(Arrays.toString(arr6));
        program.reverse(arr6);
        System.out.println(Arrays.toString(arr6));
        System.out.println(Arrays.toString(result8));
    }
}