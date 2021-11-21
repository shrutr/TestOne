

abstract class Bank {

    int noOf200;
    int noOf500;
    int noOf2000;

    abstract void denomination();

    void bankDetails(String bankName){
        System.out.println("Bank is: "+ bankName);
    }

}
