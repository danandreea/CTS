package ro.ase.cts.readers;

public abstract class AplicantReader {
	

	private String fileName;
	


	public AplicantReader(String fileName) {
		super();
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
	
	
}
