public class LeapYear {
    public static void main(String[] args) {
        int firstNumber = 1237;

        if (firstNumber % 4 == 0) {
            System.out.println("Rok jest przestepny");
        } else if (firstNumber % 4 > 0) {
            System.out.println("Rok nie jest przestepny");
        } else if (firstNumber % 100 > 0) {
            System.out.println("Rok jest przestepny");
        } else if (firstNumber % 400 == 0) {
            System.out.println("Rok jest przestepny");
        }
    }
    
}