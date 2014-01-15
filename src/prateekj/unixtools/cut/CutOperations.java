package prateekj.unixtools.cut;

import java.util.ArrayList;


class OperationInfo {
    ArrayList<Integer> fieldNos = new ArrayList<Integer>();
    String delimiter = " ";
    String fileName;
}

public class CutOperations {
    OperationInfo getInfo(String[] temp){
        OperationInfo op = new OperationInfo();
            for (String s : temp) {
                if(s.startsWith("-f")){
                    String[] fields = s.substring(2).split(",");
                    for (String field : fields) {
                        op.fieldNos.add(Integer.parseInt(field));
                    }
                }

                else if(s.startsWith("-d")){
                    op.delimiter = s.substring(2);
                    if(op.delimiter.equals(""))
                        op.delimiter = " ";
                }
                else
                    op.fileName = s;
            }

            return op;
    }
    String printSpecifiedFields(String content, OperationInfo op){
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
        return result.toString();
    }
}
