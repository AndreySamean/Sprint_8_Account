public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        String[] split = name.split(" ");
        if (name.length() >= 3 &&
                name.length() <= 19 &&
                !name.endsWith(" ") &&
                !name.startsWith(" ") &&
                split.length == 2) {
            return true;
        } else System.out.println("Check name requirements");
            return false;
    }
}