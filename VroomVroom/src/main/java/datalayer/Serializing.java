package datalayer;

import carlot.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class Serializing {


	public static void main(String[] args) {
		String filename= "carlot.txt";
		writeObject(filename, new Car("ABC123", "Toyota", "Rav4"));
		System.out.println(readObject(filename));
		List<Car> list = new ArrayList<>();
		writeObjectList(filename, list);
		list = readObjectList(filename);
		System.out.println(list);
		System.out.println(readObject("carlot.text"));
	}
	
	public static void writeObject(String file, Object o) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(file))){
			
			oos.writeObject(o);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static Object readObject(String file) {
		try(ObjectInputStream is = new ObjectInputStream(
				new FileInputStream(file))){
			
			return is.readObject();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	static void writeObjectList(String file, List<Car> o) {
		try(ObjectOutputStream os  = new ObjectOutputStream(
				new FileOutputStream(file))) {
			
			os.writeObject(o);
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	@SuppressWarnings("unchecked")
	static List<Car> readObjectList(String file) {
		try(ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(file))){
			
			return (List<Car>)ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
