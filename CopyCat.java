import java.util.*;
import java.io.*;
import java.lang.*;
public class CopyCat
{
    public static void main(String [] args) throws IOException
    {
        Scanner in = new Scanner(new File("copycat.dat"));
        while(in.hasNextLine())
        {
            System.out.println(in.nextLine());
        }
    }
    
}