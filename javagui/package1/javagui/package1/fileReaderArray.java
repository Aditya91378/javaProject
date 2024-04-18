
    package javagui.package1;

    import java.io.File;
    import java.io.IOException;
    
    import org.apache.pdfbox.pdmodel.PDDocument;
    import org.apache.pdfbox.text.PDFTextStripper;
    
    public class fileReaderArray {
        public static void main(String[] args) {
            int q=0,s;
            int stop;

            
            
            try {
                // Load PDF document
                PDDocument document = PDDocument.load( new File("D:/javaProject/javagui/package1/javagui/package1/Twoques.pdf")) ;
                // Create PDFTextStripper object
                PDFTextStripper pdfStripper = new PDFTextStripper();
                
                // Extract text from PDF
                String text = pdfStripper.getText(document);
                // Print extracted text
                // System.out.println(text);
                
                // Close the document
                document.close();
                char [] content=text.toCharArray();
                
                s=startIndex(text);
                stop=stopIndex(text,content);
                char [] ques=new char[stop - s + 1];
                
                while (s <=stop) {
                    ques[q]=content[s];
                    s++;
                    q++;
                }
                int start=stop+1;
                // do{

                // }
                // while(start<=text.length());                    
                
                System.out.println(content);
                System.out.println(ques);
                
                
                // for(int i=0;i<=stop;i++){

                //     if (Character.isDigit(text.charAt(i))) {
                //         return i;
                //     }
                // }

            } catch (IOException e) {
                e.printStackTrace();
            }
        
        }
    

        public static int startIndex(String text ){
        
          int  i=0;
            while( i<=text.length()){

                if (Character.isDigit(text.charAt(i))) {
                    return i;
                }
                i++;
            }
            return -i;
        }
        public static int stopIndex(String text,char content[]){
            int i;
            for( i=0;i<=text.length();i++){

                if (text.charAt(i)=='?') {
                    return i;
                }
            }
            return -i;
        }
    }
    

