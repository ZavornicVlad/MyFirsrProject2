public class Algorythms {
    public static void main(String[] args) {
        //ex1

        int numere[] = {1, -25, 34, -2, 67, 5};
        for (int i = 0; i < numere.length; i++) {
            int inainte = numere[i] - 1;
            int dupa = numere[i] + 1;
            System.out.println(inainte + "" + dupa);
        }
        for (int i = 0; i < numere.length; i++) {
            if (numere[i] < 0) {
                System.out.println(numere[i]);
            }
        }
        String tari[] = {"Anglia", "Romania", "Albania", "Franta", "Elvetia", "China", "SUA", "Australia"};
        for (String t : tari) {
            System.out.println(t);
            System.out.println(t.charAt(0));
            System.out.println(t.length());
            System.out.println(t.contains("n"));
        }


    }
}