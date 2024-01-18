package methods.expertMethods;

import entity.duty.SubDuty;
import entity.user.Expert;
import entity.utility.Wallet;
import methods.SameMethods;
import methods.adminMethods.AdminMethod;
import service.impl.ExpertServiceImpl;
import service.impl.SubDutyServiceImpl;
import service.impl.WalletServiceImpl;
import utility.ApplicationContext;
import utility.SecurityContext;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Optional;
import java.util.Scanner;

import static entity.user.RegistrationStatus.AWAITING_CONFIRMATION;

public class ExpertMethod extends SameMethods {
    static ExpertServiceImpl expertService = ApplicationContext.getExpertService();
    static WalletServiceImpl walletService = ApplicationContext.getWalletService();
    static SubDutyServiceImpl subDutyService = ApplicationContext.getSubDutyService();
    static Expert expert = new Expert();
    static Scanner scanner = new Scanner(System.in);

    public static void checkStar() {
        Optional<Expert> byId = expertService.findById(5);
        Expert expert = byId.get();
        System.out.println(expertService.averageStarOfExpert(expert));
    }

    public static void getImage(){
        Optional<Expert> byId = expertService.findById(21);
         expert = byId.get();
        // Assuming you have retrieved the expert entity from the database
        if (expert != null && expert.getImage() != null) {
            // Provide a file path where you want to save the image
            String filePath = "F:\\finalProject\\src\\main\\resources\\image.jpg";

            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                // Write the byte array to the file
                fos.write(expert.getImage());
                System.out.println("Photo saved to: " + filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Expert or photo not found.");
        }
    }



    public static void createExpert() throws IOException {
        expert.setFirstname("ali");
        expert.setLastname("jahroodi");
        expert.setEmail(setEmail("ali@gmail.com"));
        expert.setPassword(setPassword("12345Avbd"));
        expert.setUsername("ali");
        Wallet wallet = new Wallet();
        wallet.setCreditOfWallet(200);
        walletService.saveOrUpdate(wallet);
        expert.setWallet(wallet);
        expert.setRegistrationStatus(AWAITING_CONFIRMATION);
        expert.setWhenExpertRegistered(LocalDate.now());
        expert.setImage(setImageForExpert());
        SecurityContext.fillContext(expert);
//        addSubDutyToNewExpert();
        expert.setStar(0.0);
        expertService.saveOrUpdate(expert);
       // expert.setStar(expertService.averageStarOfExpert(expert));
       // expertService.saveOrUpdate(expert);
    }

//    private static void addSubDutyToNewExpert() {
//        System.out.println("which subDuty:");
//        AdminMethod.showSubDuties();
//        int i = scanner.nextInt();
//        Optional<SubDuty> subDutyById = subDutyService.findById(i);
//        SubDuty subDuty = subDutyById.get();
//        Expert currentExpert = SecurityContext.getCurrentExpert();
//        subDuty.setExperts(Collections.singletonList(currentExpert));
//    }
}
