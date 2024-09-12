package FiletoHandle;

import java.io.File;

class Deletefile 
{
 public static void main(String[] args) 
 {
   File fileob = new  File("Abc.txt");
   if(fileob.delete())
   {
    System.out.println("file is deleted: "+fileob.getName());
   } 
   else
   {
    System.out.println("file is not deleted");
   }  
 }    
}
