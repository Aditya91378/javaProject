import javagui.package1.fileReaderArray;



public class fileReaderAnswer  extends fileReaderArray{

    public static void main(String[] args) {
        
        



    }
    public static int startIndex(String text,int start ){ 
        while( start<text.length()){

            if (Character.isDigit(text.charAt(start))) {
                return start;
            }
            start++;
        }
        return -start;  
    }
public static int stopIndex(String text,int start){
    while( start<text.length()){

        if (text.charAt(start)=='.') {
            return start;
        }
        start++;
    }
    return -start;     
}
}
