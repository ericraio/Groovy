// Java code
package com.agiledeveloper;

public class OrderPizza
{
  public static void main(String[] args)
  {
    PizzaShop joesPizza = new PIzzaShop();
    joesPizza.setSize(Size.LARGE);
    joesPizza.setCrust(Crust.THIN);
    joesPizza.setTopping("Olives", "Onions", "Bell Pepper");
    joesPizza.setAddress("101 Main St., ...");
    int time = joesPizza.setCard(CardType.VISA, "1234-1234-1234-1234");
    System.out.printf("Pizza will arrive in %d minutes\n", time);
  }
}
