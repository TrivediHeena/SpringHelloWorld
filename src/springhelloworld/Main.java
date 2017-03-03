/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package springhelloworld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author fdsh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext apCon=new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld obj=(HelloWorld)apCon.getBean("hello");
        System.out.print(obj.getMsg());
    }

}
