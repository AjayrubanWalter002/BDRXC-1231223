package COLLECTION33Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseStudent {
public static void main(String[] args) {
	Student s1=new Student("AJAY",24);
	Student s2=new Student("SURESH",33);
	Student s3=new Student("DHANA",25);
	Student s4=new Student("JEEVA",22);
	Student s5=new Student("DANY",24);
	Student s6=new Student("STEVE",21);
	Student s7=new Student("TIM",28);
	ArrayList<Student>studentList=new ArrayList<>();
	studentList.add(s1);
	studentList.add(s2);
	studentList.add(s3);
	studentList.add(s4);
	studentList.add(s5);
	studentList.add(s6);
	studentList.add(s7);	
	
	List<Student>studentName=studentList.stream().filter(x->x.getName().startsWith("S")).collect(Collectors.toList());
	long g=studentName.stream().count();
			System.out.println("COUNT of starts in s ="+g);
	studentName.forEach(v->System.out.println("NAME STARTS WITH S is ="+v));
	studentList.stream().filter(x->x.getAge()>23).forEach(y->System.out.println("AGE ABOVE 23-"+y));
	List<Integer>belowAge=studentList.stream().map(x->x.getAge()).collect(Collectors.toList());
	belowAge.forEach(b->System.out.println("BELOW AGE = "+b));
	studentList.stream().map(i->i.getName()).forEach(c->System.out.println(c));
	List<String>totals=studentList.stream().filter(x->x.getAge()>20).map(y->y.getName()).collect(Collectors.toList());
	studentList.forEach(o->System.out.println("TOTALS="+o));
	Map<Integer,Student>mapWithFilter=studentList.stream().filter(x->x.getName().startsWith("A")).collect(Collectors.toMap(a->a.getAge(),b->b));
	mapWithFilter.forEach((h,d)->System.out.println(d));
	
	
}
}
