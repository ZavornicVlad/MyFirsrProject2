public class Conditional {
    public static void main(String[] args) {
        if (5 < 0) {
            System.out.println("5 is greater than 0");
        } else {
            System.out.println("5 is not smaller than 0");
            System.out.println("another statment");
        }
        int time = 99;
        if (time<10){
            System.out.println("Good Morning");
        }

        else if (time<18){

            System.out.println("Good day");
        }

        int day =3;
        switch (day){
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            case 7: System.out.println("Sunday");break;
            default: System.out.println("unknown");

        }

        int luna=5;
        switch (luna){
            case 1: System.out.println("ianuarie"); break;
            case 2: System.out.println("februarie"); break;
            case 3: System.out.println("martir"); break;
            case 4: System.out.println("aprilie"); break;
            case 5: System.out.println("mai"); break;
            case 6: System.out.println("iunie"); break;
            case 7: System.out.println("iulie"); break;
            case 8: System.out.println("august"); break;
            case 9: System.out.println("septembrie"); break;
            case 10: System.out.println("octombrie"); break;
            case 11: System.out.println("noiembrie"); break;
            case 12: System.out.println("decembrie"); break;
        }


    }
}