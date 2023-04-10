package Home1;

/*Класс родственник содержит краткое описание членов семьи
    - имя человека
    - его возраст
 */
public class Human {
    private String name;    //имя члена семьи
    private Integer age;    //возраст члена семьи
    private String socialStatus; //социальный статус

    public Human(String name, Integer age, String socialStatus) {
        this.name = name;
        this.age = age;
        this.socialStatus = socialStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSocialStatus() {
        return socialStatus;
    }

    public void setSocialStatus(String socialStatus) {
        this.socialStatus = socialStatus;
    }
}