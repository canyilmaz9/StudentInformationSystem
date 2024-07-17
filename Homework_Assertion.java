package day06_JUnitAssertions_dropdownMenu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.ReusableMethods;
import utilities.TestBaseEach;

import java.util.List;

public class Homework_Assertion extends TestBaseEach {


    @Test
    public void dropdowntesti(){
        //● https://the-internet.herokuapp.com/dropdown adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dropdown");

        // 1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        WebElement option = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select selectOption = new Select(option);

        selectOption.selectByIndex(1);

        System.out.println(selectOption.getFirstSelectedOption().getText());

        // 2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın

        selectOption.selectByValue("2");
        System.out.println(selectOption.getFirstSelectedOption().getText());

        // 3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        selectOption.selectByVisibleText("Option 1");
        System.out.println(selectOption.getFirstSelectedOption().getText());

        // 4.Tüm dropdown değerleri(value) yazdırın
        List<WebElement> optionList = selectOption.getOptions();

        System.out.println(ReusableMethods.getStringList(optionList));

        // 5. Dropdown’un boyutunun 4 olduğunu test edin

        int expectedListSize = 4;
        int actualListSize = optionList.size();

        Assertions.assertEquals(expectedListSize,actualListSize);

        ReusableMethods.bekle(3);
    }



}
