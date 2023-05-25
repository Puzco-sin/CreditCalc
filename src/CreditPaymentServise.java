public class CreditPaymentServise {

    public double calculate(int sum, int year) {
        double result;
        double percent = 9.99;
        double percentDecimal = percent / 100;
        int mouth = year * 12;
        double percentPerMonth = percentDecimal / 12;
        //double x = Math.pow((1 + percentPerMonth), mouth);
        result = sum * ((percentPerMonth * (Math.pow((1 + percentPerMonth), mouth))) / ((Math.pow((1 + percentPerMonth), mouth)) - 1));
        return result;
    }

}
