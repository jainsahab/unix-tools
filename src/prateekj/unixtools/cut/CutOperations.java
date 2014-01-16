package prateekj.unixtools.cut;

import java.util.ArrayList;


class OperationInfo {
    ArrayList<Integer> fieldNos = new ArrayList<Integer>();
    String delimiter = "\t";
    String fileName;
}

public class CutOperations {
    OperationInfo getInfo(String[] temp){
        OperationInfo op = new OperationInfo();
        for (String s : temp) {
            if(s.startsWith("-f"))
                op.fieldNos = getFields( s);
            else if(s.startsWith("-d"))
                op.delimiter = getDelimiter(s);
            else
                op.fileName = s;
        }
            return op;
    }

    private String getDelimiter(String s) {
        OperationInfo op = new OperationInfo();
        op.delimiter = s.substring(2);
        return op.delimiter;
    }

    private ArrayList getFields( String s) {
        OperationInfo op = new OperationInfo();
        String[] fields = s.substring(2).split(",");
        for (String field : fields) {
            op.fieldNos.add(Integer.parseInt(field));
        }
        return op.fieldNos;
    }

    String getFields(String content, OperationInfo op){
        String[] lines = content.split("\n");
        StringBuilder result = new StringBuilder();
        for (String line : lines) {
            try{
                for (int field : op.fieldNos)
                    result.append(line.split(op.delimiter)[field - 1]).append(" ");
            }catch (ArrayIndexOutOfBoundsException ex){
                result.append(" ");
            }
            result.append("\n");
        }
        return result.toString().substring(0,result.length()-1);
    }
}
