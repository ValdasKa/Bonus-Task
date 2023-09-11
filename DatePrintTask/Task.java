import java.time.LocalDate;

public class Task{
     public static void printBonusDatesBetween(int fromYear, int toYear) {
        LocalDate startDate = LocalDate.of(fromYear, 1, 1);
        LocalDate endDate = LocalDate.of(toYear, 12, 31);

        while (!startDate.isAfter(endDate)) {
            System.out.println(startDate);
            startDate = startDate.plusDays(1);
        }
    }

    public static void main(String[] args) {
    int fromYear = 2010;
    int toYear = 2015;
    Task.printBonusDatesBetween(fromYear, toYear);
}
}