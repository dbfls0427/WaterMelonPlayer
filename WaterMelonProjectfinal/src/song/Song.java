package song;

public abstract class Song {

	// 노래추가
	public abstract boolean songAdd();
	
	// 노래수정
	public abstract boolean songUpdate();
	
	// 노래삭제
	public abstract boolean songDelete();
	
	// 노래검색
	public abstract SongImpl songSearch();


	
	
}
