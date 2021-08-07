package mukimmanan;

public class StringAdd {
    public static int add(String text) throws NegativeNumberException {
        if (text.equals("")) {
            return 0;
        }

        if (text.length() == 1) {
            return Integer.parseInt(text);
        }

        String delimiter = ",";
        if (text.matches("//\\[(.*)]\n(.*)")) {
            int start = text.indexOf("[");
            int end = text.lastIndexOf("]");
            delimiter = text.substring(start + 1, end);
            int new_line_idx = text.indexOf("\n");
            text = text.substring(new_line_idx + 1);
        }
        else if (text.matches("//(.*)\n(.*)")) {
            delimiter = Character.toString(text.charAt(2));
            text = text.substring(4);
        }
        delimiter += "|\n";
        String[] values = text.split(delimiter);
        int sum = 0;
        StringBuilder stringBuilder = new StringBuilder();
        int neg_count = 0;

        for (String str: values) {
            int x = Integer.parseInt(str);
            if (x < 0) {
                neg_count += 1;
                stringBuilder.append(x);
                stringBuilder.append(",");
            }

            if (x > 1000) {
                x = 0;
            }
            sum += x;
        }
        if (neg_count > 0) {
            if (neg_count == 1) {
                throw new NegativeNumberException("Negatives Not Allowed");
            } else {
                throw new NegativeNumberException("Negative Numbers Present = " + stringBuilder);
            }
        }
        return sum;
    }
}
