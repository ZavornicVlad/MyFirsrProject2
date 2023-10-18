public class Operators {
    public static void main(String[] args) {
        int sum1 = 100+50;
        int sum2 = sum1+50;
        int sum3 = sum1+sum2;
        System.out.println("sum1 "+sum1);
        System.out.println("sum3 "+sum2);
        System.out.println("sim3 "+sum3);

        int number1 = 100;
        int number2 = 50;
        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1*number2);
        System.out.println(number1/number2);
        System.out.println(9/2);
        System.out.println(9%2);
        System.out.println(10%7);
        System.out.println(++number1);
        System.out.println(--number2);

        int number3 = number2;
        number2 = 1;
        System.out.println(number3);
        System.out.println(number2);

        //number2 0 number2=2;
        number2+=4; //echivalent number2=Number2+4
        number2-=2;
        number2*=2;
        System.out.println(number2);
        System.out.println(number1<number2);//100<6
        System.out.println(10>5);
        System.out.println('A'<'B');
        System.out.println(!true);
        System.out.println(number1);
        System.out.println(number2);
        boolean condition = number1>number2 || number1>100;
        System.out.println(condition);
        if(condition){
            System.out.println("conditia este adevarata");
        }
        else System.out.println("conditia nu este adevarata");

        public class OperatorsExercitii {
            public static void main(String[] args) {
                int var1 = 10;
                int var2 = 20;
                int var3 = 30;
                int var4 = 40;
                System.out.println(var1+var2+var3+var4);
                System.out.println(var1*var2*var3*var4);
                System.out.println(var4/var2);

                var1++;var1++;var1++;

                System.out.println(var1);

                var2 = var2-2;
                var2--;var2--;
                System.out.println(var2);

                boolean cond1 = var1+var2+var3+var4>100;
                boolean cond2 = var1*var2*var3*var4>1000;
                System.out.println(cond1);
                System.out.println(cond2);

                if(cond1 || cond2){
                    System.out.println("conditia este adevarata");}

                else System.out.println("conditia nu este adevarata");

                if (cond1 && cond2){
                    System.out.println("conditia este adevarata");}

                else System.out.println("conditia nu este adevarata");




            }








        }





    }
}
