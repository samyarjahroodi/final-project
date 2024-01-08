//package utility;
//
//import entity.user.Person;
//import lombok.Getter;
//
//import java.time.LocalDate;
//
//@SuppressWarnings("unused")
//public class SecurityContext {
//    @Getter
//    private static Person currentUser;
//
//    public static void fillContext(Person baseUser) {
//        currentUser = baseUser;
//    }
//
//
//    public static Integer getCurrentUserId() {
//        return currentUser.getId();
//    }
//
//    @Getter
//    private static LocalDate todayDate;
//
//    public static void fillContext(LocalDate today) {
//        todayDate = today;
//    }
//
//    @Getter
//    private static List<PaymentReport> paymentReportsForHousingLoan;
//
//    public static List<PaymentReport> fillPaymentReportForHousingLoan(List<PaymentReport> paymentReportsFromMenu) {
//        paymentReportsForHousingLoan = paymentReportsFromMenu;
//        return paymentReportsFromMenu;
//
//    }
//
//    @Getter
//    private static List<PaymentReport> paymentReportsForEducationalLoan;
//
//    public static List<PaymentReport> fillPaymentReportForEducationalLoan(List<PaymentReport> paymentReportsFromMenu) {
//        paymentReportsForEducationalLoan = paymentReportsFromMenu;
//        return paymentReportsFromMenu;
//
//    }
//
//    @Getter
//    private static List<PaymentReport> paymentReportsForTuitionLoan;
//
//    public static List<PaymentReport> fillPaymentReportForTuitionLoan(List<PaymentReport> paymentReportsFromMenu) {
//        paymentReportsForTuitionLoan = paymentReportsFromMenu;
//        return paymentReportsFromMenu;
//
//    }
//
//}
