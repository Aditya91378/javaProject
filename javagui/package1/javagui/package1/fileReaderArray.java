
    package javagui.package1;

    import java.io.File;
    import java.io.IOException;
    
    import org.apache.pdfbox.pdmodel.PDDocument;
    import org.apache.pdfbox.text.PDFTextStripper;
    
    public class fileReaderArray {
        public static void main(String[] args) {
            int q,s,i=0;
            int stop,start=0;
         
            try {
                // Load PDF document
                PDDocument document = PDDocument.load( new File("D:/javaProject/javagui/package1/javagui/package1/Questions.pdf")) ;
                // Create PDFTextStripper object
                PDFTextStripper pdfStripper = new PDFTextStripper();
                
                // Extract text from PDF
                String text = pdfStripper.getText(document);
                // Print extracted text
                // System.out.println(text);
                
                // Close the document
                document.close();
                char [] content=text.toCharArray();
                while(start<content.length){
                    s= startIndex(text, start);
                    stop=  stopIndex(text, start);
                    if (s != -1 && stop != -1) {
                        char [] ques=new char[stop - s + 1];
                        q=0;
                        
                            while (s <=stop) {
                                ques[q]=content[s];
                                s++;
                                q++;
                            }         
                            
                        
                            // System.out.println(ques);
                            String str= new String(ques);
                            System.out.println(str);
                            
                            start =stop+1;
                    }
                    else{
                        System.out.println("not working");
                        start++;
                    }
                
            }
            } catch (IOException e) {
                e.printStackTrace();
            }
        
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
    

