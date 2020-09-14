package java_Interfacedemo;

import java.util.List;

public interface ISaveable {

	List<String> write();
	void read(List<String> savedvlues);
}
