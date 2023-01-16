package NewDataStructure.OverviewDSAbyApnaCollege.CollectionFrameWork;

import java.util.LinkedList;
import java.util.List;

public class LinkList2 {
    public static void main(String[] args) {
        List<String> li=new LinkedList<>();

        li.add("10");
        li.add("20");
        li.add("40");
        li.add("30");
        li.add("12");

        for (String str : li) {
            System.out.print(str+" => " );
        }
        System.out.println("NULL");
    }
}
