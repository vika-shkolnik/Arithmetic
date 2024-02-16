//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Arithmetic numbers = new Arithmetic(6,3);
        numbers.summa();
        numbers.multiplication();
        numbers.maxAndMinNumber();

        Arithmetic numbers2 = new Arithmetic(10,2);
        numbers2.summa();
        numbers2.multiplication();
        numbers2.maxAndMinNumber();
    }
}