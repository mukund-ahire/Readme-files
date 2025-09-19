public class RemoveConsecutiveDuplicates{

    // Function to remove consecutive duplicates
    public static String removeConsecutiveDuplicates(String s) {

        //Edge case: If the string is Empty
        if (s == null || s.length() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        //Adding the first character always
        result.append(s.charAt(0));

        //Loop through rest of the string
        for (int i = 1; i< s.length(); i++){
            if (s.charAt(i) != s.charAt(i-1)) {
            result.append(s.charAt(i));
        }
    }
    return result.toString();
    }

    public static void main(String[] args) {
        String input = "aaabbccdee";
        String output = removeConsecutiveDuplicates(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
