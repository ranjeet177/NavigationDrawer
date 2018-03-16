package navdrawer.test.com.navigationdrawertest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<String, List<String>>();

        List<String> menu1 = new ArrayList<String>();
        List<String> menu3 = new ArrayList<String>();
        List<String> menu4 = new ArrayList<String>();
        List<String> menu5 = new ArrayList<String>();

        List<String> list1 = new ArrayList<String>();
        list1.add("SUBMENT_ITEM1");
        list1.add("SUBMENU_ITEM2");
        list1.add("SUBMENU_ITEM3");

        List<String> list2 = new ArrayList<String>();
        list2.add("SUBMENU2_ITEM1");
        list2.add("SUBMENU2_ITEM2");
        list2.add("SUBMENU2_ITEM3");

        expandableListDetail.put("MENU1", menu1);
        expandableListDetail.put("LIST1", list1);
        expandableListDetail.put("LIST2", list2);
        expandableListDetail.put("MENU2", menu3);
        expandableListDetail.put("MENU3", menu4);


        return expandableListDetail;
    }
}
