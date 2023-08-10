package chapter03;

public class SongTest {

	public static void main(String[] args) {
		Song song1 = new Song("좋은날","아이유","리얼","이민수",3,2010);
//		song1.setTitle("좋은날");
//		song1.setArtist("IU");
//		song1.setAlbum("Real");
//		song1.setComposer("이민수");
//		song1.setTrack(3);
//		song1.setYear(2010);
		
		song1.show();
		
		Song song2 = new Song("디토","뉴진스");
		song2.show();
	}

}
