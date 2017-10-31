package task3;

public class Figures {

    public static void draw(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++){
                System.out.print('#');
            }
            System.out.println();
        }
    }

    public static void draw(int size, char ch){
        switch (ch) {
            case 'd':
                for (int row = 1; row <= size; row++) {
                    for (int col = 1; col <= size; col++) {
                        if (row + col > size)
                            System.out.print('#');
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;
            case 'b':
                for (int row = 1; row <= size; row++) {
                    for (int col = 1; col <= size; col++) {
                        if (row + col < size)
                            System.out.print('#');
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;
            case 'h':
                for (int row = 1; row <= size; row++) {
                    for (int col = 1; col <= size; col++) {
                        if ((row == 1) || (row == size) || (row == col) || (row == (size - col + 1)))
                            System.out.print('#');
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;
                default:
                    System.out.println("No such option");
        }
    }

}
