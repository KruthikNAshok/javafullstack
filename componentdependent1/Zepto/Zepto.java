class Zepto {

public static double takeOrder(String foodName) {

double price = 0.0;

if (foodName == "Tofu Curry") {
 price = 125.00;
} else if (foodName == "Grilled Chicken") {
price = 155.00;
} else if (foodName == "Cheese Balls") {
 price = 85.00;
} else if (foodName == "Falafel") {
 price = 95.00;
} else if (foodName == "Hummus & Pita") {
price = 105.00;
} else if (foodName == "BBQ Wings") {
 price = 120.00;
 } else if (foodName == "Stuffed Paratha") {
price = 60.00;
} else if (foodName == "Egg Roll") {
 price = 70.00;
} else if (foodName == "Chicken Popcorn") {
  price = 80.00;
} else if (foodName == "Paneer Bhurji") {
   price = 90.00;
} else if (foodName == "Veg Thupka") {
  price = 95.00;
} else if (foodName == "Chicken Shawarma") {
price = 130.00;
} else if (foodName == "Veg Salad") {
 price = 65.00;
 } else if (foodName == "Caesar Salad") {
 price = 85.00;
} else if (foodName == "Chicken Nuggets") {
 price = 75.00;
 } else if (foodName == "Garlic Bread") {
price = 55.00;
} else if (foodName == "Tandoori Chicken") {
 price = 160.00;
} else if (foodName == "Veg Korma") {
 price = 115.00;
} else if (foodName == "Mushroom Masala") {
  price = 125.00;
} else if (foodName == "Curd Rice") {
  price = 50.00;
 } else if (foodName == "Schezwan Rice") {
   price = 90.00;
 } else if (foodName == "Gobi 65") {
   price = 70.00;
} else if (foodName == "Tomato Soup") {
  price = 45.00;
 } else if (foodName == "Sweet Corn Soup") {
   price = 50.00;
 } else if (foodName == "Onion Rings") {
 price = 60.00;
} else if (foodName == "Paneer Frankie") {
 price = 85.00;
} else if (foodName == "Pineapple Fried Rice") {
price = 100.00;
} else if (foodName == "Chicken Pulao") {
price = 135.00;
} else if (foodName == "Rajma Masala") {
price = 95.00;
} else if (foodName == "Kadhi Pakora") {
price = 80.00;
} else if (foodName == "Egg Biryani") {
price = 130.00;
 } else if (foodName == "Veg Biryani") {
price = 110.00;
} else if (foodName == "Mutton Curry") {
 price = 180.00;
} else if (foodName == "Bhindi Fry") {
   price = 70.00;
 } else if (foodName == "Baingan Bharta") {
   price = 90.00;
} else if (foodName == "Paneer Butter Masala") {
  price = 140.00;
  } else if (foodName == "Butter Naan") {
    price = 20.00;
 } else if (foodName == "Plain Rice") {
    price = 35.00;
} else if (foodName == "Kathi Roll") {
   price = 95.00;
} else if (foodName == "Paneer Wrap") {
    price = 100.00;
 } else if (foodName == "Garlic Naan") {
price = 25.00;
} else if (foodName == "Sev Puri") {
    price = 30.00;
} else if (foodName == "Methi Paratha") {
 price = 50.00;
} else if (foodName == "Tamarind Rice") {
  price = 60.00;
} else if (foodName == "Sabudana Khichdi") {
} else if (foodName == "Lemon Rice") {
 } else if (foodName == "Rava Dosa") {
   price = 65.00;
} else if (foodName == "Chilli Chicken") {
   price = 135.00;
  } else if (foodName == "Paneer Pakoda") {
price = 85.00;
} else {
System.out.println(foodName + " is not available.");
 }

 return price;
    }
}
