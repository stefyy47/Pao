package proiect;

public class Customer extends Person implements Service{
   private String email;
   private double money;
   private int chair;

   public void setEmail(String email) {
      this.email = email;
   }

   public void setMoney(double money) {
      this.money = money;
   }

   public String getEmail() {
      return email;
   }

   public double getMoney() {
      return money;
   }

   public int getChair() {
      return chair;
   }

   public Customer(String email, double money, String first_name, String last_name, int age){
      super(first_name, last_name, age);
      this.email = email;
      this.money = money;
      this.chair = -1;
   }
   public int buyTicket(Hall h){
      if(this.age < h.minimumAge)
         return 0;
      if(this.money < h.getPrice())
         return 0;
      if(h.getAviablePlace() != 0){
         this.chair = h.getAviablePlace();
         h.places.replace(this.chair, false, true);
         return this.chair;
      }
      return 0;
   }
   public int buyTicket(Hall h, int place){
      if(this.age < h.minimumAge)
         return 0;
      if(this.money < h.getPrice())
         return 0;
      if(h.getAviablePlace(place) != false){
         this.chair = place;
         this.money -= h.getPrice();
         h.places.replace(place, false, true);
         return this.chair;
      }
      return 0;
   }
   public int sellTicket(Hall h, Customer c){
      if(this.chair == -1)
         return 0;
      else if (c.money >= h.getPrice()){
         c.chair = this.chair;
         this.chair = -1;
         this.money += h.getPrice();
         c.money -= h.getPrice();
         return 1;
      }
      return 0;
   }

   @Override
   public String toString() {
      StringBuilder x = new StringBuilder(super.toString());
      x.append(" Email. " + "Has " + this.money + " money left.");
      if(chair != -1)
         x.append("The customer has a reserved seat.");
      else
         x.append("The customer doesn't have a reserved seat.");
      String temp = new String(x);
      return temp;
   }
}
