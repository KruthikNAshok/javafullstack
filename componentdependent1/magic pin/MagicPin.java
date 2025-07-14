class MagicPin {

public static double getFoodPriceByName(String name) {

double price = 0.0;

 if (name == "Chilli Garlic Noodles") {
      price = 105.00;
}
else if (name == "Veg Thai Curry") {
      price = 130.00;
}
else if (name == "Red Sauce Pasta") {
     price = 115.00;
}
else if (name == "White Sauce Pasta") {
     price = 120.00;
}
else if (name == "Spinach Corn Sandwich") {
    price = 95.00;
}
else if (name == "Dragon Roll") {
     price = 100.00;
}
 else if (name == "Chocolate Mousse") {
       price = 85.00;
}
else if (name == "Nutella Waffle") {
    price = 110.00;
}
else if (name == "Paneer Roll") {
  price = 90.00;
}
else if (name == "Chicken Wrap") {
     price = 120.00;
 }
else if (name == "Gulab Jamun") {
 price = 50.00;
 }
else if (name == "Rasgulla") {
 price = 45.00;
}
else if (name == "Kaju Katli") {
 price = 65.00;
 }
else if (name == "Boondi Ladoo") {
 price = 40.00;
}
else if (name == "Chana Masala") {
    price = 85.00;
}
 else if (name == "Veg Jaipuri") {
     price = 115.00;
}
 else if (name == "Mix Veg Curry") {
    price = 100.00;
}
else if (name == "Tomato Basil Soup") {
price = 55.00;
}
 else if (name == "Litti Chokha") {
price = 90.00;
}
else if (name == "Vegetable Spring Roll") {
   price = 80.00;
}
 else if (name == "Chicken Spring Roll") {
     price = 100.00;
   }
else if (name == "Stuffed Capsicum") {
     price = 85.00;
}
else if (name == "Masala Daliya") {
    price = 70.00;
}
 else if (name == "Besan Chilla") {
    price = 60.00;
}
else if (name == "Multigrain Paratha") {
   price = 65.00;
}
else if (name == "Spinach Soup") {
   price = 50.00;
}
else if (name == "Sweet Lassi") {
    price = 40.00;
 }
else if (name == "Rava Upma") {
 price = 55.00;
}
else if (name == "Beetroot Pulao") {
price = 95.00;
}
price = 105.00;
 }
else {
      System.out.println(name + " is not found");
    }

        return price;
    }
}
