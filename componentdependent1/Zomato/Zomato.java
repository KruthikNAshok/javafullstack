class Zomato {

public static double takeOrder(String name) {

double price = 0.0;

if (name == "Moong Dal Halwa") {
 price = 80.00;
}
else if (name == "Veg Lasagna") {
price = 150.00;
}
 else if (name == "Corn Cheese Balls") {
price = 95.00;
}
else if (name == "Chocolate Cake") {
price = 110.00;
 }
else if (name == "Tiramisu") {
 price = 140.00;
}
 else if (name == "Veg Quesadilla") {
price = 135.00;
 }
else if (name == "Chicken Quesadilla") {
 price = 155.00;
}
else if (name == "Cheesy Nachos") {
price = 85.00;
}
else if (name == "Paneer Kulcha") {
price = 65.00;
}
else if (name == "Masala Papad") {
price = 35.00;
}
else if (name == "Veg Cutlet") {
price = 45.00;
}
 else if (name == "French Fries") {
 price = 60.00;
 }
else if (name == "Peri Peri Fries") {
 price = 70.00;
}
 else if (name == "Crispy Corn") {
 price = 90.00;
}
else if (name == "Momos") {
price = 75.00;
}
else if (name == "Tandoori Momos") {
  price = 95.00;
 }
else if (name == "Veg Hotdog") {
 price = 85.00;
}
else if (name == "Chicken Hotdog") {
   price = 105.00;
 }
else if (name == "Masala Omelette") {
 price = 55.00;
}
else if (name == "Veg Hakka Noodles") {
 price = 100.00;
}
 else if (name == "Chicken Hakka Noodles") {
price = 120.00;
}
 else if (name == "Cheese Sandwich") {
  price = 65.00;
}
else if (name == "Paneer Sandwich") {
 price = 75.00;
 }
else if (name == "Tandoori Paneer Sandwich") {
 price = 85.00;
}
 else if (name == "Egg Sandwich") {
price = 70.00;
}
 else if (name == "Chocolate Shake") {
 price = 90.00;
}
else if (name == "Strawberry Shake") {
   price = 85.00;
 }
 else if (name == "Oreo Shake") {
   price = 95.00;
}
 else {
     System.out.println(name + " is not found");
}

 return price;
    }
}
