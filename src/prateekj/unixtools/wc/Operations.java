package prateekj.unixtools.wc;

class Options {
    boolean lines;
    boolean words;
    boolean chars;
    String filename;
}

public class Operations{
    Options getOptions(String[] temp){
        Options options = new Options();
        for (String i : temp){
            if(i.equalsIgnoreCase("-c"))
                options.chars = true;
            if(i.equalsIgnoreCase("-l"))
                options.lines = true;
            if(i.equalsIgnoreCase("-w"))
                options.words = true;
            if(!i.substring(0, 1).startsWith("-"))
                options.filename = i;
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
