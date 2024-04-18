package javagui.package1;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class fileReader {
    public static void main(String[] args) {

        try {
            // Load PDF document
            PDDocument document = PDDocument.load( new File("D:/javaProject/javagui/package1/javagui/package1/Twoques.pdf")) ;
            // Create PDFTextStripper object
            PDFTextStripper pdfStripper = new PDFTextStripper();
            
            // Extract text from PDF
            String text = pdfStripper.getText(document);
            
            // Print extracted text
            System.out.println(text);
            
            // Close the document
            document.close();
            // Define start and end markers
            // String startMarker = "startmarker";
            String endMarker = "?";
            String endMarker2 =".";

            // Find the positions of start and end markers
            // int startIndex = text.indexOf(startMarker);
            int endIndex = text.indexOf(endMarker);
            int endIndex2 = text.indexOf(endMarker2);
            // Find the position of the first integer before the end marker
            int startIndex = findLastIntegerBeforeIndex(text, endIndex);
            // Check if both markers are found
            if (startIndex != -1 && endIndex != -1) {
                // Extract the text between start and end markers
                String extractedText = text.substring(startIndex , endIndex+endMarker.length());
                // String extractedText = text.substring(startIndex + startMarker.length(), endIndex);

                // Print the extracted text
                System.out.println(extractedText);

                // Or you can store it in a variable
                String storedText = extractedText;
            } 
            // else      if (startIndex != -1 && endIndex2 != -1) {
            //     // Extract the text between start and end markers
            //     String extractedText = text.substring(startIndex + startMarker.length(), endIndex);

            //     // Print the extracted text
            //     System.out.println(extractedText);

            //     // Or you can store it in a variable
            //     String storedText = extractedText;
            // } 
            
            
            else {
                System.out.println("Markers not found");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }

  public static int findLastIntegerBeforeIndex(String text, int endIndex) {
        for (int i = endIndex - 1; i >= 0; i--) {
            if (Character.isDigit(text.charAt(i))) {
                return i;
            }
        }
        return -1; // Return -1 if no integer is found before the specified index
    }
    
}
