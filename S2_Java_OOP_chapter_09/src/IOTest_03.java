import java.io.*;

public class IOTest_03 {
    public static void main(String[] args) throws IOException {
        String readPath = "C:\\Users\\Public\\Documents\\Code\\JavaCode\\S2_Java_OOP_chapter_09\\Test.txt";
        String writePath = "C:\\Users\\Public\\Documents\\Code\\JavaCode\\S2_Java_OOP_chapter_09\\TestCopy.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(readPath)); PrintWriter writer = new PrintWriter(writePath)) {

            String lin;
            while ((lin = reader.readLine()) != null) {
                writer.println(lin);
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}