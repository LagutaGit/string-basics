public class Main {
    public static void main(String[] args) {
//        dyadka1();
//        konspekt1();
//        homeWork1();
//        homeWork2();
        homeWork3();
    }

    public static void dyadka1() {
        String phone = "9605378877";
//        Метод замены символов
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
//            страшное предупреждение через throw
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний");
        }

        System.out.println("phone = " + phone);
        String expectedPhone = "79605378877";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
    }

    public static void konspekt1() {
//        String address = "Адрес, который мы хотим указать при доставке";
//        String street = "Манежная";
//        street = "Манежная площадь";
//        System.out.println(street);
//
//        String streetSecond = "Манежная";
//        streetSecond = streetSecond + " площадь";
//        System.out.println("Адресс магазина - " + streetSecond);
//
//        String numberPhone = "9654132154";
//        numberPhone = '7' + numberPhone;
//        System.out.println("Номер телефона - " + numberPhone);
//
//        String phone = "965413";
//        if (phone.length() == 10) {
//            phone = '7' + phone;
//        } else if (phone.length() > 11) {
//            throw new RuntimeException("В телефоне больше 11 цифр");
//        } else if (phone.length() < 7) {
//            throw new RuntimeException("В телефоне меньше 7 цифр");
//        }
//        System.out.println("phone = " + phone);

//        String street2 = "манежная";
//        String streetTrue = street2.replace("м","М");
//        System.out.println(streetTrue);
    }

    public static void homeWork1() {
//        Zadacha 1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО Сотрудника - " + fullName);
    }
    public static void homeWork2() {
        String fullName = "koval liam hemtsword";

        String toUpperCaseName = fullName.toUpperCase();
        System.out.println(toUpperCaseName);
    }
    public static void homeWork3() {
        String fullName = "Королёв Иван Романович";

        String toUpperCaseName = fullName.replace("ё", "е");
        System.out.println(toUpperCaseName);
    }
}