package main.java.DemoOnStreams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Stream is a wrapper
// around ?? - data sources - can be -> array, list, map, files, console, ports, logs
// for operations on data coming through those data sources
public class CreateStream {
    public static void main(String[] args) {
//        Converting arrays to a Stream
        Integer[] arr = {10, 20, 30, 40, 50};
        Stream<Integer> s1 = Stream.of(arr);
        System.out.println(s1.findFirst());

//        Items to Stream :
        Stream<Integer> s2 = Stream.of(10, 200, 11, 245, 873, 8);
        System.out.println(s2.toArray().toString());

//        List / collections to Stream
        List<Integer> list = Arrays.asList(400, 10, 900, 432, 908, 777, 764);
        Stream<Integer> s3 = list.stream();
        System.out.println(s3.toString());

//        use a builder to create a stream
        Stream.Builder<Integer> sb = Stream.builder();
        sb.accept(10);
        sb.accept(300);
        sb.accept(4000);
        sb.accept(6000);

        Stream<Integer> stream1 = sb.build();
    }
}
