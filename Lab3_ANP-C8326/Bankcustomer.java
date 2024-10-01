//create a classname
public class Bankcustomer{
//variable
int accountno;
int amount;
String accounttype;
//passing parameter in constructor
Bankcustomer(int accno, int amt,String acctype)
{
this.accountno=accno;
this.amount=amt;
this.accounttype=acctype;
}
void display()//method to display
{
System.out.println("Accountno: "+accountno + "\nAmount: "+amount + "\nAccounttype: "+accounttype);
}
public static void main(String args[])
{
Bankcustomer obj1=new Bankcustomer(234516,50000,"current account");
Bankcustomer obj2=new Bankcustomer(211354,30000,"current account");
obj1.display();
obj2.display();
}
}

