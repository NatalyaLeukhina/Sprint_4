package example;
public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;

    }

    boolean onlySingleSubstring (String str, String subStr) {
        return str.indexOf(subStr) == str.lastIndexOf(subStr);
    }


    public boolean checkNameToEmboss() {
        if (name == null) {
            return false;
        }


        return name.length() >= 3 && name.length() <= 19 && name.contains(" ") & onlySingleSubstring(name, " ") && !name.startsWith(" ") && !name.endsWith(" ");
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
    }

}