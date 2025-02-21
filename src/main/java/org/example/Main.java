package org.example;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.layout.Document;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.geom.PageSize;
import org.example.NewSeller.sellerContract;
import org.example.User.GuideTemplate;
import org.example.User.Sender;
import org.example.User.Receiver;
import org.example.User.Content;
import org.example.User.Person;
import org.example.NewSeller.categoryCommissions;


import com.itextpdf.html2pdf.HtmlConverter;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // 1. Configurar el resolver de plantillas
            ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
            templateResolver.setTemplateMode("HTML");  // Modo de la plantilla (puede ser "HTML", "XML", etc.)
            templateResolver.setSuffix(".html");       // Sufijo de las plantillas (por ejemplo, .html)
            templateResolver.setCharacterEncoding("UTF-8"); // Codificación

            // 2. Crear la instancia del motor de plantillas
            TemplateEngine templateEngine = new TemplateEngine();
            templateEngine.setTemplateResolver(templateResolver);


            // Crear el objeto Seller -  ----------------------
            Sender sender = new Sender(
                    "DISTRIBUIDORAS TRANSPORTADORAS UNIDAS DEL PERU",
                    "1458731458910-01",
                    "150115",
                    "01/09/2024",
                    "+51944256175",
                    "Jirón Antonio Raimondi 180, La Victoria, Sótano - Calle. 5 - Tda. 23 - Block.\n" +
                            "37.REFERENCIA: Intersección Calle.5 con Psje. 16 - C.C. Polvos Azules - De lunes a\n" +
                            "Sábados => 11:00 am - 6:00 pm, Centro Comercial Polvos Azules - Sótano",
                    ""
            );

            // Crear el objeto Receiver - Cliente ----------------------
            Receiver receiver = new Receiver(
                    "Gonzalo Alonso Carlos Villanueva Romero",
                    "vic147r@gmail.com",
                    "961632117",
                    "Ate - 150103",
                    "Calle Morelli 181 San Borja Lima 14324",
                    "Calle Morelli 181 San Borja Lima 14324"
            );

            Content content = new Content("3", Arrays.asList(new Person("Zapatilla Urbana Mujer Nike W Court Lite 3 DV3279-600 Rosado Talla 7", 2), new Person("Zapatilla Deportiva Under Armour W Charged Rogue 3 3025756-101 Blanco Talla 8", 1), new Person("Zapatilla Urbana Mujer Nike W Court Lite 3 DV3279-600 Rosado Talla 7", 2), new Person("Zapatilla Deportiva Under Armour W Charged Rogue 3 3025756-101 Blanco Talla 8", 1)));
            //*******************
            GuideTemplate guideTemplate = new GuideTemplate(
                    "SLV7687569PLZV011441",
                    sender,
                    receiver,
                    "RP20221213192513-01111",
                    content,
                    "CONSTRUCTOR OXAPAMPINO EMPRESA INDIVIDUAL DE SELLER PARA CENTER RESPONSABILIDAD LIMITADA - \"COXA\" E.I.R.L."
            );


            // 3. Crear el contexto con los datos que se pasarán a la plantilla
            Context context = new Context();
            context.setVariable("guideTemplate", guideTemplate);

            List<categoryCommissions> categoryCommissions = Arrays.asList(new categoryCommissions("","", "", ""), new categoryCommissions("","", "", ""));

            List<String> ecommerce = Arrays.asList("promart", "pv", "oeschle", "realplaza", "inkafarma", "agora");

            sellerContract sellerContract = new sellerContract(
                    "Gonzalo Alonso Carlos Villanueva Romero",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    ecommerce,
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    ""

            );
            Context context1 = new Context();
            context1.setVariable("sellerContract", sellerContract);
            context1.setVariable("categoryCommission", categoryCommissions);
            // 4. Procesar la plantilla para generar el HTML resultante

            String renderedHtml = templateEngine.process("templates/template_seller_contract_v3", context1);
            // Escribir el HTML renderizado a un archivo
            try (FileWriter fileWriter = new FileWriter("src/main/resources/templates/output1.html")) {
                fileWriter.write(renderedHtml);
            }

            // Convertir el HTML a PDF
            String htmlFilePath = "src/main/resources/templates/output1.html"; // Ruta del archivo HTML
            String outputPath = "src/main/resources/templates/template_seller_contract_v3.pdf"; // Ruta del archivo PDF de salida

            ByteArrayOutputStream target = new ByteArrayOutputStream();
            PdfWriter writer = new PdfWriter(new FileOutputStream(outputPath));
            PdfDocument pdfDocument = new PdfDocument(writer);
            pdfDocument.setDefaultPageSize(PageSize.A4.rotate());
            Document document = new Document(pdfDocument);
            document.setMargins(0, 0, 0, 0);
            ConverterProperties converterProperties = new ConverterProperties();

            HtmlConverter.convertToPdf(renderedHtml, pdfDocument, converterProperties);


            System.out.println("Archivo HTML generado exitosamente.");
            // 5. Mostrar el HTML generado en la consola
            // System.out.println(renderedHtml);
            System.out.println("Termino......");
            document.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}