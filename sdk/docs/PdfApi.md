# PdfApi

All URIs are relative to *https://api.aspose.cloud/v2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAnnotation**](PdfApi.md#deleteAnnotation) | **DELETE** /pdf/{name}/annotations/{annotationId} | Delete document annotation by ID
[**deleteDocumentAnnotations**](PdfApi.md#deleteDocumentAnnotations) | **DELETE** /pdf/{name}/annotations | Delete all annotations from the document
[**deleteDocumentLinkAnnotations**](PdfApi.md#deleteDocumentLinkAnnotations) | **DELETE** /pdf/{name}/links | Delete all link annotations from the document
[**deleteField**](PdfApi.md#deleteField) | **DELETE** /pdf/{name}/fields/{fieldName} | Delete document field by name.
[**deleteImage**](PdfApi.md#deleteImage) | **DELETE** /pdf/{name}/images/{imageId} | Delete image from document page.
[**deleteLinkAnnotation**](PdfApi.md#deleteLinkAnnotation) | **DELETE** /pdf/{name}/links/{linkId} | Delete document page link annotation by ID
[**deletePage**](PdfApi.md#deletePage) | **DELETE** /pdf/{name}/pages/{pageNumber} | Delete document page by its number.
[**deletePageAnnotations**](PdfApi.md#deletePageAnnotations) | **DELETE** /pdf/{name}/pages/{pageNumber}/annotations | Delete all annotations from the page
[**deletePageLinkAnnotations**](PdfApi.md#deletePageLinkAnnotations) | **DELETE** /pdf/{name}/pages/{pageNumber}/links | Delete all link annotations from the page
[**deleteProperties**](PdfApi.md#deleteProperties) | **DELETE** /pdf/{name}/documentproperties | Delete custom document properties.
[**deleteProperty**](PdfApi.md#deleteProperty) | **DELETE** /pdf/{name}/documentproperties/{propertyName} | Delete document property.
[**getDocument**](PdfApi.md#getDocument) | **GET** /pdf/{name} | Read common document info.
[**getDocumentAnnotations**](PdfApi.md#getDocumentAnnotations) | **GET** /pdf/{name}/annotations | Read documant page annotations. Returns only FreeTextAnnotations, TextAnnotations, other annotations will implemented next releases.
[**getDocumentAttachmentByIndex**](PdfApi.md#getDocumentAttachmentByIndex) | **GET** /pdf/{name}/attachments/{attachmentIndex} | Read document attachment info by its index.
[**getDocumentAttachments**](PdfApi.md#getDocumentAttachments) | **GET** /pdf/{name}/attachments | Read document attachments info.
[**getDocumentBookmarks**](PdfApi.md#getDocumentBookmarks) | **GET** /pdf/{name}/bookmarks | Read document bookmark/bookmarks (including children).
[**getDocumentFreeTextAnnotations**](PdfApi.md#getDocumentFreeTextAnnotations) | **GET** /pdf/{name}/annotations/freetext | Read document free text annotations.
[**getDocumentProperties**](PdfApi.md#getDocumentProperties) | **GET** /pdf/{name}/documentproperties | Read document properties.
[**getDocumentProperty**](PdfApi.md#getDocumentProperty) | **GET** /pdf/{name}/documentproperties/{propertyName} | Read document property by name.
[**getDocumentTextAnnotations**](PdfApi.md#getDocumentTextAnnotations) | **GET** /pdf/{name}/annotations/text | Read document text annotations.
[**getDownload**](PdfApi.md#getDownload) | **GET** /storage/file | Download a specific file 
[**getDownloadDocumentAttachmentByIndex**](PdfApi.md#getDownloadDocumentAttachmentByIndex) | **GET** /pdf/{name}/attachments/{attachmentIndex}/download | Download document attachment content by its index.
[**getEpubInStorageToPdf**](PdfApi.md#getEpubInStorageToPdf) | **GET** /pdf/create/epub | Convert EPUB file (located on storage) to PDF format and return resulting file in response. 
[**getField**](PdfApi.md#getField) | **GET** /pdf/{name}/fields/{fieldName} | Get document field by name.
[**getFields**](PdfApi.md#getFields) | **GET** /pdf/{name}/fields | Get document fields.
[**getFreeTextAnnotation**](PdfApi.md#getFreeTextAnnotation) | **GET** /pdf/{name}/annotations/freetext/{annotationId} | Read document page free text annotation by ID.
[**getHtmlInStorageToPdf**](PdfApi.md#getHtmlInStorageToPdf) | **GET** /pdf/create/html | Convert HTML file (located on storage) to PDF format and return resulting file in response. 
[**getImage**](PdfApi.md#getImage) | **GET** /pdf/{name}/images/{imageId} | Read document image by ID.
[**getImageExtractAsGif**](PdfApi.md#getImageExtractAsGif) | **GET** /pdf/{name}/images/{imageId}/extract/gif | Extract document image in GIF format
[**getImageExtractAsJpeg**](PdfApi.md#getImageExtractAsJpeg) | **GET** /pdf/{name}/images/{imageId}/extract/jpeg | Extract document image in JPEG format
[**getImageExtractAsPng**](PdfApi.md#getImageExtractAsPng) | **GET** /pdf/{name}/images/{imageId}/extract/png | Extract document image in PNG format
[**getImageExtractAsTiff**](PdfApi.md#getImageExtractAsTiff) | **GET** /pdf/{name}/images/{imageId}/extract/tiff | Extract document image in TIFF format
[**getImages**](PdfApi.md#getImages) | **GET** /pdf/{name}/pages/{pageNumber}/images | Read document images.
[**getLaTeXInStorageToPdf**](PdfApi.md#getLaTeXInStorageToPdf) | **GET** /pdf/create/latex | Convert LaTeX file (located on storage) to PDF format and return resulting file in response. 
[**getLinkAnnotation**](PdfApi.md#getLinkAnnotation) | **GET** /pdf/{name}/links/{linkId} | Read document link annotation by ID.
[**getMhtInStorageToPdf**](PdfApi.md#getMhtInStorageToPdf) | **GET** /pdf/create/mht | Convert MHT file (located on storage) to PDF format and return resulting file in response. 
[**getPage**](PdfApi.md#getPage) | **GET** /pdf/{name}/pages/{pageNumber} | Read document page info.
[**getPageAnnotations**](PdfApi.md#getPageAnnotations) | **GET** /pdf/{name}/pages/{pageNumber}/annotations | Read documant page annotations. Returns only FreeTextAnnotations, TextAnnotations, other annotations will implemented next releases.
[**getPageConvertToBmp**](PdfApi.md#getPageConvertToBmp) | **GET** /pdf/{name}/pages/{pageNumber}/convert/bmp | Convert document page to Bmp image and return resulting file in response.
[**getPageConvertToEmf**](PdfApi.md#getPageConvertToEmf) | **GET** /pdf/{name}/pages/{pageNumber}/convert/emf | Convert document page to Emf image and return resulting file in response.
[**getPageConvertToGif**](PdfApi.md#getPageConvertToGif) | **GET** /pdf/{name}/pages/{pageNumber}/convert/gif | Convert document page to Gif image and return resulting file in response.
[**getPageConvertToJpeg**](PdfApi.md#getPageConvertToJpeg) | **GET** /pdf/{name}/pages/{pageNumber}/convert/jpeg | Convert document page to Jpeg image and return resulting file in response.
[**getPageConvertToPng**](PdfApi.md#getPageConvertToPng) | **GET** /pdf/{name}/pages/{pageNumber}/convert/png | Convert document page to Png image and return resulting file in response.
[**getPageConvertToTiff**](PdfApi.md#getPageConvertToTiff) | **GET** /pdf/{name}/pages/{pageNumber}/convert/tiff | Convert document page to Tiff image  and return resulting file in response.
[**getPageFreeTextAnnotations**](PdfApi.md#getPageFreeTextAnnotations) | **GET** /pdf/{name}/pages/{pageNumber}/annotations/freetext | Read document page free text annotations.
[**getPageLinkAnnotation**](PdfApi.md#getPageLinkAnnotation) | **GET** /pdf/{name}/pages/{pageNumber}/links/{linkId} | Read document page link annotation by ID.
[**getPageLinkAnnotations**](PdfApi.md#getPageLinkAnnotations) | **GET** /pdf/{name}/pages/{pageNumber}/links | Read document page link annotations.
[**getPageText**](PdfApi.md#getPageText) | **GET** /pdf/{name}/pages/{pageNumber}/text | Read page text items.
[**getPageTextAnnotations**](PdfApi.md#getPageTextAnnotations) | **GET** /pdf/{name}/pages/{pageNumber}/annotations/text | Read document page text annotations.
[**getPages**](PdfApi.md#getPages) | **GET** /pdf/{name}/pages | Read document pages info.
[**getPclInStorageToPdf**](PdfApi.md#getPclInStorageToPdf) | **GET** /pdf/create/pcl | Convert PCL file (located on storage) to PDF format and return resulting file in response. 
[**getPdfInStorageToDoc**](PdfApi.md#getPdfInStorageToDoc) | **GET** /pdf/{name}/convert/doc | Converts PDF document (located on storage) to DOC format and returns resulting file in response content
[**getPdfInStorageToEpub**](PdfApi.md#getPdfInStorageToEpub) | **GET** /pdf/{name}/convert/epub | Converts PDF document (located on storage) to EPUB format and returns resulting file in response content
[**getPdfInStorageToHtml**](PdfApi.md#getPdfInStorageToHtml) | **GET** /pdf/{name}/convert/html | Converts PDF document (located on storage) to Html format and returns resulting file in response content
[**getPdfInStorageToLaTeX**](PdfApi.md#getPdfInStorageToLaTeX) | **GET** /pdf/{name}/convert/latex | Converts PDF document (located on storage) to LaTeX format and returns resulting file in response content
[**getPdfInStorageToMobiXml**](PdfApi.md#getPdfInStorageToMobiXml) | **GET** /pdf/{name}/convert/mobixml | Converts PDF document (located on storage) to MOBIXML format and returns resulting file in response content
[**getPdfInStorageToPdfA**](PdfApi.md#getPdfInStorageToPdfA) | **GET** /pdf/{name}/convert/pdfa | Converts PDF document (located on storage) to PdfA format and returns resulting file in response content
[**getPdfInStorageToPptx**](PdfApi.md#getPdfInStorageToPptx) | **GET** /pdf/{name}/convert/pptx | Converts PDF document (located on storage) to PPTX format and returns resulting file in response content
[**getPdfInStorageToSvg**](PdfApi.md#getPdfInStorageToSvg) | **GET** /pdf/{name}/convert/svg | Converts PDF document (located on storage) to SVG format and returns resulting file in response content
[**getPdfInStorageToTiff**](PdfApi.md#getPdfInStorageToTiff) | **GET** /pdf/{name}/convert/tiff | Converts PDF document (located on storage) to TIFF format and returns resulting file in response content
[**getPdfInStorageToXls**](PdfApi.md#getPdfInStorageToXls) | **GET** /pdf/{name}/convert/xls | Converts PDF document (located on storage) to XLS format and returns resulting file in response content
[**getPdfInStorageToXml**](PdfApi.md#getPdfInStorageToXml) | **GET** /pdf/{name}/convert/xml | Converts PDF document (located on storage) to XML format and returns resulting file in response content
[**getPdfInStorageToXps**](PdfApi.md#getPdfInStorageToXps) | **GET** /pdf/{name}/convert/xps | Converts PDF document (located on storage) to XPS format and returns resulting file in response content
[**getPsInStorageToPdf**](PdfApi.md#getPsInStorageToPdf) | **GET** /pdf/create/ps | Convert PS file (located on storage) to PDF format and return resulting file in response. 
[**getSvgInStorageToPdf**](PdfApi.md#getSvgInStorageToPdf) | **GET** /pdf/create/svg | Convert SVG file (located on storage) to PDF format and return resulting file in response. 
[**getText**](PdfApi.md#getText) | **GET** /pdf/{name}/text | Read document text.
[**getTextAnnotation**](PdfApi.md#getTextAnnotation) | **GET** /pdf/{name}/annotations/text/{annotationId} | Read document page text annotation by ID.
[**getVerifySignature**](PdfApi.md#getVerifySignature) | **GET** /pdf/{name}/verifySignature | Verify signature document.
[**getWebInStorageToPdf**](PdfApi.md#getWebInStorageToPdf) | **GET** /pdf/create/web | Convert web page to PDF format and return resulting file in response. 
[**getWordsPerPage**](PdfApi.md#getWordsPerPage) | **GET** /pdf/{name}/pages/wordCount | Get number of words per document page.
[**getXfaPdfInStorageToAcroForm**](PdfApi.md#getXfaPdfInStorageToAcroForm) | **GET** /pdf/{name}/convert/xfatoacroform | Converts PDF document which contatins XFA form (located on storage) to PDF with AcroForm and returns resulting file response content
[**getXmlInStorageToPdf**](PdfApi.md#getXmlInStorageToPdf) | **GET** /pdf/create/xml | Convert XML file (located on storage) to PDF format and return resulting file in response. 
[**getXpsInStorageToPdf**](PdfApi.md#getXpsInStorageToPdf) | **GET** /pdf/create/xps | Convert XPS file (located on storage) to PDF format and return resulting file in response. 
[**getXslFoInStorageToPdf**](PdfApi.md#getXslFoInStorageToPdf) | **GET** /pdf/create/xslfo | Convert XslFo file (located on storage) to PDF format and return resulting file in response. 
[**postAppendDocument**](PdfApi.md#postAppendDocument) | **POST** /pdf/{name}/appendDocument | Append document to existing one.
[**postCreateField**](PdfApi.md#postCreateField) | **POST** /pdf/{name}/fields | Create field.
[**postDocumentTextReplace**](PdfApi.md#postDocumentTextReplace) | **POST** /pdf/{name}/text/replace | Document&#39;s replace text method.
[**postInsertImage**](PdfApi.md#postInsertImage) | **POST** /pdf/{name}/pages/{pageNumber}/images | Insert image to document page.
[**postMovePage**](PdfApi.md#postMovePage) | **POST** /pdf/{name}/pages/{pageNumber}/movePage | Move page to new position.
[**postOptimizeDocument**](PdfApi.md#postOptimizeDocument) | **POST** /pdf/{name}/optimize | Optimize document.
[**postPageFreeTextAnnotations**](PdfApi.md#postPageFreeTextAnnotations) | **POST** /pdf/{name}/pages/{pageNumber}/annotations/freetext | Add document page free text annotations.
[**postPageLinkAnnotations**](PdfApi.md#postPageLinkAnnotations) | **POST** /pdf/{name}/pages/{pageNumber}/links | Add document page link annotations.
[**postPageTextAnnotations**](PdfApi.md#postPageTextAnnotations) | **POST** /pdf/{name}/pages/{pageNumber}/annotations/text | Add document page text annotations.
[**postPageTextReplace**](PdfApi.md#postPageTextReplace) | **POST** /pdf/{name}/pages/{pageNumber}/text/replace | Page&#39;s replace text method.
[**postSignDocument**](PdfApi.md#postSignDocument) | **POST** /pdf/{name}/sign | Sign document.
[**postSignPage**](PdfApi.md#postSignPage) | **POST** /pdf/{name}/pages/{pageNumber}/sign | Sign page.
[**postSplitDocument**](PdfApi.md#postSplitDocument) | **POST** /pdf/{name}/split | Split document to parts.
[**putAddNewPage**](PdfApi.md#putAddNewPage) | **PUT** /pdf/{name}/pages | Add new page to end of the document.
[**putAddText**](PdfApi.md#putAddText) | **PUT** /pdf/{name}/pages/{pageNumber}/text | Add text to PDF document page.
[**putCreate**](PdfApi.md#putCreate) | **PUT** /storage/file | Upload a specific file 
[**putCreateDocument**](PdfApi.md#putCreateDocument) | **PUT** /pdf/{name} | Create empty document.
[**putEpubInStorageToPdf**](PdfApi.md#putEpubInStorageToPdf) | **PUT** /pdf/{name}/create/epub | Convert EPUB file (located on storage) to PDF format and upload resulting file to storage. 
[**putFieldsFlatten**](PdfApi.md#putFieldsFlatten) | **PUT** /pdf/{name}/fields/flatten | Flatten form fields in document.
[**putFreeTextAnnotation**](PdfApi.md#putFreeTextAnnotation) | **PUT** /pdf/{name}/annotations/freetext/{annotationId} | Replace document free text annotation
[**putHtmlInStorageToPdf**](PdfApi.md#putHtmlInStorageToPdf) | **PUT** /pdf/{name}/create/html | Convert HTML file (located on storage) to PDF format and upload resulting file to storage. 
[**putImageExtractAsGif**](PdfApi.md#putImageExtractAsGif) | **PUT** /pdf/{name}/images/{imageId}/extract/gif | Extract document image in GIF format to folder
[**putImageExtractAsJpeg**](PdfApi.md#putImageExtractAsJpeg) | **PUT** /pdf/{name}/images/{imageId}/extract/jpeg | Extract document image in JPEG format to folder
[**putImageExtractAsPng**](PdfApi.md#putImageExtractAsPng) | **PUT** /pdf/{name}/images/{imageId}/extract/png | Extract document image in PNG format to folder
[**putImageExtractAsTiff**](PdfApi.md#putImageExtractAsTiff) | **PUT** /pdf/{name}/images/{imageId}/extract/tiff | Extract document image in TIFF format to folder
[**putImageInStorageToPdf**](PdfApi.md#putImageInStorageToPdf) | **PUT** /pdf/{name}/create/images | Convert image file (located on storage) to PDF format and upload resulting file to storage. 
[**putImagesExtractAsGif**](PdfApi.md#putImagesExtractAsGif) | **PUT** /pdf/{name}/pages/{pageNumber}/images/extract/gif | Extract document images in GIF format to folder.
[**putImagesExtractAsJpeg**](PdfApi.md#putImagesExtractAsJpeg) | **PUT** /pdf/{name}/pages/{pageNumber}/images/extract/jpeg | Extract document images in JPEG format to folder.
[**putImagesExtractAsPng**](PdfApi.md#putImagesExtractAsPng) | **PUT** /pdf/{name}/pages/{pageNumber}/images/extract/png | Extract document images in PNG format to folder.
[**putImagesExtractAsTiff**](PdfApi.md#putImagesExtractAsTiff) | **PUT** /pdf/{name}/pages/{pageNumber}/images/extract/tiff | Extract document images in TIFF format to folder.
[**putLaTeXInStorageToPdf**](PdfApi.md#putLaTeXInStorageToPdf) | **PUT** /pdf/{name}/create/latex | Convert LaTeX file (located on storage) to PDF format and upload resulting file to storage. 
[**putLinkAnnotation**](PdfApi.md#putLinkAnnotation) | **PUT** /pdf/{name}/links/{linkId} | Replace document page link annotations
[**putMergeDocuments**](PdfApi.md#putMergeDocuments) | **PUT** /pdf/{name}/merge | Merge a list of documents.
[**putMhtInStorageToPdf**](PdfApi.md#putMhtInStorageToPdf) | **PUT** /pdf/{name}/create/mht | Convert MHT file (located on storage) to PDF format and upload resulting file to storage. 
[**putPageAddStamp**](PdfApi.md#putPageAddStamp) | **PUT** /pdf/{name}/pages/{pageNumber}/stamp | Add page stamp.
[**putPageConvertToBmp**](PdfApi.md#putPageConvertToBmp) | **PUT** /pdf/{name}/pages/{pageNumber}/convert/bmp | Convert document page to bmp image and upload resulting file to storage.
[**putPageConvertToEmf**](PdfApi.md#putPageConvertToEmf) | **PUT** /pdf/{name}/pages/{pageNumber}/convert/emf | Convert document page to emf image and upload resulting file to storage.
[**putPageConvertToGif**](PdfApi.md#putPageConvertToGif) | **PUT** /pdf/{name}/pages/{pageNumber}/convert/gif | Convert document page to gif image and upload resulting file to storage.
[**putPageConvertToJpeg**](PdfApi.md#putPageConvertToJpeg) | **PUT** /pdf/{name}/pages/{pageNumber}/convert/jpeg | Convert document page to Jpeg image and upload resulting file to storage.
[**putPageConvertToPng**](PdfApi.md#putPageConvertToPng) | **PUT** /pdf/{name}/pages/{pageNumber}/convert/png | Convert document page to png image and upload resulting file to storage.
[**putPageConvertToTiff**](PdfApi.md#putPageConvertToTiff) | **PUT** /pdf/{name}/pages/{pageNumber}/convert/tiff | Convert document page to Tiff image and upload resulting file to storage.
[**putPclInStorageToPdf**](PdfApi.md#putPclInStorageToPdf) | **PUT** /pdf/{name}/create/pcl | Convert PCL file (located on storage) to PDF format and upload resulting file to storage. 
[**putPdfInRequestToDoc**](PdfApi.md#putPdfInRequestToDoc) | **PUT** /pdf/convert/doc | Converts PDF document (in request content) to DOC format and uploads resulting file to storage.
[**putPdfInRequestToEpub**](PdfApi.md#putPdfInRequestToEpub) | **PUT** /pdf/convert/epub | Converts PDF document (in request content) to EPUB format and uploads resulting file to storage.
[**putPdfInRequestToHtml**](PdfApi.md#putPdfInRequestToHtml) | **PUT** /pdf/convert/html | Converts PDF document (in request content) to Html format and uploads resulting file to storage.
[**putPdfInRequestToLaTeX**](PdfApi.md#putPdfInRequestToLaTeX) | **PUT** /pdf/convert/latex | Converts PDF document (in request content) to LaTeX format and uploads resulting file to storage.
[**putPdfInRequestToMobiXml**](PdfApi.md#putPdfInRequestToMobiXml) | **PUT** /pdf/convert/mobixml | Converts PDF document (in request content) to MOBIXML format and uploads resulting file to storage.
[**putPdfInRequestToPdfA**](PdfApi.md#putPdfInRequestToPdfA) | **PUT** /pdf/convert/pdfa | Converts PDF document (in request content) to PdfA format and uploads resulting file to storage.
[**putPdfInRequestToPptx**](PdfApi.md#putPdfInRequestToPptx) | **PUT** /pdf/convert/pptx | Converts PDF document (in request content) to PPTX format and uploads resulting file to storage.
[**putPdfInRequestToSvg**](PdfApi.md#putPdfInRequestToSvg) | **PUT** /pdf/convert/svg | Converts PDF document (in request content) to SVG format and uploads resulting file to storage.
[**putPdfInRequestToTiff**](PdfApi.md#putPdfInRequestToTiff) | **PUT** /pdf/convert/tiff | Converts PDF document (in request content) to TIFF format and uploads resulting file to storage.
[**putPdfInRequestToXls**](PdfApi.md#putPdfInRequestToXls) | **PUT** /pdf/convert/xls | Converts PDF document (in request content) to XLS format and uploads resulting file to storage.
[**putPdfInRequestToXml**](PdfApi.md#putPdfInRequestToXml) | **PUT** /pdf/convert/xml | Converts PDF document (in request content) to XML format and uploads resulting file to storage.
[**putPdfInRequestToXps**](PdfApi.md#putPdfInRequestToXps) | **PUT** /pdf/convert/xps | Converts PDF document (in request content) to XPS format and uploads resulting file to storage.
[**putPdfInStorageToDoc**](PdfApi.md#putPdfInStorageToDoc) | **PUT** /pdf/{name}/convert/doc | Converts PDF document (located on storage) to DOC format and uploads resulting file to storage
[**putPdfInStorageToEpub**](PdfApi.md#putPdfInStorageToEpub) | **PUT** /pdf/{name}/convert/epub | Converts PDF document (located on storage) to EPUB format and uploads resulting file to storage
[**putPdfInStorageToHtml**](PdfApi.md#putPdfInStorageToHtml) | **PUT** /pdf/{name}/convert/html | Converts PDF document (located on storage) to Html format and uploads resulting file to storage
[**putPdfInStorageToLaTeX**](PdfApi.md#putPdfInStorageToLaTeX) | **PUT** /pdf/{name}/convert/latex | Converts PDF document (located on storage) to LaTeX format and uploads resulting file to storage
[**putPdfInStorageToMobiXml**](PdfApi.md#putPdfInStorageToMobiXml) | **PUT** /pdf/{name}/convert/mobixml | Converts PDF document (located on storage) to MOBIXML format and uploads resulting file to storage
[**putPdfInStorageToPdfA**](PdfApi.md#putPdfInStorageToPdfA) | **PUT** /pdf/{name}/convert/pdfa | Converts PDF document (located on storage) to PdfA format and uploads resulting file to storage
[**putPdfInStorageToPptx**](PdfApi.md#putPdfInStorageToPptx) | **PUT** /pdf/{name}/convert/pptx | Converts PDF document (located on storage) to PPTX format and uploads resulting file to storage
[**putPdfInStorageToSvg**](PdfApi.md#putPdfInStorageToSvg) | **PUT** /pdf/{name}/convert/svg | Converts PDF document (located on storage) to SVG format and uploads resulting file to storage
[**putPdfInStorageToTiff**](PdfApi.md#putPdfInStorageToTiff) | **PUT** /pdf/{name}/convert/tiff | Converts PDF document (located on storage) to TIFF format and uploads resulting file to storage
[**putPdfInStorageToXls**](PdfApi.md#putPdfInStorageToXls) | **PUT** /pdf/{name}/convert/xls | Converts PDF document (located on storage) to XLS format and uploads resulting file to storage
[**putPdfInStorageToXml**](PdfApi.md#putPdfInStorageToXml) | **PUT** /pdf/{name}/convert/xml | Converts PDF document (located on storage) to XML format and uploads resulting file to storage
[**putPdfInStorageToXps**](PdfApi.md#putPdfInStorageToXps) | **PUT** /pdf/{name}/convert/xps | Converts PDF document (located on storage) to XPS format and uploads resulting file to storage
[**putPrivileges**](PdfApi.md#putPrivileges) | **PUT** /pdf/{name}/privileges | Update privilege document.
[**putPsInStorageToPdf**](PdfApi.md#putPsInStorageToPdf) | **PUT** /pdf/{name}/create/ps | Convert PS file (located on storage) to PDF format and upload resulting file to storage. 
[**putReplaceImage**](PdfApi.md#putReplaceImage) | **PUT** /pdf/{name}/images/{imageId} | Replace document image.
[**putSearchableDocument**](PdfApi.md#putSearchableDocument) | **PUT** /pdf/{name}/ocr | Create searchable PDF document. Generate OCR layer for images in input PDF document.
[**putSetProperty**](PdfApi.md#putSetProperty) | **PUT** /pdf/{name}/documentproperties/{propertyName} | Add/update document property.
[**putSvgInStorageToPdf**](PdfApi.md#putSvgInStorageToPdf) | **PUT** /pdf/{name}/create/svg | Convert SVG file (located on storage) to PDF format and upload resulting file to storage. 
[**putTextAnnotation**](PdfApi.md#putTextAnnotation) | **PUT** /pdf/{name}/annotations/text/{annotationId} | Replace document text annotation
[**putUpdateField**](PdfApi.md#putUpdateField) | **PUT** /pdf/{name}/fields/{fieldName} | Update field.
[**putUpdateFields**](PdfApi.md#putUpdateFields) | **PUT** /pdf/{name}/fields | Update fields.
[**putWebInStorageToPdf**](PdfApi.md#putWebInStorageToPdf) | **PUT** /pdf/{name}/create/web | Convert web page to PDF format and upload resulting file to storage. 
[**putXfaPdfInRequestToAcroForm**](PdfApi.md#putXfaPdfInRequestToAcroForm) | **PUT** /pdf/convert/xfatoacroform | Converts PDF document which contatins XFA form (in request content) to PDF with AcroForm and uploads resulting file to storage.
[**putXfaPdfInStorageToAcroForm**](PdfApi.md#putXfaPdfInStorageToAcroForm) | **PUT** /pdf/{name}/convert/xfatoacroform | Converts PDF document which contatins XFA form (located on storage) to PDF with AcroForm and uploads resulting file to storage
[**putXmlInStorageToPdf**](PdfApi.md#putXmlInStorageToPdf) | **PUT** /pdf/{name}/create/xml | Convert XML file (located on storage) to PDF format and upload resulting file to storage. 
[**putXpsInStorageToPdf**](PdfApi.md#putXpsInStorageToPdf) | **PUT** /pdf/{name}/create/xps | Convert XPS file (located on storage) to PDF format and upload resulting file to storage. 
[**putXslFoInStorageToPdf**](PdfApi.md#putXslFoInStorageToPdf) | **PUT** /pdf/{name}/create/xslfo | Convert XslFo file (located on storage) to PDF format and upload resulting file to storage. 


<a name="deleteAnnotation"></a>
# **deleteAnnotation**
> AsposeResponse deleteAnnotation(name, annotationId, storage, folder)

Delete document annotation by ID

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDocumentAnnotations"></a>
# **deleteDocumentAnnotations**
> AsposeResponse deleteDocumentAnnotations(name, storage, folder)

Delete all annotations from the document

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDocumentLinkAnnotations"></a>
# **deleteDocumentLinkAnnotations**
> AsposeResponse deleteDocumentLinkAnnotations(name, storage, folder)

Delete all link annotations from the document

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteField"></a>
# **deleteField**
> AsposeResponse deleteField(name, fieldName, storage, folder)

Delete document field by name.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fieldName** | **String**| The field name/ |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteImage"></a>
# **deleteImage**
> AsposeResponse deleteImage(name, imageId, storage, folder)

Delete image from document page.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLinkAnnotation"></a>
# **deleteLinkAnnotation**
> AsposeResponse deleteLinkAnnotation(name, linkId, storage, folder)

Delete document page link annotation by ID

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **linkId** | **String**| The link ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePage"></a>
# **deletePage**
> AsposeResponse deletePage(name, pageNumber, storage, folder)

Delete document page by its number.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePageAnnotations"></a>
# **deletePageAnnotations**
> AsposeResponse deletePageAnnotations(name, pageNumber, storage, folder)

Delete all annotations from the page

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePageLinkAnnotations"></a>
# **deletePageLinkAnnotations**
> AsposeResponse deletePageLinkAnnotations(name, pageNumber, storage, folder)

Delete all link annotations from the page

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProperties"></a>
# **deleteProperties**
> AsposeResponse deleteProperties(name, storage, folder)

Delete custom document properties.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **storage** | **String**|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProperty"></a>
# **deleteProperty**
> AsposeResponse deleteProperty(name, propertyName, storage, folder)

Delete document property.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **propertyName** | **String**|  |
 **storage** | **String**|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocument"></a>
# **getDocument**
> DocumentResponse getDocument(name, storage, folder)

Read common document info.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getDocumentAnnotations"></a>
# **getDocumentAnnotations**
> AnnotationsInfoResponse getDocumentAnnotations(name, storage, folder)

Read documant page annotations. Returns only FreeTextAnnotations, TextAnnotations, other annotations will implemented next releases.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AnnotationsInfoResponse**](AnnotationsInfoResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentAttachmentByIndex"></a>
# **getDocumentAttachmentByIndex**
> AttachmentResponse getDocumentAttachmentByIndex(name, attachmentIndex, storage, folder)

Read document attachment info by its index.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **attachmentIndex** | **Integer**| The attachment index. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AttachmentResponse**](AttachmentResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentAttachments"></a>
# **getDocumentAttachments**
> AttachmentsResponse getDocumentAttachments(name, storage, folder)

Read document attachments info.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AttachmentsResponse**](AttachmentsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentBookmarks"></a>
# **getDocumentBookmarks**
> File getDocumentBookmarks(name, bookmarkPath, storage, folder)

Read document bookmark/bookmarks (including children).

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **bookmarkPath** | **String**| The bookmark path. Leave it empty if you want to get all the bookmarks in the document. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getDocumentFreeTextAnnotations"></a>
# **getDocumentFreeTextAnnotations**
> FreeTextAnnotationsResponse getDocumentFreeTextAnnotations(name, storage, folder)

Read document free text annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FreeTextAnnotationsResponse**](FreeTextAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentProperties"></a>
# **getDocumentProperties**
> DocumentPropertiesResponse getDocumentProperties(name, storage, folder)

Read document properties.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **storage** | **String**|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**DocumentPropertiesResponse**](DocumentPropertiesResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentProperty"></a>
# **getDocumentProperty**
> DocumentPropertyResponse getDocumentProperty(name, propertyName, storage, folder)

Read document property by name.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **propertyName** | **String**|  |
 **storage** | **String**|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**DocumentPropertyResponse**](DocumentPropertyResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocumentTextAnnotations"></a>
# **getDocumentTextAnnotations**
> TextAnnotationsResponse getDocumentTextAnnotations(name, storage, folder)

Read document text annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**TextAnnotationsResponse**](TextAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDownload"></a>
# **getDownload**
> File getDownload(path, versionId, storage)

Download a specific file 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path of the file including the file name and extension e.g. /file.ext |
 **versionId** | **String**| File&#39;s version | [optional]
 **storage** | **String**| User&#39;s storage name | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getDownloadDocumentAttachmentByIndex"></a>
# **getDownloadDocumentAttachmentByIndex**
> File getDownloadDocumentAttachmentByIndex(name, attachmentIndex, storage, folder)

Download document attachment content by its index.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **attachmentIndex** | **Integer**| The attachment index. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getEpubInStorageToPdf"></a>
# **getEpubInStorageToPdf**
> File getEpubInStorageToPdf(srcPath, storage)

Convert EPUB file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.epub) |
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getField"></a>
# **getField**
> FieldResponse getField(name, fieldName, storage, folder)

Get document field by name.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fieldName** | **String**| The field name/ |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FieldResponse**](FieldResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFields"></a>
# **getFields**
> FieldsResponse getFields(name, storage, folder)

Get document fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FieldsResponse**](FieldsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFreeTextAnnotation"></a>
# **getFreeTextAnnotation**
> FreeTextAnnotationResponse getFreeTextAnnotation(name, annotationId, storage, folder)

Read document page free text annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FreeTextAnnotationResponse**](FreeTextAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHtmlInStorageToPdf"></a>
# **getHtmlInStorageToPdf**
> File getHtmlInStorageToPdf(srcPath, htmlFileName, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop, storage)

Convert HTML file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.zip) |
 **htmlFileName** | **String**| Name of HTML file in ZIP. |
 **height** | **Double**| Page height | [optional]
 **width** | **Double**| Page width | [optional]
 **isLandscape** | **Boolean**| Is page landscaped | [optional]
 **marginLeft** | **Double**| Page margin left | [optional]
 **marginBottom** | **Double**| Page margin bottom | [optional]
 **marginRight** | **Double**| Page margin right | [optional]
 **marginTop** | **Double**| Page margin top | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getImage"></a>
# **getImage**
> ImageResponse getImage(name, imageId, storage, folder)

Read document image by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**ImageResponse**](ImageResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getImageExtractAsGif"></a>
# **getImageExtractAsGif**
> File getImageExtractAsGif(name, imageId, width, height, storage, folder)

Extract document image in GIF format

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getImageExtractAsJpeg"></a>
# **getImageExtractAsJpeg**
> File getImageExtractAsJpeg(name, imageId, width, height, storage, folder)

Extract document image in JPEG format

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getImageExtractAsPng"></a>
# **getImageExtractAsPng**
> File getImageExtractAsPng(name, imageId, width, height, storage, folder)

Extract document image in PNG format

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getImageExtractAsTiff"></a>
# **getImageExtractAsTiff**
> File getImageExtractAsTiff(name, imageId, width, height, storage, folder)

Extract document image in TIFF format

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getImages"></a>
# **getImages**
> ImagesResponse getImages(name, pageNumber, storage, folder)

Read document images.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**ImagesResponse**](ImagesResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLaTeXInStorageToPdf"></a>
# **getLaTeXInStorageToPdf**
> File getLaTeXInStorageToPdf(srcPath, storage)

Convert LaTeX file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.tex) |
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getLinkAnnotation"></a>
# **getLinkAnnotation**
> LinkAnnotationResponse getLinkAnnotation(name, linkId, storage, folder)

Read document link annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **linkId** | **String**| The link ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**LinkAnnotationResponse**](LinkAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMhtInStorageToPdf"></a>
# **getMhtInStorageToPdf**
> File getMhtInStorageToPdf(srcPath, storage)

Convert MHT file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.mht) |
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPage"></a>
# **getPage**
> DocumentPageResponse getPage(name, pageNumber, storage, folder)

Read document page info.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**DocumentPageResponse**](DocumentPageResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageAnnotations"></a>
# **getPageAnnotations**
> AnnotationsInfoResponse getPageAnnotations(name, pageNumber, storage, folder)

Read documant page annotations. Returns only FreeTextAnnotations, TextAnnotations, other annotations will implemented next releases.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AnnotationsInfoResponse**](AnnotationsInfoResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageConvertToBmp"></a>
# **getPageConvertToBmp**
> File getPageConvertToBmp(name, pageNumber, width, height, folder, storage)

Convert document page to Bmp image and return resulting file in response.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageConvertToEmf"></a>
# **getPageConvertToEmf**
> File getPageConvertToEmf(name, pageNumber, width, height, folder, storage)

Convert document page to Emf image and return resulting file in response.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageConvertToGif"></a>
# **getPageConvertToGif**
> File getPageConvertToGif(name, pageNumber, width, height, folder, storage)

Convert document page to Gif image and return resulting file in response.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageConvertToJpeg"></a>
# **getPageConvertToJpeg**
> File getPageConvertToJpeg(name, pageNumber, width, height, folder, storage)

Convert document page to Jpeg image and return resulting file in response.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageConvertToPng"></a>
# **getPageConvertToPng**
> File getPageConvertToPng(name, pageNumber, width, height, folder, storage)

Convert document page to Png image and return resulting file in response.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageConvertToTiff"></a>
# **getPageConvertToTiff**
> File getPageConvertToTiff(name, pageNumber, width, height, folder, storage)

Convert document page to Tiff image  and return resulting file in response.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageFreeTextAnnotations"></a>
# **getPageFreeTextAnnotations**
> FreeTextAnnotationsResponse getPageFreeTextAnnotations(name, pageNumber, storage, folder)

Read document page free text annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FreeTextAnnotationsResponse**](FreeTextAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageLinkAnnotation"></a>
# **getPageLinkAnnotation**
> LinkAnnotationResponse getPageLinkAnnotation(name, pageNumber, linkId, storage, folder)

Read document page link annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **linkId** | **String**| The link ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**LinkAnnotationResponse**](LinkAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageLinkAnnotations"></a>
# **getPageLinkAnnotations**
> LinkAnnotationsResponse getPageLinkAnnotations(name, pageNumber, storage, folder)

Read document page link annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**LinkAnnotationsResponse**](LinkAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageText"></a>
# **getPageText**
> TextRectsResponse getPageText(name, pageNumber, LLX, LLY, URX, URY, format, regex, splitRects, folder, storage)

Read page text items.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| Number of page (starting from 1). |
 **LLX** | **Double**|  |
 **LLY** | **Double**|  |
 **URX** | **Double**|  |
 **URY** | **Double**|  |
 **format** | [**List&lt;String&gt;**](String.md)| List of formats for search. | [optional]
 **regex** | **String**| Formats are specified as a regular expression. | [optional]
 **splitRects** | **Boolean**| Split result fragments (default is true). | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**TextRectsResponse**](TextRectsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPageTextAnnotations"></a>
# **getPageTextAnnotations**
> TextAnnotationsResponse getPageTextAnnotations(name, pageNumber, storage, folder)

Read document page text annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**TextAnnotationsResponse**](TextAnnotationsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPages"></a>
# **getPages**
> DocumentPagesResponse getPages(name, storage, folder)

Read document pages info.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**DocumentPagesResponse**](DocumentPagesResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPclInStorageToPdf"></a>
# **getPclInStorageToPdf**
> File getPclInStorageToPdf(srcPath, storage)

Convert PCL file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.pcl) |
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToDoc"></a>
# **getPdfInStorageToDoc**
> File getPdfInStorageToDoc(name, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, folder, storage)

Converts PDF document (located on storage) to DOC format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **addReturnToLineEnd** | **Boolean**| Add return to line end. | [optional]
 **format** | **String**| Allows to specify .doc or .docx file format. | [optional]
 **imageResolutionX** | **Integer**| Image resolution X. | [optional]
 **imageResolutionY** | **Integer**| Image resolution Y. | [optional]
 **maxDistanceBetweenTextLines** | **Double**| Max distance between text lines. | [optional]
 **mode** | **String**| Allows to control how a PDF document is converted into a word processing document. | [optional]
 **recognizeBullets** | **Boolean**| Recognize bullets. | [optional]
 **relativeHorizontalProximity** | **Double**| Relative horizontal proximity. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToEpub"></a>
# **getPdfInStorageToEpub**
> File getPdfInStorageToEpub(name, contentRecognitionMode, folder, storage)

Converts PDF document (located on storage) to EPUB format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **contentRecognitionMode** | **String**| ?roperty tunes conversion for this or that desirable method of recognition of content. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToHtml"></a>
# **getPdfInStorageToHtml**
> File getPdfInStorageToHtml(name, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, folder, storage)

Converts PDF document (located on storage) to Html format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **additionalMarginWidthInPoints** | **Integer**| Defines width of margin that will be forcibly left around that output HTML-areas. | [optional]
 **compressSvgGraphicsIfAny** | **Boolean**| The flag that indicates whether found SVG graphics(if any) will be compressed(zipped) into SVGZ format during saving. | [optional]
 **convertMarkedContentToLayers** | **Boolean**| If attribute ConvertMarkedContentToLayers set to true then an all elements inside a PDF marked content (layer) will be put into an HTML div with \&quot;data-pdflayer\&quot; attribute specifying a layer name. This layer name will be extracted from optional properties of PDF marked content. If this attribute is false (by default) then no any layers will be created from PDF marked content. | [optional]
 **defaultFontName** | **String**| Specifies the name of an installed font which is used to substitute any document font that is not embedded and not installed in the system. If null then default substitution font is used. | [optional]
 **documentType** | **String**| Result document type. | [optional]
 **fixedLayout** | **Boolean**| The value indicating whether that HTML is created as fixed layout. | [optional]
 **imageResolution** | **Integer**| Resolution for image rendering. | [optional]
 **minimalLineWidth** | **Integer**| This attribute sets minimal width of graphic path line. If thickness of line is less than 1px Adobe Acrobat rounds it to this value. So this attribute can be used to emulate this behavior for HTML browsers. | [optional]
 **preventGlyphsGrouping** | **Boolean**| This attribute switch on the mode when text glyphs will not be grouped into words and strings This mode allows to keep maximum precision during positioning of glyphs on the page and it can be used for conversion documents with music notes or glyphs that should be placed separately each other. This parameter will be applied to document only when the value of FixedLayout attribute is true. | [optional]
 **splitCssIntoPages** | **Boolean**| When multipage-mode selected(i.e &#39;SplitIntoPages&#39; is &#39;true&#39;), then this attribute defines whether should be created separate CSS-file for each result HTML page. | [optional]
 **splitIntoPages** | **Boolean**| The flag that indicates whether each page of source document will be converted into it&#39;s own target HTML document, i.e whether result HTML will be splitted into several HTML-pages. | [optional]
 **useZOrder** | **Boolean**| If attribute UseZORder set to true, graphics and text are added to resultant HTML document accordingly Z-order in original PDF document. If this attribute is false all graphics is put as single layer which may cause some unnecessary effects for overlapped objects. | [optional]
 **antialiasingProcessing** | **String**| The parameter defines required antialiasing measures during conversion of compound background images from PDF to HTML. | [optional]
 **cssClassNamesPrefix** | **String**| When PDFtoHTML converter generates result CSSs, CSS class names (something like \&quot;.stl_01 {}\&quot; ... \&quot;.stl_NN {}) are generated and used in result CSS. This property allows forcibly set class name prefix. | [optional]
 **explicitListOfSavedPages** | [**List&lt;Integer&gt;**](Integer.md)| With this property You can explicitely define what pages of document should be converted. Pages in this list must have 1-based numbers. I.e. valid numbers of pages must be taken from range (1...[NumberOfPagesInConvertedDocument]) Order of appearing of pages in this list does not affect their order in result HTML page(s) - in result pages allways will go in order in which they are present in source PDF. | [optional]
 **fontEncodingStrategy** | **String**| Defines encoding special rule to tune PDF decoding for current document. | [optional]
 **fontSavingMode** | **String**| Defines font saving mode that will be used during saving of PDF to desirable format. | [optional]
 **htmlMarkupGenerationMode** | **String**| Sometimes specific reqirments to generation of HTML markup are present. This parameter defines HTML preparing modes that can be used during conversion of PDF to HTML to match such specific requirments. | [optional]
 **lettersPositioningMethod** | **String**| The mode of positioning of letters in words in result HTML. | [optional]
 **pagesFlowTypeDependsOnViewersScreenSize** | **Boolean**| If attribute &#39;SplitOnPages&#x3D;false&#39;, than whole HTML representing all input PDF pages will be put into one big result HTML file. This flag defines whether result HTML will be generated in such way that flow of areas that represent PDF pages in result HTML will depend on screen resolution of viewer. | [optional]
 **partsEmbeddingMode** | **String**| It defines whether referenced files (HTML, Fonts,Images, CSSes) will be embedded into main HTML file or will be generated as apart binary entities. | [optional]
 **rasterImagesSavingMode** | **String**| Converted PDF can contain raster images This parameter defines how they should be handled during conversion of PDF to HTML. | [optional]
 **removeEmptyAreasOnTopAndBottom** | **Boolean**| Defines whether in created HTML will be removed top and bottom empty area without any content (if any). | [optional]
 **saveShadowedTextsAsTransparentTexts** | **Boolean**| Pdf can contain texts that are shadowed by another elements (f.e. by images) but can be selected to clipboard in Acrobat Reader (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML to mimic behaviour of Acrobat Reader (othervise such texts are usually saved as hidden, not available for copying to clipboard). | [optional]
 **saveTransparentTexts** | **Boolean**| Pdf can contain transparent texts that can be selected to clipboard (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML. | [optional]
 **specialFolderForAllImages** | **String**| The path to directory to which must be saved any images if they are encountered during saving of document as HTML. If parameter is empty or null then image files(if any) wil be saved together with other files linked to HTML It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. | [optional]
 **specialFolderForSvgImages** | **String**| The path to directory to which must be saved only SVG-images if they are encountered during saving of document as HTML. If parameter is empty or null then SVG files(if any) wil be saved together with other image-files (near to output file) or in special folder for images (if it specified in SpecialImagesFolderIfAny option). It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. | [optional]
 **trySaveTextUnderliningAndStrikeoutingInCss** | **Boolean**| PDF itself does not contain underlining markers for texts. It emulated with line situated under text. This option allows converter try guess that this or that line is a text&#39;s underlining and put this info into CSS instead of drawing of underlining graphically. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToLaTeX"></a>
# **getPdfInStorageToLaTeX**
> File getPdfInStorageToLaTeX(name, pagesCount, folder, storage)

Converts PDF document (located on storage) to LaTeX format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pagesCount** | **Integer**| Pages count. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToMobiXml"></a>
# **getPdfInStorageToMobiXml**
> File getPdfInStorageToMobiXml(name, folder, storage)

Converts PDF document (located on storage) to MOBIXML format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToPdfA"></a>
# **getPdfInStorageToPdfA**
> File getPdfInStorageToPdfA(name, type, folder, storage)

Converts PDF document (located on storage) to PdfA format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **type** | **String**| Type of PdfA format. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToPptx"></a>
# **getPdfInStorageToPptx**
> File getPdfInStorageToPptx(name, separateImages, slidesAsImages, folder, storage)

Converts PDF document (located on storage) to PPTX format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **separateImages** | **Boolean**| Separate images. | [optional]
 **slidesAsImages** | **Boolean**| Slides as images. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToSvg"></a>
# **getPdfInStorageToSvg**
> File getPdfInStorageToSvg(name, compressOutputToZipArchive, folder, storage)

Converts PDF document (located on storage) to SVG format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **compressOutputToZipArchive** | **Boolean**| Specifies whether output will be created as one zip-archive. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToTiff"></a>
# **getPdfInStorageToTiff**
> File getPdfInStorageToTiff(name, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, folder, storage)

Converts PDF document (located on storage) to TIFF format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **brightness** | **Double**| Image brightness. | [optional]
 **compression** | **String**| Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. | [optional]
 **colorDepth** | **String**| Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. | [optional]
 **leftMargin** | **Integer**| Left image margin. | [optional]
 **rightMargin** | **Integer**| Right image margin. | [optional]
 **topMargin** | **Integer**| Top image margin. | [optional]
 **bottomMargin** | **Integer**| Bottom image margin. | [optional]
 **orientation** | **String**| Image orientation. Possible values are: None, Landscape, Portait. | [optional]
 **skipBlankPages** | **Boolean**| Skip blank pages flag. | [optional]
 **width** | **Integer**| Image width. | [optional]
 **height** | **Integer**| Image height. | [optional]
 **xResolution** | **Integer**| Horizontal resolution. | [optional]
 **yResolution** | **Integer**| Vertical resolution. | [optional]
 **pageIndex** | **Integer**| Start page to export. | [optional]
 **pageCount** | **Integer**| Number of pages to export. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToXls"></a>
# **getPdfInStorageToXls**
> File getPdfInStorageToXls(name, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, folder, storage)

Converts PDF document (located on storage) to XLS format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **insertBlankColumnAtFirst** | **Boolean**| Insert blank column at first | [optional]
 **minimizeTheNumberOfWorksheets** | **Boolean**| Minimize the number of worksheets | [optional]
 **scaleFactor** | **Double**| Scale factor | [optional]
 **uniformWorksheets** | **Boolean**| Uniform worksheets | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToXml"></a>
# **getPdfInStorageToXml**
> File getPdfInStorageToXml(name, folder, storage)

Converts PDF document (located on storage) to XML format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPdfInStorageToXps"></a>
# **getPdfInStorageToXps**
> File getPdfInStorageToXps(name, folder, storage)

Converts PDF document (located on storage) to XPS format and returns resulting file in response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getPsInStorageToPdf"></a>
# **getPsInStorageToPdf**
> File getPsInStorageToPdf(srcPath, storage)

Convert PS file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.ps) |
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getSvgInStorageToPdf"></a>
# **getSvgInStorageToPdf**
> File getSvgInStorageToPdf(srcPath, adjustPageSize, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop, storage)

Convert SVG file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.svg) |
 **adjustPageSize** | **Boolean**| Adjust page size | [optional]
 **height** | **Double**| Page height | [optional]
 **width** | **Double**| Page width | [optional]
 **isLandscape** | **Boolean**| Is page landscaped | [optional]
 **marginLeft** | **Double**| Page margin left | [optional]
 **marginBottom** | **Double**| Page margin bottom | [optional]
 **marginRight** | **Double**| Page margin right | [optional]
 **marginTop** | **Double**| Page margin top | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getText"></a>
# **getText**
> TextRectsResponse getText(name, LLX, LLY, URX, URY, format, regex, splitRects, folder, storage)

Read document text.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **LLX** | **Double**|  |
 **LLY** | **Double**|  |
 **URX** | **Double**|  |
 **URY** | **Double**|  |
 **format** | [**List&lt;String&gt;**](String.md)| List of formats for search. | [optional]
 **regex** | **String**| Formats are specified as a regular expression. | [optional]
 **splitRects** | **Boolean**| Split result fragments (default is true). | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**TextRectsResponse**](TextRectsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTextAnnotation"></a>
# **getTextAnnotation**
> TextAnnotationResponse getTextAnnotation(name, annotationId, storage, folder)

Read document page text annotation by ID.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**TextAnnotationResponse**](TextAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVerifySignature"></a>
# **getVerifySignature**
> SignatureVerifyResponse getVerifySignature(name, signName, storage, folder)

Verify signature document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **signName** | **String**| Sign name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SignatureVerifyResponse**](SignatureVerifyResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWebInStorageToPdf"></a>
# **getWebInStorageToPdf**
> File getWebInStorageToPdf(url, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop, storage)

Convert web page to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**| Source url |
 **height** | **Double**| Page height | [optional]
 **width** | **Double**| Page width | [optional]
 **isLandscape** | **Boolean**| Is page landscaped | [optional]
 **marginLeft** | **Double**| Page margin left | [optional]
 **marginBottom** | **Double**| Page margin bottom | [optional]
 **marginRight** | **Double**| Page margin right | [optional]
 **marginTop** | **Double**| Page margin top | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getWordsPerPage"></a>
# **getWordsPerPage**
> WordCountResponse getWordsPerPage(name, storage, folder)

Get number of words per document page.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**WordCountResponse**](WordCountResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getXfaPdfInStorageToAcroForm"></a>
# **getXfaPdfInStorageToAcroForm**
> File getXfaPdfInStorageToAcroForm(name, folder, storage)

Converts PDF document which contatins XFA form (located on storage) to PDF with AcroForm and returns resulting file response content

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getXmlInStorageToPdf"></a>
# **getXmlInStorageToPdf**
> File getXmlInStorageToPdf(srcPath, xslFilePath, storage)

Convert XML file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.xml) |
 **xslFilePath** | **String**| Full XSL source filename (ex. /folder1/folder2/template.xsl) | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getXpsInStorageToPdf"></a>
# **getXpsInStorageToPdf**
> File getXpsInStorageToPdf(srcPath, storage)

Convert XPS file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.xps) |
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getXslFoInStorageToPdf"></a>
# **getXslFoInStorageToPdf**
> File getXslFoInStorageToPdf(srcPath, storage)

Convert XslFo file (located on storage) to PDF format and return resulting file in response. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.xslfo) |
 **storage** | **String**| The document storage. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="postAppendDocument"></a>
# **postAppendDocument**
> DocumentResponse postAppendDocument(name, appendDocument, appendFile, startPage, endPage, storage, folder)

Append document to existing one.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The original document name. |
 **appendDocument** | [**AppendDocument**](AppendDocument.md)| with the append document data. | [optional]
 **appendFile** | **String**| Append file server path. | [optional]
 **startPage** | **Integer**| Appending start page. | [optional] [default to 0]
 **endPage** | **Integer**| Appending end page. | [optional] [default to 0]
 **storage** | **String**| The documents storage. | [optional]
 **folder** | **String**| The original document folder. | [optional]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCreateField"></a>
# **postCreateField**
> AsposeResponse postCreateField(name, page, field, storage, folder)

Create field.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **page** | **Integer**| Document page number. |
 **field** | [**Field**](Field.md)| with the field data. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postDocumentTextReplace"></a>
# **postDocumentTextReplace**
> TextReplaceResponse postDocumentTextReplace(name, textReplace, storage, folder)

Document&#39;s replace text method.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **textReplace** | [**TextReplaceListRequest**](TextReplaceListRequest.md)|  |
 **storage** | **String**|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**TextReplaceResponse**](TextReplaceResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postInsertImage"></a>
# **postInsertImage**
> AsposeResponse postInsertImage(name, pageNumber, llx, lly, urx, ury, imageFilePath, storage, folder, image)

Insert image to document page.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **llx** | **Double**| Coordinate lower left X. |
 **lly** | **Double**| Coordinate lower left Y. |
 **urx** | **Double**| Coordinate upper right X. |
 **ury** | **Double**| Coordinate upper right Y. |
 **imageFilePath** | **String**| Path to image file if specified. Request content is used otherwise. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **image** | [****](.md)| Image file. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postMovePage"></a>
# **postMovePage**
> AsposeResponse postMovePage(name, pageNumber, newIndex, storage, folder)

Move page to new position.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **newIndex** | **Integer**| The new page position/index. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postOptimizeDocument"></a>
# **postOptimizeDocument**
> AsposeResponse postOptimizeDocument(name, options, storage, folder)

Optimize document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **options** | [**OptimizeOptions**](OptimizeOptions.md)| The optimization options. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageFreeTextAnnotations"></a>
# **postPageFreeTextAnnotations**
> AsposeResponse postPageFreeTextAnnotations(name, pageNumber, annotations, storage, folder)

Add document page free text annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;FreeTextAnnotation&gt;**](FreeTextAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageLinkAnnotations"></a>
# **postPageLinkAnnotations**
> AsposeResponse postPageLinkAnnotations(name, pageNumber, links, storage, folder)

Add document page link annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **links** | [**List&lt;LinkAnnotation&gt;**](LinkAnnotation.md)| Array of link anotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageTextAnnotations"></a>
# **postPageTextAnnotations**
> AsposeResponse postPageTextAnnotations(name, pageNumber, annotations, storage, folder)

Add document page text annotations.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **annotations** | [**List&lt;TextAnnotation&gt;**](TextAnnotation.md)| The array of annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPageTextReplace"></a>
# **postPageTextReplace**
> TextReplaceResponse postPageTextReplace(name, pageNumber, textReplaceListRequest, storage, folder)

Page&#39;s replace text method.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **pageNumber** | **Integer**|  |
 **textReplaceListRequest** | [**TextReplaceListRequest**](TextReplaceListRequest.md)|  |
 **storage** | **String**|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**TextReplaceResponse**](TextReplaceResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSignDocument"></a>
# **postSignDocument**
> AsposeResponse postSignDocument(name, signature, storage, folder)

Sign document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **signature** | [**Signature**](Signature.md)| Signature object containing signature data. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSignPage"></a>
# **postSignPage**
> AsposeResponse postSignPage(name, pageNumber, signature, storage, folder)

Sign page.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **signature** | [**Signature**](Signature.md)| Signature object containing signature data. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSplitDocument"></a>
# **postSplitDocument**
> SplitResultResponse postSplitDocument(name, format, from, to, storage, folder)

Split document to parts.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **format** | **String**| Resulting documents format. | [optional]
 **from** | **Integer**| Start page if defined. | [optional]
 **to** | **Integer**| End page if defined. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SplitResultResponse**](SplitResultResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putAddNewPage"></a>
# **putAddNewPage**
> DocumentPagesResponse putAddNewPage(name, storage, folder)

Add new page to end of the document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**DocumentPagesResponse**](DocumentPagesResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putAddText"></a>
# **putAddText**
> AsposeResponse putAddText(name, pageNumber, paragraph, folder, storage)

Add text to PDF document page.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| Number of page (starting from 1). |
 **paragraph** | [**Paragraph**](Paragraph.md)| Paragraph data. | [optional]
 **folder** | **String**| Document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCreate"></a>
# **putCreate**
> AsposeResponse putCreate(path, file, versionId, storage)

Upload a specific file 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext |
 **file** | [****](.md)| File to upload |
 **versionId** | **String**| Source file&#39;s version | [optional]
 **storage** | **String**| User&#39;s storage name | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCreateDocument"></a>
# **putCreateDocument**
> DocumentResponse putCreateDocument(name, storage, folder)

Create empty document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The new document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The new document folder. | [optional]

### Return type

[**DocumentResponse**](DocumentResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putEpubInStorageToPdf"></a>
# **putEpubInStorageToPdf**
> AsposeResponse putEpubInStorageToPdf(name, srcPath, storage, dstFolder)

Convert EPUB file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.epub) |
 **storage** | **String**| The document storage. | [optional]
 **dstFolder** | **String**| The destination document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putFieldsFlatten"></a>
# **putFieldsFlatten**
> AsposeResponse putFieldsFlatten(name, storage, folder)

Flatten form fields in document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putFreeTextAnnotation"></a>
# **putFreeTextAnnotation**
> FreeTextAnnotationResponse putFreeTextAnnotation(name, annotationId, annotation, storage, folder)

Replace document free text annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**FreeTextAnnotation**](FreeTextAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FreeTextAnnotationResponse**](FreeTextAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putHtmlInStorageToPdf"></a>
# **putHtmlInStorageToPdf**
> AsposeResponse putHtmlInStorageToPdf(name, srcPath, htmlFileName, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop, dstFolder, storage)

Convert HTML file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.zip) |
 **htmlFileName** | **String**| Name of HTML file in ZIP. |
 **height** | **Double**| Page height | [optional]
 **width** | **Double**| Page width | [optional]
 **isLandscape** | **Boolean**| Is page landscaped | [optional]
 **marginLeft** | **Double**| Page margin left | [optional]
 **marginBottom** | **Double**| Page margin bottom | [optional]
 **marginRight** | **Double**| Page margin right | [optional]
 **marginTop** | **Double**| Page margin top | [optional]
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImageExtractAsGif"></a>
# **putImageExtractAsGif**
> AsposeResponse putImageExtractAsGif(name, imageId, width, height, storage, folder, destFolder)

Extract document image in GIF format to folder

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **destFolder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImageExtractAsJpeg"></a>
# **putImageExtractAsJpeg**
> AsposeResponse putImageExtractAsJpeg(name, imageId, width, height, storage, folder, destFolder)

Extract document image in JPEG format to folder

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **destFolder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImageExtractAsPng"></a>
# **putImageExtractAsPng**
> AsposeResponse putImageExtractAsPng(name, imageId, width, height, storage, folder, destFolder)

Extract document image in PNG format to folder

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **destFolder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImageExtractAsTiff"></a>
# **putImageExtractAsTiff**
> AsposeResponse putImageExtractAsTiff(name, imageId, width, height, storage, folder, destFolder)

Extract document image in TIFF format to folder

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| Image ID. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **destFolder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImageInStorageToPdf"></a>
# **putImageInStorageToPdf**
> AsposeResponse putImageInStorageToPdf(name, imageTemplates, dstFolder, storage)

Convert image file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageTemplates** | [**ImageTemplatesRequest**](ImageTemplatesRequest.md)| Image templates |
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImagesExtractAsGif"></a>
# **putImagesExtractAsGif**
> AsposeResponse putImagesExtractAsGif(name, pageNumber, width, height, storage, folder, destFolder)

Extract document images in GIF format to folder.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **destFolder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImagesExtractAsJpeg"></a>
# **putImagesExtractAsJpeg**
> AsposeResponse putImagesExtractAsJpeg(name, pageNumber, width, height, storage, folder, destFolder)

Extract document images in JPEG format to folder.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **storage** | **String**|  | [optional]
 **folder** | **String**| The document folder. | [optional]
 **destFolder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImagesExtractAsPng"></a>
# **putImagesExtractAsPng**
> AsposeResponse putImagesExtractAsPng(name, pageNumber, width, height, storage, folder, destFolder)

Extract document images in PNG format to folder.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **destFolder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putImagesExtractAsTiff"></a>
# **putImagesExtractAsTiff**
> AsposeResponse putImagesExtractAsTiff(name, pageNumber, width, height, storage, folder, destFolder)

Extract document images in TIFF format to folder.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **destFolder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putLaTeXInStorageToPdf"></a>
# **putLaTeXInStorageToPdf**
> AsposeResponse putLaTeXInStorageToPdf(name, srcPath, dstFolder, storage)

Convert LaTeX file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.tex) |
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putLinkAnnotation"></a>
# **putLinkAnnotation**
> LinkAnnotationResponse putLinkAnnotation(name, linkId, link, storage, folder)

Replace document page link annotations

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **linkId** | **String**| The link ID. |
 **link** | [**LinkAnnotation**](LinkAnnotation.md)| Link anotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**LinkAnnotationResponse**](LinkAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putMergeDocuments"></a>
# **putMergeDocuments**
> File putMergeDocuments(name, mergeDocuments, storage, folder)

Merge a list of documents.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Resulting documen name. |
 **mergeDocuments** | [**MergeDocuments**](MergeDocuments.md)| with a list of documents. | [optional]
 **storage** | **String**| Resulting document storage. | [optional]
 **folder** | **String**| Resulting document folder. | [optional]

### Return type

[**File**](File.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putMhtInStorageToPdf"></a>
# **putMhtInStorageToPdf**
> AsposeResponse putMhtInStorageToPdf(name, srcPath, dstFolder, storage)

Convert MHT file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.mht) |
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPageAddStamp"></a>
# **putPageAddStamp**
> AsposeResponse putPageAddStamp(name, pageNumber, stamp, storage, folder)

Add page stamp.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **stamp** | [**Stamp**](Stamp.md)| with data. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPageConvertToBmp"></a>
# **putPageConvertToBmp**
> AsposeResponse putPageConvertToBmp(name, pageNumber, outPath, width, height, folder, storage)

Convert document page to bmp image and upload resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **outPath** | **String**| The out path of result image. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPageConvertToEmf"></a>
# **putPageConvertToEmf**
> AsposeResponse putPageConvertToEmf(name, pageNumber, outPath, width, height, folder, storage)

Convert document page to emf image and upload resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **outPath** | **String**| The out path of result image. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPageConvertToGif"></a>
# **putPageConvertToGif**
> AsposeResponse putPageConvertToGif(name, pageNumber, outPath, width, height, folder, storage)

Convert document page to gif image and upload resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **outPath** | **String**| The out path of result image. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPageConvertToJpeg"></a>
# **putPageConvertToJpeg**
> AsposeResponse putPageConvertToJpeg(name, pageNumber, outPath, width, height, folder, storage)

Convert document page to Jpeg image and upload resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **outPath** | **String**| The out path of result image. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPageConvertToPng"></a>
# **putPageConvertToPng**
> AsposeResponse putPageConvertToPng(name, pageNumber, outPath, width, height, folder, storage)

Convert document page to png image and upload resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **outPath** | **String**| The out path of result image. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPageConvertToTiff"></a>
# **putPageConvertToTiff**
> AsposeResponse putPageConvertToTiff(name, pageNumber, outPath, width, height, folder, storage)

Convert document page to Tiff image and upload resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **pageNumber** | **Integer**| The page number. |
 **outPath** | **String**| The out path of result image. |
 **width** | **Integer**| The converted image width. | [optional]
 **height** | **Integer**| The converted image height. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPclInStorageToPdf"></a>
# **putPclInStorageToPdf**
> AsposeResponse putPclInStorageToPdf(name, srcPath, dstFolder, storage)

Convert PCL file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.pcl) |
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInRequestToDoc"></a>
# **putPdfInRequestToDoc**
> AsposeResponse putPdfInRequestToDoc(outPath, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, storage, file)

Converts PDF document (in request content) to DOC format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.doc) |
 **addReturnToLineEnd** | **Boolean**| Add return to line end. | [optional]
 **format** | **String**| Allows to specify .doc or .docx file format. | [optional]
 **imageResolutionX** | **Integer**| Image resolution X. | [optional]
 **imageResolutionY** | **Integer**| Image resolution Y. | [optional]
 **maxDistanceBetweenTextLines** | **Double**| Max distance between text lines. | [optional]
 **mode** | **String**| Allows to control how a PDF document is converted into a word processing document. | [optional]
 **recognizeBullets** | **Boolean**| Recognize bullets. | [optional]
 **relativeHorizontalProximity** | **Double**| Relative horizontal proximity. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **file** | [****](.md)| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInRequestToEpub"></a>
# **putPdfInRequestToEpub**
> AsposeResponse putPdfInRequestToEpub(outPath, contentRecognitionMode, storage, file)

Converts PDF document (in request content) to EPUB format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.epub) |
 **contentRecognitionMode** | **String**| ?roperty tunes conversion for this or that desirable method of recognition of content. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **file** | [****](.md)| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInRequestToHtml"></a>
# **putPdfInRequestToHtml**
> AsposeResponse putPdfInRequestToHtml(outPath, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, storage, file)

Converts PDF document (in request content) to Html format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.html) |
 **additionalMarginWidthInPoints** | **Integer**| Defines width of margin that will be forcibly left around that output HTML-areas. | [optional]
 **compressSvgGraphicsIfAny** | **Boolean**| The flag that indicates whether found SVG graphics(if any) will be compressed(zipped) into SVGZ format during saving. | [optional]
 **convertMarkedContentToLayers** | **Boolean**| If attribute ConvertMarkedContentToLayers set to true then an all elements inside a PDF marked content (layer) will be put into an HTML div with \&quot;data-pdflayer\&quot; attribute specifying a layer name. This layer name will be extracted from optional properties of PDF marked content. If this attribute is false (by default) then no any layers will be created from PDF marked content. | [optional]
 **defaultFontName** | **String**| Specifies the name of an installed font which is used to substitute any document font that is not embedded and not installed in the system. If null then default substitution font is used. | [optional]
 **documentType** | **String**| Result document type. | [optional]
 **fixedLayout** | **Boolean**| The value indicating whether that HTML is created as fixed layout. | [optional]
 **imageResolution** | **Integer**| Resolution for image rendering. | [optional]
 **minimalLineWidth** | **Integer**| This attribute sets minimal width of graphic path line. If thickness of line is less than 1px Adobe Acrobat rounds it to this value. So this attribute can be used to emulate this behavior for HTML browsers. | [optional]
 **preventGlyphsGrouping** | **Boolean**| This attribute switch on the mode when text glyphs will not be grouped into words and strings This mode allows to keep maximum precision during positioning of glyphs on the page and it can be used for conversion documents with music notes or glyphs that should be placed separately each other. This parameter will be applied to document only when the value of FixedLayout attribute is true. | [optional]
 **splitCssIntoPages** | **Boolean**| When multipage-mode selected(i.e &#39;SplitIntoPages&#39; is &#39;true&#39;), then this attribute defines whether should be created separate CSS-file for each result HTML page. | [optional]
 **splitIntoPages** | **Boolean**| The flag that indicates whether each page of source document will be converted into it&#39;s own target HTML document, i.e whether result HTML will be splitted into several HTML-pages. | [optional]
 **useZOrder** | **Boolean**| If attribute UseZORder set to true, graphics and text are added to resultant HTML document accordingly Z-order in original PDF document. If this attribute is false all graphics is put as single layer which may cause some unnecessary effects for overlapped objects. | [optional]
 **antialiasingProcessing** | **String**| The parameter defines required antialiasing measures during conversion of compound background images from PDF to HTML. | [optional]
 **cssClassNamesPrefix** | **String**| When PDFtoHTML converter generates result CSSs, CSS class names (something like \&quot;.stl_01 {}\&quot; ... \&quot;.stl_NN {}) are generated and used in result CSS. This property allows forcibly set class name prefix. | [optional]
 **explicitListOfSavedPages** | [**List&lt;Integer&gt;**](Integer.md)| With this property You can explicitely define what pages of document should be converted. Pages in this list must have 1-based numbers. I.e. valid numbers of pages must be taken from range (1...[NumberOfPagesInConvertedDocument]) Order of appearing of pages in this list does not affect their order in result HTML page(s) - in result pages allways will go in order in which they are present in source PDF. | [optional]
 **fontEncodingStrategy** | **String**| Defines encoding special rule to tune PDF decoding for current document. | [optional]
 **fontSavingMode** | **String**| Defines font saving mode that will be used during saving of PDF to desirable format. | [optional]
 **htmlMarkupGenerationMode** | **String**| Sometimes specific reqirments to generation of HTML markup are present. This parameter defines HTML preparing modes that can be used during conversion of PDF to HTML to match such specific requirments. | [optional]
 **lettersPositioningMethod** | **String**| The mode of positioning of letters in words in result HTML. | [optional]
 **pagesFlowTypeDependsOnViewersScreenSize** | **Boolean**| If attribute &#39;SplitOnPages&#x3D;false&#39;, than whole HTML representing all input PDF pages will be put into one big result HTML file. This flag defines whether result HTML will be generated in such way that flow of areas that represent PDF pages in result HTML will depend on screen resolution of viewer. | [optional]
 **partsEmbeddingMode** | **String**| It defines whether referenced files (HTML, Fonts,Images, CSSes) will be embedded into main HTML file or will be generated as apart binary entities. | [optional]
 **rasterImagesSavingMode** | **String**| Converted PDF can contain raster images This parameter defines how they should be handled during conversion of PDF to HTML. | [optional]
 **removeEmptyAreasOnTopAndBottom** | **Boolean**| Defines whether in created HTML will be removed top and bottom empty area without any content (if any). | [optional]
 **saveShadowedTextsAsTransparentTexts** | **Boolean**| Pdf can contain texts that are shadowed by another elements (f.e. by images) but can be selected to clipboard in Acrobat Reader (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML to mimic behaviour of Acrobat Reader (othervise such texts are usually saved as hidden, not available for copying to clipboard). | [optional]
 **saveTransparentTexts** | **Boolean**| Pdf can contain transparent texts that can be selected to clipboard (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML. | [optional]
 **specialFolderForAllImages** | **String**| The path to directory to which must be saved any images if they are encountered during saving of document as HTML. If parameter is empty or null then image files(if any) wil be saved together with other files linked to HTML It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. | [optional]
 **specialFolderForSvgImages** | **String**| The path to directory to which must be saved only SVG-images if they are encountered during saving of document as HTML. If parameter is empty or null then SVG files(if any) wil be saved together with other image-files (near to output file) or in special folder for images (if it specified in SpecialImagesFolderIfAny option). It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. | [optional]
 **trySaveTextUnderliningAndStrikeoutingInCss** | **Boolean**| PDF itself does not contain underlining markers for texts. It emulated with line situated under text. This option allows converter try guess that this or that line is a text&#39;s underlining and put this info into CSS instead of drawing of underlining graphically. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **file** | [****](.md)| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInRequestToLaTeX"></a>
# **putPdfInRequestToLaTeX**
> AsposeResponse putPdfInRequestToLaTeX(outPath, pagesCount, storage, file)

Converts PDF document (in request content) to LaTeX format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.tex) |
 **pagesCount** | **Integer**| Pages count. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **file** | [****](.md)| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInRequestToMobiXml"></a>
# **putPdfInRequestToMobiXml**
> AsposeResponse putPdfInRequestToMobiXml(outPath, storage, file)

Converts PDF document (in request content) to MOBIXML format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.mobixml) |
 **storage** | **String**| The document storage. | [optional]
 **file** | [****](.md)| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInRequestToPdfA"></a>
# **putPdfInRequestToPdfA**
> AsposeResponse putPdfInRequestToPdfA(outPath, type, storage, file)

Converts PDF document (in request content) to PdfA format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.pdf) |
 **type** | **String**| Type of PdfA format. |
 **storage** | **String**| The document storage. | [optional]
 **file** | [****](.md)| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInRequestToPptx"></a>
# **putPdfInRequestToPptx**
> AsposeResponse putPdfInRequestToPptx(outPath, separateImages, slidesAsImages, storage, file)

Converts PDF document (in request content) to PPTX format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.pptx) |
 **separateImages** | **Boolean**| Separate images. | [optional]
 **slidesAsImages** | **Boolean**| Slides as images. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **file** | [****](.md)| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInRequestToSvg"></a>
# **putPdfInRequestToSvg**
> AsposeResponse putPdfInRequestToSvg(outPath, storage, file)

Converts PDF document (in request content) to SVG format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.svg) |
 **storage** | **String**| The document storage. | [optional]
 **file** | [****](.md)| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInRequestToTiff"></a>
# **putPdfInRequestToTiff**
> AsposeResponse putPdfInRequestToTiff(outPath, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, storage, file)

Converts PDF document (in request content) to TIFF format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.tiff) |
 **brightness** | **Double**| Image brightness. | [optional]
 **compression** | **String**| Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. | [optional]
 **colorDepth** | **String**| Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. | [optional]
 **leftMargin** | **Integer**| Left image margin. | [optional]
 **rightMargin** | **Integer**| Right image margin. | [optional]
 **topMargin** | **Integer**| Top image margin. | [optional]
 **bottomMargin** | **Integer**| Bottom image margin. | [optional]
 **orientation** | **String**| Image orientation. Possible values are: None, Landscape, Portait. | [optional]
 **skipBlankPages** | **Boolean**| Skip blank pages flag. | [optional]
 **width** | **Integer**| Image width. | [optional]
 **height** | **Integer**| Image height. | [optional]
 **xResolution** | **Integer**| Horizontal resolution. | [optional]
 **yResolution** | **Integer**| Vertical resolution. | [optional]
 **pageIndex** | **Integer**| Start page to export. | [optional]
 **pageCount** | **Integer**| Number of pages to export. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **file** | [****](.md)| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInRequestToXls"></a>
# **putPdfInRequestToXls**
> AsposeResponse putPdfInRequestToXls(outPath, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, storage, file)

Converts PDF document (in request content) to XLS format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.xls) |
 **insertBlankColumnAtFirst** | **Boolean**| Insert blank column at first | [optional]
 **minimizeTheNumberOfWorksheets** | **Boolean**| Minimize the number of worksheets | [optional]
 **scaleFactor** | **Double**| Scale factor | [optional]
 **uniformWorksheets** | **Boolean**| Uniform worksheets | [optional]
 **storage** | **String**| The document storage. | [optional]
 **file** | [****](.md)| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInRequestToXml"></a>
# **putPdfInRequestToXml**
> AsposeResponse putPdfInRequestToXml(outPath, storage, file)

Converts PDF document (in request content) to XML format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.xml) |
 **storage** | **String**| The document storage. | [optional]
 **file** | [****](.md)| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInRequestToXps"></a>
# **putPdfInRequestToXps**
> AsposeResponse putPdfInRequestToXps(outPath, storage, file)

Converts PDF document (in request content) to XPS format and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.xps) |
 **storage** | **String**| The document storage. | [optional]
 **file** | [****](.md)| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToDoc"></a>
# **putPdfInStorageToDoc**
> AsposeResponse putPdfInStorageToDoc(name, outPath, addReturnToLineEnd, format, imageResolutionX, imageResolutionY, maxDistanceBetweenTextLines, mode, recognizeBullets, relativeHorizontalProximity, folder, storage)

Converts PDF document (located on storage) to DOC format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.doc) |
 **addReturnToLineEnd** | **Boolean**| Add return to line end. | [optional]
 **format** | **String**| Allows to specify .doc or .docx file format. | [optional]
 **imageResolutionX** | **Integer**| Image resolution X. | [optional]
 **imageResolutionY** | **Integer**| Image resolution Y. | [optional]
 **maxDistanceBetweenTextLines** | **Double**| Max distance between text lines. | [optional]
 **mode** | **String**| Allows to control how a PDF document is converted into a word processing document. | [optional]
 **recognizeBullets** | **Boolean**| Recognize bullets. | [optional]
 **relativeHorizontalProximity** | **Double**| Relative horizontal proximity. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToEpub"></a>
# **putPdfInStorageToEpub**
> AsposeResponse putPdfInStorageToEpub(name, outPath, contentRecognitionMode, folder, storage)

Converts PDF document (located on storage) to EPUB format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.epub) |
 **contentRecognitionMode** | **String**| ?roperty tunes conversion for this or that desirable method of recognition of content. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToHtml"></a>
# **putPdfInStorageToHtml**
> AsposeResponse putPdfInStorageToHtml(name, outPath, additionalMarginWidthInPoints, compressSvgGraphicsIfAny, convertMarkedContentToLayers, defaultFontName, documentType, fixedLayout, imageResolution, minimalLineWidth, preventGlyphsGrouping, splitCssIntoPages, splitIntoPages, useZOrder, antialiasingProcessing, cssClassNamesPrefix, explicitListOfSavedPages, fontEncodingStrategy, fontSavingMode, htmlMarkupGenerationMode, lettersPositioningMethod, pagesFlowTypeDependsOnViewersScreenSize, partsEmbeddingMode, rasterImagesSavingMode, removeEmptyAreasOnTopAndBottom, saveShadowedTextsAsTransparentTexts, saveTransparentTexts, specialFolderForAllImages, specialFolderForSvgImages, trySaveTextUnderliningAndStrikeoutingInCss, folder, storage)

Converts PDF document (located on storage) to Html format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.html) |
 **additionalMarginWidthInPoints** | **Integer**| Defines width of margin that will be forcibly left around that output HTML-areas. | [optional]
 **compressSvgGraphicsIfAny** | **Boolean**| The flag that indicates whether found SVG graphics(if any) will be compressed(zipped) into SVGZ format during saving. | [optional]
 **convertMarkedContentToLayers** | **Boolean**| If attribute ConvertMarkedContentToLayers set to true then an all elements inside a PDF marked content (layer) will be put into an HTML div with \&quot;data-pdflayer\&quot; attribute specifying a layer name. This layer name will be extracted from optional properties of PDF marked content. If this attribute is false (by default) then no any layers will be created from PDF marked content. | [optional]
 **defaultFontName** | **String**| Specifies the name of an installed font which is used to substitute any document font that is not embedded and not installed in the system. If null then default substitution font is used. | [optional]
 **documentType** | **String**| Result document type. | [optional]
 **fixedLayout** | **Boolean**| The value indicating whether that HTML is created as fixed layout. | [optional]
 **imageResolution** | **Integer**| Resolution for image rendering. | [optional]
 **minimalLineWidth** | **Integer**| This attribute sets minimal width of graphic path line. If thickness of line is less than 1px Adobe Acrobat rounds it to this value. So this attribute can be used to emulate this behavior for HTML browsers. | [optional]
 **preventGlyphsGrouping** | **Boolean**| This attribute switch on the mode when text glyphs will not be grouped into words and strings This mode allows to keep maximum precision during positioning of glyphs on the page and it can be used for conversion documents with music notes or glyphs that should be placed separately each other. This parameter will be applied to document only when the value of FixedLayout attribute is true. | [optional]
 **splitCssIntoPages** | **Boolean**| When multipage-mode selected(i.e &#39;SplitIntoPages&#39; is &#39;true&#39;), then this attribute defines whether should be created separate CSS-file for each result HTML page. | [optional]
 **splitIntoPages** | **Boolean**| The flag that indicates whether each page of source document will be converted into it&#39;s own target HTML document, i.e whether result HTML will be splitted into several HTML-pages. | [optional]
 **useZOrder** | **Boolean**| If attribute UseZORder set to true, graphics and text are added to resultant HTML document accordingly Z-order in original PDF document. If this attribute is false all graphics is put as single layer which may cause some unnecessary effects for overlapped objects. | [optional]
 **antialiasingProcessing** | **String**| The parameter defines required antialiasing measures during conversion of compound background images from PDF to HTML. | [optional]
 **cssClassNamesPrefix** | **String**| When PDFtoHTML converter generates result CSSs, CSS class names (something like \&quot;.stl_01 {}\&quot; ... \&quot;.stl_NN {}) are generated and used in result CSS. This property allows forcibly set class name prefix. | [optional]
 **explicitListOfSavedPages** | [**List&lt;Integer&gt;**](Integer.md)| With this property You can explicitely define what pages of document should be converted. Pages in this list must have 1-based numbers. I.e. valid numbers of pages must be taken from range (1...[NumberOfPagesInConvertedDocument]) Order of appearing of pages in this list does not affect their order in result HTML page(s) - in result pages allways will go in order in which they are present in source PDF. | [optional]
 **fontEncodingStrategy** | **String**| Defines encoding special rule to tune PDF decoding for current document. | [optional]
 **fontSavingMode** | **String**| Defines font saving mode that will be used during saving of PDF to desirable format. | [optional]
 **htmlMarkupGenerationMode** | **String**| Sometimes specific reqirments to generation of HTML markup are present. This parameter defines HTML preparing modes that can be used during conversion of PDF to HTML to match such specific requirments. | [optional]
 **lettersPositioningMethod** | **String**| The mode of positioning of letters in words in result HTML. | [optional]
 **pagesFlowTypeDependsOnViewersScreenSize** | **Boolean**| If attribute &#39;SplitOnPages&#x3D;false&#39;, than whole HTML representing all input PDF pages will be put into one big result HTML file. This flag defines whether result HTML will be generated in such way that flow of areas that represent PDF pages in result HTML will depend on screen resolution of viewer. | [optional]
 **partsEmbeddingMode** | **String**| It defines whether referenced files (HTML, Fonts,Images, CSSes) will be embedded into main HTML file or will be generated as apart binary entities. | [optional]
 **rasterImagesSavingMode** | **String**| Converted PDF can contain raster images This parameter defines how they should be handled during conversion of PDF to HTML. | [optional]
 **removeEmptyAreasOnTopAndBottom** | **Boolean**| Defines whether in created HTML will be removed top and bottom empty area without any content (if any). | [optional]
 **saveShadowedTextsAsTransparentTexts** | **Boolean**| Pdf can contain texts that are shadowed by another elements (f.e. by images) but can be selected to clipboard in Acrobat Reader (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML to mimic behaviour of Acrobat Reader (othervise such texts are usually saved as hidden, not available for copying to clipboard). | [optional]
 **saveTransparentTexts** | **Boolean**| Pdf can contain transparent texts that can be selected to clipboard (usually it happen when document contains images and OCRed texts extracted from it). This settings tells to converter whether we need save such texts as transparent selectable texts in result HTML. | [optional]
 **specialFolderForAllImages** | **String**| The path to directory to which must be saved any images if they are encountered during saving of document as HTML. If parameter is empty or null then image files(if any) wil be saved together with other files linked to HTML It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. | [optional]
 **specialFolderForSvgImages** | **String**| The path to directory to which must be saved only SVG-images if they are encountered during saving of document as HTML. If parameter is empty or null then SVG files(if any) wil be saved together with other image-files (near to output file) or in special folder for images (if it specified in SpecialImagesFolderIfAny option). It does not affect anything if CustomImageSavingStrategy property was successfully used to process relevant image file. | [optional]
 **trySaveTextUnderliningAndStrikeoutingInCss** | **Boolean**| PDF itself does not contain underlining markers for texts. It emulated with line situated under text. This option allows converter try guess that this or that line is a text&#39;s underlining and put this info into CSS instead of drawing of underlining graphically. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToLaTeX"></a>
# **putPdfInStorageToLaTeX**
> AsposeResponse putPdfInStorageToLaTeX(name, outPath, pagesCount, folder, storage)

Converts PDF document (located on storage) to LaTeX format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.tex) |
 **pagesCount** | **Integer**| Pages count. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToMobiXml"></a>
# **putPdfInStorageToMobiXml**
> AsposeResponse putPdfInStorageToMobiXml(name, outPath, folder, storage)

Converts PDF document (located on storage) to MOBIXML format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.mobixml) |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToPdfA"></a>
# **putPdfInStorageToPdfA**
> AsposeResponse putPdfInStorageToPdfA(name, outPath, type, folder, storage)

Converts PDF document (located on storage) to PdfA format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.pdf) |
 **type** | **String**| Type of PdfA format. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToPptx"></a>
# **putPdfInStorageToPptx**
> AsposeResponse putPdfInStorageToPptx(name, outPath, separateImages, slidesAsImages, folder, storage)

Converts PDF document (located on storage) to PPTX format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.pptx) |
 **separateImages** | **Boolean**| Separate images. | [optional]
 **slidesAsImages** | **Boolean**| Slides as images. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToSvg"></a>
# **putPdfInStorageToSvg**
> AsposeResponse putPdfInStorageToSvg(name, outPath, folder, storage)

Converts PDF document (located on storage) to SVG format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.svg) |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToTiff"></a>
# **putPdfInStorageToTiff**
> AsposeResponse putPdfInStorageToTiff(name, outPath, brightness, compression, colorDepth, leftMargin, rightMargin, topMargin, bottomMargin, orientation, skipBlankPages, width, height, xResolution, yResolution, pageIndex, pageCount, folder, storage)

Converts PDF document (located on storage) to TIFF format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.tiff) |
 **brightness** | **Double**| Image brightness. | [optional]
 **compression** | **String**| Tiff compression. Possible values are: LZW, CCITT4, CCITT3, RLE, None. | [optional]
 **colorDepth** | **String**| Image color depth. Possible valuse are: Default, Format8bpp, Format4bpp, Format1bpp. | [optional]
 **leftMargin** | **Integer**| Left image margin. | [optional]
 **rightMargin** | **Integer**| Right image margin. | [optional]
 **topMargin** | **Integer**| Top image margin. | [optional]
 **bottomMargin** | **Integer**| Bottom image margin. | [optional]
 **orientation** | **String**| Image orientation. Possible values are: None, Landscape, Portait. | [optional]
 **skipBlankPages** | **Boolean**| Skip blank pages flag. | [optional]
 **width** | **Integer**| Image width. | [optional]
 **height** | **Integer**| Image height. | [optional]
 **xResolution** | **Integer**| Horizontal resolution. | [optional]
 **yResolution** | **Integer**| Vertical resolution. | [optional]
 **pageIndex** | **Integer**| Start page to export. | [optional]
 **pageCount** | **Integer**| Number of pages to export. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToXls"></a>
# **putPdfInStorageToXls**
> AsposeResponse putPdfInStorageToXls(name, outPath, insertBlankColumnAtFirst, minimizeTheNumberOfWorksheets, scaleFactor, uniformWorksheets, folder, storage)

Converts PDF document (located on storage) to XLS format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.xls) |
 **insertBlankColumnAtFirst** | **Boolean**| Insert blank column at first | [optional]
 **minimizeTheNumberOfWorksheets** | **Boolean**| Minimize the number of worksheets | [optional]
 **scaleFactor** | **Double**| Scale factor | [optional]
 **uniformWorksheets** | **Boolean**| Uniform worksheets | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToXml"></a>
# **putPdfInStorageToXml**
> AsposeResponse putPdfInStorageToXml(name, outPath, folder, storage)

Converts PDF document (located on storage) to XML format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.xml) |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPdfInStorageToXps"></a>
# **putPdfInStorageToXps**
> AsposeResponse putPdfInStorageToXps(name, outPath, folder, storage)

Converts PDF document (located on storage) to XPS format and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.xps) |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPrivileges"></a>
# **putPrivileges**
> AsposeResponse putPrivileges(name, privileges, storage, folder)

Update privilege document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **privileges** | [**DocumentPrivilege**](DocumentPrivilege.md)| Document privileges.  | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putPsInStorageToPdf"></a>
# **putPsInStorageToPdf**
> AsposeResponse putPsInStorageToPdf(name, srcPath, dstFolder, storage)

Convert PS file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.ps) |
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putReplaceImage"></a>
# **putReplaceImage**
> ImageResponse putReplaceImage(name, imageId, imageFilePath, storage, folder, image)

Replace document image.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **imageId** | **String**| The image ID. |
 **imageFilePath** | **String**| Path to image file if specified. Request content is used otherwise. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **image** | [****](.md)| Image file. | [optional]

### Return type

[**ImageResponse**](ImageResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putSearchableDocument"></a>
# **putSearchableDocument**
> AsposeResponse putSearchableDocument(name, storage, folder, lang)

Create searchable PDF document. Generate OCR layer for images in input PDF document.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **lang** | **String**| language for OCR engine. Possible values: eng, ara, bel, ben, bul, ces, dan, deu, ell, fin, fra, heb, hin, ind, isl, ita, jpn, kor, nld, nor, pol, por, ron, rus, spa, swe, tha, tur, ukr, vie, chi_sim, chi_tra or thier combination e.g. eng,rus  | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putSetProperty"></a>
# **putSetProperty**
> DocumentPropertyResponse putSetProperty(name, propertyName, value, storage, folder)

Add/update document property.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **propertyName** | **String**|  |
 **value** | **String**|  |
 **storage** | **String**|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**DocumentPropertyResponse**](DocumentPropertyResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putSvgInStorageToPdf"></a>
# **putSvgInStorageToPdf**
> AsposeResponse putSvgInStorageToPdf(name, srcPath, adjustPageSize, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop, dstFolder, storage)

Convert SVG file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.svg) |
 **adjustPageSize** | **Boolean**| Adjust page size | [optional]
 **height** | **Double**| Page height | [optional]
 **width** | **Double**| Page width | [optional]
 **isLandscape** | **Boolean**| Is page landscaped | [optional]
 **marginLeft** | **Double**| Page margin left | [optional]
 **marginBottom** | **Double**| Page margin bottom | [optional]
 **marginRight** | **Double**| Page margin right | [optional]
 **marginTop** | **Double**| Page margin top | [optional]
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putTextAnnotation"></a>
# **putTextAnnotation**
> TextAnnotationResponse putTextAnnotation(name, annotationId, annotation, storage, folder)

Replace document text annotation

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **annotationId** | **String**| The annotation ID. |
 **annotation** | [**TextAnnotation**](TextAnnotation.md)| Annotation. |
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**TextAnnotationResponse**](TextAnnotationResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putUpdateField"></a>
# **putUpdateField**
> FieldResponse putUpdateField(name, fieldName, field, storage, folder)

Update field.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fieldName** | **String**| The name of a field to be updated. |
 **field** | [**Field**](Field.md)| with the field data. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FieldResponse**](FieldResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putUpdateFields"></a>
# **putUpdateFields**
> FieldsResponse putUpdateFields(name, fields, storage, folder)

Update fields.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **fields** | [**Fields**](Fields.md)| with the fields data. | [optional]
 **storage** | **String**| The document storage. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**FieldsResponse**](FieldsResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putWebInStorageToPdf"></a>
# **putWebInStorageToPdf**
> AsposeResponse putWebInStorageToPdf(name, url, height, width, isLandscape, marginLeft, marginBottom, marginRight, marginTop, dstFolder, storage)

Convert web page to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **url** | **String**| Source url |
 **height** | **Double**| Page height | [optional]
 **width** | **Double**| Page width | [optional]
 **isLandscape** | **Boolean**| Is page landscaped | [optional]
 **marginLeft** | **Double**| Page margin left | [optional]
 **marginBottom** | **Double**| Page margin bottom | [optional]
 **marginRight** | **Double**| Page margin right | [optional]
 **marginTop** | **Double**| Page margin top | [optional]
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putXfaPdfInRequestToAcroForm"></a>
# **putXfaPdfInRequestToAcroForm**
> AsposeResponse putXfaPdfInRequestToAcroForm(outPath, storage, file)

Converts PDF document which contatins XFA form (in request content) to PDF with AcroForm and uploads resulting file to storage.

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.pdf) |
 **storage** | **String**| The document storage. | [optional]
 **file** | [****](.md)| A file to be converted. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putXfaPdfInStorageToAcroForm"></a>
# **putXfaPdfInStorageToAcroForm**
> AsposeResponse putXfaPdfInStorageToAcroForm(name, outPath, folder, storage)

Converts PDF document which contatins XFA form (located on storage) to PDF with AcroForm and uploads resulting file to storage

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **outPath** | **String**| Full resulting filename (ex. /folder1/folder2/result.pdf) |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putXmlInStorageToPdf"></a>
# **putXmlInStorageToPdf**
> AsposeResponse putXmlInStorageToPdf(name, srcPath, xslFilePath, dstFolder, storage)

Convert XML file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.xml) |
 **xslFilePath** | **String**| Full XSL source filename (ex. /folder1/folder2/template.xsl) | [optional]
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putXpsInStorageToPdf"></a>
# **putXpsInStorageToPdf**
> AsposeResponse putXpsInStorageToPdf(name, srcPath, dstFolder, storage)

Convert XPS file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.xps) |
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putXslFoInStorageToPdf"></a>
# **putXslFoInStorageToPdf**
> AsposeResponse putXslFoInStorageToPdf(name, srcPath, dstFolder, storage)

Convert XslFo file (located on storage) to PDF format and upload resulting file to storage. 

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **srcPath** | **String**| Full source filename (ex. /folder1/folder2/template.xpsfo) |
 **dstFolder** | **String**| The destination document folder. | [optional]
 **storage** | **String**| The document storage. | [optional]

### Return type

[**AsposeResponse**](AsposeResponse.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
