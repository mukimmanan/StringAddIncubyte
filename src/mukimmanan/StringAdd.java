package mukimmanan;

public class StringAdd {
    public static int add(String text) {
        if (text.equals("")) {
            return 0;
        }

        if (text.length() == 1) {
            return Integer.parseInt(text);
        }

        String[] values = text.split(",");
        return Integer.parseInt(values[0]) + Integer.parseInt(values[1]);
    }
}
