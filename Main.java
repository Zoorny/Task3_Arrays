package task3;

import java.util.Arrays;

public class Main {
    public static int stats1[] = {0,0,0,0,0,0,0,0,0,0,0};
    public static int stats2[] = {0,0,0,0,0,0,0,0,0,0,0};
    public static void main(String[] args) {

        System.out.println("Task 1:");
        int n = 1000;
        System.out.println(n + " elements");
        int a1[] = ArrayHandler.randomArray(n, 100);
        System.out.println(Arrays.toString(a1));
        int a1bubble[] = new int[a1.length];
        System.arraycopy( a1, 0, a1bubble, 0, a1.length );
        int a1selection[] = new int[a1.length];
        System.arraycopy( a1, 0, a1selection, 0, a1.length );
        int a1sort[] = new int[a1.length];
        System.arraycopy( a1, 0, a1sort, 0, a1.length );


        long startTime = System.nanoTime();
        Sort.bubbleSort(a1bubble);
        long estimatedTime = System.nanoTime() - startTime;

        System.out.println();
        System.out.println(Arrays.toString(a1bubble));
        System.out.println("Bubble sort time: " + estimatedTime / 1000 + "мкс");

        startTime = System.nanoTime();
        Sort.selectionSort(a1selection);
        estimatedTime = System.nanoTime() - startTime;

        System.out.println();
        System.out.println(Arrays.toString(a1selection));
        System.out.println("Selection sort time: " + estimatedTime / 1000 + "мкс");

        startTime = System.nanoTime();
        Arrays.sort(a1sort);
        estimatedTime = System.nanoTime() - startTime;

        System.out.println();
        System.out.println(Arrays.toString(a1sort));
        System.out.println("Arrays.sort() sort time: " + estimatedTime / 1000 + "мкс");
        System.out.println();

        System.out.println("Task 2:");
        n = 20;
        startTime = System.nanoTime();
        Fact.factCycle(n);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Факториал с помощью цикла для n = " + n + " элементов занимает " + estimatedTime + "нс");


        startTime = System.nanoTime();
        Fact.factRec(n);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Факториал с помощью рекурсии для n = " + n + " элементов занимает " + estimatedTime + "нс");
        System.out.println(n + "!" + " = " + Fact.factCycle(n));
        System.out.println();

        System.out.println("Task 3:");
        Figures.draw(5);
        System.out.println();
        Figures.draw(7, 'd');
        System.out.println();
        Figures.draw(9, 'h');

        System.out.println("\nTask 4:\na");
        int arrA[] = ArrayHandler.oddArray();
        System.out.println(Arrays.toString(arrA));
        System.out.println(ArrayHandler.reverseArr(arrA));

        System.out.println('b');
        int arrB[] = ArrayHandler.randomArray(20,11);
        System.out.println(Arrays.toString(arrB));
        System.out.println("odd: " + ArrayHandler.oddCount(arrB) + " even: " + ArrayHandler.evenCount(arrB));

        System.out.println('c');
        int arrC[] = ArrayHandler.randomArray(10, 100, 1);
        System.out.println(Arrays.toString(arrC));
        ArrayHandler.oddZero(arrC);
        System.out.println(Arrays.toString(arrC));

        System.out.println('d');
        int arrD[] = ArrayHandler.randomArray(15, 101, -50);
        System.out.println(Arrays.toString(arrD));
        ArrayHandler.max(arrD);
        ArrayHandler.min(arrD);

        System.out.println('e');
        int arrE1[] = ArrayHandler.randomArray(10, 11);
        int arrE2[] = ArrayHandler.randomArray(10, 11);
        System.out.println(Arrays.toString(arrE1));
        System.out.println(Arrays.toString(arrE2));
        System.out.println("arrE1 average value = " + ArrayHandler.avgValue(arrE1));
        System.out.println("arrE2 average value = " + ArrayHandler.avgValue(arrE2));
        if (ArrayHandler.avgValue(arrE1) > (ArrayHandler.avgValue(arrE2)))
            System.out.println("arrE1 average value is higher");
        else if (ArrayHandler.avgValue(arrE1) < (ArrayHandler.avgValue(arrE2)))
            System.out.println("arrE2 average value is higher");
        else
            System.out.println("arrE1 and arrE2 average values are equal");

        System.out.println('f');
        int arrF[] = ArrayHandler.randomArray(20, 3, -1);
        System.out.println(Arrays.toString(arrF));
        ArrayHandler.freq(arrF);

        System.out.println("Task 5\na");
        int arrAA[][] = ArrayHandler.randomMulArray(8,8,99,1);
        ArrayHandler.print(arrAA);
        System.out.println("По главной диагонали:");
        System.out.println("Cумма: " + ArrayHandler.sumMain(arrAA) + "\nПроизведение: " +  ArrayHandler.mulMain(arrAA));
        System.out.println("По побочной диагонали:");
        System.out.println("Cумма: " + ArrayHandler.sumSecond(arrAA) + "\nПроизведение: " +  ArrayHandler.mulSecond(arrAA));

        System.out.println('b');
        int arrBB[][] = ArrayHandler.randomMulArray(8,5,199,-99);
        ArrayHandler.print(arrBB);
        ArrayHandler.mulMax(arrBB);

        System.out.println('c');
        int arrCC[][] = ArrayHandler.randomMulArray(8,5,21,-10);
        ArrayHandler.print(arrCC);
        ArrayHandler.maxRow(arrCC);

        System.out.println('d');
        int arrDD[][] = ArrayHandler.randomMulArray(10,7,101,0);
        ArrayHandler.print(arrDD);
        System.out.println();
        ArrayHandler.rowSort(arrDD);
        ArrayHandler.print(arrDD);

        System.out.println("\nTask 6");
        EnumTester e = new EnumTester();
        startTime = System.nanoTime();
        for (EnumTester.MyNumber number: EnumTester.MyNumber.values())
        {
            e.enumElse(number);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("If-else time: " + estimatedTime/1000 + "мкс");

        startTime = System.nanoTime();
        for (EnumTester.MyNumber number: EnumTester.MyNumber.values())
        {
            e.enumSwitch(number);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Switch time: " + estimatedTime/1000 + "мкс");

        System.out.println("Array tests:");
        int arr6[] = ArrayHandler.randomArray(50, 11);
        startTime = System.nanoTime();
        for (int i = 0; i < arr6.length; i++){
            ArrayHandler.arrayIf(arr6[i], stats1);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("\nIf-else array time: " + estimatedTime/1000 + "мкс");
        for (int i =0; i< stats1.length; i++) {
            System.out.println("Element " + i + ": " + stats1[i] + " times" );
        }

        startTime = System.nanoTime();
        for (int i = 0; i < arr6.length; i++){
            ArrayHandler.arrayIf(arr6[i], stats2);
        }
        estimatedTime = System.nanoTime() - startTime;

        System.out.println("\nSwitch array time: " + estimatedTime/1000 + "мкс");
        for (int i =0; i< stats2.length; i++) {
            System.out.println("Element " + i + ": " + stats2[i] + " times" );
        }

    }



}
