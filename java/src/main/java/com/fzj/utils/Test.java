package com.fzj.utils;


import java.util.*;

/**
 * @author fzj 80326288
 **/
public class Test {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Person person = new Person();
            person.setName("A");
//            person.setMoney(person.money + i);
            personList.add(person);
        }
        for (int i = 0; i < 1000; i++) {
            Person person = new Person();
            person.setName("B");
//            person.setMoney(person.money + i);
            personList.add(person);
        }
        for (int i = 0; i < 1000; i++) {
            Person person = new Person();
            person.setName("C");
//            person.setMoney(person.money + i);
            personList.add(person);
        }
        Map<String, Person> result = new HashMap<>();
        for (Person person : personList) {
            Person person1 = result.get(person.getName());
            if (person1 == null) {
                person1 = new Person();
                person1.setName(person.getName());
                person1.setMoney(person.getMoney());
            } else {
                person1.setMoney(person1.getMoney() + person.money);
            }
            result.put(person.getName(), person1);
        }
        Collection<Person> values = result.values();
        System.out.println(values);
    }



    public static class Person {
        private String name;
        private Long money = 10000L;

        public Long getMoney() {
            return money;
        }

        public String getName() {
            return name;
        }

        public void setMoney(Long money) {
            this.money = money;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    private void random() {
        Random random = new Random();
        int ran1 = random.nextInt(100000);

        for (int i = 0; i < 99; i++) {


            System.out.println((int) ((Math.random() * 9 + 1) * 10000));
            System.out.println(i);
        }
        System.out.println(random);
    }
}
