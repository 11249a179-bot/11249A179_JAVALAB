import java.io.*;

public class IOStreamOperations{
    public static void main(String[]args){
        try{
            String data = "Welcome to Java IO Stream Operations.";

            FileOutputStream out = new FileOutputStream("sample.txt");
            out.write(data.getBytes());
            out.close();

            System.out.println("Data written successfully.");

            FileInputStream in = new FileInputStream("sample.txt");

            int ch;
            System.out.println("\nFile Contents:");

            while((ch=in.read())!=-1){
                System.out.print((char)ch);

            }
            in.close();
        }
        catch(IOException e){
            System.out.println("Error:"+e);
        }
    }
}