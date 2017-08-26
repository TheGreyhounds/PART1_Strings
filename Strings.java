public class Strings {
    public static void main(String[] args) {
        /* The String has predefined methods for pretty much
           anything you could want to do with Strings in Java.
           Here's an example of something you've already done,
           String concatenation, using the built-in method
        */
        
        String firstHalf = "In your editor I may look incomplete, ";
        String secondHalf = "but on your command prompt I'll look whole!";
        
        String combinedString = firstHalf.concat(secondHalf);
        String combinedDifferently = "did you expect that ".concat("literals were also objects?");
        System.out.println(combinedString);
        System.out.println(combinedDifferently);
        
        
        String shouting = "JAVA IS A GREAT PROGRAMMING LANGUAGE.";
        String whisper = shouting.toLowerCase();
        System.out.println(shouting);
        System.out.println(whisper);
        
        String secondWhisper = "I'm trapped inside a computer, please help.";
        String secondShout = secondWhisper.toUpperCase();
        System.out.println(secondWhisper);
        System.out.println(secondShout);
        
        int num = 365;
        // Notice I'm not calling valueOf() from a String object,
        // I'm calling it from the String class itself.
        // This function will also work for all Integer literals
        // (long, byte, double, etc.)
        String stringOfNumber = String.valueOf(num);
        
        // You'll see the outputs are identical. This is because
        // println() automatically calls valueOf() when we pass it
        // an argument that isn't a String.
        System.out.println(num);
        System.out.println(stringOfNumber);
        
        String whitespace = "   ";
        String text = "Now let's see if you remember how to concat strings.";
        System.out.println(text);
        // Take a hard look at this line. What do our Strings look like as
        // Java goes down the line and executes the concat() function?
        String combinedText = whitespace.concat(text).concat(whitespace);
        
        String originalText = combinedText.trim();
        int lengthOfText = originalText.length();
        
        // A new type of variable spotted!
        boolean variableEquality = text.equals(originalText);
        
        // Also, take notice that I've stretched this statement over two lines
        System.out.println("The original text, " + lengthOfText + " characters long, " +
                           "is the same length as our trimmed text: " + variableEquality);
    }
}