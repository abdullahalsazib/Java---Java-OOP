public class Person {
     int number;
     String name;
     String address;
     String phone;
     String email;
     
     Person(int number, String name, String address, String phone, String email) {
          this.number = number;
          this.name = name;
          this.address = address;
          this.phone = phone;
          this.email = email;
     }
     
     void display() {
          System.out.println("Number: " + number);
          System.out.println("Name: " + name);
          System.out.println("Address: " + address);
          System.out.println("Phone: " + phone);
          System.out.println("Email: " + email);
     }

     
}
