package example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class AccountTest {
    private final String name;
    private final boolean expectedNameAndSurname;

    public AccountTest (String name, boolean expectedNameAndSurname) {
        this.name = name;
        this.expectedNameAndSurname = expectedNameAndSurname;

    }

    @Parameterized.Parameters
    public static Object[][] getAccount() {
        return new Object[][] {
                // 3 знака из них 1 пробел посередине
                {"О Л", true},
                //пустая строка
                {"", false},
                //18 знаков с пробелом посередине
                {"Тимоти Шаламеннннн", true},
                //19 знаков с пробелом посередине
                {"Тимоти Шаламенннннн", true},
                //20 знаков с пробелом посередине
                {"Тимоти Шаламеннннннн", false},
                //18 знаков с пробелом в начале строки
                {" ТимотиШаламеннннн", false},
                //18 знаков с пробелом в конце строки
                {"ТимотиШаламеннннн ", false},
                //17 знаков с 2 пробелами
                {"Тимоти  Шаламеннн", false},
                //13 знаков без пробелов
                {"ТимотиШаламен", false},
                //3 пробела
                {"   ", false}

                };
    }
    @Test
    public void printAccountNameAndSurname() {
        Account account = new Account(name);
        boolean actualNameAndSurname = account.checkNameToEmboss();
        Assert.assertEquals(expectedNameAndSurname, actualNameAndSurname);
    }
}
