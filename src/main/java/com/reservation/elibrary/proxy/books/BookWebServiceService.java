
package com.reservation.elibrary.proxy.books;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "BookWebServiceService", targetNamespace = "http://server.reservation.org/", wsdlLocation = "http://localhost:8088/books?wsdl")
public class BookWebServiceService
    extends Service
{

    private static final URL BOOKWEBSERVICESERVICE_WSDL_LOCATION;
    private static final WebServiceException BOOKWEBSERVICESERVICE_EXCEPTION;
    private static final QName BOOKWEBSERVICESERVICE_QNAME = new QName("http://server.reservation.org/", "BookWebServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8088/books?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOOKWEBSERVICESERVICE_WSDL_LOCATION = url;
        BOOKWEBSERVICESERVICE_EXCEPTION = e;
    }

    public BookWebServiceService() {
        super(__getWsdlLocation(), BOOKWEBSERVICESERVICE_QNAME);
    }

    public BookWebServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BOOKWEBSERVICESERVICE_QNAME, features);
    }

    public BookWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, BOOKWEBSERVICESERVICE_QNAME);
    }

    public BookWebServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BOOKWEBSERVICESERVICE_QNAME, features);
    }

    public BookWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Books
     */
    @WebEndpoint(name = "BooksPort")
    public Books getBooksPort() {
        return super.getPort(new QName("http://server.reservation.org/", "BooksPort"), Books.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Books
     */
    @WebEndpoint(name = "BooksPort")
    public Books getBooksPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.reservation.org/", "BooksPort"), Books.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOOKWEBSERVICESERVICE_EXCEPTION!= null) {
            throw BOOKWEBSERVICESERVICE_EXCEPTION;
        }
        return BOOKWEBSERVICESERVICE_WSDL_LOCATION;
    }

}
