package mukimmanan;

public class StringAdd {
    public static int add(String text) {
        if (text.equals("")) {
            return 0;
        }

        if (text.length() == 1) {
            return Integer.parseInt(text);
        }

        String delimiter = ",";
        if (text.contains("\n")) {
            delimiter = "[,\n]";
        }
        String[] values = text.split(delimiter);
        int sum = 0;

        for (String str: values) {
            sum += Integer.parseInt(str);
        }
        return sum;
    }
}
