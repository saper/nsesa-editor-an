<?xml version="1.0" encoding="utf-8"?>
<!--

    xhtml2odt - XHTML to ODT XML transformation.
    Copyright (C) 2009 Aurelien Bompard
    Inspired by the work on docbook2odt, by Roman Fordinal
    http://open.comsultia.com/docbook2odf/

    License: LGPL v2.1 or later <http://www.gnu.org/licenses/lgpl-2.1.html>

    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU Lesser General Public
    License as published by the Free Software Foundation; either
    version 2.1 of the License, or (at your option) any later version.

    This library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public
    License along with this library; if not, write to the Free Software
    Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
    MA  02110-1301  USA

-->
<xsl:stylesheet
        xmlns:h="http://www.w3.org/1999/xhtml"
        xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
        xmlns:text="urn:oasis:names:tc:opendocument:xmlns:text:1.0"
        xmlns:draw="urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
        xmlns:xlink="http://www.w3.org/1999/xlink"
        version="1.0">


    <xsl:template match="h:a">
        <xsl:call-template name="link">
            <xsl:with-param name="mode" select="''"/>
        </xsl:call-template>
    </xsl:template>
    <xsl:template match="h:a" mode="inparagraph">
        <xsl:call-template name="link">
            <xsl:with-param name="mode" select="'inparagraph'"/>
        </xsl:call-template>
    </xsl:template>

    <xsl:template name="link">
        <xsl:param name="mode"/>
        <xsl:choose>
            <xsl:when test="h:img">
                <draw:a>
                    <xsl:call-template name="link-content">
                        <xsl:with-param name="mode" select="$mode"/>
                    </xsl:call-template>
                </draw:a>
            </xsl:when>
            <xsl:otherwise>
                <text:a>
                    <xsl:call-template name="link-content">
                        <xsl:with-param name="mode" select="$mode"/>
                    </xsl:call-template>
                </text:a>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>

    <xsl:template name="link-content">
        <xsl:param name="mode"/>
        <xsl:attribute name="xlink:type">
            <xsl:text>simple</xsl:text>
        </xsl:attribute>
        <xsl:attribute name="xlink:href">
            <xsl:choose>
                <xsl:when test="contains(@href, '#') and substring-before(@href,'#') = $url">
                    <xsl:text>#</xsl:text><xsl:value-of select="substring-after(@href,'#')"/>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="@href"/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:attribute>
        <xsl:choose>
            <xsl:when test="@id">
                <text:bookmark-start>
                    <xsl:attribute name="text:name">
                        <xsl:value-of select="@id"/>
                    </xsl:attribute>
                </text:bookmark-start>
            </xsl:when>
        </xsl:choose>
        <xsl:choose>
            <xsl:when test="$mode = 'inparagraph'">
                <xsl:apply-templates mode="inparagraph"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:apply-templates/>
            </xsl:otherwise>
        </xsl:choose>
        <xsl:choose>
            <xsl:when test="@id">
                <text:bookmark-end>
                    <xsl:attribute name="text:name">
                        <xsl:value-of select="@id"/>
                    </xsl:attribute>
                </text:bookmark-end>
            </xsl:when>
        </xsl:choose>
    </xsl:template>


</xsl:stylesheet>
