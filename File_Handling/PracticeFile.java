package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;

public class PracticeFile {
  public static void main(String[] args) {

    try {
      File file = new File("C:\\Users\\USER\\Desktop\\newFile.txt");

      if (file.exists()) {
        System.out.println("File exist");
      } else {
        file.createNewFile();
        System.out.println("File Created");
      }

      Scanner sc = new Scanner(file);
      // FileReader fr = new FileReader(file);

      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
      // sc.close();

      FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);

      bw.write("Practicing file changing\n");
      bw.append("new Changes made");
      bw.close();

      sc.close();

    } catch (Exception e) {
      System.out.println("Unable to detect or create file");
    }

  }
}
