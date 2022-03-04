package MusicPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class Music {

	private static ArrayList<Album> albums = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Album album = new Album(name: "Album1",artist: "AC/DC");
		
		album.addSong(title:"TNT",duration: 4.5);
		album.addSong(title: "Highway to hell",duration: 3.5);
		album.addSong(title:"ThunderStruck",duration: 5.0);
		
		album = new Album(name:"Album2",artist: "Eminem");
		
		albums.add(album);
		
		LinkedList<Song>playList_1 = new LinkedList<>();
		albums.get(0).addToPlayList(title:"TNT",duration:playList_1);
		
		play(playList_1);
	}
	private static void play(LinkedList<Song> playList) {
		Scanner sc = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song>listIterator = playList.listIterator();
		
		if(playList.size()==0){
			System.out.println("This playList have a song");
		}else {
			System.out.println("Now playing"+ listIterator.next().toString());
			printMenu();
		}
		while(!quit) {
			int action = sc.nextInt();
			sc.nextLine();
			
			switch (action) {
			
			case 0:
				System.out.println("playlist complete");
				quit = true;
				break;
			case 1:
				if(!forward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					forward =true;
				}
				if(listIterator.hasNext()) {
					System.out.println("Now playing"+listIterator.next().toString());
				}else {
					System.out.println("no song available, reached to the end of the list");
					forward = false;
				}
				break;
			case 2:
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward = false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("we are the first song");
					forward = false;
				}
				break;
			case 3:
				if(forward) {
					if(listIterator.hasPrevious()) {
						System.out.println("now playing"+listIterator.next().toString());
					}
				}
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if(playList.size()>0) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("now playing"+listIterator.next().toString());
					}else {
						if(listIterator.hasPrevious());
						System.out.println("now playing"+listIterator.previous().toString());
					}
				}
			}
			
		}
	}
	private static void printMenu() {
		System.out.println("Available options\n press");
		System.out.println("0- to quite\n"+
						   "1 - to play next song\n"+
				           "2 - to play previous song\n"+
				           "3 - to play replay the current song\n"+
				           "4 - list of all songs\n"+
				           "5 - print all available options\n"+
				           "6 - delete current song\n");
	}
	private static void printList(LinkedList<Song>playList) {
		Iterator<Song>iterator=playList.iterator();
		System.out.println("..............");
		while(iterator.hasNext()) {
			System.out.println();
		}
	}
}
