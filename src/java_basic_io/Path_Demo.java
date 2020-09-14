package java_basic_io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path_Demo {

	public static void main(String[] args) {
		
		Path path = Paths.get("C:\\Users\\LENOVO\\Desktop\\Docu\\DSC04782.JPG");
		
		System.out.format("toString %s%n", path.toString());
		System.out.format("getfileName %s%n", path.getFileName());
		System.out.format("getName(0) %s%n", path.getName(0));
		System.out.format("getNameCount %s%n", path.getNameCount());
		System.out.format("getParent %s%n", path.getParent());
		System.out.format("getRoot %s%n", path.getRoot());
		System.out.format("subpath(0, 3) %s%n", path.subpath(0, 3));
		System.out.format("getFileSystem %s%n", path.getFileSystem());
		System.out.format("ToAbsulatepath %s%n", path.toAbsolutePath());
		System.out.format("Path joining %s%n ", path.resolve(path.subpath(0, 3)));
		
		
		
//	A common requirement when you are writing file I/O code is the capability to construct 
//	a path from one location in the file system to another location. You can meet this using the 'relativize' method. 
		
		Path p1 = Paths.get("home");
		Path p3 = Paths.get("home/sally/bar");
		// Result is sally/bar
		Path p1_to_p3 = p1.relativize(p3);
		// Result is ../..
		Path p3_to_p1 = p3.relativize(p1);
		System.out.println(p1_to_p3);
		System.out.println(p3_to_p1);
		
//		In this example, the two paths share the same node, home. To navigate from home to bar, 
//		you first navigate one level down to sally and then one more level down to bar. 
//		Navigating from bar to home requires moving up two levels.
	}

}
