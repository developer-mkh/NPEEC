package section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 郵便番号に対応する住所の一部を表示する。
 */
public class List3_2 {

    public static void main(String[] args) {
        List<Person> personList = getPersonList();
        Map<String, String>zipCodeMap = getZipCodeMap();

        for (Person p : personList) {
            // TODO:演習4
        }
    }

    /**
     * 個人のリストを取得する。
     * @return 個人のリスト。
     */
    private static List<Person> getPersonList() {
        List<Person> ret = new ArrayList<>();

        ret.add(new Person("なぶら　いちろう", "1840001"));
        ret.add(new Person("なぶら　じろう", "1870036"));
        ret.add(new Person("なぶら　さぶろう", "1890013"));
        ret.add(new Person("なぶら　しろう", null));
        ret.add(new Person("なぶら　ごろう", "1850021"));

        return ret;
    }

    /**
     * 郵便番号と住所のマップを取得する(東京都下の小金井市、小平市、東村山市、国分寺市4市分)。
      * @return 郵便番号がキー、住所がバリューのマップ。
     */
    private static Map<String, String> getZipCodeMap() {
        Map<String, String> ret = new HashMap<>();

        ret.put("1840002","東京都小金井市梶野町");
        ret.put("1840005","東京都小金井市桜町");
        ret.put("1840001","東京都小金井市関野町");
        ret.put("1840012","東京都小金井市中町");
        ret.put("1840014","東京都小金井市貫井南町");
        ret.put("1840015","東京都小金井市貫井北町");
        ret.put("1840011","東京都小金井市東町");
        ret.put("1840004","東京都小金井市本町");
        ret.put("1840013","東京都小金井市前原町");
        ret.put("1840003","東京都小金井市緑町");
        ret.put("1870001","東京都小平市大沼町");
        ret.put("1870031","東京都小平市小川東町");
        ret.put("1870035","東京都小平市小川西町");
        ret.put("1870032","東京都小平市小川町");
        ret.put("1870043","東京都小平市学園東町");
        ret.put("1870045","東京都小平市学園西町");
        ret.put("1870044","東京都小平市喜平町");
        ret.put("1870034","東京都小平市栄町");
        ret.put("1870023","東京都小平市上水新町");
        ret.put("1870022","東京都小平市上水本町");
        ret.put("1870021","東京都小平市上水南町");
        ret.put("1870011","東京都小平市鈴木町");
        ret.put("1870024","東京都小平市たかの台");
        ret.put("1870025","東京都小平市津田町");
        ret.put("1870004","東京都小平市天神町");
        ret.put("1870033","東京都小平市中島町");
        ret.put("1870042","東京都小平市仲町");
        ret.put("1870002","東京都小平市花小金井");
        ret.put("1870003","東京都小平市花小金井南町");
        ret.put("1870041","東京都小平市美園町");
        ret.put("1870012","東京都小平市御幸町");
        ret.put("1870013","東京都小平市回田町");
        ret.put("1890002","東京都東村山市青葉町");
        ret.put("1890001","東京都東村山市秋津町");
        ret.put("1890011","東京都東村山市恩多町");
        ret.put("1890003","東京都東村山市久米川町");
        ret.put("1890013","東京都東村山市栄町");
        ret.put("1890021","東京都東村山市諏訪町");
        ret.put("1890026","東京都東村山市多摩湖町");
        ret.put("1890022","東京都東村山市野口町");
        ret.put("1890012","東京都東村山市萩山町");
        ret.put("1890024","東京都東村山市富士見町");
        ret.put("1890014","東京都東村山市本町");
        ret.put("1890023","東京都東村山市美住町");
        ret.put("1890025","東京都東村山市廻田町");
        ret.put("1850024","東京都国分寺市泉町");
        ret.put("1850001","東京都国分寺市北町");
        ret.put("1850004","東京都国分寺市新町");
        ret.put("1850036","東京都国分寺市高木町");
        ret.put("1850003","東京都国分寺市戸倉");
        ret.put("1850033","東京都国分寺市内藤");
        ret.put("1850005","東京都国分寺市並木町");
        ret.put("1850013","東京都国分寺市西恋ケ窪");
        ret.put("1850035","東京都国分寺市西町");
        ret.put("1850023","東京都国分寺市西元町");
        ret.put("1850034","東京都国分寺市光町");
        ret.put("1850014","東京都国分寺市東恋ケ窪");
        ret.put("1850002","東京都国分寺市東戸倉");
        ret.put("1850022","東京都国分寺市東元町");
        ret.put("1850032","東京都国分寺市日吉町");
        ret.put("1850031","東京都国分寺市富士本");
        ret.put("1850011","東京都国分寺市本多");
        ret.put("1850012","東京都国分寺市本町");
        ret.put("1850021","東京都国分寺市南町");
        return ret;
    }

}
