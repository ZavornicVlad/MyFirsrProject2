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

