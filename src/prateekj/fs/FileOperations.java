package prateekj.fs;

import java.io.*;

public class FileOperations {
    public void writeFile(String fileName,String content){
        try {
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            for(int i = 0 ; i < content.split("\n").length ; i++){
                writer.println(content.split("\n")[i]);
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    public String readFile(String fileName){
        String line = null,data="";
        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while ((line = reader.readLine()) != null) {
                data += line+"\n";
            }
        }
        catch(Exception e){
            System.out.println("something went wrong"+e);
        }
        return data.substring(0,data.length()-1);
    }
}
