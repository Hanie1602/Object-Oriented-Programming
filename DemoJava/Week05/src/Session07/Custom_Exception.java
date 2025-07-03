//Khang16022003*
package Session07;

public class Custom_Exception {
    static void validate (int age) throws InvalidAgeException {
        if(age < 18)
            throw new InvalidAgeException ("not valid");
        else
            System.out.println("Welcome to vote");
    }
    
    public static void main(String[] args) {
        try {
            validate(13);
        }
        catch(Exception m) {
            System.out.println("Exception ouccured: " + m);
        }
        System.out.println("rest of the code.....");
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}
