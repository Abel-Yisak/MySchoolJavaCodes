public class MasterTaxEmployee {
   private int employeeid;
   private String firstName, lastName;   
   private double salary;  

   public MasterTaxEmployee() {}
   public MasterTaxEmployee(String firstname, String lastname, double salary) {
      this.firstName = firstname;
      this.lastName = lastname;
      this.salary = salary;
   }
   public int getId() {
      return employeeid;
   }
   public void setId( int id ) {
      this.employeeid = id;
   }
   public String getFirstName() {
      return firstName;
   }
   public void setFirstName( String first_name ) {
      this.firstName = first_name;
   }
   public String getLastName() {
      return lastName;
   }
   public void setLastName( String last_name ) {
      this.lastName = last_name;
   }
   public double getSalary() {
      return salary;
   }
   public void setSalary( double salary ) {
      this.salary = salary;
   }
}

