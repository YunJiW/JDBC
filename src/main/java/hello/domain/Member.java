package hello.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Member {
    private String username;
    private int money;


    public Member(String username, int money) {
        this.username = username;
        this.money = money;
    }
}
