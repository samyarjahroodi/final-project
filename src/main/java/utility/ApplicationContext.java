package utility;

import javax.persistence.EntityManager;

@SuppressWarnings("unused")
public class ApplicationContext {

    private static final EntityManager ENTITY_MANAGER;
//    private static final CardRepositoryImpl CARD_REPOSITORY;


    //   private static final CardServiceImpl CARD_SERVICE;


    static {
        ENTITY_MANAGER = EntityManagerProvider.getEntityManager();
        //CARD_REPOSITORY = new CardRepositoryImpl(ENTITY_MANAGER);
        //CARD_SERVICE = new CardServiceImpl(CARD_REPOSITORY);
    }


//    public static CardServiceImpl getCARD_SERVICE() {
//        return CARD_SERVICE;
//    }


}