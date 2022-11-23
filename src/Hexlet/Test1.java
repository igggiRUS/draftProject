package Hexlet;

public class Test1 {
    public static void main(String[] args) {
        var text = "Never forget what you are, for surely the world will not";

        // BEGIN (write your solution here)
        System.out.println("First: " + text.charAt(0));
        System.out.println("Last: " + text.charAt(text.length()-1));


        // BEGIN
                var result = "First: "
                        + text.charAt(0)
                        + "\nLast: "
                        + text.charAt(text.length() - 1);

                System.out.println(result);
                // END
            }
        }

