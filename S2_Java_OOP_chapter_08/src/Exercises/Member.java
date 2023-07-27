package Exercises;
/*
* 姓名
* 编号
* 密码
* 积分
* 日期
* */
public class Member {
    private String name;
    private Integer cardId;
    private Integer password;
    private Integer score;
    private String registerDate;

    public Member(){

    }

    public Member(String name, Integer cardId, int password, int score, String registerDate) {
        this.name = name;
        this.cardId = cardId;
        this.password = password;
        this.score = score;
        this.registerDate = registerDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }
}
