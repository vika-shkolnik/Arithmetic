public class Arithmetic {

    private int a;
    private int b;
    public Arithmetic (int a, int b) {
        this.a=a;
        this.b=b;
    }
    public void summa () {
        System.out.println("Сумма: " + (a + b));
    }
    public void multiplication () {
        System.out.println("Произведение: " + a * b);
    }
    public void maxAndMinNumber () {
        String message = a>b ? ("Максимальное число: "+ a + "\n" + "Минимальное число: " + b):
                ("Максимальное число: "+ b + "\n" + "Минимальное число: " + a);
        System.out.println(message+"\n");
    }
}
