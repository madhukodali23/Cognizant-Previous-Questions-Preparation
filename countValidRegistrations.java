import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
public class Main {
    public static int countValidRegistrations(int n, String registrations[], String start, String end)
    {
        int count =0;
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate startDate =  LocalDate.parse(start, formatter);
        LocalDate endDate =  LocalDate.parse(end, formatter);
        for(String k : registrations)
        {
            LocalDate reg = LocalDate.parse(k, formatter);
            if ((reg.isEqual(startDate) || reg.isAfter(startDate)) && (reg.isEqual(endDate) || reg.isBefore(endDate)))
            {
                count++;
            }
        
        }
        return count;
    }
   public static void main(String[] args)
   {
        int n = 6;
        String[] registrations = {
            "01-01-2023", "10-01-2023", "05-02-2023",
            "25-12-2022", "03-01-2023", "01-03-2023"
        };
        String start = "01-01-2023";
        String end = "31-01-2023";

        System.out.println(countValidRegistrations(n, registrations, start, end));
   }
}
