package lt.viko.eif.o.sharapova.soapservice.soap.utils;

import org.apache.fop.apps.*;
import org.xml.sax.SAXException;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/**
 * PDF Converter used to accept XSL (instructions how to render PDF) and XML (data to be rendered) files
 * to produce PDF representation of XML data.
        */
public class PDFConverterUtil {

    /**
     * Converts XML data into PDF.
     *
     * @throws IOException
     * @throws SAXException
     * @throws TransformerException
     */
    public static void convertToPDF() throws IOException, SAXException, TransformerException
    {
        File xsltFile = new File("src/main/resources/xsl/library-to-PDF.xsl");
        StreamSource xmlSource = new StreamSource(new File("src/main/resources/xml/library.xml"));
        FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
        FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
        OutputStream out;
        out = new java.io.FileOutputStream("src/main/resources/pdf/library.pdf");

        try {
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);

            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(new StreamSource(xsltFile));

            Result res = new SAXResult(fop.getDefaultHandler());

            transformer.transform(xmlSource, res);
        }
        finally {
            out.close();
        }
    }
}
