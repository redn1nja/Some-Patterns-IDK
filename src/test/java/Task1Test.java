import org.example.task1.Gender;
import org.example.task1.User;
import org.junit.Assert;
import org.junit.Test;


public class Task1Test {
    @Test
    public void testNoArgs(){
        User user = User.builder().build();
        Assert.assertEquals(user.toString(), "User(name=null, age=0, gender=null, weight=0.0, height=0.0)");
    }
    @Test
    public void testFewArgs(){
        User user = User.builder().name("Oles").height(2.10).build();
        Assert.assertEquals(user.toString(), "User(name=Oles, age=0, gender=null, weight=0.0, height=2.1)");
    }
    @Test
    public void testAllArgs(){
        User user = User.builder().name("Oles").age(31).gender(Gender.MALE).weight(78.0).height(2.10).build();
        Assert.assertEquals(user.toString(), "User(name=Oles, age=31, gender=MALE, weight=78.0, height=2.1)");
    }
}
