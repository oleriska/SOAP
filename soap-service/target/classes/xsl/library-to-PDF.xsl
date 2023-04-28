<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fo="http://www.w3.org/1999/XSL/Format">
    <xsl:template match="/">
        <fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format">
            <fo:layout-master-set>
                <fo:simple-page-master master-name="page" page-height="11in" page-width="8.5in" margin-top="1in" margin-bottom="1in" margin-left="1in" margin-right="1in">
                    <fo:region-body/>
                </fo:simple-page-master>
            </fo:layout-master-set>
            <fo:page-sequence master-reference="page">
                <fo:flow flow-name="xsl-region-body">
                    <fo:block vertical-align="top" text-align="center">
                        <fo:external-graphic src="library_.svg" width="0.5px" height="0.3px">
                        </fo:external-graphic>
                    </fo:block>

                    <fo:block font-size="20pt" font-weight="bold" text-align="center">
                        <xsl:value-of select="Library/Library_Name"/>
                    </fo:block>
                    <fo:block font-size="14pt" font-weight="bold" margin-top="1in">
                        Books
                    </fo:block>
                    <fo:table margin-top="0.5in">
                        <fo:table-column column-width="1in"/>
                        <fo:table-column column-width="1in"/>
                        <fo:table-column column-width="2.5in"/>
                        <fo:table-column column-width="1.5in"/>
                        <fo:table-column column-width="2in"/>
                        <fo:table-header>
                            <fo:table-row font-weight="bold">
                                <fo:table-cell>
                                    <fo:block>
                                        Book ID
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block>
                                        Author ID
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block>
                                        Title
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block>
                                        Edition
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block>
                                        Release Date
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                        </fo:table-header>
                        <fo:table-body>
                            <xsl:for-each select="Library/Books/Library_Book">
                                <fo:table-row>
                                    <fo:table-cell>
                                        <fo:block>
                                            <xsl:value-of select="Book_ID"/>
                                        </fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell>
                                        <fo:block>
                                            <xsl:value-of select="Book_Author_ID"/>
                                        </fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell>
                                        <fo:block>
                                            <xsl:value-of select="Book_Title"/>
                                        </fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell>
                                        <fo:block>
                                            <xsl:value-of select="Book_Edition"/>
                                        </fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell>
                                        <fo:block>
                                            <xsl:value-of select="Book_Release_Date"/>
                                        </fo:block>
                                    </fo:table-cell>
                                </fo:table-row>
                            </xsl:for-each>
                        </fo:table-body>
                    </fo:table>
                    <fo:block font-size="14pt" font-weight="bold" margin-top="1in">
                        Loans
                    </fo:block>
                    <fo:table margin-top="0.5in">
                        <fo:table-column column-width="1.5in"/>
                        <fo:table-column column-width="1.5in"/>
                        <fo:table-column column-width="1.5in"/>
                        <fo:table-column column-width="1.5in"/>
                        <fo:table-column column-width="1in"/>
                        <fo:table-header>
                            <fo:table-row font-weight="bold">
                                <fo:table-cell>
                                    <fo:block>
                                        Loan ID
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block>
                                        Student ID
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block>
                                        Book ID
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block>
                                        From
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block>
                                        To
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                        </fo:table-header>
                        <fo:table-body>
                            <xsl:for-each select="Library/Loans/Library_Loan">
                                <fo:table-row>
                                    <fo:table-cell>
                                        <fo:block>
                                            <xsl:value-of select="Loan_ID"/>
                                        </fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell>
                                        <fo:block>
                                            <xsl:value-of select="Loan_Student_ID"/>
                                        </fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell>
                                        <fo:block>
                                            <xsl:value-of select="Loan_Book_ID"/>
                                        </fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell>
                                        <fo:block>
                                            <xsl:value-of select="Loan_From"/>
                                        </fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell>
                                        <fo:block>
                                            <xsl:value-of select="Loan_To"/>
                                        </fo:block>
                                    </fo:table-cell>
                                </fo:table-row>
                            </xsl:for-each>
                        </fo:table-body>
                    </fo:table>
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>
</xsl:stylesheet>