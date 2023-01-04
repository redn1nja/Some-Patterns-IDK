import org.example.task2.Client;
import org.example.task2.MailInfo;
import org.example.task2.MailType;
import org.junit.Assert;
import org.junit.Test;

public class Task2Test {
    @Test
    public void testMail(){
        MailInfo mailInfo = new MailInfo();
        mailInfo.setMailType(MailType.GIFT);
        mailInfo.setClient(new Client());
        String mail = mailInfo.createMail();
        Assert.assertEquals(mail, "Some e-mail according to MailType and Client parameters, GIFT");
    }
}
