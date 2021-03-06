<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0"
		  xmlns:t="http://www.touchtec.com.br/twfc-tags">
	
	<t:panel id="plataformaForm" cssClass="form">
		<t:title value="%{formTitle}"/>
		
		<input type="hidden" name="plataforma.id" value="${plataforma.id}"/>

		<t:set component="label" value="width:150px" property="style" />
		
		<t:field>
			<t:label value="Nome"/>
			<t:textinput name="plataforma.nome" value="%{plataforma.nome}">
				<t:validate criteria="required" />
			</t:textinput>
		</t:field>

		<t:field>
			<t:label value="Fabricante"/>

			<t:singleselect
					name="plataforma.fabricante.id"
					value="%{plataforma.fabricante}"
					list="%{fabricantes}"
					optionLabel="nome"
					optionValue="id">
				<t:validate criteria="required" />
			</t:singleselect>
		</t:field>
		
		<t:toolbar>
			<t:jsbutton template="cancel" action="$('plataformaForm').remove(); $t('list').open()"/>
			<t:submitbutton action="Plataformas!save.action" template="save" primary="true"/>
		</t:toolbar>
	</t:panel>
	
</jsp:root>