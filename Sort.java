package task3;



public class Sort {

    public static void bubbleSort(int arr[]){
        int temp;
        for (int i = arr.length - 1; i > 0; i--)
            for (int j = 0; j < i; j++)
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

    }

    public static void selectionSort(int arr[]){
        int temp, min;
        for (int i = 0; i < arr.length - 1; i++){
            min = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[min])
                    min = j;
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void reverseBubbleSort(int arr[]){
        int temp;
        for (int i = arr.length - 1; i > 0; i--)
            for (int j = 0; j < i; j++)
                if (arr[j + 1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }




}
