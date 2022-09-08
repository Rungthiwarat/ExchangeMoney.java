public class ExchangeMoney {
    private Float amount;
    private String currency;

    public ExchangeMoney(Float amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public void toTHB() {
        if (currency == "USD") {
            amount = amount * 30;
            currency = "THB";
        }
    }

    public void toUSD() {
        if (currency == "THB") {
            amount = amount / 30;
            currency = "USD";
        }
    }

    public String getData() {
        return "Amount: " + amount + " Currency: " + currency;
    }

}
