package org.example.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.task1.Gender;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    private static int idAssign = 0;
    private int id;
    public void setId(int id) {
        this.id = idAssign++;
    }
    private String Name;
    private int age;
    private Gender sex;
}
