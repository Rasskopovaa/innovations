package calculator.test_2;

import java.util.*;

public class User {
    public static void main(String[] args) {
        new User("Игорь", 40, false);
        new User("Оля", 34, true);
        new User("Полина", 15, true);
        System.out.println("Все пользователи:");
        System.out.println(User.getAllUsers());
        System.out.println("Все пользователи: MALE");
        System.out.println(User.getAllUsers(false));
        System.out.println("Все пользователи:FEMALE");
        System.out.println(User.getAllUsers(true));
        System.out.println();
        System.out.println("Всех пользователей:"+User.getHowManyUsers());
        System.out.println("Всех пользователей MALE: " +User.getHowManyUsers(false));
        System.out.println("Всех пользователей FEMALE: "+User.getHowManyUsers(true));
        System.out.println();
        System.out.println("Общий возраст всех пользователей: "+User.getAllAgeUsers());
        System.out.println("Общий возраст пользоваетелей MALE: "+User.getAllAgeUsers(false));
        System.out.println("Общий возраст пользоваетелей FEMALE: "+User.getAllAgeUsers(true));

    }
    private int id;
    private String name;
    private int age;
    private boolean sex;

    private static Map<Integer, User> allUsers;
    private static int countId = 0;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                sex == user.sex;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, sex);
    }
    public User(String name, int age, boolean sex) {
        if (allUsers == null){
            allUsers = new HashMap<>();
        }

        this.name = name;
        this.age = age;
        this.sex = sex;

        if (!hasUser()){
            countId++;
            this.id = countId;
            allUsers.put(id, this);
        }
    }
    private boolean hasUser(){
        for (User user : allUsers.values()){
            if (user.equals(this) && user.hashCode() == this.hashCode()){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
    public static List<User> getAllUsers(){//возращает целый список
        return new ArrayList<>(allUsers.values());
    }

    public static List<User> getAllUsers(boolean sex){//возвращает список в зависимости от переданного параметра
        List<User> listAllUsers = new ArrayList<>();
        for (User user : allUsers.values()){
            if (user.sex == sex){
                listAllUsers.add(user);
            }
        }
        return listAllUsers;
    }
    public static int getHowManyUsers(){//количество в общем списке
        return allUsers.size();
    }

    public static int getHowManyUsers(boolean sex){//количество по полу
        return getAllUsers(sex).size();
    }
    public static int getAllAgeUsers(){ //считает общую сумму по возрасту
        int countAge = 0;
        for (User user : allUsers.values()){
            countAge += user.age;
        }
        return countAge;
    }

    public static int getAllAgeUsers(boolean sex){//общая сумма по возрасту ( учитывая признак пола)
        int countAge = 0;
        for (User user : getAllUsers(sex)){
            countAge += user.age;
        }
        return countAge;
    }
}