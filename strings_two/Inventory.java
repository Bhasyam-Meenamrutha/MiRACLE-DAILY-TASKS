package strings_two;

// An inventory system generates product codes using the first three letters of the product name, the first two letters of the brand name, 
// and the last three digits of the product ID. Convert all letters to uppercase and display the generated product code.

public class Inventory {
    public static void main(String[] args) {
        String pName = "Laptop";
        String bName = "Asus";
        int pId = 123456;
        String pCode= generateCode(pName, bName, pId); 
        System.out.println("Generated Product Code: " + pCode);
    }
    public static String generateCode(String pName, String bName, int pId) {
        String productCode = pName.substring(0, 3).toUpperCase() +
                             bName.substring(0, 2).toUpperCase() + 
                             String.format("%03d", pId % 1000);
        return productCode;
    }
    
}
