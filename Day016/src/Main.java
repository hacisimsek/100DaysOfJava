public class Main {
    public static void main(String[] args) {
        System.out.println(createSql("name", "age", "address", "phone"));
    }
    private static String createSql(String... colums){
        return new StringBuilder("SELECT ")
                .append(String.join(", ", colums))
                .append(" FROM PEOPLE")
                .toString();
    }
}