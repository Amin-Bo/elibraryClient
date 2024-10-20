
package com.reservation.elibrary.proxy.reservations;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.reservation.elibrary.proxy.reservations package. 
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

    private static final QName _AddReservation_QNAME = new QName("http://server.reservation.org/", "addReservation");
    private static final QName _AddReservationResponse_QNAME = new QName("http://server.reservation.org/", "addReservationResponse");
    private static final QName _GetAllReservations_QNAME = new QName("http://server.reservation.org/", "getAllReservations");
    private static final QName _GetAllReservationsResponse_QNAME = new QName("http://server.reservation.org/", "getAllReservationsResponse");
    private static final QName _GetReservation_QNAME = new QName("http://server.reservation.org/", "getReservation");
    private static final QName _GetReservationResponse_QNAME = new QName("http://server.reservation.org/", "getReservationResponse");
    private static final QName _Reservation_QNAME = new QName("http://server.reservation.org/", "reservation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.reservation.elibrary.proxy.reservations
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddReservation }
     * 
     * @return
     *     the new instance of {@link AddReservation }
     */
    public AddReservation createAddReservation() {
        return new AddReservation();
    }

    /**
     * Create an instance of {@link AddReservationResponse }
     * 
     * @return
     *     the new instance of {@link AddReservationResponse }
     */
    public AddReservationResponse createAddReservationResponse() {
        return new AddReservationResponse();
    }

    /**
     * Create an instance of {@link GetAllReservations }
     * 
     * @return
     *     the new instance of {@link GetAllReservations }
     */
    public GetAllReservations createGetAllReservations() {
        return new GetAllReservations();
    }

    /**
     * Create an instance of {@link GetAllReservationsResponse }
     * 
     * @return
     *     the new instance of {@link GetAllReservationsResponse }
     */
    public GetAllReservationsResponse createGetAllReservationsResponse() {
        return new GetAllReservationsResponse();
    }

    /**
     * Create an instance of {@link GetReservation }
     * 
     * @return
     *     the new instance of {@link GetReservation }
     */
    public GetReservation createGetReservation() {
        return new GetReservation();
    }

    /**
     * Create an instance of {@link GetReservationResponse }
     * 
     * @return
     *     the new instance of {@link GetReservationResponse }
     */
    public GetReservationResponse createGetReservationResponse() {
        return new GetReservationResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "addReservation")
    public JAXBElement<AddReservation> createAddReservation(AddReservation value) {
        return new JAXBElement<>(_AddReservation_QNAME, AddReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "addReservationResponse")
    public JAXBElement<AddReservationResponse> createAddReservationResponse(AddReservationResponse value) {
        return new JAXBElement<>(_AddReservationResponse_QNAME, AddReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllReservations }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllReservations }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "getAllReservations")
    public JAXBElement<GetAllReservations> createGetAllReservations(GetAllReservations value) {
        return new JAXBElement<>(_GetAllReservations_QNAME, GetAllReservations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllReservationsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllReservationsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "getAllReservationsResponse")
    public JAXBElement<GetAllReservationsResponse> createGetAllReservationsResponse(GetAllReservationsResponse value) {
        return new JAXBElement<>(_GetAllReservationsResponse_QNAME, GetAllReservationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "getReservation")
    public JAXBElement<GetReservation> createGetReservation(GetReservation value) {
        return new JAXBElement<>(_GetReservation_QNAME, GetReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "getReservationResponse")
    public JAXBElement<GetReservationResponse> createGetReservationResponse(GetReservationResponse value) {
        return new JAXBElement<>(_GetReservationResponse_QNAME, GetReservationResponse.class, null, value);
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
