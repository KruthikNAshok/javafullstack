public class ZomatoRunner {
public static void main(String[] args) {
double rate = Zomato.takeOrder("Tandoori Momos");
System.out.println("Food Price: ₹" + rate);
}
}
