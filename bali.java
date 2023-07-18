package TestClasses;
public class Uniquevaluefromarray {

	public static void main(String[] args) {
    String str="hello world";

Map<String, Long> result = Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));  
		System.out.println(result);  
		}  }
