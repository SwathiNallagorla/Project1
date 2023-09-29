package TASKSPrograms;
import java.util.Scanner;
import java.security.SecureRandom;
public class PasswordGenerator {
	
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        System.out.print("Enter the length of the password: ");
	        int length = s.nextInt();

	        String password = generatePassword(length);
	        System.out.println("Generated Password: " + password);

	        s.close();
	    }

	    public static String generatePassword(int length) {
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;:,.<>?";
	        SecureRandom random = new SecureRandom();
	        StringBuilder password = new StringBuilder();

	        for (int i = 0; i < length; i++) {
	            int randomIndex = random.nextInt(characters.length());
	            char randomChar = characters.charAt(randomIndex);
	            password.append(randomChar);
	        }

	        return password.toString();
	    }
	}







