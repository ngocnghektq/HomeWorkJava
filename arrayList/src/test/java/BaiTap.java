import java.util.*;
import java.util.stream.Collectors;

import org.junit.Test;

public class BaiTap {
    String str = " - ";

    ArrayList<Integer> intVietNam = new ArrayList<>();
    ArrayList<Integer> intChina = new ArrayList<>();
    ArrayList<Integer> intJapan = new ArrayList<>();
    ArrayList<Integer> intKorea = new ArrayList<>();
    ArrayList<Integer> intUSA = new ArrayList<>();
    ArrayList<Integer> intFrance = new ArrayList<>();
    ArrayList<Integer> intMalaysia = new ArrayList<>();
    ArrayList<Person> people = new ArrayList<>(Array.personArrayList());

    @Test
    public void bai1_1() {
        System.out.println("1.1 Đếm số người theo từng quốc tịch in ra màn hình");


        Map<String, Integer> map = Array.personArrayList().stream().collect(
                Collectors.groupingBy(
                        Person::getNationality,
                        Collectors.collectingAndThen(
                                Collectors.mapping(Person::getAge, Collectors.toSet()),
                                Set::size)
                )
        );

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("- " + entry.getKey() + " : " + entry.getValue());
        }
    }

    @Test
    public void bai1_3() {
        System.out.println("1.3 Tính trung bình tuổi của người theo từng quốc gia");
        for (Person person : people) {
            switch (person.getNationality()) {
                case "Vietnam":
                    intVietNam.add(person.getAge());
                    break;
                case "USA":
                    intUSA.add(person.getAge());
                    break;
                case "China":
                    intChina.add(person.getAge());
                    break;
                case "Korea":
                    intKorea.add(person.getAge());
                    break;
                case "Japan":
                    intJapan.add(person.getAge());
                    break;
                case "France":
                    intFrance.add(person.getAge());
                    break;
                case "Malaysia":
                    intMalaysia.add(person.getAge());
                    break;
            }
        }

        System.out.println("- Vietnam: " + avg(intVietNam));
        System.out.println("- USA: " + avg(intUSA));
        System.out.println("- China: " + avg(intChina));
        System.out.println("- Korea: " + avg(intKorea));
        System.out.println("- Japan: " + avg(intJapan));
        System.out.println("- France: " + avg(intFrance));
        System.out.println("- Malaysia: " + avg(intMalaysia));
    }

    public int avg(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (Integer item : arrayList) {
            sum = sum + item;
        }
        int avg = sum / arrayList.size();
        return avg;
    }

    @Test
    public void bai1_2() {
        System.out.println("1.2 Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình");
        ArrayList<Person> listAge = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() > 25) {
                listAge.add(person);
            }
        }
        ArrayList<Person> sortAge = sortByAge(listAge);

        for (Person person : sortAge) {
            System.out.println(str + person.getName() + str + person.getNationality() + str + person.getAge());
        }
    }

    public ArrayList<Person> sortByAge(ArrayList<Person> personList) {

        Collections.sort(personList, new Comparator<Person>() {

            @Override
            public int compare(Person person1, Person person2) {
                return person1.getAge() - person2.getAge();
            }

        });
        return personList;
    }

    @Test
    public void bai1_4() {
        System.out.println("1.4 In ra màn hình đánh giá tuổi mỗi người");
        String danhGia = "";
        for (Person person : people) {

            if (person.getAge() < 20)
                danhGia = "nổi loạn";
            else if (person.getAge() >= 20 && person.getAge() <= 30)
                danhGia = "việc làm";
            else if (person.getAge() >= 31 && person.getAge() <= 40)
                danhGia = "sự nghiệp";
            else
                danhGia = "hưởng thụ";
            System.out.printf(str + person.getName() + str + person.getNationality() + str + person.getAge() + str + danhGia + "\n");
        }
    }
}

