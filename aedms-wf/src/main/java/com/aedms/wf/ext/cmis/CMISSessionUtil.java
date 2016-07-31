package com.aedms.wf.ext.cmis;

import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.apache.chemistry.opencmis.client.api.Document;
import org.apache.chemistry.opencmis.client.api.DocumentType;
import org.apache.chemistry.opencmis.client.api.Folder;
import org.apache.chemistry.opencmis.client.api.ItemIterable;
import org.apache.chemistry.opencmis.client.api.ObjectId;
import org.apache.chemistry.opencmis.client.api.ObjectType;
import org.apache.chemistry.opencmis.client.api.QueryResult;
import org.apache.chemistry.opencmis.client.api.Session;
import org.apache.chemistry.opencmis.commons.PropertyIds;
import org.apache.chemistry.opencmis.commons.data.ContentStream;
import org.apache.chemistry.opencmis.commons.definitions.DocumentTypeDefinition;
import org.apache.chemistry.opencmis.commons.definitions.PropertyDefinition;
import org.apache.chemistry.opencmis.commons.enums.VersioningState;
import org.apache.chemistry.opencmis.commons.impl.dataobjects.ContentStreamImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value = "cmisSessionUtil")
public class CMISSessionUtil {

	@Autowired
	@Lazy
	Session cmisSession;

	public Document createDocument( String fileName,  byte[] content) throws Exception {
		//TODO: Put them under Default Folder for now.
		Folder defaltFault=(Folder)cmisSession.getObjectByPath("/Default");
		Map<String, Object> docProps = new HashMap<String, Object>();
		docProps.put(PropertyIds.NAME, fileName);
		docProps.put(PropertyIds.OBJECT_TYPE_ID, "cmis:document");

		ByteArrayInputStream in = new ByteArrayInputStream(content);
		ContentStream contentStream = new ContentStreamImpl(fileName, BigInteger.valueOf(content.length), "text/plain", in);;
		Document document = defaltFault.createDocument(docProps, contentStream, VersioningState.MAJOR);
		return document;
	}

	//TODO: method not working
	public  Folder getFolder( String folderName) {
		ObjectType type = cmisSession.getTypeDefinition("cmis:folder");
		PropertyDefinition<?> objectIdPropDef = type.getPropertyDefinitions().get(PropertyIds.OBJECT_ID);
		String objectIdQueryName = objectIdPropDef.getQueryName();

		ItemIterable<QueryResult> results = cmisSession
				.query("SELECT * FROM cmis:folder WHERE cmis:name='" + folderName + "'", false);
		for (QueryResult qResult : results) {
			String objectId = qResult.getPropertyValueByQueryName(objectIdQueryName);
			return (Folder) cmisSession.getObject(cmisSession.createObjectId(objectId));
		}
		return null;
	}

	public static Folder createFolder(Session session, Folder parentFolder, String folderName) {
		Map<String, Object> folderProps = new HashMap<String, Object>();
		folderProps.put(PropertyIds.NAME, folderName);
		folderProps.put(PropertyIds.OBJECT_TYPE_ID, "cmis:folder");
		ObjectId folderObjectId = session.createFolder(folderProps, parentFolder, null, null, null);
		return (Folder) session.getObject(folderObjectId);
	}

}
