import java.util.PriorityQueue;
import java.util.Collections;


class HQE implements Comparable<HQE> {
	private int num;
	private String content;
	
	public HQE(int num, String content) {
		this.num = num;
		this.content = content;
	}
	
	@Override
	public int compareTo(HQE hqe) {
		return Integer.compare(this.num, hqe.num);
	}
	
	@Override
	public String toString() {
		return Integer.toString(num) + content;
	}
}




public class HeapQ {
	public static void main(String[] args) {
//		PriorityQueue<Integer> min_hq = new PriorityQueue<>();
//		PriorityQueue<Integer> max_hq = new PriorityQueue<>(Collections.reverseOrder());
//		min_hq.add(3);
//		min_hq.add(2);
//		min_hq.add(1);
//		System.out.println(min_hq);
//		
//		System.out.println(min_hq.poll());
//		System.out.println(min_hq);		
//		System.out.println(min_hq.size());
		
		
		PriorityQueue<HQE> hq = new PriorityQueue<>();
		hq.add(new HQE(10, "asdf"));
		hq.add(new HQE(5, "zxcv"));
		System.out.println(hq);
		
		
		
	}
}
