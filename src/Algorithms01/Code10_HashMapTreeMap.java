package Algorithms01;
import java.util.HashMap;
public class Code10_HashMapTreeMap {
    // 定义类型
    public static class Node{
        public int value;

        // 构造函数
        public Node(int v) {
            value = v;
        }
    }


    // (K V)表
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("jinhe", "我是某某某");
        System.out.println(map.containsKey("jinhe"));
        System.out.println(map.containsKey("jin"));
        System.out.println(map.get("jinhe"));

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        HashMap<Node, String> map3 = new HashMap<>();
        map3.put(node1, "我进来了");
        System.out.println(map3.containsKey(node1));
        System.out.println(map3.containsKey(node2));
    }

        // 有序表
}
