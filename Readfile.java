package FiletoHandle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Readfile 
{
 public static void main(String[] args) 
 {
  File fileob = new  File("Abcd.txt"); 
  try
  {
    Scanner sc = new Scanner(fileob);
    while(sc.hasNextLine())
    {
        String line = sc.nextLine();
        System.out.println(line);
    }
    sc.close();
  }  
  catch(FileNotFoundException e)
  {
    e.printStackTrace();
  } 
 }    
}
