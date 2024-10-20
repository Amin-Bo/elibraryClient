
package com.reservation.elibrary.proxy.users;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebService(name = "Users", targetNamespace = "http://server.reservation.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Users {


    /**
     * 
     * @return
     *     returns java.util.List<com.reservation.elibrary.proxy.users.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllUsers", targetNamespace = "http://server.reservation.org/", className = "com.reservation.elibrary.proxy.users.GetAllUsers")
    @ResponseWrapper(localName = "getAllUsersResponse", targetNamespace = "http://server.reservation.org/", className = "com.reservation.elibrary.proxy.users.GetAllUsersResponse")
    @Action(input = "http://server.reservation.org/Users/getAllUsersRequest", output = "http://server.reservation.org/Users/getAllUsersResponse")
    public List<User> getAllUsers();

    /**
     * 
     * @param arg0
     * @return
     *     returns com.reservation.elibrary.proxy.users.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://server.reservation.org/", className = "com.reservation.elibrary.proxy.users.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://server.reservation.org/", className = "com.reservation.elibrary.proxy.users.GetUserResponse")
    @Action(input = "http://server.reservation.org/Users/getUserRequest", output = "http://server.reservation.org/Users/getUserResponse")
    public User getUser(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param user
     * @return
     *     returns com.reservation.elibrary.proxy.users.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addUser", targetNamespace = "http://server.reservation.org/", className = "com.reservation.elibrary.proxy.users.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://server.reservation.org/", className = "com.reservation.elibrary.proxy.users.AddUserResponse")
    @Action(input = "http://server.reservation.org/Users/addUserRequest", output = "http://server.reservation.org/Users/addUserResponse")
    public User addUser(
        @WebParam(name = "User", targetNamespace = "")
        User user);

}
