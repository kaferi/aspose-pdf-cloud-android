package com.aspose.pdf.android.examples.highlightannotations;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.aspose.asposecloudpdfandroid.ApiException;
import com.aspose.asposecloudpdfandroid.api.PdfApi;
import com.aspose.asposecloudpdfandroid.model.AnnotationFlags;
import com.aspose.asposecloudpdfandroid.model.AsposeResponse;
import com.aspose.asposecloudpdfandroid.model.HighlightAnnotation;
import com.aspose.asposecloudpdfandroid.model.HighlightAnnotationResponse;
import com.aspose.asposecloudpdfandroid.model.HighlightAnnotationsResponse;
import com.aspose.asposecloudpdfandroid.model.HorizontalAlignment;
import com.aspose.asposecloudpdfandroid.model.Point;
import com.aspose.asposecloudpdfandroid.model.Rectangle;

public class HighLightAnnotations {
	private final PdfApi pdfApi;
	private String tempFolder = "TempPdfCloud";
	private String ExampleDataFolder = "ExampleData";

	class ApiCreds {
		public String app_key;
		public String app_sid;
		public String product_uri;
	}

	public HighLightAnnotations()
	   {

	       pdfApi = new PdfApi("app_key", "app_sid");
	       pdfApi.getApiClient().setBasePath("product_uri");
	   }

	private void uploadFile(String name) throws ApiException {
		File file = new File(ExampleDataFolder + "/" + name);
		AsposeResponse response = pdfApi.putCreate(tempFolder + '/' + name, file, null, null);
	}

	public void getDocumentHighlightAnnotationsExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		HighlightAnnotationsResponse response = pdfApi.getDocumentHighlightAnnotations(name, null, tempFolder);
	}

	public void getPageHighlightAnnotationsExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		int pageNumber = 2;

		HighlightAnnotationsResponse response = pdfApi.getPageHighlightAnnotations(name, pageNumber, null, tempFolder);
	}

	public void getHighlightAnnotationExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		HighlightAnnotationsResponse responseAnnotations = pdfApi.getDocumentHighlightAnnotations(name, null,
				tempFolder);
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		HighlightAnnotationResponse response = pdfApi.getHighlightAnnotation(name, annotationId, null, tempFolder);
	}

	public void postPageHighlightAnnotationsExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		int pageNumber = 1;

		Rectangle rect = new Rectangle().LLX(100.).LLY(100.).URX(200.).URY(200.);

		List<AnnotationFlags> flags = new ArrayList<>();
		flags.add(AnnotationFlags.DEFAULT);

		List<Point> points = new ArrayList<>();
		points.add(new Point().X(10.).Y(10.));
		points.add(new Point().X(20.).Y(10.));
		points.add(new Point().X(10.).Y(20.));
		points.add(new Point().X(10.).Y(10.));

		HighlightAnnotation annotation = new HighlightAnnotation();
		annotation.setName("Name");
		annotation.setRect(rect);
		annotation.setFlags(flags);
		annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
		annotation.setRichText("Rich Text");
		annotation.setSubject("Subj");
		annotation.setZindex(1);
		annotation.setTitle("Title");
		annotation.setQuadPoints(points);
		annotation.setModified("02/02/2018 00:00:00.000 AM");

		List<HighlightAnnotation> annotations = new ArrayList<>();
		annotations.add(annotation);

		AsposeResponse response = pdfApi.postPageHighlightAnnotations(name, pageNumber, annotations, null, tempFolder);

	}

	public void putHighlightAnnotationExample() throws ApiException {
		String name = "PdfWithAnnotations.pdf";
		uploadFile(name);

		Rectangle rect = new Rectangle().LLX(100.).LLY(100.).URX(200.).URY(200.);

		List<AnnotationFlags> flags = new ArrayList<>();
		flags.add(AnnotationFlags.DEFAULT);

		List<Point> points = new ArrayList<>();
		points.add(new Point().X(10.).Y(10.));
		points.add(new Point().X(20.).Y(10.));
		points.add(new Point().X(10.).Y(20.));
		points.add(new Point().X(10.).Y(10.));

		HighlightAnnotation annotation = new HighlightAnnotation();
		annotation.setName("Name Updated");
		annotation.setRect(rect);
		annotation.setFlags(flags);
		annotation.setHorizontalAlignment(HorizontalAlignment.CENTER);
		annotation.setRichText("Rich Text Updated");
		annotation.setSubject("Subj Updated");
		annotation.setZindex(1);
		annotation.setTitle("Title Updated");
		annotation.setQuadPoints(points);
		annotation.setModified("02/02/2018 00:00:00.000 AM");

		HighlightAnnotationsResponse responseAnnotations = pdfApi.getDocumentHighlightAnnotations(name, null,
				tempFolder);
		String annotationId = responseAnnotations.getAnnotations().getList().get(0).getId();

		AsposeResponse response = pdfApi.putHighlightAnnotation(name, annotationId, annotation, null, tempFolder);

	}

}
