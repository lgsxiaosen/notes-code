public class Main {

    public static void main(String[] args) {
        // 声明容器
        Aggregate<String> aggregate = new ConcreteAggregate<String>();
        aggregate.add("abc");
        aggregate.add("123");
        aggregate.add("sds");
        // 遍历
        Iterator<String> iterator = aggregate.iterator();
        System.out.println(iterator.hasNext());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
