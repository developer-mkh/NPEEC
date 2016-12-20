package section3;

/**
 * 個人を表すクラス。
 */
public class Person {

    private String name;
    private String zipCode;

    /**
     * コンストラクタ。
     * @param name 氏名
     * @param zipCode 誕生日
     */
    public Person(String name, String zipCode) {
        this.zipCode = zipCode;
        this.name = name;
    }

    /**
     * 氏名を返す。
     * @return 氏名
     */
    public String getName() {
        return name;
    }

    /**
     * 郵便番号を返す。
     * @return 郵便番号
     */
    public String getZipCode() {
        return zipCode;
    }
}
