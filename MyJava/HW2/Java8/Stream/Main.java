package HW2.Java8.Stream;
import java.util.ArrayList;
import java.util.List;


class MyStream<T> {
    @FunctionalInterface
    interface MyFunction<T, R> {
        R apply(T t);
    }

    static <T, R> List<R> MyMap(List<T> list, MyFunction<T, R> mapper) {
        List<R> resultList = new ArrayList<>();
        for (T item : list) {
            R result = mapper.apply(item);
            resultList.add(result);
        }
        return resultList;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> mappedList = MyStream.MyMap(list, o -> o * 3);

        System.out.println("Original list: " + list);
        System.out.println("Mapped list: " + mappedList);
    }
}
