
package io.github.syske.springbootwebservicedemo.client1;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 3.3.1
 * 2020-04-28T16:54:24.787+08:00
 * Generated source version: 3.3.1
 *
 */
public final class HelloService_HelloServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.ws.sample/", "HelloService");

    private HelloService_HelloServiceImplPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = HelloService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        HelloService_Service ss = new HelloService_Service(wsdlURL, SERVICE_NAME);
        HelloService port = ss.getHelloServiceImplPort();

        {
        System.out.println("Invoking sayHello...");
        Name _sayHello_parameters = new Name();
        _sayHello_parameters.setMyname("Frist");
        Hello _sayHello__return = port.sayHello(_sayHello_parameters);
        System.out.println("sayHello.result=" + _sayHello__return.getHello());


        }

        System.exit(0);
    }

}