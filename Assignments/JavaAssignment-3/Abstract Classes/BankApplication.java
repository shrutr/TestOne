

public class BankApplication {

    public static void main(String[] args) {

        SBIBank obj1 = new SBIBank();
        obj1.bankDetails("SBI");
        obj1.denomination();

        HDFCBank obj2 = new HDFCBank();
        obj2.bankDetails("HDFC");
        obj2.denomination();

        ICICIBank obj3 = new ICICIBank();
        obj3.bankDetails("ICICI");
        obj3.denomination();
    }
}

