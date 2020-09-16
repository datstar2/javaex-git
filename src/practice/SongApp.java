package practice;

public class SongApp {

	public static void main(String[] args) {
		Song ninano = new Song();
		
		
		ninano.setTitle("ninano");
		ninano.setAlbum("godofmusic");
		ninano.setArtist("JohnPark");
		ninano.setComposer("johnPark");
		ninano.setYear(2016);
		ninano.setTrack(5);
		
		
		ninano.showInfo();
	}

}
