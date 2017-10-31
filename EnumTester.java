package task3;

public class EnumTester {

    public enum MyNumber {one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen}


    public void enumElse(MyNumber num){

        if (num == MyNumber.one) System.out.println(num.toString() + " is 1");
        else if (num == MyNumber.two) System.out.println(num.toString() + " is 2");
        else if (num == MyNumber.three) System.out.println(num.toString() + " is 3");
        else if (num == MyNumber.four) System.out.println(num.toString() + " is 4");
        else if (num == MyNumber.five) System.out.println(num.toString() + " is 5");
        else if (num == MyNumber.six) System.out.println(num.toString() + " is 6");
        else if (num == MyNumber.seven) System.out.println(num.toString() + " is 7");
        else if (num == MyNumber.eight) System.out.println(num.toString() + " is 8");
        else if (num == MyNumber.nine) System.out.println(num.toString() + " is 9");
        else if (num == MyNumber.ten) System.out.println(num.toString() + " is 10");
        else if (num == MyNumber.eleven) System.out.println(num.toString() + " is 11");
        else if (num == MyNumber.twelve) System.out.println(num.toString() + " is 12");
        else if (num == MyNumber.thirteen) System.out.println(num.toString() + " is 13");
        else if (num == MyNumber.fourteen) System.out.println(num.toString() + " is 14");
        else if (num == MyNumber.fifteen) System.out.println(num.toString() + " is 15");


    }

    public void enumSwitch(MyNumber num){

        switch (num){
            case one : System.out.println(num.toString() + " is 1"); break;
            case two : System.out.println(num.toString() + " is 2");  break;
            case three : System.out.println(num.toString() + " is 3");  break;
            case four : System.out.println(num.toString() + " is 4");  break;
            case five : System.out.println(num.toString() + " is 5");  break;
            case six : System.out.println(num.toString() + " is 6");  break;
            case seven : System.out.println(num.toString() + " is 7");  break;
            case eight: System.out.println(num.toString() + " is 8");  break;
            case nine: System.out.println(num.toString() + " is 9");  break;
            case ten : System.out.println(num.toString() + " is 10");  break;
            case eleven: System.out.println(num.toString() + " is 11");  break;
            case twelve: System.out.println(num.toString() + " is 12");  break;
            case thirteen: System.out.println(num.toString() + " is 13");  break;
            case fourteen: System.out.println(num.toString() + " is 14");  break;
            case fifteen: System.out.println(num.toString() + " is 15");
        }


    }


}
