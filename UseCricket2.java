package COLLECTION33Streams;

	import java.util.ArrayList;
	import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
	public class UseCricket2 {
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
		playerList.stream().filter(x->x.getAge()>30&&x.getRun()>50).map(t->t.getName()).forEach(y->System.out.println("filter with map-"+y));
		List<String>bestPlayer=playerList.stream().filter(x->x.getAge()<30&&x.getRun()>50).map(s->s.getName()).collect(Collectors.toList());
		bestPlayer.forEach(c->System.out.println(c));
		Map<String,Cricket>player=playerList.stream().filter(x->x.getName().startsWith("A")).collect(Collectors.toMap(a->a.getName(), b->b));
		System.out.println(player);
	}
}
