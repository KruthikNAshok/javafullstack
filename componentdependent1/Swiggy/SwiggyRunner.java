public class SwiggyRunner {
public static void main(String[] args) {
      
double price = Swiggy.takeOrder("Butter Chicken");
System.out.println("Price: ₹" + price);
    }
}
