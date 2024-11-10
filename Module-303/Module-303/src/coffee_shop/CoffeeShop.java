package coffee_shop;
import java.util.*;

public class CoffeeShop {
    private final Scanner scanner=new Scanner(System.in);
    private final List<Product> products=new ArrayList<>();
    private final List<Product> cart = new ArrayList<>();

    private void initProducts() {
        Product p1=new Product("Small Coffee", 4.57, 0);
        products.add(p1);
        Product p2 = new Product("Large Coffee", 7.99, 0);
        products.add(p2);
        Product p3 = new Product("Sugar Cookie", 5.89, 0);
        products.add(p3);
        Product p5 = new Product("Ginger Cookie", 5.89, 0);
        products.add(p5);
        Product p4 = new Product("Egg Sandwich", 2.49, 0);
        products.add(p4);


        List<Product> loaded = new ProductLoader().loadProducts();
        products.addAll(loaded);

        List<Product> sorted = products.stream().sorted(Comparator.comparing(Product::getPrice)).toList();

        products.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getName));
        sortByPrice(products);
    }

    private void sortByPrice(List<Product> source) {


        for ( int outer = 0 ; outer < source.size() - 1 ; outer++) {
            for ( int inner = outer + 1 ; inner < source.size() ; inner++ ) {
                Product p0 = source.get(outer);
                Product p1 = source.get(inner);

                if ( p0.getPrice() > p1.getPrice()) {
                    //Product temp = source.get(outer);
                    source.set(inner, p0);
                    source.set(outer, p1);
                }
            }
        }

        products.forEach(p -> System.out.println(p));

    }

    private void printProductMenu(List<Product> menuProducts) {
        for (int count = 0; count < menuProducts.size(); count++) {
            Product p = menuProducts.get(count);
            System.out.println((count + 1) + ") " + p.getName() + " \t " + p.getPrice());
        }
        System.out.println("");
    }

    private int printMainMenu() throws InvalidInputException {
        System.out.println("1) See product menu");
        System.out.println("2) Purchase product");
        System.out.println("3) Checkout");
        System.out.println("4) Exit");
        System.out.println("5) Product Search");
        if ( cart.size() > 0 ) {
            System.out.println("6) Remove Item From Cart");
        }

        return readNumberFromUser("\nEnter Selection :");
    }
    private int readNumberFromUser(String question) throws InvalidInputException {
        System.out.print(question);
        try {
            int selection = scanner.nextInt();
            return selection;
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
            throw new InvalidInputException("Invalid input: " + e.getMessage());
        } finally {
            if ( scanner.hasNextLine() ) {
                scanner.nextLine();
            }
        }
    }

    public void addProductToCart() {
        printProductMenu(products);
        try {
            int selection = readNumberFromUser("Enter product number:");
            if (isProductSelectionValid(selection)) {
                int quantity = readNumberFromUser("Enter quantity to buy:");
                if (quantity <= 0) {
                    System.out.println("Must buy at least one item");

                } else {

                    Product p = products.get(selection - 1);
                    p.setQuantity(p.getQuantity() + quantity);
                    if (!doesSelectedProductExistInCart(p)) {
                        cart.add(p);
                    }
                    System.out.println("Added " + p.getName() + " to your cart.\n");
                }
            } else {
                System.out.println("Invalid item selection");
            }
        } catch (InvalidInputException iie) {
            System.out.println("===== HERE =====");
        }
    }

    private boolean isProductSelectionValid(int selectedProduct) {
        if (selectedProduct >= 1 && selectedProduct <= products.size()) {
            return true;
        }

        return false;
    }

    private boolean doesSelectedProductExistInCart(Product purchase) {
        boolean found = false;
        for (Product item : cart) {
            if (item.getName().equals(purchase.getName())) {
                found = true;
                break;
            }
        }
        return found;
    }
    public void checkout() {
        System.out.println("==== Items in your cart ====");
        double subtotal = 0.0;
        for (Product item : cart) {
            System.out.println(item.getName() + " \t " + item.getQuantity() + " \t $" + item.getPrice() + " \t Total $" + (item.getPrice() * item.getQuantity()));
            subtotal = subtotal + item.getPrice();
        }
        System.out.println("");
        System.out.println("Subtotal\t\t $" + subtotal);
        double tax = subtotal * 0.09;
        System.out.println("Tax\t\t\t\t $" + tax);
        double total = (subtotal + tax);
        System.out.println("Total\t\t\t $" + total + "\n");
    }
    public void productSearch() {
        System.out.print("Enter a product name to search for: ");
        String search = scanner.nextLine();
        List<Product> results = products.stream().filter(p -> p.getName().contains(search)).toList();

        if ( results.isEmpty() ) {
            System.out.println("No results were found for input " + search + ".\n");
        } else {
            results.forEach(p -> System.out.println(p));
        }
    }

    public void deleteProduct() {
        System.out.println("=============== DELETE PRODUCT ===============");

        printProductMenu(cart);

        try {
            int selection = readNumberFromUser("Enter product number to remove:");

            // do some error checking here on both of these
            int quantity = readNumberFromUser("Enter quantity to remove:");

            // lets assume the user only enters valid data
            Product remove = cart.get(selection-1);

            if ( remove.getQuantity() < quantity ) {
                // this is the case where there are 5 in the cart and we want to remove 3
                remove.setQuantity(remove.getQuantity() - quantity);
            } else {
                // this remove the item from the cart
                cart.remove(selection - 1);
            }

        } catch ( Exception e) {
            System.out.println("Invalid product selection");
        } catch (InvalidInputException e) {
            throw new RuntimeException(e);
        }
    }

    public void start() throws InvalidInputException {
        initProducts();
        while (true) {
            try {
                int selection = printMainMenu();
                if (selection == 1) {
                    printProductMenu(products);
                } else if (selection == 2) {
                    addProductToCart();
                } else if (selection == 3) {
                    checkout();
                } else if (selection == 4) {
                    System.out.println("Good bye");
                    System.exit(0);
                } else if (selection == 5) {
                    productSearch();
                } else if ( selection == 6 && cart.size() > 0 ) {
                    // if the user enters 6 we still want to check
                    deleteProduct();
                } else {
                    System.out.println("Invalid command entered " + selection + "\n");
                }
            } catch ( Exception e ) {
                System.out.println("Invalid command entered\n");
            }
        }
    }
    public static void main(String[] args) {
        CoffeeShop cs = new CoffeeShop();
        try {
            cs.start();
        } catch (InvalidInputException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ending program");
    }
}