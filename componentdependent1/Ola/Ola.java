class Ola {

  public static double takeOrder(String name) {

   double price = 0.0;

if (name == "Mexican Rice Bowl") {
 price = 130.00;
}
 else if (name == "Schezwan Noodles") {
price = 105.00;
 }
else if (name == "Paneer Pav Bhaji") {
price = 95.00;
}
else if (name == "Aloo Cheese Frankie") {
 price = 80.00;
}
else if (name == "Veg Club Sandwich") {
price = 85.00;
 }
else if (name == "Corn Mayo Sandwich") {
 price = 70.00;
 }
else if (name == "Soya Chaap Roll") {
  price = 90.00;
}
else if (name == "Manchow Soup") {
price = 60.00;
}
else if (name == "Mango Milkshake") {
 price = 75.00;
}
else if (name == "Fruit Bowl") {
 price = 65.00;
}
else if (name == "Coconut Water") {
price = 30.00;
}
else if (name == "Thandai") {
price = 55.00;
}
else if (name == "Kesar Milk") {
 price = 50.00;
}
 else if (name == "Cheese Dosa") {
 price = 85.00;
 }
else if (name == "Mysore Masala Dosa") {
 price = 90.00;
}
else if (name == "Cheese Uttapam") {
price = 70.00;
 }
else if (name == "Vada Pav") {
 price = 40.00;
}
else if (name == "Cheese Vada Pav") {
 price = 55.00;
}
else if (name == "Sabzi Pulao") {
price = 85.00;
}
 else if (name == "Tawa Pulao") {
 price = 95.00;
}
else if (name == "Hyderabadi Biryani") {
price = 150.00;
 }
 else if (name == "Ragi Dosa") {
 price = 75.00;
}
else if (name == "Cabbage Poriyal") {
  price = 65.00;
}
else if (name == "Paneer Do Pyaza") {
price = 120.00;
}
 else if (name == "Kheema Pav") {
  price = 110.00;
}
else if (name == "Misal Pav") {
  price = 70.00;
}
else if (name == "Dal Fry") {
   price = 80.00;
}
 else if (name == "Malai Kofta") {
 price = 135.00;
}
else if (name == "Chole Bhature") {
 price = 100.00;
}
else if (name == "Pineapple Raita") {
 price = 60.00;
}
else {
System.out.println(name + " is not found");
}

return price;
    }
}
