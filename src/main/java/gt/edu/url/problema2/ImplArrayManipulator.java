package gt.edu.url.problema2;

public class ImplArrayManipulator implements ArrayManipulator{	
	public int subsets(List set) {
		ArrayList<Integer> n1 = new ArrayList<>();
		for (int i = 0; i < set.size(); i++) {
			int aux=(int) set.get(i);
			n1.add(i,aux);
		}
		
		if(set.size()==1) {System.out.println("Solo ha ingresado un valor= "+ set.get(0));}
		for (int i = 0; i < set.size(); i++) {
			subsets(n1);
			if (i==set.size()) {
				n1.swap(i, set.size()-1);	
			}else {
				n1.swap(0, set.size()-1);
			}
			System.out.print(n1.remove(i));
		}
		subsets(n1);
		
		return 0;
	}
	public static void main(String[] args) {
		ImplArrayManipulator n1= new ImplArrayManipulator();
		ArrayList<Integer> l1= new ArrayList<>();	
		n1.subsets(l1);
	}

}
