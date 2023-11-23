package a01a.sol2;

import java.util.*;
import java.util.stream.*;

public class LogicsImpl implements Logics {
	
	private final List<Integer> values;
	
	public LogicsImpl(int size) {
		this.values = new ArrayList<>(Collections.nCopies(size,0));
	}
	
	@Override
	public int size() {
		return this.values.size();
	}

	@Override
	public List<String> currentNames() {
		return values.stream().map(String::valueOf).collect(Collectors.toList());
	}

	@Override
	public List<Boolean> currentEnabling() {
		return values.stream().map((x)->x<values.size()).collect(Collectors.toList());
	}

	@Override
	public String hit(int elem) {
		int n = this.values.get(elem);
		this.values.set(elem, ++n);
		return String.valueOf(n);
	}

	@Override
	public String result() {
		return this.values.stream().map(String::valueOf).collect(Collectors.joining("|", "<<", ">>"));
	}

	@Override
	public boolean toQuit() {
		return this.values.stream().allMatch(i->i==this.values.get(0));
	}
	
}
