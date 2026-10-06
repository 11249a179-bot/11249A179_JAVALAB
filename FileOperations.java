import java.io.*;

public class FileOperations{
    public static void main(String[]args){
        try{
            File file = new File("sample.txt");

            if (file.createNewFile())
                System.out.println("File created successfully.");

            FileWriter writer = new FileWriter(file);
            writer.write("Welcome to java file operations.\n");
            writer.write("This is laboratory experiment.");
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            System.out.println("\nFile Contents:");
            while((line=reader.readLine()) !=null){
                System.out.println(line);
            }

            reader.close();
        }
        catch(IOException e){
            System.out.println("File operation error:"+e);
        }
    }
}