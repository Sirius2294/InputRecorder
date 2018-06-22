import java.io.*;

public class ControllerOutputStream {
	
	private FileOutputStream fos;

	public ControllerOutputStream(FileOutputStream fos) {
		this.fos = fos;
	}
	
	public void saveControllerInputs() {
		DataOutputStream dos = new DataOutputStream(fos);
		
	}
	
}
