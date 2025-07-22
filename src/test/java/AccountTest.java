import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {

    @Test
    @DisplayName("Valid name can be printed")
    public void checkNameToEmbossValidNameShouldReturnTrue(){
        String name = "Тимоти Шаламе";
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        assertTrue(actualResult);
    }

    @ParameterizedTest(name = "{0}")
    @CsvSource({"Имя без пробела, 'ТимотиШаламе'",
            "Пробел в начале, ' Тимоти Шаламе'",
            "Пробел в конце, 'ТимотиШаламе '",
            "Меньше 3 символов, 'Ти'",
            "Больше 19 символов, 'ТимотиШаламеТимотиШаламеТимотиШаламе'"})
    public void checkNameToEmbossInvalidNameShouldReturnFalse(String testDescription, String name){
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        assertFalse(actualResult);
    }


}
