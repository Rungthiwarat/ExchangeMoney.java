public class Main {
    public static void main(String[] args) {
        ExchangeMoney exchangeMoney = new ExchangeMoney(300.0f, "THB");
        System.out.println(exchangeMoney.getData());
        exchangeMoney.toUSD();
        System.out.println(exchangeMoney.getData());
        exchangeMoney.toTHB();
        System.out.println(exchangeMoney.getData());
    }

}
