package StreamAPI.Date;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class MainDate {
    public static void main(String[] args) {
        System.out.println(new MainDate().tomorrow());
        System.out.println("------------------------");
        System.out.println(new MainDate().yesterday());
    }

    public LocalDate tomorrow() {
//        LocalDate.now().plusDays(1);
        return LocalDate.now().plus(1, DAYS);
    }

    public LocalDate yesterday() {
        return LocalDate.now().minus(1, DAYS);
    }
}
