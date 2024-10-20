
package com.reservation.elibrary.proxy.users;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.reservation.elibrary.proxy.users package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _AddUser_QNAME = new QName("http://server.reservation.org/", "addUser");
    private static final QName _AddUserResponse_QNAME = new QName("http://server.reservation.org/", "addUserResponse");
    private static final QName _GetAllUsers_QNAME = new QName("http://server.reservation.org/", "getAllUsers");
    private static final QName _GetAllUsersResponse_QNAME = new QName("http://server.reservation.org/", "getAllUsersResponse");
    private static final QName _GetUser_QNAME = new QName("http://server.reservation.org/", "getUser");
    private static final QName _GetUserResponse_QNAME = new QName("http://server.reservation.org/", "getUserResponse");
    private static final QName _Reservation_QNAME = new QName("http://server.reservation.org/", "reservation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.reservation.elibrary.proxy.users
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     * @return
     *     the new instance of {@link AddUser }
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     * @return
     *     the new instance of {@link AddUserResponse }
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link GetAllUsers }
     * 
     * @return
     *     the new instance of {@link GetAllUsers }
     */
    public GetAllUsers createGetAllUsers() {
        return new GetAllUsers();
    }

    /**
     * Create an instance of {@link GetAllUsersResponse }
     * 
     * @return
     *     the new instance of {@link GetAllUsersResponse }
     */
    public GetAllUsersResponse createGetAllUsersResponse() {
        return new GetAllUsersResponse();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     * @return
     *     the new instance of {@link GetUser }
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     * @return
     *     the new instance of {@link GetUserResponse }
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     * @return
     *     the new instance of {@link Reservation }
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link User }
     * 
     * @return
     *     the new instance of {@link User }
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllUsers }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "getAllUsers")
    public JAXBElement<GetAllUsers> createGetAllUsers(GetAllUsers value) {
        return new JAXBElement<>(_GetAllUsers_QNAME, GetAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllUsersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "getAllUsersResponse")
    public JAXBElement<GetAllUsersResponse> createGetAllUsersResponse(GetAllUsersResponse value) {
        return new JAXBElement<>(_GetAllUsersResponse_QNAME, GetAllUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Reservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "reservation")
    public JAXBElement<Reservation> createReservation(Reservation value) {
        return new JAXBElement<>(_Reservation_QNAME, Reservation.class, null, value);
    }

}
