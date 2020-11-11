class paytm{  
 
public static void payment(int phno)
{
System.out.println("Payment"+" for mobile no "+phno+" successful! " );
} 
public static void payment(String nameDth, String customerID)
{
System.out.println("DTH Payment for "+nameDth+ " customerID - "+customerID+" paid successfully!");

}

public static void payment(int meterNo,String customerID, double billAmount)
{
System.out.println("Electricity Payment for customerID - "+customerID+ ", meterNo - "+meterNo+ " and billAmount "+billAmount+"Rs"+ " paid successfully!" );

}

public static void main(String[] args){  
paytm.payment(1234567890);
  paytm.payment("Airtel","3334567555");
  paytm.payment(123,"626457",450.00);
}
}  
   