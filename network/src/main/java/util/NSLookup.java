package util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NSLookup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(">>");

            String line = scanner.nextLine();

            InetAddress[] ia = null;
            String[] returnStr = null;

            if ("quit".equals(line)) {
                break;
            }

            try {
                ia = InetAddress.getAllByName(line);
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
            returnStr = new String[ia.length];
            for (int i = 0; i < ia.length; i++) {
                returnStr[i] = ia[i].getHostAddress();
            }

            for (String s : returnStr) {
                System.out.println(line + " : " + s);
            }
        }
        scanner.close();
    }
}
