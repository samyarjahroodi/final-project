import utility.EntityManagerProvider;

import javax.persistence.EntityManager;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        EntityManager entityManager = EntityManagerProvider.getEntityManager();

        File file = new File("C:\\Users\\Samyar\\Desktop\\tree-736885_1280.jpg");



    }
}
