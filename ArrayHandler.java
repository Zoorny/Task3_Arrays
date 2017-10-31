package task3;

import java.util.Random;

public class ArrayHandler {
    public static int[] randomArray(int size, int bound){
        int arr[] = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++){
            arr[i] = rnd.nextInt(bound);
        }
        return  arr;
    }
    public static int[] randomArray(int size, int bound, int shift){
        int arr[] = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++){
            arr[i] = rnd.nextInt(bound) + shift;
        }
        return  arr;
    }

    public static int[] oddArray(){
        int arr[] = new int[50];
        for (int i = 0, j = 1; i < 50; i++, j+=2){
            arr[i] = j;
        }
        return  arr;
    }

    public static String reverseArr(int[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = iMax; ; i--) {
            b.append(a[i]);
            if (i == 0)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    public static int oddCount(int arr[]){
        int result = 0;
        for (int i =0; i < arr.length; i++)
            if (arr[i] % 2 != 0)
                result++;
        return result;
    }
    public static int evenCount(int arr[]){
        int result = 0;
        for (int i =0; i < arr.length; i++)
            if (arr[i] % 2 == 0)
                result++;
        return result;
    }

    public static void oddZero(int arr[]){
        for (int i = 0; i < arr.length; i++){
            if (i % 2 != 0)
                arr[i] = 0;
        }
    }

    public static void max(int arr[]){
        int max = -50, maxI = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= max) {
                max = arr[i];
                maxI = i;
            }
        }
        System.out.println("Max element :" + max + "\nLast entry index: " + maxI);

    }

    public static void min(int arr[]){
        int min = 50, minI = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] <= min) {
                min = arr[i];
                minI = i;
            }
        }
        System.out.println("Min element :" + min + "\nLast entry index: " + minI);

    }

    public static double avgValue(int arr[]){
        double avg = 0;
        for (int i = 0; i < arr.length; i++){
            avg += arr[i];
        }
        return avg/arr.length;
    }

    public static void freq(int arr[]){
        int freqArr[] = {0,0,0};
        for (int i = 0; i < arr.length; i++){
            switch (arr[i]){
                case -1:
                    freqArr[0]++;
                    break;
                case 0:
                    freqArr[1]++;
                    break;
                case 1:
                    freqArr[2]++;
                    break;
            }
        }

        System.out.println("Most frequent elements: ");
        if (freqArr[0] >= freqArr[1] && freqArr[0] >= freqArr[2])
            System.out.println("element -1, " + freqArr[0] + " times");
        if (freqArr[1] >= freqArr[0] && freqArr[1] >= freqArr[2])
            System.out.println("element 0, " + freqArr[1] + " times");
        if (freqArr[2] >= freqArr[0] && freqArr[2] >= freqArr[1])
            System.out.println("element 1, " + freqArr[2] + " times");

        System.out.println("Equally frequent: ");
        if (freqArr[0] == freqArr[1]) {
            System.out.println("element -1, " + freqArr[0] + " times");
            System.out.println("element 0, " + freqArr[1] + " times");
        }
        if (freqArr[1] == freqArr[2]) {
            System.out.println("element 0, " + freqArr[1] + " times");
            System.out.println("element 1, " + freqArr[2] + " times");
        }
        if (freqArr[2] == freqArr[0]) {
            System.out.println("element -1, " + freqArr[0] + " times");
            System.out.println("element 1, " + freqArr[2] + " times");
        }
        if (freqArr[0] != freqArr[1] && freqArr[1] != freqArr[2] && freqArr[2] != freqArr[0])
            System.out.println("none");
    }

    public static int[][] randomMulArray(int row, int col, int bound, int shift){
        Random rnd = new Random();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) arr[i][j] = rnd.nextInt(bound) + shift;
        }
            return arr;
    }

    public static void print(int arr[][]){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++){
                System.out.format("%4d", arr[row][col]);;
            }
            System.out.println();
        }
    }

    public static int sumMain(int arr[][]){
        int sum = 0;
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++)
                if (row == col)
                    sum += arr[row][col];
        return sum;
    }

    public static long mulMain(int arr[][]){
        long mul = 1;
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++)
                if (row == col)
                    mul *= arr[row][col];
        return mul;
    }

    public static int sumSecond(int arr[][]){
        int sum = 0;
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++)
                if (row == (arr[row].length - col - 1))
                    sum += arr[row][col];
        return sum;
    }

    public static long mulSecond(int arr[][]){
        long mul = 1;
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++)
                if (row == (arr[row].length - col - 1))
                    mul *= arr[row][col];
        return mul;
    }

    public static void mulMax(int arr[][]){
        int maxRow = -1, maxCol = -1;
        int max = -99;
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++)
                if (arr[row][col] > max){
                    maxRow = row;
                    maxCol = col;
                    max = arr[row][col];
                }
        System.out.println("Max element: " + max + " at [" + maxRow + ',' + maxCol + ']' );
    }

    public static void maxRow(int arr[][]){
        long max[] = new long[arr.length];
        long maxRowValue = 1;
        int maxRowIndex = 0;
        for (int i = 0; i < arr.length; i++)
            max[i] = 1;
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++)
                max[row] *= Math.abs(arr[row][col]);
        for (int i = 0; i < arr.length; i++)
            if (max[i] > maxRowValue) {
                maxRowValue = max[i];
                maxRowIndex = i;
            }
        System.out.println("Max row index: " + maxRowIndex + "\nMax row value: " + maxRowValue);
    }

    public static void rowSort(int arr[][]){
        for (int row = 0; row < arr.length; row++){
            Sort.reverseBubbleSort(arr[row]);
        }
    }

    public static void arrayIf(int num, int stats[]){

        if (num == 0) {System.out.print("0 "); stats[0]++;}
        else if (num == 1) {System.out.print("1 "); stats[1]++;}
        else if (num == 2) {System.out.print("2 "); stats[2]++;}
        else if (num == 3) {System.out.print("3 "); stats[3]++;}
        else if (num == 4) {System.out.print("4 "); stats[4]++;}
        else if (num == 5) {System.out.print("5 "); stats[5]++;}
        else if (num == 6) {System.out.print("6 "); stats[6]++;}
        else if (num == 7) {System.out.print("7 "); stats[7]++;}
        else if (num == 8) {System.out.print("8 "); stats[8]++;}
        else if (num == 9) {System.out.print("9 "); stats[9]++;}
        else if (num == 10) {System.out.print("10 "); stats[10]++;}

    }

    public static void arraySwitch(int num, int stats[]){
        switch (num){
            case 0: System.out.print("0 "); stats[0]++; break;
            case 1: System.out.print("1 "); stats[1]++; break;
            case 2: System.out.print("2 "); stats[2]++; break;
            case 3: System.out.print("3 "); stats[3]++; break;
            case 4: System.out.print("4 "); stats[4]++; break;
            case 5: System.out.print("5 "); stats[5]++; break;
            case 6: System.out.print("6 "); stats[6]++; break;
            case 7: System.out.print("7 "); stats[7]++; break;
            case 8: System.out.print("8 "); stats[8]++; break;
            case 9: System.out.print("9 "); stats[9]++; break;
            case 10: System.out.print("10 "); stats[10]++; break;

        }
    }




}
