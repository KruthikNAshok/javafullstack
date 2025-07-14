class Swiggy {

public static double takeOrder(String foodName) {

double price = 0.0;

if (foodName == "Burger") {
 price = 78.00;
} else if (foodName == "Pizza") {
 price = 99.99;
} else if (foodName == "Pasta") {
price = 120.50;
} else if (foodName == "Biryani") {
price = 150.00;
} else if (foodName == "Noodles") {
price = 85.75;
} else if (foodName == "Fried Rice") {
price = 90.00;
} else if (foodName == "Manchurian") {
price = 95.00;
} else if (foodName == "Dosa") {
 price = 60.00;
} else if (foodName == "Idli") {
price = 40.00;
} else if (foodName == "Vada") {
price = 45.00;
} else if (foodName == "Samosa") {
price = 25.00;
} else if (foodName == "Kachori") {
price = 30.00;
} else if (foodName == "Chole Bhature") {
  price = 80.00;
} else if (foodName == "Paneer Tikka") {
price = 110.00;
} else if (foodName == "Aloo Paratha") {
price = 50.00;
} else if (foodName == "Chicken Curry") {
 price = 140.00;
} else if (foodName == "Butter Chicken") {
 price = 160.00;
} else if (foodName == "Fish Fry") {
 price = 170.00;
} else if (foodName == "Egg Curry") {
 price = 100.00;
} else if (foodName == "Kebabs") {
  price = 130.00;
} else if (foodName == "Rolls") {
   price = 90.00;
} else if (foodName == "Wraps") {
  price = 95.00;
} else if (foodName == "Pav Bhaji") {
 price = 70.00;
} else if (foodName == "Misal Pav") {
   price = 65.00;
} else if (foodName == "Poha") {
price = 35.00;
} else if (foodName == "Upma") {
price = 40.00;
} else if (foodName == "Maggi") {
price = 30.00;
} else if (foodName == "Sandwich") {
 price = 60.00;
} else if (foodName == "Frankie") {
 price = 85.00;
} else if (foodName == "Spring Roll") {
price = 75.00;
} else if (foodName == "Pani Puri") {
 price = 25.00;
 } else if (foodName == "Dhokla") {
 price = 55.00;
} else if (foodName == "Khandvi") {
  price = 60.00;
} else if (foodName == "Handi") {
  price = 180.00;
} else if (foodName == "Dal Makhani") {
price = 110.00;
} else if (foodName == "Rajma Chawal") {
  price = 100.00;
} else if (foodName == "Khichdi") {
 price = 70.00;
 } else if (foodName == "Thali") {
  price = 150.00;
} else if (foodName == "Chapati") {
   price = 12.00;
} else if (foodName == "Pulao") {
  price = 95.00;
} else if (foodName == "Tandoori Roti") {
   price = 15.00;
} else if (foodName == "Rasgulla") {
   price = 25.00;
 } else if (foodName == "Gulab Jamun") {
 price = 30.00;
} else if (foodName == "Jalebi") {
price = 35.00;
} else if (foodName == "Ice Cream") {
 price = 50.00;
} else if (foodName == "Brownie") {
price = 70.00;
} else if (foodName == "Cake") {
price = 100.00;
 } else if (foodName == "Chocolate Mousse") {
 price = 90.00;
} else if (foodName == "Lassi") {
 price = 40.00;
} else {
 System.out.println(foodName + " is not available.");
}

 return price;
}
}
