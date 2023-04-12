package COLLECTION33Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCricket {
public static void main(String[] args) {
	Cricket c1=new Cricket("DHONI",46,70,0,true);
	Cricket c2=new Cricket("RAINA",40,38,2,true);
	Cricket c3=new Cricket("BUMRAH",37,12,4,false);
	Cricket c4=new Cricket("KOHLI",35,88,0,true);
	Cricket c5=new Cricket("HARDIK",30,36,2,true);
	Cricket c6=new Cricket("CHAHAL",27,0,3,false);
	Cricket c7=new Cricket("DHINESHKARTHIK",35,47,0,true);
	Cricket c8=new Cricket("AJAY", 22, 90, 0, true);
	ArrayList<Cricket>playerList=new ArrayList<>();
	playerList.add(c1);
	playerList.add(c2);
	playerList.add(c3);
	playerList.add(c4);
	playerList.add(c5);
	playerList.add(c6);
	playerList.add(c7);
	playerList.add(c8);
	List<Cricket>ck=playerList.stream().filter(x->x.getName().startsWith("D")).collect(Collectors.toList());
	//for(Cricket c:ck) {
	//long a=ck.stream().count();
		//System.out.println(c.getName());
		//System.out.println(c);
		
    List<Cricket>above10=playerList.stream().filter(y->y.getRun()>=10).collect(Collectors.toList());
    int max=0;
	Cricket temp=null;
        for(Cricket j:above10) {
        	if(j.getRun()>=max) {
              max=j.getRun();
               temp=j;
	}
	}
        	//System.out.println(temp);
        List<Cricket>maxAge=playerList.stream().filter(z->z.getAge()>=28).collect(Collectors.toList());
        //maxAge.forEach(t->System.out.println(t));
 playerList.stream().filter(t->t.getAge()>36).forEach(g->System.out.println("ABOVE 36="+g));
 playerList.stream().filter(v->v.getAge()>40).forEach(f->System.out.println("ABOVE 40="+ f));
    long a=playerList.stream().count();
 System.out.println("COUNT OF PLAYERS="+a);
    List<Boolean>score=playerList.stream().map(g->g.getRun()>70).collect(Collectors.toList());
    score.forEach(g->System.out.println(g));
    List<Integer>scores=playerList.stream().map(j->j.getRun()).collect(Collectors.toList());
 scores.forEach(j->System.out.println(j));
long i=scores.stream().count();
System.out.println(i);
playerList.stream().map(k->k.getName().charAt(k.getName().length()/2)).forEach(y->System.out.println("MIDDELE CHAR="+y));
long k=playerList.stream().count();
System.out.println(k);


	}
}