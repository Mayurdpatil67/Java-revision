//Popular String Methods ..
package Datatypes;

public class TestString {
    public static void main(String[] args) {
        String text = "  Hello World  ";

        // Case Manipulation
        System.out.println(text.toUpperCase()); // " HELLO WORLD "
        System.out.println(text.toLowerCase()); // " hello world "

        // Whitespace Handling
        System.out.println(text.trim()); // "Hello World"

        // Search & Replace
        System.out.println(text.indexOf("World")); // 8
        System.out.println(text.lastIndexOf("o")); // 8
        System.out.println(text.replace("World", "Java")); // " Hello Java "

        // Substring
        System.out.println(text.substring(2, 7)); // "Hello"

        // Checking Properties
        System.out.println(text.startsWith("  He")); // true
        System.out.println(text.endsWith("ld  ")); // true
        System.out.println("Hello123".matches("[a-zA-Z]+")); // false (contains digits)

        // String Length
        System.out.println(text.length()); // 14

        // Splitting
        String[] words = text.trim().split(" ");
        for (String word : words) {
            System.out.println(word); // Prints "Hello" and "World"
        }

        // Concatenation
        System.out.println(text.trim() + " Java"); // "Hello World Java"
    }
}
