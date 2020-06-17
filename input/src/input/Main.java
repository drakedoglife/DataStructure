package input;

import java.io.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        byte[] buffer = new byte[10];
        for (int i = 0; i < buffer.length; ++i) {
            buffer[i] = (byte) i;
        }
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("a.txt")
            )));
            int i = 123456;
            out.println(i);
            out.close();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("src/input/Main.java")
                    )
            );
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
