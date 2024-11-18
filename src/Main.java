public class Main {
    public static void main(String[] args) {

        System.out.println("Task#1");
       String firstName = "Ivan";
       String middleName = "Ivanovich";
       String lastName = "Ivanov";
       String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(" Ф. И. О. сотрудника - " + fullName );


        System.out.println(" Task#2");
        String fullName1 = "Ivanov Ivan Ivanovich";
        System.out.println( fullName1.toUpperCase());

        System.out.println( "Task#3");
        String fullName3 = " Иванов " + " Семён " + " Семёнович ";
        String replacedFullName3 = fullName3.replace("ё" , "е");
        System.out.println(" Данные Ф. И. О. сотрудника - " + replacedFullName3);

    }
}