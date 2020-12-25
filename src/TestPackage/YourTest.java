package TestPackage;

import Item.Items;
import Settings.UserNameAndPassword;
import Settings.UserSettings;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class YourTest {

    /*
        Given before class

              Do not change the before class
    */

    /*
        before class verilmiştir

        before class değiştirmeyin
   */
    @Before
    public void beforeClass(){

        UserNameAndPassword userNameAndPassword = new UserNameAndPassword();

        userNameAndPassword.addUserToList();

    }

    /*

    YOUR CODE IS STARTING HERE

    Test the UserNameAndPassword class setUsername method

    Check all the possible options.

    NOTE :  For each possibility you need to create a different @Test method

     */


      /*

    KOD BURDAN BAŞLIYOR

     UserNameAndPassword class setUsername method TEST EDİN

    Bütün ihtimalleri check edin

    NOTE :  Her ihtimal için farklı @Test method oluşturmanız gerekiyor

     */
    @Test
    public  void Test1(){
        UserNameAndPassword uap=new UserNameAndPassword();
        String userName="sati @demirci";
        String expected="Username should not contain space";
        String result=uap.setUsername(userName);

        Assert.assertEquals(expected,result);

    }
    @Test
    public void Tes2(){
        UserNameAndPassword uap=new UserNameAndPassword();
        String pass="sd3456";
        String expected="sd3456";
        String result=uap.setPassword(pass);
        Assert.assertEquals(expected,result);
    }
    @Test
    public void test3(){
        UserNameAndPassword uap=new UserNameAndPassword();
        String pass="12";
        String expected="Password length more then 5 character";
        String result=uap.setPassword(pass);
        Assert.assertEquals(expected,result);
    }
    @Test
    public void test4(){
        UserNameAndPassword uap=new UserNameAndPassword();
        String userName="satidemirci";
        String expected="Username should contain @ symbol";
        String result=uap.setUsername(userName);

        Assert.assertEquals(expected,result);

    }
    @Test
    public  void Test5(){
        UserNameAndPassword uap=new UserNameAndPassword();
        String userName="@demr";
        String expected="Username length should be more then 6";
        String result=uap.setUsername(userName);

        Assert.assertEquals(expected,result);

    }
    @Test
    public  void Test6(){
        UserNameAndPassword uap=new UserNameAndPassword();
        String userName="@demirci";
        UserNameAndPassword.UserNameLists.add(userName);
        String expected="Username should be unique";
        String result=uap.setUsername(userName);

        Assert.assertEquals(expected,result);

    }






}
