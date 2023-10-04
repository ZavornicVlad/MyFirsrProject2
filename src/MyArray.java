public class MyArray {
    public static void main(String[] args) {
        int []myArray={1,2,3,4};
        double []numbers = {1.1,1.2,1.3,1.4};

        String[] numbersArray = {"Unu.Unu","Unu.Doi","Unu.Trei","Unu.Patru"};
        System.out.println(numbers[1]);
        System.out.println(numbers[3]);




        String[]myStringArray = {"Unu", "Doi","Trei"};
        System.out.println(myArray[3]);
        System.out.println(numbers[1]);
        for (int i=0;i<numbersArray.length;i++)
            System.out.println(numbersArray[i]);


        for (int i=0;i<myStringArray.length;i++){
            System.out.println(myStringArray[i]);
        }
    }
}
