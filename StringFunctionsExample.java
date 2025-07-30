package oops;

public class StringFunctionsExample {

	
	    public static void main(String[] args) {
	        String str = "hello world";
	        String str2 = "HELLO WORLD";

	        System.out.println("Original String: " + str);

	        // Length of the string
	        System.out.println("Length: " + str.length());

	        // Character at index
	        System.out.println("Character at index 1: " + str.charAt(1));

	        // Substring
	        System.out.println("Substring (0, 5): " + str.substring(0, 5));

	        // Contains
	        System.out.println("Contains 'world': " + str.contains("world"));

	        // StartsWith and EndsWith
	        System.out.println("Starts with 'hello': " + str.startsWith("hello"));
	        System.out.println("Ends with 'world': " + str.endsWith("world"));

	        // IndexOf and LastIndexOf
	        System.out.println("Index of 'o': " + str.indexOf('o'));
	        System.out.println("Last Index of 'o': " + str.lastIndexOf('o'));

	        // Replace
	        System.out.println("Replace 'l' with 'x': " + str.replace('l', 'x'));

	        // ToUpperCase and ToLowerCase
	        System.out.println("To Upper Case: " + str.toUpperCase());
	        System.out.println("To Lower Case: " + str.toLowerCase());

	        // Equals and EqualsIgnoreCase
	        System.out.println("Equals str2: " + str.equals(str2));
	        System.out.println("EqualsIgnoreCase str2: " + str.equalsIgnoreCase(str2));

	        // Trim
	        String strWithSpaces = "   hello world   ";
	        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

	        // Split
	        String[] words = str.split(" ");
	        System.out.println("Split:");
	        for (String word : words) {
	            System.out.println(word);
	        }

	        // Concat
	        System.out.println("Concatenated: " + str.concat("!!!"));

	        // isEmpty
	        System.out.println("Is Empty: " + str.isEmpty());

	        // CompareTo
	        System.out.println("CompareTo 'hello': " + str.compareTo("hello"));

	        // Matches (regex)
	        System.out.println("Matches regex '.*world': " + str.matches(".*world"));

	        // ToCharArray
	        char[] chars = str.toCharArray();
	        System.out.print("Characters: ");
	        for (char c : chars) {
	            System.out.print(c + " ");
	        }

	        // Format
	        String formatted = String.format("Welcome to %s", str);
	        System.out.println("\nFormatted string: " + formatted);

	        // Intern
	        String interned = str.intern();
	        System.out.println("Interned string: " + interned);

	        // Repeat (Java 11+)
	        System.out.println("Repeat 3 times: " + str.repeat(3));
	    }
	}