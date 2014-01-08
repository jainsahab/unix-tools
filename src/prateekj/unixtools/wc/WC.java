 package prateekj.unixtools.wc;
 public class WC{
     public static void main(String[] args) {
         Operations op;
         op = new Operations();
         Options options = op.getOptions(args);
         String data;
         int totalLine;
         int totalWords;
         int totalChars;
         data = op.readFile(options.filename);
         if(options.lines){
            totalLine = op.countLine(data);
            System.out.print(totalLine + "    ");
         }
         if(options.words){
            totalWords = op.countWords(data);
             System.out.print(totalWords + "    ");
         }
         if(options.chars){
            totalChars = op.countCharacters(data);
             System.out.print(totalChars + "    ");
         }
         System.out.println(options.filename);
     }
 }