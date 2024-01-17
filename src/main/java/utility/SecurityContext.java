package utility;

import entity.duty.Duty;
import entity.duty.SubDuty;
import entity.user.Expert;
import entity.user.Person;
import lombok.Getter;

import java.time.LocalDate;

@SuppressWarnings("unused")
public class SecurityContext {
    @Getter
    private static Person currentUser;

    public static void fillContext(Person baseUser) {
        currentUser = baseUser;
    }

    @Getter
    private static Expert currentExpert;

    public static void fillContext(Expert expert) {
        currentExpert = expert;
    }

    @Getter
    private static Duty currentDuty;

    public static void fillContext(Duty duty) {
        currentDuty = duty;
    }

    @Getter
    private static SubDuty currentSubDuty;

    public static void fillContext(SubDuty subDuty) {
        currentSubDuty = subDuty;
    }

    public static Integer getCurrentUserId() {
        return currentUser.getId();
    }

    @Getter
    private static LocalDate todayDate;

    public static void fillContext(LocalDate today) {
        todayDate = today;
    }

}
