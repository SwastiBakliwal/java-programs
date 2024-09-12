package FiletoHandle;

import java.io.FileWriter;
import java.io.IOException;

class Writefile 
{
  public static void main(String[] args) 
  {
   try
   {
    FileWriter obj = new FileWriter("Abc.txt");
    obj.write("hey I am learning java and the topic is file handling.\nokyy now byee dnd.... ");
    obj.close();
   } 
   catch (IOException e) 
   {
    // TODO Auto-generated catch block
    e.printStackTrace();
   }
     
  }  
}
