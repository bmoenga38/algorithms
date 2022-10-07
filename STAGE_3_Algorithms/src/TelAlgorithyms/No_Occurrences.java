package TelAlgorithyms;

// Print No  of Occurrences of each character in a given String

public class No_Occurrences {
    public static void main(String[] args) {
       String s = "aabssssdfgghhh";
       String result = "";
        for (int i = 0; i <s.length() ; i++) {
            int c = 0;
            if (result.contains("" + s.charAt(i)))
                continue;
            for (int j = 0; j <s.length() ; j++) {
                if (s.charAt(i) == s.charAt(j))
                    c++;
                result = result + s.charAt(i);
            }
            System.out.println(s.charAt(i) +" = " + c);
        }
    }
}
