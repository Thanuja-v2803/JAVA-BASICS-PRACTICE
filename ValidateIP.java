public class ValidateIP {
    public static void main(String[] args) {

        String ip = "192.168.1.1";   // given IP address
        String parts[] = ip.split("\\.");

        boolean valid = true;

        if (parts.length != 4) {
            valid = false;
        } else {
            for (int i = 0; i < 4; i++) {
                int num = Integer.parseInt(parts[i]);

                if (num < 0 || num > 255) {
                    valid = false;
                    break;
                }
            }
        }

        if (valid)
            System.out.println("Valid IP Address");
        else
            System.out.println("Invalid IP Address");
    }
}
