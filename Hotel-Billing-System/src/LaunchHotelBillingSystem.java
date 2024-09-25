import java.util.ArrayList;
import java.util.Scanner;


class Bill{
	int itemId;
	String itemName;
	int itemPrice;
	int quantity;
	int subTotal;

	public Bill(int itemId, String itemName, int itemPrice, int quantity, int subTotal) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		this.subTotal = subTotal;
	}

	public String toString() {
		return itemId+"        "+itemName+"          "+itemPrice+"         "+quantity+"        "+subTotal;
	}


}

public class LaunchHotelBillingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=null;
		int itemId=0;
		int quantity=0;
		String itemName=null;
		int itemPrice=0;
		int subTotal=0;
		String choice="y";
		int grandTotal=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to BCC");
		System.out.println("Dear customer kindly enter your name");
		name=scan.nextLine();

		ArrayList<Bill> al=new ArrayList<Bill>();

		do {
			System.out.println("Dear "+name+",Below is the menu");
			System.out.println("_______________________________________________");
			System.out.println("ItemID            ItemName            ItemPrice");
			System.out.println("_______________________________________________");
			System.out.println("1                   Water                10");
			System.out.println("2                   Pepsi                40");
			System.out.println("3                   Fries                60");
			System.out.println("4                   Pizza                100");
			System.out.println("5                   Burger               150");
			System.out.println("_______________________________________________");
			System.out.println("Enter the ItemId");
			itemId=scan.nextInt();
			System.out.println("Enter the Quantity");
			quantity=scan.nextInt();
			switch(itemId) {
			case 1:itemName="Water";
			itemPrice=10;
			subTotal=itemPrice*quantity;
			break;
			case 2:itemName="Pepsi";
			itemPrice=40;
			subTotal=itemPrice*quantity;
			break;
			case 3:itemName="Fries";
			itemPrice=60;
			subTotal=itemPrice*quantity;
			break;
			case 4:itemName="Pizza";
			itemPrice=100;
			subTotal=itemPrice*quantity;
			break;
			case 5:itemName="Burger";
			itemPrice=150;
			subTotal=itemPrice*quantity;
			break;
			default :System.out.println("Invalid choice.Please select between(1-5)");
			break;

			}
			System.out.println("ItemId:"+itemId+"ItemName:"+itemName+"ItemPrice:"+itemPrice+"Quantity:"+quantity+"SubTotal:"+subTotal);
			grandTotal=grandTotal+subTotal;
			Bill b=new Bill(itemId,itemName,itemPrice,quantity,subTotal);
			al.add(b);
			System.out.println("Do you want to order anything more(y/n)");
			choice=scan.next();
			

		}
		while(choice.equals("y"));//do not use== operator
		System.out.println("itemId   itemName   itemPrice quantity   subTotal");
		System.out.println("___________________________________________________");
		
		for(Bill x:al) {
			System.out.println(x);
		}
		System.out.println("____________________________________________________");
		System.out.println("Grand Total is :"+grandTotal);
	}
}
