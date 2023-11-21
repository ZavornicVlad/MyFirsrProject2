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
        String tari[] = {"Anglia", "Romania", "Albania", "Franta", "Elvetia", "China", "SUA","Australia" };
        for (String tara : tari) {
            System.out.println(tara);
            System.out.println(tara.charAt(0));
            System.out.println(tara.length());
            System.out.println(tara.contains("n"));
        }

        int lungimeTaraLunga = 0 ;
        int lungimeTaraScurta = tari[0].length();
        String taraLunga = "";
        String taraScurta = "";
        for (String tara : tari ){
            if (lungimeTaraLunga < tara.length()){
                lungimeTaraLunga = tara.length();
                taraLunga = tara;
            }
            else if (lungimeTaraLunga == tara.length()){
                taraLunga = taraLunga + " " + tara;
            }
            if (lungimeTaraScurta >tara.length()){
                lungimeTaraScurta = tara.length();
                taraScurta = tara;
            }
            else if (lungimeTaraScurta == tara.length()){
                taraScurta = taraScurta + " " + tara;
            }
        }
        System.out.println("Tara cu cel mai lung nume este " + taraLunga + ", cu lungimea " + lungimeTaraLunga);
        System.out.println("Tara cu cel mai scurt nume este " + taraScurta + ", cu lungimea " + taraScurta.length());

    }
}