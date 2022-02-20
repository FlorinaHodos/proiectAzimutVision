/*24.02.2022
Proiect Curs Software Tester
 */

package ProiectAzimutVision;
// import statements

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ProiectAzimutVision {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://jospalaria.com/");

        chrome.manage().window().maximize();
        //accepta Cookies
        WebElement acceptCookies = chrome.findElement(By.xpath("//*[@id=\"moove_gdpr_cookie_info_bar\"]/div/div/div[2]/button"));
        acceptCookies.click();
        waitSeconds(1);


        //selecteaza categoria
        WebElement categorieFemei = chrome.findElement(By.xpath("//*[@id=\"row-unique-0\"]/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div/div/span/a"));
        categorieFemei.click();

        waitSeconds(1);
        //scroll down
        WebElement scrollDown = chrome.findElement(By.xpath("//*[@id=\"page-header\"]/div/div[2]/i"));
        scrollDown.click();

        waitSeconds(1);
        //filtreaza produs dupa culoarea alb
        WebElement filtreazaAlb = chrome.findElement(By.xpath("//*[@id=\"woocommerce_layered_nav-3\"]/ul/li[1]/a"));
        filtreazaAlb.click();

        waitSeconds(1);
        //scroll down
        WebElement scrollDown1 = chrome.findElement(By.xpath("//*[@id=\"page-header\"]/div/div[2]/i"));
        scrollDown1.click();

        waitSeconds(1);
        //selecteaza produs
        WebElement palarieAlba = chrome.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div/h3/a"));
        palarieAlba.click();

        waitSeconds(1);
        //alege marime produs
        WebElement marimePalarie = chrome.findElement(By.xpath("//*[@id=\"pa_marime\"]"));
        marimePalarie.sendKeys("Mărime unică");
        marimePalarie.click();
        marimePalarie.click();

        waitSeconds(2);
        //adauga produs in cosul de cumparaturi
        WebElement adaugaInCos = chrome.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/form/div/div[2]/button/span"));
        adaugaInCos.click();

        waitSeconds(2);
        //afisaza cosul de cumparaturi
        WebElement veziCos = chrome.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/div/div/a"));
        veziCos.click();

        chrome.navigate().refresh();
//       waitSeconds(1);
        //continua cu finalizarea comenzii
        WebElement finalizeazaComanda = chrome.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div/article/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div/a"));
        finalizeazaComanda.click();

        waitSeconds(1);
        chrome.navigate().refresh();
        //insereaza prenume
        WebElement prenume = chrome.findElement(By.id("billing_first_name"));
        prenume.click();
        prenume.sendKeys("Florina");

        waitSeconds(2);
        //insereaza nume
        WebElement nume = chrome.findElement(By.id("billing_last_name"));
        nume.sendKeys("Hodos");

        waitSeconds(2);
        //insereaza strada
        WebElement strada = chrome.findElement(By.xpath("//*[@id=\"billing_address_1\"]"));
        strada.sendKeys("Mihai Viteazu 100");

        waitSeconds(2);
        //insereaza oras
        WebElement oras = chrome.findElement(By.xpath("//*[@id=\"billing_city\"]"));
        oras.sendKeys("Turda");

        waitSeconds(2);
        //insereaza judet
        WebElement judet = chrome.findElement(By.xpath("//*[@id=\"select2-billing_state-container\"]"));
        judet.click();
        WebElement insereazaCluj = chrome.findElement(By.xpath("/html/body/span/span/span[1]/input"));
        insereazaCluj.sendKeys("Cluj" + "\n" + "\n");
        insereazaCluj.click();
        insereazaCluj.click();

        waitSeconds(2);
        //insereaza cod postal
        WebElement codPostal = chrome.findElement(By.xpath("//*[@id=\"billing_postcode\"]"));
        codPostal.click();
        codPostal.sendKeys("401011");

        waitSeconds(2);
        //insereaza numar telefon
        WebElement telefon = chrome.findElement(By.xpath("//*[@id=\"billing_phone\"]"));
        telefon.sendKeys("0740089376");

        waitSeconds(2);
        //insereaza email
        WebElement adresaEmail = chrome.findElement(By.xpath("//*[@id=\"billing_email\"]"));
        adresaEmail.sendKeys("hodos.florina@gmail.com");

//        waitSeconds(1);
//        WebElement amCititTermenii = chrome.findElement(By.xpath("//*[@id=\"terms\"]"));
//        amCititTermenii.click();
//
//        waitSeconds(1);
//        //continua cu plasarea comenzii
//        WebElement plaseazaComanda = chrome.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div/article/div/div/div/div/div/div[2]/form/div[2]/div/div/button"));
//        plaseazaComanda.click();
//        plaseazaComanda.click();

        waitSeconds(2);
        //navigheaza pe pagina web anterioara
        chrome.navigate().back();
        chrome.navigate().refresh();

        waitSeconds(1);
        //goleste cosul de cumparaturi
        WebElement golesteCos = chrome.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div/article/div/div/div/div[1]/div/div/div/div/div/div/div/div/form/table/tbody/tr[1]/td[1]/a"));
        golesteCos.click();

        waitSeconds(1);
        chrome.navigate().refresh();
        //navigheaza pe homepage
        WebElement inapoiLaMagazin = chrome.findElement(By.xpath("//*[@id=\"row-unique-1\"]/div/div/div/div/div/div/div/div/p/a"));
        inapoiLaMagazin.click();

        waitSeconds(4);
        chrome.close();//inchide doar fereastra curenta
        chrome.quit();//inchide toate instantele


    }

    /*comanda de așteptare intrerupe o anumita perioada (1 secunda)
    inainte de a trece la pasul urmator*/
    private static void waitSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void hover(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

}
