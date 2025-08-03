// Let us suppose we have a file named "test.txt" in D-drive. Now we first read from this file
// character-by-character and later we write the contents of this file to another file say
// "testwrite.txt" in E-drive. For these tasks, we use the character stream classes namely
// FileReader and FileWriter. The code is given below:

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIo {
    public static void main(String [] args) throws IOException{
        FileReader fr = new FileReader("/Users/sureshsubba/java program/text.txt");
        char [] a = new char[100];
        fr.read(a);
        System.out.println(a);
        fr.close();
        FileWriter fw = new FileWriter("/Users/sureshsubba/java program/text1.txt");
        fw.write(a);
        fw.close();
    }
}
