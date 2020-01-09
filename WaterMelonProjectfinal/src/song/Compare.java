package song;

import java.util.Comparator;

public class Compare implements Comparator<SongImpl>{

	@Override
	public int compare(SongImpl o1, SongImpl o2) {
		return o1.getLike() > o2.getLike() ? -1 : o1.getLike() < o2.getLike() ? 1 : 0;
	}
	
	
	
}
