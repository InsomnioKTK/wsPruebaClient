
package com.ejs.soapws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ejs.soapws package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _GetBicicleta_QNAME = new QName("http://soapWs.ejs.com/", "getBicicleta");
    private final static QName _GetBicicletasResponse_QNAME = new QName("http://soapWs.ejs.com/", "getBicicletasResponse");
    private final static QName _GetBicicletasXMLResponse_QNAME = new QName("http://soapWs.ejs.com/", "getBicicletasXMLResponse");
    private final static QName _Bicicleta_QNAME = new QName("http://soapWs.ejs.com/", "bicicleta");
    private final static QName _GetBicicletasXML_QNAME = new QName("http://soapWs.ejs.com/", "getBicicletasXML");
    private final static QName _GetBicicletaResponse_QNAME = new QName("http://soapWs.ejs.com/", "getBicicletaResponse");
    private final static QName _GetBicicletas_QNAME = new QName("http://soapWs.ejs.com/", "getBicicletas");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ejs.soapws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBicicleta }
     * 
     */
    public GetBicicleta createGetBicicleta() {
        return new GetBicicleta();
    }

    /**
     * Create an instance of {@link GetBicicletasResponse }
     * 
     */
    public GetBicicletasResponse createGetBicicletasResponse() {
        return new GetBicicletasResponse();
    }

    /**
     * Create an instance of {@link GetBicicletasXMLResponse }
     * 
     */
    public GetBicicletasXMLResponse createGetBicicletasXMLResponse() {
        return new GetBicicletasXMLResponse();
    }

    /**
     * Create an instance of {@link Bicicleta }
     * 
     */
    public Bicicleta createBicicleta() {
        return new Bicicleta();
    }

    /**
     * Create an instance of {@link GetBicicletasXML }
     * 
     */
    public GetBicicletasXML createGetBicicletasXML() {
        return new GetBicicletasXML();
    }

    /**
     * Create an instance of {@link GetBicicletaResponse }
     * 
     */
    public GetBicicletaResponse createGetBicicletaResponse() {
        return new GetBicicletaResponse();
    }

    /**
     * Create an instance of {@link GetBicicletas }
     * 
     */
    public GetBicicletas createGetBicicletas() {
        return new GetBicicletas();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBicicleta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapWs.ejs.com/", name = "getBicicleta")
    public JAXBElement<GetBicicleta> createGetBicicleta(GetBicicleta value) {
        return new JAXBElement<GetBicicleta>(_GetBicicleta_QNAME, GetBicicleta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBicicletasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapWs.ejs.com/", name = "getBicicletasResponse")
    public JAXBElement<GetBicicletasResponse> createGetBicicletasResponse(GetBicicletasResponse value) {
        return new JAXBElement<GetBicicletasResponse>(_GetBicicletasResponse_QNAME, GetBicicletasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBicicletasXMLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapWs.ejs.com/", name = "getBicicletasXMLResponse")
    public JAXBElement<GetBicicletasXMLResponse> createGetBicicletasXMLResponse(GetBicicletasXMLResponse value) {
        return new JAXBElement<GetBicicletasXMLResponse>(_GetBicicletasXMLResponse_QNAME, GetBicicletasXMLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bicicleta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapWs.ejs.com/", name = "bicicleta")
    public JAXBElement<Bicicleta> createBicicleta(Bicicleta value) {
        return new JAXBElement<Bicicleta>(_Bicicleta_QNAME, Bicicleta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBicicletasXML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapWs.ejs.com/", name = "getBicicletasXML")
    public JAXBElement<GetBicicletasXML> createGetBicicletasXML(GetBicicletasXML value) {
        return new JAXBElement<GetBicicletasXML>(_GetBicicletasXML_QNAME, GetBicicletasXML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBicicletaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapWs.ejs.com/", name = "getBicicletaResponse")
    public JAXBElement<GetBicicletaResponse> createGetBicicletaResponse(GetBicicletaResponse value) {
        return new JAXBElement<GetBicicletaResponse>(_GetBicicletaResponse_QNAME, GetBicicletaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBicicletas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapWs.ejs.com/", name = "getBicicletas")
    public JAXBElement<GetBicicletas> createGetBicicletas(GetBicicletas value) {
        return new JAXBElement<GetBicicletas>(_GetBicicletas_QNAME, GetBicicletas.class, null, value);
    }

}
