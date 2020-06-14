package Year_2019_8_9_集合作业;

import java.util.*;

public class homeWork11 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String str = new String();
        String str1 = new String();
        hashMap.put("2006", "意大利");
        hashMap.put("2002", "巴西");
        hashMap.put("1998", "法国");
        hashMap.put("1994", "巴西");
        hashMap.put("1990", "德国");
        hashMap.put("1986", "阿根廷");
        hashMap.put("1982", "意大利");
        hashMap.put("1978", "阿根廷");
        hashMap.put("1974", "德国");
        hashMap.put("1970", "巴西");
        hashMap.put("1966", "英格兰");
        hashMap.put("1962", "巴西");
        hashMap.put("1958", "巴西");
        hashMap.put("1954", "德国");
        hashMap.put("1950", "乌拉圭");
        hashMap.put("1938", "意大利");
        hashMap.put("1934", "意大利");
        hashMap.put("1930", "乌拉圭");
        System.out.println("请输入年份：");
        str = scanner.nextLine();
        /*boolean isHave=false;
        for (Iterator it = hashMap.keySet().iterator(); it.hasNext(); ) {
            if (it.next().equals(str)) {
                isHave=true;
                System.out.println(hashMap.get(str)+"夺冠");
                break;
            }
            if ((it.hasNext()==false)&&isHave==false) {
                System.out.println("没有举办世界杯");
                break;
            }
        }
        System.out.println("请输入球队名字：");
        str1 = scanner.nextLine();
        System.out.println(str1);
        for (Iterator it = hashMap.keySet().iterator(); it.hasNext(); ) {
            if (hashMap.get(it.next()).equals(str1)) {
                isHave=true;
                System.out.println(it.toString()+" ");
            }
            if ((it.hasNext()==false)&&isHave==false) {
                System.out.println("没有获得过世界杯");
                break;
            }
        }*/
        if (hashMap.get(str)==null){
            System.out.println("没有举办世界杯");
        }else
        {
            System.out.println(hashMap.get(str));
        }
        System.out.println("请输入球队名字：");
        str1 = scanner.nextLine();
        Set<Map.Entry<String,String>> entry2=hashMap.entrySet();//entry
        for (Map.Entry<String,String> entry1:entry2){
            if (entry1.getValue().equals(str1)){
                System.out.println(entry1.getKey());
            }
        }
    }
}
