package org.example.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailType mailType;

    public String createMail(){
        return String.format("Some e-mail according to MailType and Client parameters, %s", mailType.toString());
    }
}
