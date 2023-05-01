package example;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.example.Account;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    @DisplayName("Проверка имени и фамилии при соблюдении всех условий")
    @Description("Вернет true,если все условия соблюдены")
    public void validNameTrue() {
        Account account = new Account("Viola Kot");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка имени и фамилии, при вводе короткого имени")
    @Description("Вернет false, если имя меньше трех символов")
    public void invalidShortNameFalse() {
        Account account = new Account("Vi");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка имени и фамилии, которые имеют больше символов, чем по условию")
    @Description("Вернет false, который имеет больше 19 символов")
    public void invalidLongNameFalse() {
        Account account = new Account("ViolaKotViolaKotViola");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка имени и фамилии, которые не имеют пробелов")
    @Description("Вернет false, если нет хотя бы одного пробела")
    public void invalidNoSpaceNameFalse() {
        Account account = new Account("ViolaKot");
        assertFalse(account.checkNameToEmboss());
    }


    @Test
    @DisplayName("Проверка имени и фамилии  которые имеют пробел в начале")
    @Description("вернет false, так как имя и фамилия имеет больше одного пробела и пробел есть в начале")
    public void invalidSpaceAtBeginningNameFalse() {
        Account account = new Account(" Viola Kot");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка имени и фамилии  которые имеют пробел в конце")
    @Description("вернет false, так как имя и фамилия имеет больше одного пробела и пробел есть в конце")
    public void invalidSpaceAtEndNameFalse() {
        Account account = new Account("Viola Kot ");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка имени и фамилии, которые содеражат пробелы и в начале и в конце.")
    @Description("Вернет false, если у имени и фамилии больше одного пробела, и пробелы есть и в конце и в начале")
    public void invalidSpaceAtEndAndBeginningNameFalse() {
        Account account = new Account(" Viola Kot ");
        assertFalse(account.checkNameToEmboss());
    }
}

