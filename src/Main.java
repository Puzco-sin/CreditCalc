public class Main {
    public static void main(String[] args) {

        CreditPaymentServise servise = new CreditPaymentServise();
        double pay = servise.calculate(1_000_000, 1);
        double pay1 = servise.calculate(1_000_000, 2);
        double pay2 = servise.calculate(1_000_000, 3);

        System.out.printf("Ежимесячный платёж на год = %.0f", pay);
        System.out.println();
        System.out.printf("Ежимесячный платёж на два года = %.0f", pay1);
        System.out.println();
        System.out.printf("Ежимесячный платёж на три года = %.0f", pay2);
    }
}

