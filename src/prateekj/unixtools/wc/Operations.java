package prateekj.unixtools.wc;
import java.io.*;

class Options {
    boolean lines;
    boolean words;
    boolean chars;
    String filename;
};

class Operations{
	String readFile(String fileName){
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
    Options getOptions(String[] temp){
        Options options = new Options();
        for (int i = 0 ; i < temp.length ; i++){
            if(temp[i].equalsIgnoreCase("-c"))
                options.chars = true;
            if(temp[i].equalsIgnoreCase("-l"))
                options.lines = true;
            if(temp[i].equalsIgnoreCase("-w"))
                options.words = true;
            if(!temp[i].substring(0,1).startsWith("-"))
                options.filename = temp[i];
        }
        return options;
    }

	int countLine(String data){
		return data.split("\n").length;
	}
	int countWords(String data){
		int count = 0;
		for (int i = 0; i<data.split("\n").length; i++) {
			count += data.split("\n")[i].split(" ").length;
		}
		return count;
	}
	int countCharacters(String data){
		return data.length();
	}
}
