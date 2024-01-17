package methods.clilentMethods;


import entity.user.Customer;
import entity.utility.Wallet;
import methods.SameMethods;
import service.impl.CustomerServiceImpl;
import service.impl.WalletServiceImpl;
import utility.ApplicationContext;
import utility.SecurityContext;
import validation.Validation;


public class ClientMethod extends SameMethods {
    static CustomerServiceImpl customerService = ApplicationContext.getCustomerService();
    static WalletServiceImpl walletService = ApplicationContext.getWalletService();
    static Customer customer = new Customer();


    public static void createClient() {
        customer.setFirstname("samyar");
        customer.setLastname("jahroodi");
        customer.setEmail(setEmail("samyar@gmail.com"));
        customer.setPassword(setPassword("1234Abcd"));
        customer.setUsername("samyar");
        Wallet wallet = new Wallet();
        wallet.setCreditOfWallet(200);
        walletService.saveOrUpdate(wallet);
        customer.setWallet(wallet);
        customerService.saveOrUpdate(customer);
        SecurityContext.fillContext(customer);
    }


    public static void changePassword(String string) {
        Customer currentUser = (Customer) SecurityContext.getCurrentUser();
        //check the previous password!!
        String password = currentUser.getPassword();
        if (password.equals("1234Abcd")) {
            boolean validPassword = Validation.isValidPassword(string);
            if (validPassword) {
                currentUser.setPassword(string);
            } else {
                System.out.println("not strong password!!!");
            }
            customerService.saveOrUpdate(currentUser);
        } else {
            System.out.println("your previous password is not correct");
        }
    }
}
