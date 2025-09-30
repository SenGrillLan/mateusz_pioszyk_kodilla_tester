public class Loops {
    public static void main(String[] args) {

        // Pętla 1: wypisywanie liczb 0–10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // Pętla 2: wypisywanie imion z tablicy
        String[] names = {"Zygfryd", "Gwidon", "Florentyna"};
        for (int x = 0; x < names.length; x++) {
            System.out.println(names[x]);
        }

        // Pętla 3: suma liczb od 0 do 100
        int suma = 0;
        for (int z = 0; z <= 100; z++) {
            suma += z;
        }
        System.out.println("Suma = " + suma);
    }
}