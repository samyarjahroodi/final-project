package methods.clilentMethods;


import entity.user.Customer;
import entity.utility.Wallet;
import methods.SameMethods;
import service.impl.CustomerServiceImpl;
import service.impl.WalletServiceImpl;
import utility.ApplicationContext;
import utility.SecurityContext;
import validation.Validation;

import java.util.Scanner;


public class ClientMethod extends SameMethods {
    static CustomerServiceImpl customerService = ApplicationContext.getCustomerService();
    static WalletServiceImpl walletService = ApplicationContext.getWalletService();
    static Customer customer = new Customer();
    static Scanner scanner = new Scanner(System.in);


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

    public static void changePassword(String username, String oldPassword, String newPassword) {
        for (Customer c : customerService.findAll()) {
            if (username.equals(c.getUsername())) {
                for (Customer c1 : customerService.findAll()) {
                    if (c1.getPassword().equals(oldPassword)) {
                        Customer customer = customerService.getId(username, oldPassword);
                        if (Validation.isValidPassword(newPassword)) {
                            customer.setPassword(newPassword);
                            customerService.saveOrUpdate(customer);
                            return;
                        } else {
                            System.out.println("your password is not strong");
                        }
                    }
                }
            }
        }
        throw new NullPointerException("null or empty username");
    }

}
