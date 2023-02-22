/************************************************************
 * Java Course 2 Module 2
 * 
 * Simulating the creation and displaying the Person Objects
 * 
 * @author: Jellie Mae Ortiz
 *          Date Created: May 17, 2022
 ************************************************************/

public class Person {

    private String firstName; //instance variables needed to display
    private String lastName;  

    class numOfPeople {

        static int totalNum = 1; //initialize this to keep track the total number of people
    }

    public Person() {

        //iniatilize the Person object with the given
        this.firstName = "John";
        this.lastName = "Doe";

    }

    public Person(String fName, String lName) {

        this.firstName = fName;
        this.lastName = lName;
    }

    public void printFullName() {

        System.out.println(firstName + " " + lastName);
    }

    /**
     * @return String return the firstName
     */
    public String getFirst() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirst(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return String return the lastName
     */
    public String getLast() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLast(String lastName) {
        this.lastName = lastName;
    }

    public static int getNumOfPeople(int i) {

        i = numOfPeople.totalNum;
        i++;
        return i;
    }

}
