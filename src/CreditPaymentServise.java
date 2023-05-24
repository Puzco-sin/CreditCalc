public class CreditPaymentServise {

    public double calculate(int s, int y) {
        double result;
        double percent = 9.99;
        double pd = percent / 100;
        int mouth = y * 12;
        double i = pd / 12;
        double x = Math.pow((1 + i), mouth);
        result = s * ((i * x) / (x - 1));
        return result;
    }

}
