package practice;

public class Song {
	private String title, artist, album, composer;
	private int year, track;
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return title;
	}
	
	public String getAlbum() {
		return title;
	}
	
	public String getCompser() {
		return title;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getTrack() {
		return track;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void showInfo() {
		System.out.println("제목:" + title);
		System.out.println("가수:" + artist);
		System.out.println("앨범:" + album);
		System.out.println("작곡가:" + composer);
		System.out.println("발표년도:" + year);
		System.out.println("트랙번호:" + track);
	}
	
	public Song() {
		
	}

}
