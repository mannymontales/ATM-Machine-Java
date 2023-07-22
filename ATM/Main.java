public class Main {
    public static void main(String[] args) {

        Account account = new Account(123, 123);

        //1
        account.otherCheckingBalance.add(20.23);
        account.otherSavingBalance.add(90.24);
        //account.otherSavingBalance.add(20.00);

        account.otherCheckingBalance.add(203.70);
        account.otherSavingBalance.add(342.70);

//        for (Double acc: account.getOtherCheckingBalance()){
//
//            System.out.println(account.getOtherCheckingBalance());
//            //System.out.println(account.getOtherSavingBalance());
//        }

        for (int i = 0; i < 2; i++){
            //System.out.println(account.getValueOfOtherCheckingBalance(i));
            System.out.println(account.getValueOfOtherCheckingBalance(i));
            System.out.println(account.getValueOfOtherSavingBalance(i));
        }
    }
}
