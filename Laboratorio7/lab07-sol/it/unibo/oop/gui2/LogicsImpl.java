package a02a.sol2;

import java.util.*;
import java.util.stream.IntStream;

public class LogicsImpl implements Logics {
    
    private List<List<Boolean>> grid = new ArrayList<>();
    
    public LogicsImpl(int size){
        for (int i=0; i<size; i++) {
        	final List<Boolean> row = new ArrayList<>(); 
        	this.grid.add(row);
        	for (int j=0; j<size; j++) {
        		row.add(false);
        	}
        }
    }
    
    private boolean gridGet(int row, int col) {
    	return this.grid.get(row).get(col);
    }

	@Override
	public boolean hit(int row, int col) {
		final boolean val = !this.gridGet(row, col);
		this.grid.get(row).set(col,val);
		System.out.println(grid);
		return val;
	}

	@Override
	public boolean isAnyRowFull() {
		return this.grid.stream().anyMatch(l -> l.stream().allMatch(b->b));
	}

	@Override
	public boolean isAnyColumnFull() {
		return IntStream.range(0,grid.size())
						.anyMatch(index -> this.grid.stream()
													.allMatch(l -> l.get(index)));
	}

}
