package exception_handling_two;

import java.util.Scanner;

class InvalidPhoneException extends Exception {
    InvalidPhoneException(String msg) {
        super(msg);
    }
}

class InsufficientQuantity extends Exception {
    InsufficientQuantity(String msg) {
        super(msg);
    }
}

class UnderPrice extends Exception {
    UnderPrice(String msg) {
        super(msg);
    }
}

class InvalidAddress extends Exception {
    InvalidAddress(String msg) {
        super(msg);
    }
}

public class OnlineShoppingCheckout {

    public static void validatePhone(String num) throws InvalidPhoneException {
        if (!num.matches("\\d{10}")) {
            throw new InvalidPhoneException("Phone number should contain exactly 10 digits.");
        }
    }

    public static void validateQuantity(int quantity) throws InsufficientQuantity {
        if (quantity <= 0) {
            throw new InsufficientQuantity("Quantity must be greater than 0.");
        }
    }

    public static void validatePrice(double price) throws UnderPrice {
        if (price <= 0) {
            throw new UnderPrice("Price must be greater than 0.");
        }
    }

    public static void validateAddress(String address) throws InvalidAddress {
        if (address == null || address.trim().isEmpty()) {
            throw new InvalidAddress("Address should not be empty.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Product Name: ");
            String product = sc.nextLine();
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();
            validateQuantity(quantity);
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            validatePrice(price);
            sc.nextLine(); 
            System.out.print("Enter Delivery Address: ");
            String address = sc.nextLine();
            validateAddress(address);
            System.out.print("Enter Mobile Number: ");
            String mobile = sc.nextLine();
            validatePhone(mobile);
            double totalBill = quantity * price;
            System.out.println("\nOrder Placed Successfully!");
            System.out.println("Product Name : " + product);
            System.out.println("Quantity     : " + quantity);
            System.out.println("Price        : " + price);
            System.out.println("Total Bill   : " + totalBill);

        } catch (InvalidPhoneException | InvalidAddress | UnderPrice | InsufficientQuantity e) {
            System.out.println("Checkout Failed! " + e.getMessage());
        }

      
    }
}