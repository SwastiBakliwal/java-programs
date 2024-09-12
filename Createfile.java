package FiletoHandle;
import java.io.File;
import java.io.IOException;
class Createfile 
{
    public static void main(String[] args) 
    {
      File fileob = new  File("Abc.txt"); 
    try 
    {
        fileob.createNewFile();
        System.out.println("file is created");
    } 
    catch (IOException e) 
    {
        System.out.println("unable to create this file");
        // TODO Auto-generated catch block
        e.printStackTrace();
    }   
    }    
}
        

