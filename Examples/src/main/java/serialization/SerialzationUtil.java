package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialzationUtil {
	/**
	 * This method is used to deserialize data from the given file 
	 * It uses FileInputStream to read the byte stream from the specified file
	 * ObjectInputStream used to convert the byte data to actual object
	 * @param fileName
	 * @return Employee object
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Employee deserialize(String  fileName) throws IOException, ClassNotFoundException{
		File file = new File("./"+fileName);
		FileInputStream fileIn = new FileInputStream(file);
		ObjectInputStream in = new ObjectInputStream(fileIn);
		 Employee emp = (Employee)in.readObject();
		 in.close();
		 fileIn.close();
		return emp;	
	}
	/**
	 * This method serializes the input object 
	 * This uses FileOutputStream  which opens connection to a file so that
	 * it accepts byte data 
	 * ObjectOutPutStream converts the object in to stream of bytes
	 * this basically stores the state of the object
	 * @param emp
	 * @return filename 
	 * @throws IOException
	 */
	public String serialize(Employee emp) throws IOException{
		FileOutputStream fileOut = new FileOutputStream(new File("./emp.txt"));
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(emp);
		out.close();
		fileOut.close();
		return "emp.txt";
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp = new Employee();
		emp.setEmpId("1234A1");
		emp.setName("Hareesha");
		emp.setSal(123.45);
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getSal());
		SerialzationUtil util = new SerialzationUtil();
		String serialisedFile = util.serialize(emp);
		System.out.println("Serialised...");
		Employee emp1= util.deserialize(serialisedFile);
		System.out.println("Deserialised...");
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getSal());
	}

}
