/************************************************************
 * Java Course 2 Module 2
 * 
 * Simulating the creation and displaying the Person Objects
 * 
 * @author: Jellie Mae Ortiz
 *          Date Created: May 17, 2022
 ************************************************************/

public class PersonDriver {
  
    public static void main(String[] args) {
        
        Person person1 = new Person();
        person1.printFullName();
        Person person2 = new Person("Matt", "Thebo");
        person2.printFullName();
        person1.setFirst("Paul");
        person1.setLast("John");
        person1.printFullName();
        System.out.println("Total number of people = " + Person.getNumOfPeople(0));
        
      } // end main 
}

