package strings_two;

// A document management system stores thousands of files with different extensions. Write a program to accept a
// file name and determine whether it is a PDF, Word, Excel, or Image file based on its extension.

public class Document {
    public static void main(String[] args) {
        String fileName = "report.pdf";

        if (fileName.endsWith(".pdf")) {
            System.out.println("The file is a PDF document.");
        } else if (fileName.endsWith(".doc") || fileName.endsWith(".docx")) {
            System.out.println("The file is a Word document.");
        } else if (fileName.endsWith(".xls") || fileName.endsWith(".xlsx")) {
            System.out.println("The file is an Excel document.");
        } else if (fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png") || fileName.endsWith(".gif")) {
            System.out.println("The file is an Image document.");
        } else {
            System.out.println("Unknown file type.");
        }
    }
    



}
