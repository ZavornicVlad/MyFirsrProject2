public class javaMethods {
    public static void main(String[] args) {
        printHello();
        printHello();
        weLearn();
        helloName(" Vlad");
        helloName(" Cristina");
        helloName(" 1");
        getSum( 2, 3);
        getSum(10,20);
        getProdus(2,2);
        helloNameAge("Vlad ",38);
        friends("vlad","ema");
        System.out.println(getSumWithReturn(5,6));
        System.out.println(getProductWithReturn(2,2));
        System.out.println(areMere("Ana "));
        System.out.println(areMere("Vlad "));


    }

    private static void printHello(){
        System.out.println("hello World");
    }

    private static void weLearn(){
        System.out.println("We learn methods");
    }


    private static void helloName(String name){
        System.out.println("Hello"+name);
    }
    private static void helloNameAge(String name, int age){
        System.out.println(name+"is " +age+" years old");
    }
    private static void friends(String nume1,String nume2){
        System.out.println(nume1+ " and " + nume2+ " are friends");
    }
    private static void getSum(int x, int y){
        System.out.println(x+y);
    }
    private static void getProdus(int x, int y){
        System.out.println(x*y);
    }

    private static int getSumWithReturn(int x, int y){
        //int sum = x+y;
        return x+y;

    }

    // to do getProductWithReturn...

    private static int getProductWithReturn(int a, int b){
        int product = a*b;
        return product;
    }
    private static String areMere(String nume){
        return (nume+"are mere");
    }


}
