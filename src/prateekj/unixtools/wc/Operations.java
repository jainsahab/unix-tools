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
        if(temp.length == 1){
            options.lines = options.chars = options.words =true;
            options.filename = temp[0];
            return options;
        }
        for (String i : temp){
            if(i.equalsIgnoreCase("-c"))
                options.chars = true;
            if(i.equalsIgnoreCase("-l"))
                options.lines = true;
            if(i.equalsIgnoreCase("-w"))
                options.words = true;
            if(!i.startsWith("-"))
                options.filename = i;
        }
        return options;
    }

	int countLine(String data){
		return countOccurrencesOf(data, '\n');
	}

    int countOccurrencesOf(String data, char s) {
        int count = 0;
        for (int i = 0; i < data.length(); i++) {
                if(data.charAt(i)==s)
                    count++;
        }
        return count;
    }

    int countWords(String data){
		int count = 0;
        String[] temp = data.split("\n");
		for (String i : temp)
            count += i.split(" ").length;
		return count;
	}
	int countCharacters(String data){
		return data.length()+countLine(data);
	}
}
