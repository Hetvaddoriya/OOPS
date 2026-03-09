class bankaccount
{
  String accountholdername;
  double balance;
  static double interestrate=5.0;
  void assignvalue(String name,double bal)
{

 accountholdername=name;
 balance=bal;
}
  void display()
{
System.out.println("Account Holder Name:"+accountholdername);
System.out.println("Balence:"+balance);
System.out.println(" Insterest Rate:"+interestrate);
System.out.println("Insterest Earned:"+calculateinterest());
}

 double calculateinterest()
{
 return (balance*interestrate)/100;
}
 static void updateinterestrate(double newrate)
{
 interestrate=newrate;
System.out.println("Interest Rate Update to:"+interestrate+"%");

} 
  public static void main(String []args)
{
  bankaccount b1=new bankaccount();
  bankaccount b2 =new bankaccount();
  b1.assignvalue("nikunj",10000000);
  b2.assignvalue("het",50000000);
  System.out.println("Befor rate change");
  b1.display();
  b2.display();
  bankaccount.updateinterestrate(50.0);
   System.out.println("After rate change");
  b1.display();
  b2.display();
}

}
