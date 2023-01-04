package org.example.task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<MailInfo> infos = new ArrayList<MailInfo>();


    public void addMailInfo(MailInfo mailInfo){
        infos.add(mailInfo);
    }
    public void sendAll(){
        for (MailInfo info: infos) {
            MailSender.sendMail(info);
        }
    }
}
