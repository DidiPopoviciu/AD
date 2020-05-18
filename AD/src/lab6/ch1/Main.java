package lab6.ch1;

public class Main {
    public static void main(String[] args) {
        ExchangeDesk eDesk = new ExchangeDesk();
        RON ron = new RON(10);

        USD usd = eDesk.convert(ron, USD.class, 0.25);
        System.out.println(usd);

        EUR eur = eDesk.<USD,EUR>convert(usd, EUR.class, 1.1);
        System.out.println(eur);
    }
}
