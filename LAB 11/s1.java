import java.util.Scanner;

class Member {
     String Name;
     double Age;
     int PhoneNumber;
     String Address;
     double Salary;
     
     public void printSalary() {
          System.out.println("Salary is: " + Salary);
     }
}

class Employee extends Member {
     String specialization;

     Employee() { }

     Employee(String Name, double Age, int PhoneNumber, String Address, double Salary, String specialization) {
          this.Name = Name;
          this.Age = Age;
          this.PhoneNumber = PhoneNumber;
          this.Address = Address;
          this.Salary = Salary;
          this.specialization = specialization;
     }
     
     public void display() {
          System.out.println("==> Employee <==");
          System.out.println("Name: " + Name);
          System.out.println("Age: " + Age);
          System.out.println("PhoneNumber: " + PhoneNumber);
          System.out.println("Address: " + Address);
          System.out.println("Salary: " + Salary);
          System.out.println("specialization: " + specialization);
     }
}

class Manager extends Employee {
     String department;
     
     Manager() { }
     Manager(String Name, double Age, int PhoneNumber, String Address, double Salary, String specialization,
               String department) {
          this.Name = Name;
          this.Age = Age;
          this.PhoneNumber = PhoneNumber;
          this.Address = Address;
          this.Salary = Salary;
          this.specialization = specialization;
          this.department = department;
     }
     
     public void display() {
          System.out.println("==> Manager <==");
          System.out.println("Name: " + Name);
          System.out.println("Age: " + Age);
          System.out.println("PhoneNumber: " + PhoneNumber);
          System.out.println("Address: " + Address);
          System.out.println("Salary: " + Salary);
          System.out.println("specialization: " + specialization);
          System.out.println("department: " + department);
     }
}

class s1 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String Name;
          double Age;
          int PhoneNumber;
          String Address;
          double Salary;
          String specialization;
          String department;
          System.out.print("Enter Name: ");
          Name = sc.next();
          System.out.print("Enter Age: ");
          Age = sc.nextInt();
          System.out.print("Enter PhoneNumber: ");
          PhoneNumber = sc.nextInt();
          System.out.print("Enter Address: ");
          sc.nextLine(); // to remove empty line
          Address = sc.nextLine();
          System.out.print("Enter Salary: ");
          Salary = sc.nextDouble();
          System.out.print("Enter specialization: ");
          specialization = sc.next();
          System.out.print("Enter department: ");
          System.out.println();
          // Name, Age, PhoneNumber, Address, Salary, specialization
          Employee e = new Employee(Name, Age, PhoneNumber, Address, Salary, specialization);
          e.display();
          Manager m = new Manager(Name, Age, PhoneNumber, Address, Salary, specialization, department);
          m.display();
          
     }
}