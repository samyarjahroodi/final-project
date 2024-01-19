import entity.operation.CustomerOrder;
import methods.adminMethods.AdminMethod;
import methods.customerMethods.CustomerMethod;
import methods.expertMethods.ExpertMethod;
import utility.EntityManagerProvider;

import javax.persistence.EntityManager;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        EntityManager entityManager = EntityManagerProvider.getEntityManager();

        //create random customer
        //CustomerMethod.createCustomer();

        //change password
        //CustomerMethod.changePassword("samyar", "1234Abcd", "12345Abchfffds");


        //create random duty and sub duty
        //AdminMethod.createDuty("decoration of house");
        //AdminMethod.createSubDuty("painting the walls", "painting all walls of your home");


        //create random expert
        // ExpertMethod.createExpert();


        //show duty and sub duty
//        AdminMethod.showDuties();
//        AdminMethod.showSubDuties();

        //delete sub duty from duty
//         AdminMethod.deleteSubDutyFromTheExistDuty();
//         AdminMethod.deleteDuty();

        //update duty and sub duty
        // AdminMethod.updateDetailsForSubDuty("maintaining your apartment",2000);

        //ExpertMethod.checkStar();

        // ExpertMethod.getImage(8);

        //AdminMethod.changeTheStatusOfExpert(8);

        CustomerMethod.publishOrder(2);
    }
}