
package com.reservation.elibrary.proxy.books;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.reservation.elibrary.proxy.books package. 
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

    private static final QName _AddBook_QNAME = new QName("http://server.reservation.org/", "addBook");
    private static final QName _AddBookResponse_QNAME = new QName("http://server.reservation.org/", "addBookResponse");
    private static final QName _DeleteBook_QNAME = new QName("http://server.reservation.org/", "deleteBook");
    private static final QName _DeleteBookResponse_QNAME = new QName("http://server.reservation.org/", "deleteBookResponse");
    private static final QName _GetAllBooks_QNAME = new QName("http://server.reservation.org/", "getAllBooks");
    private static final QName _GetAllBooksResponse_QNAME = new QName("http://server.reservation.org/", "getAllBooksResponse");
    private static final QName _GetBook_QNAME = new QName("http://server.reservation.org/", "getBook");
    private static final QName _GetBookResponse_QNAME = new QName("http://server.reservation.org/", "getBookResponse");
    private static final QName _UpdateBook_QNAME = new QName("http://server.reservation.org/", "updateBook");
    private static final QName _UpdateBookResponse_QNAME = new QName("http://server.reservation.org/", "updateBookResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.reservation.elibrary.proxy.books
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     * @return
     *     the new instance of {@link AddBook }
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     * @return
     *     the new instance of {@link AddBookResponse }
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link DeleteBook }
     * 
     * @return
     *     the new instance of {@link DeleteBook }
     */
    public DeleteBook createDeleteBook() {
        return new DeleteBook();
    }

    /**
     * Create an instance of {@link DeleteBookResponse }
     * 
     * @return
     *     the new instance of {@link DeleteBookResponse }
     */
    public DeleteBookResponse createDeleteBookResponse() {
        return new DeleteBookResponse();
    }

    /**
     * Create an instance of {@link GetAllBooks }
     * 
     * @return
     *     the new instance of {@link GetAllBooks }
     */
    public GetAllBooks createGetAllBooks() {
        return new GetAllBooks();
    }

    /**
     * Create an instance of {@link GetAllBooksResponse }
     * 
     * @return
     *     the new instance of {@link GetAllBooksResponse }
     */
    public GetAllBooksResponse createGetAllBooksResponse() {
        return new GetAllBooksResponse();
    }

    /**
     * Create an instance of {@link GetBook }
     * 
     * @return
     *     the new instance of {@link GetBook }
     */
    public GetBook createGetBook() {
        return new GetBook();
    }

    /**
     * Create an instance of {@link GetBookResponse }
     * 
     * @return
     *     the new instance of {@link GetBookResponse }
     */
    public GetBookResponse createGetBookResponse() {
        return new GetBookResponse();
    }

    /**
     * Create an instance of {@link UpdateBook }
     * 
     * @return
     *     the new instance of {@link UpdateBook }
     */
    public UpdateBook createUpdateBook() {
        return new UpdateBook();
    }

    /**
     * Create an instance of {@link UpdateBookResponse }
     * 
     * @return
     *     the new instance of {@link UpdateBookResponse }
     */
    public UpdateBookResponse createUpdateBookResponse() {
        return new UpdateBookResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     * @return
     *     the new instance of {@link Book }
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "addBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<>(_AddBook_QNAME, AddBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "addBookResponse")
    public JAXBElement<AddBookResponse> createAddBookResponse(AddBookResponse value) {
        return new JAXBElement<>(_AddBookResponse_QNAME, AddBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "deleteBook")
    public JAXBElement<DeleteBook> createDeleteBook(DeleteBook value) {
        return new JAXBElement<>(_DeleteBook_QNAME, DeleteBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "deleteBookResponse")
    public JAXBElement<DeleteBookResponse> createDeleteBookResponse(DeleteBookResponse value) {
        return new JAXBElement<>(_DeleteBookResponse_QNAME, DeleteBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooks }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllBooks }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "getAllBooks")
    public JAXBElement<GetAllBooks> createGetAllBooks(GetAllBooks value) {
        return new JAXBElement<>(_GetAllBooks_QNAME, GetAllBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooksResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllBooksResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "getAllBooksResponse")
    public JAXBElement<GetAllBooksResponse> createGetAllBooksResponse(GetAllBooksResponse value) {
        return new JAXBElement<>(_GetAllBooksResponse_QNAME, GetAllBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "getBook")
    public JAXBElement<GetBook> createGetBook(GetBook value) {
        return new JAXBElement<>(_GetBook_QNAME, GetBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "getBookResponse")
    public JAXBElement<GetBookResponse> createGetBookResponse(GetBookResponse value) {
        return new JAXBElement<>(_GetBookResponse_QNAME, GetBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBook }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateBook }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "updateBook")
    public JAXBElement<UpdateBook> createUpdateBook(UpdateBook value) {
        return new JAXBElement<>(_UpdateBook_QNAME, UpdateBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateBookResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.reservation.org/", name = "updateBookResponse")
    public JAXBElement<UpdateBookResponse> createUpdateBookResponse(UpdateBookResponse value) {
        return new JAXBElement<>(_UpdateBookResponse_QNAME, UpdateBookResponse.class, null, value);
    }

}
