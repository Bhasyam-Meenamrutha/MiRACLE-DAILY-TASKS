package strings_two;

// A billing application stores invoice numbers entered by employees in different formats. Before saving, the system should remove leading and 
// trailing spaces, convert all letters to uppercase, and replace spaces with hyphens (-) to maintain a standard format.

public class Billing {
    public static void main(String[] args) {
        String invoiceNo = "  ITG 6488  ";
        String formattedInvoiceNo = formatInvoiceNumber(invoiceNo);
        System.out.println("Formatted Invoice Number: " + formattedInvoiceNo);
    }

    public static String formatInvoiceNumber(String invoiceNumber) {
        String trimInvoiceNo = invoiceNumber.trim();
        String upInvoiceNo = trimInvoiceNo.toUpperCase();
        String formattedInvoiceNo = upInvoiceNo.replace(" ", "-");
        return formattedInvoiceNo;
    }
}
