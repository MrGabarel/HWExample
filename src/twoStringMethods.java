public class twoStringMethods {

    public static String alternateStrings(String str1, String str2) {
        String output = "";
        int i;
        for (i = 0; i < str1.length() && i < str2.length(); i++) {
            output += str1.substring(i, i + 1);
            output += str2.substring(i, i + 1);
        }
        output += getAdditionalLetters(str1, str2, i);
        return output;
    }

    public static String getAdditionalLetters(String str1, String str2, int i) {
        String output = "";
        if (str1.length() >= i) {
            output += str1.substring(i);
        }
        if (str2.length() >= i) {
            output += str2.substring(i);
        }
        return output;
    }

    public static boolean abcTest(String input) {
        int i = -1;
        do {
            int currentLocation = input.indexOf("a", i + 1);
            if (currentLocation == -1) {
                return false;
            }
            i = currentLocation;
            if(checkIfIsAbc(input, currentLocation)){
                return true;
            }
        } while (i < input.length());
        return false;
    }

    public static boolean checkIfIsAbc(String input, int currentLocation) {
        if (currentLocation == 0 || !(input.substring(currentLocation - 1, currentLocation).equals("."))) {
            if (input.substring(currentLocation + 1, currentLocation + 3).equals("bc")) {
                return true;
            }
        }
        return false;
    }
}
