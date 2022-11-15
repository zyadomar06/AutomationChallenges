package Challenge1Tests.tests.utilities;

import org.openqa.selenium.Cookie;

import java.io.*;
import java.util.Date;
import java.util.StringTokenizer;

import static Challenge1Tests.tests.testBase.driver;

public class cookiesHandler {

    String projectPath = System.getProperty("user.dir");
    String cookiesPath = "/src/main/java/data/Cookies";

    final  String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

    public void cookiesWrite() {
        // create file named Cookies to store Login Information
        File file = new File(projectPath+cookiesPath);
        try
        {
            // Delete old file if exists
            file.delete();
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file);
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);
            // loop for getting the cookie information

            // loop for getting the cookie information
            for (Cookie ck : driver.manage().getCookies()) {
                Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";" + ck.getExpiry() + ";" + ck.isSecure()));
                Bwrite.newLine();
            }
            Bwrite.close();
            fileWrite.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void cookiesRead ()
    {
        try
        {

            File file = new File(projectPath+cookiesPath);
            FileReader fileReader = new FileReader(file);
            BufferedReader Buffreader = new BufferedReader(fileReader);
            String strline;
            while((strline=Buffreader.readLine())!=null)
            {
                StringTokenizer token = new StringTokenizer(strline,";");
                while(token.hasMoreTokens())
                {
                    String name = token.nextToken();
                    String value = token.nextToken();
                    String domain = token.nextToken();
                    String path = token.nextToken();
                    Date expiry = null;

                    String val;
                    if(!(val=token.nextToken()).equals("null"))
                    {
                        expiry = new Date(val);
                    }
                    Boolean isSecure = Boolean.parseBoolean(token.nextToken());
                    Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);
                    System.out.println(ck);
                    driver.manage().deleteAllCookies();
                    driver.manage().addCookie(ck); // This will add the stored cookie to your current session
                }
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        driver.navigate().to(URL);
    }
}
