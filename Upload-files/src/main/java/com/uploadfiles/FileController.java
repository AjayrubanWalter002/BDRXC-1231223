package com.uploadfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;

@RestController
//@CrossOrigin("http://localhost:8081")
public class FileController {

	@Autowired
	FileRepository fr;

	@PostMapping("/upload")
	public ResponseEntity<Object> uploadFile(@RequestParam("file") MultipartFile file)
			throws MaxUploadSizeExceededException {
		String message = "";
		try {
			String fileName = StringUtils.cleanPath(file.getOriginalFilename());
			FileEntity FileEntity = new FileEntity(fileName, file.getContentType(), file.getBytes());

			fr.save(FileEntity);

			message = "Uploaded successfully: " + file.getOriginalFilename();
			return ResponseEntity.status(HttpStatus.OK).body(new Message(message));
		} catch (Exception e) {
			message = "Sorry Could not upload the file: " + file.getOriginalFilename() + "!";
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new Message(message));
		}

	}
//	  @GetMapping("/files")
//	  public ResponseEntity<List<ResponseFile>> getListFiles() {
//	    List<ResponseFile> files;
//		try {
//			files = ((Object) FileRepository.getAllFiles()).map(dbFile -> {
//			  String fileDownloadUri = ServletUriComponentsBuilder
//			      .fromCurrentContextPath()
//			      .path("/files/")
//			      .path(dbFile.getId())
//			      .toUriString();
//
//			  return new ResponseFile(
//			      dbFile.getName(),
//			      fileDownloadUri,
//			      dbFile.getType(),
//			      dbFile.getData().length);
//			}).collect(Collectors.toList());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	    return ResponseEntity.status(HttpStatus.OK).body(files);
//	  }

}
