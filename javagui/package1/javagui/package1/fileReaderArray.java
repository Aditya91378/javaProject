
    package javagui.package1;

    import java.io.File;
    import java.io.IOException;
    
    import org.apache.pdfbox.pdmodel.PDDocument;
    import org.apache.pdfbox.text.PDFTextStripper;
    
    public class fileReaderArray {
        
        public int Aend;
        public static void main(String[] args) {
            int q,s=0;
            int stop=0;
            String str,answer;
         
            try {
                // Load PDF document
                PDDocument document = PDDocument.load( new File("D:/javaProject/javagui/package1/javagui/package1/Questions.pdf")) ;
                // Create PDFTextStripper object
                PDFTextStripper pdfStripper = new PDFTextStripper();
                
                // Extract text from PDF
                String text = pdfStripper.getText(document);
                // Print extracted text
                System.out.println(text);
                
                // Close the document
                document.close();

                //Question  Extraction
                char [] content=text.toCharArray();
                while(s<content.length){
                    s= startIndex(text, s);
                    if(s>stop){
                        answers(stop,s,content);
                        // obj.Aend=s-1;
                        // System.out.println(obj.Aend);
                    }
                    stop=  stopIndex(text, s);
                    // System.out.println(s);
                    // System.out.println(stop);

                    if (s != -1 && stop != -1) {
                        char [] ques=new char[stop - s + 1];
                        q=0;
                            while (s <=stop) {
                                ques[q]=content[s];
                                s++;
                                q++;
                            }         
                            // System.out.println(ques);
                            str= new String(ques);
                            System.out.println(str);       
                            // s =s;
                            // System.out.println(s);
                            // System.out.println(obj.Aend); 
                            
                    }
                    else{
                        System.out.println("not working");
                        s++;
                    }   
            }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static int startIndex(String text,int s ){ 
                while( s<text.length()){

                    if (Character.isDigit(text.charAt(s)))  {
                        return s;
                    }
                    s++;
                }
                return -s;  
            }
        public static int stopIndex(String text,int s){
            while( s<text.length()){

                if (text.charAt(s)=='.') {
                    return s;
                }
                s++;
            }
            return -s;     
        }
        public static void answers(int stop,int s,char content[] ){ 
            String answer ;
            int i=0,c=0;
            char [] ans=new char[ s -stop+2];
            while( stop+1<=s-1){

                 ans[i]=content[stop+1];
                 i++;
                 stop++;
                }
                System.out.println(ans); 
                answer = new String(ans);
                // if(ans[i]=='A'){
                //     while(c<=ans.length)
                //     if(ans[i]=='B')
                //     option[c]= ans[i];
                // }
        }

    }
    

  