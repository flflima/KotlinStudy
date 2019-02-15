package academy.learnprogramming.java;

public class Dummy {

    public String checkVacationMessage(boolean isVacation) {
        return isVacation ? "I'm on vacations" : "I'm working";
    }


    public void printNumbers(final int[] numbers) {
        for (int number: numbers) {
            System.out.println(number);
        }
    }
}
