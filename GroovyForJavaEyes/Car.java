// Java code
public class Car
{
  private int miles;
  private int year;

  public Car(int theYear) { year = theYear; }
  public int getMiles() { return miles; }
  public void setMiles(int theMiles) { miles = theMiles; }
  public int getYear() { return year; }

  public static void main(String[] args)
  {
    Car car = new Car(2008);

    System.out.println("Year: " + car.getYear());
    System.out.println("Miles: " + car.getYear());
    System.out.println("Setting miles: " + car.getYear());
    car.setMiles(25);
    System.out.println("Miles: " + car.getMiles());
  }
}
