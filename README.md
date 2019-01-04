# Document-output-PDF-Reporting-Spring-boot-with-jasperreport

Reporting ini pada aplikasi yang menggunakan spring boot, menggunakan jasperreport studio bisa download jasperreport studio di google.

1. Langkah pertama import dependency jasperreport ke aplikasi spring yang dikerjakan. Berikut cara import dependency jasperreport ke maven dependency

 <dependency>
    <groupId>net.sf.jasperreports</groupId>
    <artifactId>jasperreports</artifactId>
    <version>6.4.0</version>
 </dependency>

2. Membuat template report sederhana, bisa templating langsung di jasperreport studio. Berikut contoh template sederhana.
  
  <jasperReport ... >
    <field name="FIRST_NAME" class="java.lang.String"/>
    <field name="LAST_NAME" class="java.lang.String"/>
    <field name="SALARY" class="java.lang.Double"/>
    <field name="ID" class="java.lang.Integer"/>
    <detail>
        <band height="51" splitType="Stretch">
            <textField>
                <reportElement x="0" y="0" width="100" height="20"/>
                <textElement/>
                <textFieldExpression class="java.lang.String">
                  <![CDATA[$F{FIRST_NAME}]]></textFieldExpression>
            </textField>
            <textField>
                <reportElement x="100" y="0" width="100" height="20"/>
                <textElement/>
                <textFieldExpression class="java.lang.String">
                  <![CDATA[$F{LAST_NAME}]]></textFieldExpression>
            </textField>
            <textField>
                <reportElement x="200" y="0" width="100" height="20"/>
                <textElement/>
                <textFieldExpression class="java.lang.String">
                  <![CDATA[$F{SALARY}]]></textFieldExpression>
            </textField>
        </band>
    </detail>
</jasperReport>

3. Membuat class Writer.java

Class ini sebagai class util yang fungsinya digunakan untuk export document ke berbagai tipe file pdf dan digunakan di class utama yang berisi data-data yang akan di reporting.

4. Membuat class utama.java
Class ini digunakan untuk input parameter parameter yang digunakan.

Sumber : https://www.baeldung.com/spring-jasper
