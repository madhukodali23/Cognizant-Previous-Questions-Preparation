import java.util.*;
class Main {
    public static void main(String[] args) {
       double salary = 8000;
       double rating = 3;
       double increment = 0;
       if (salary <= 0 || rating < 1 || rating > 5)
       {
           System.out.println("Invalid Input");
           return;
       }
       if (rating >= 1 && rating <= 3)
       {
           increment = 0.10;
       }
       else if (rating > 3 && rating <= 4)
       {
           increment = 0.25;
       }
       else if (rating > 4 && rating <= 5)
       {
           increment = 0.30;
       }
       double incrementedSalary = salary * increment;
       double totalSalary = incrementedSalary + salary;
       System.out.printf("Total Salary:%.2f", totalSalary);
    }
}
