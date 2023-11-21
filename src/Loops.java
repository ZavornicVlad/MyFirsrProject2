public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++)
            System.out.println(i);

        for (int i = 0; i <= 10; i += 2)
            System.out.println(i);

        //for each
        String cars[] = {"BmW", "Mazda", "Opel", "Toyota"};
        for (String car : cars) {
            System.out.println();
        }
        //While
        int l = 0;
        while (l < 5) {
            System.out.println(l);
            l++;
        };
        //DO WHILE
        int j=0;
        do{
            System.out.println(j);
            j++;
        } while (j<5);

        //BREAK
        for (int k=0; k<10; k++){
            if(k==4){break;}
            System.out.println(k);
        }

        int k =0;
        while (k<10){
            k++;
            if(k==4) continue;
            System.out.println(k);
        }

        //exercitiu 4 A5

        String fructe[] = {"mar","capsuni","banane","pere"};
        for (int i=0; i<fructe.length; i++){
            System.out.println("imi place sa mananc "+fructe[i]);
        }





    }

}