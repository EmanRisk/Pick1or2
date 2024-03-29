//This program prompts a user to pick either # 1 or 2. If they input anything else, the program will not crash.
//Each choice will prompt the user to enter 3 names
//# 1 will print out the names in alphabetical order
//# 2 will print out the names with inverse characters (ex.uppercase to lowercase)

import java.util.Arrays;
import java.util.Scanner;

public class pick1or2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num = 0;

		// Start off with try/catch program so user doesn't crash the program.

		while (num != 1 && num != 2) {
			try {
				System.out.print("Enter 1 or 2: ");
				in = new Scanner(System.in);
				num = in.nextDouble();
				in.close();
				if (num == 1)
					System.out.println("Aite, you chose number 1. Now enter 3 different names.");
				else if (num == 2)
					System.out.println("Aite, you chose number 2. Now enter 3 different names.");
				else
					System.out.printf("huh? ");
			} catch (Exception ex) {
				System.out.println("Enter the NUMBER 1 or 2 or take your shenanigans elsewhere");
				in.nextLine();
			}
			in.close();
		}

		// If the user chose #1, program will print names inputted in alphabetical order

		if (num == 1) {
			String[] strArr1 = new String[3];
			Scanner scanner = new Scanner(System.in);
			for (int i = 0; i < 3; i++) {
				strArr1[i] = scanner.nextLine();
			}
			Arrays.sort(strArr1);
			for (int i = 0; i < 3; i++) {
				System.out.println(strArr1[i]);
			}
		}

		// If the user chose #2, program will print the inverses character cases of the
		// names inputted

		else if (num == 2) {
			String[] strArr2 = new String[3];
			Scanner scanner = new Scanner(System.in);
			for (int j = 0; j < 3; j++) {
				strArr2[j] = scanner.nextLine();
			}

			// Converting names to inverse using nested for loops

			for (int k = 0; k < 3; k++) {
				// Convert to string

				String invStr = strArr2[k];

				// Convert to Array

				char[] charArr = invStr.toCharArray();

				// Changing to inverse of characters

				for (int l = 0; l < charArr.length; l++) {
					// Uppercase to lowercase

					if (Character.isUpperCase(charArr[l])) {
						charArr[l] = Character.toLowerCase(charArr[l]);
					}
					// lowercase to uppercase

					else if (Character.isLowerCase(charArr[l])) {
						charArr[l] = Character.toUpperCase(charArr[l]);
					}
				}
				// Convert to string again and display result

				String invNam = new String(charArr);
				System.out.println(invNam);
			}
			scanner.close();
		}
	}
}

