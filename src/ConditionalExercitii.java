public class ConditionalExercitii {
    public static void main(String[] args) {
        int temperature = 30;

        if (temperature < 18) {
            System.out.println("prea frig");
        } else if (temperature >= 18 && temperature <= 22) {
            System.out.println("OK");
        }

        if (temperature > 22) {
            System.out.println("prea cald");
        }

        char gender = 'f';
        boolean married = true;
        if (gender == 'm') {
            System.out.println("Domnul");
        } else if (gender == 'f' && married == false) {
            System.out.println("Domnisoara");
        } else if (gender == 'f' && married == true) {
            System.out.println("Doamna");

        }
        //varianta 2

        if (gender == 'm') {
            System.out.println("Domnul");
        } else if (gender == 'f') {
            if (married) {
                System.out.println("Doamna");

            } else System.out.println("Domnisoara");
        }

        char letter ='j';
        if (letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
            System.out.println(letter+" este vocala");
        }
        else System.out.println(letter+" este consoana");





    }
}
