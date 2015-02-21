
package com.simavirtual.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UnWebService", targetNamespace = "http://ws.simavirtual.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UnWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "codigo", targetNamespace = "http://ws.simavirtual.com/", className = "com.simavirtual.ws.Codigo")
    @ResponseWrapper(localName = "codigoResponse", targetNamespace = "http://ws.simavirtual.com/", className = "com.simavirtual.ws.CodigoResponse")
    @Action(input = "http://ws.simavirtual.com/UnWebService/codigoRequest", output = "http://ws.simavirtual.com/UnWebService/codigoResponse")
    public String codigo(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}