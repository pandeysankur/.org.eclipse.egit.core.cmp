package arrayList;

import java.util.ArrayList;

public class MainStudent {

	public static void main(String[] args) {
		Student s1 = new Student(101, "Ankur", 23);
		Student s2 = new Student(102, "Ravi", 21);
		Student s3 = new Student(103, "Ayush", 25);

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println(al);
		for (Student s : al) {
			System.out.println(s.rollNo + " " + s.name + " " + s.age);
		}

	}
}
/*
 * int appleCount = 0; int orangeCount = 0;
 * 
 * for (int i = 0; i < apples.Count(); ++i) { apples[i] += a; if (apples[i] >= s
 * && apples[i] <= t) ++appleCount; }
 * 
 * for (int i = 0; i < oranges.Count(); ++i) { oranges[i] += b; if (oranges[i]
 * >= s && oranges[i] <= t) ++orangeCount; }
 */
