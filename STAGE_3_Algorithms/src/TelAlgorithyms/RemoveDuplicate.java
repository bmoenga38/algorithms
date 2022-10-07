package TelAlgorithyms;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "asadasgft";
        String result = "";

        for (int i = 0; i <s.length() ; i++) {
            if (result.contains("" + s.charAt(i)))
                continue;
            result = result + s.charAt(i);
        }
        System.out.println(result);
    }
}
