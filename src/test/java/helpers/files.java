package helpers;

import java.io.*;

/*
    Helper class to process files and file content
 */

public class files {

    /*
         Method to check weather a file exists or not
         Parameters:
              filepath: location of file
    */
    public static boolean doesFileExist(String filePath){
        File f = new File(filePath);
        if(f.exists() && !f.isDirectory())
            return true;
        else
            return false;
    }

    /*
         Print out file content with specific format
         Parameters:
              filepath: location of file
         Format example:
            Word1
                  Meaning 1
                  Meaning 2
            Word2
                  Meaning1
                  Meaning2
    */
    public static void printOutDictionary(String filePath){
        BufferedReader reader;
        try {
            System.out.println("\n --- PRINTING OUT DICTIONARY --- ");
            reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while (line != null) {
                //System.out.println(line);
                System.out.println(line.split(" - ")[0]);
                for(int i=0; i<line.split(" - ")[1].split(",").length; i++)
                    System.out.println("\t"+line.split(" - ")[1].split(",")[i].trim());
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException f){
            System.err.println("Can't printout dictionary. File not found at "+filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
