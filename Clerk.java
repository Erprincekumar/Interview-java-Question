class Clerk{

 public static void main(String args[]){

   BankAccount b=new BankAccount();
  // b.balance();CE Cannot find sysmbol
  //System.out.println(b.balance);CE balance has private access in BankAccount
   b.setBalance(50000);
   System.out.println(b.getBalance());

   b.setBalance(-50000);
   System.out.println(b.getBalance());
 }
}