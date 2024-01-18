import methods.adminMethods.AdminMethod;
import methods.clilentMethods.ClientMethod;
import methods.expertMethods.ExpertMethod;
import utility.EntityManagerProvider;

import javax.persistence.EntityManager;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        EntityManager entityManager = EntityManagerProvider.getEntityManager();

        //create random customer
        //ClientMethod.createClient();

        //change password
        //ClientMethod.changePassword("samyar", "12345Abchfffds", "1234Abcd");


        //create random duty and sub duty
       /* AdminMethod.createDuty("decoration of house");
        AdminMethod.createSubDuty("painting the walls", "painting all walls of your home");*/


        //create random expert
       // ExpertMethod.createExpert();


        //show duty and sub duty
        //      AdminMethod.showDuties();
//        AdminMethod.showSubDuties();

        //delete sub duty from duty
//         AdminMethod.deleteSubDutyFromTheExistDuty();
//         AdminMethod.deleteDuty();

        //update duty and sub duty
        //AdminMethod.updateDetailsForSubDuty();

        //ExpertMethod.checkStar();

        //ExpertMethod.getImage();

        AdminMethod.changeTheStatusOfExpert(14);
    }
}