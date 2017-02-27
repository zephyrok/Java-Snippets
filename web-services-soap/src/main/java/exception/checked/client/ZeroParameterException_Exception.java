
package exception.checked.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ZeroParameterException", targetNamespace = "http://checked.exception/")
public class ZeroParameterException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ZeroParameterException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ZeroParameterException_Exception(String message, ZeroParameterException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ZeroParameterException_Exception(String message, ZeroParameterException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: exception.checked.client.ZeroParameterException
     */
    public ZeroParameterException getFaultInfo() {
        return faultInfo;
    }

}