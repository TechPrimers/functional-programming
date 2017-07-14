import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("Peter", 20, Arrays.asList("1","2")),
                new User("Greg", 22, Arrays.asList("3","4")),
                new User("Ryan", 24, Arrays.asList("5")),
                new User("Sam", 26, Arrays.asList("6")));

        System.out.println("Functional Style: ");

        //5
        users.stream()
                .map(user -> user.getPhoneNumber().stream())
                .flatMap(new Function<Stream<String>, Stream<?>>() {
                    @Override
                    public Stream<?> apply(Stream<String> stringStream) {
                        return stringStream.fil;
                    }
                })


    }

    private static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }


    static class User {
        private String name;
        private Integer age = 30;
        private List<String> phoneNumber;

        public User(String name, Integer age, List<String> phoneNumber) {
            this.name = name;
            this.age = age;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public List<String> getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(List<String> phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            return "name : " + name + " age : " + age;
        }
    }
}
