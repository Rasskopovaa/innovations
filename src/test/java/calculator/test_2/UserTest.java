package calculator.test_2;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserTest {
    @Test
    public void getAllUsers() {

         User user =new User("Игорь", 40, false);
        User user1 = new User("Оля", 34, true);
        User user2 = new User("Полина", 15, true);


        List<User> expected = User.getAllUsers();

        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getAllUsers_NO_NULL() {
        //проверка на нуль
        List<User> expected = User.getAllUsers();
        Assert.assertNotNull(expected);
    }
    @Test
    public void getAllUsers_MALE(){
        User user =new User("Игорь", 40, false);
        User user1 = new User("Оля", 34, true);
        User user2 = new User("Полина", 15, true);

        List<User> expected = User.getAllUsers(false);
        List<User> actual= new ArrayList<>();
        actual.add(user);
        Assert.assertEquals(expected,actual);
    }
    public void getAllUsers_FEMALE() {
        User user =new User("Игорь", 40, false);
        User user1 = new User("Оля", 34, true);
        User user2 = new User("Полина", 15, true);



        List<User> expected = User.getAllUsers(true);

        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getAllUsers_FEMALE_NO_NULL() {

        List<User> expected = User.getAllUsers(true);
        Assert.assertNotNull(expected);
    }
    @Test
    public void getHowManyUsers() {
        User user =new User("Игорь", 40, false);
        User user1 = new User("Оля", 34, true);
        User user2 = new User("Полина", 15, true);

        int expected = User.getHowManyUsers();

        int actual = 3;

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getHowManyUsers_MALE() {
        User user = new User("Игорь", 40, false);
        User user1 = new User("Оля", 34, true);
        User user2 = new User("Полина", 15, true);

        int expected = User.getHowManyUsers(false);

        int actual = 1;

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getHowManyUsers_FEMALE() {
        User user = new User("Игорь", 40, false);
        User user1 = new User("Оля", 34, true);
        User user2 = new User("Полина", 15, true);

        int expected = User.getHowManyUsers(true);

        int actual = 2;

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getAllAgeUsers() {
        User user = new User("Игорь", 40, false);
        User user1 = new User("Оля", 34, true);
        User user2 = new User("Полина", 15, true);

        int expected = User.getAllAgeUsers();

        int actual = 40 + 34 + 15;

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getAllAgeUsers_MALE() {
        User user = new User("Игорь", 40, false);
        User user1 = new User("Оля", 34, true);
        User user2 = new User("Полина", 15, true);

        int expected = User.getAllAgeUsers(false);

        int actual = 40;

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getAllAgeUsers_FEMALE() {
        User user = new User("Игорь", 40, false);
        User user1 = new User("Оля", 34, true);
        User user2 = new User("Полина", 15, true);

        int expected = User.getAllAgeUsers(true);

        int actual = 34 + 15;

        Assert.assertEquals(expected, actual);
}
}
