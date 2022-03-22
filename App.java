package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Music> arrayList = new ArrayList<Music>();
		arrayList.add(new Music(1, "Tamil BGM", "ABCD", "abcd", "D:\\Songs", "BGM"));
		arrayList.add(new Music(2, "Friends Song ", "ABCD", "abcd", "D:\\Songs", "Friendship"));
		arrayList.add(new Music(3, "Beliver Song", "Abcd", "abcd", "D:\\Songs", "Motivation song"));
		arrayList.add(new Music(4, "Chill bro", "ABCD", "abcd", "D:\\Songs", "Mind Free Song"));
		arrayList.add(new Music(5, "Kerla BGM", "ABCD", "abcd", "D:\\Songs", "BGM"));
		int id = 5;

		do {
			System.out.println("*********** MUSIC PLAYER ************");
			System.out.println("Press 1 to Play a song:");
			System.out.println("Press 2 to Searche a song:");
			System.out.println("Press 3 to Show all songs:");
			System.out.println("Press 4 to Operate on Songs database:");
			int n = scanner.nextInt();

			switch (n) {
			case 1: {
				System.out.println("Press 1 to Play all song:");
				System.out.println("Press 2 to Play Songs Randomly:");
				System.out.println("Press 3 to Play a Particular song:");
				int a = scanner.nextInt();

				if (a == 1) {
					Collections.sort(arrayList);
					for (Music music : arrayList) {
						System.out.print(music.getS_Title() + " Playing....");
						Thread.sleep(1000);
						System.out.println("Song End.");
					}
				} else if (a == 2) {
					Collections.shuffle(arrayList);
					for (Music music : arrayList) {
						System.out.println(music.getS_Title() + " Playing....");
						Thread.sleep(1000);
						System.out.println("Song End.");
						Thread.sleep(1000);
					}

				} else if(a==3) {
					System.out.println("Enter song title:");
					String s = scanner.next();
					for (Music music : arrayList) {
						if (music.getS_Title().contains(s)) {
							System.out.println(music.getS_Title() + "Playing......");
							Thread.sleep(1000);
							System.out.println("Song End.");
							Thread.sleep(1000);

						}

					}
				}else {
					System.out.println("Enter valid Option:");
				}
			}
				break;
			case 2:
				System.out.println("Enter song title:");
				String str = scanner.next();

				for (Music music : arrayList) {
					if (music.getS_Title().contains(str))
						System.out.println(music.getS_Title() + "Playing......");
					Thread.sleep(1000);
				}

				break;
			case 3:
				System.out.println("Show all songs");
				for (Music music : arrayList) {
					System.out.println(music);
				}
				break;
			case 4:
				System.out.println("Press A to Add a song:");
				System.out.println("Press B to Edit an Existing song:");
				System.out.println("Press C to Delete an Existing song:");
				String b = scanner.next();
				switch (b) {
				case "A": {
//					System.out.println("Enter Song ID");
//					int l=scanner.nextInt();

					System.out.println("Enter Song Name:");
					String m = scanner.next();

					System.out.println("Enter Song Artist");
					String n1 = scanner.next();

					System.out.println("Enter Song Album");
					String o = scanner.next();

					System.out.println("Enter Song Location");
					String p = scanner.next();

					System.out.println("Enter Song Discription");
					String q = scanner.next();

					arrayList.add(new Music(++id, m, n1, o, p, q));
					System.out.println("Added Successfully...!!! ");
					System.out.println("List of Songs: ");

					for (Music music : arrayList) {
						System.out.println(music.getS_Title());
					}
					break;
				}
				case "B": {
					System.out.println("Enter Song Id");
					int x = scanner.nextInt();
					
					for (Music music : arrayList) {
						if(music.getS_Id()==x) {
							System.out.println("Enter Song Name:");
							String a1 = scanner.next();
							if(!a1.toLowerCase().equalsIgnoreCase("na")) {
								music.setS_Title(a1);
							}

							System.out.println("Enter Song Artist");
							String b1 = scanner.next();
							if(!b1.toLowerCase().equalsIgnoreCase("na")) {
								music.setS_Artist(b1);
							}

							System.out.println("Enter Song Album");
							String c1= scanner.next();
							if(!c1.toLowerCase().equalsIgnoreCase("na")) {
								music.setS_Album(c1);
							}

							System.out.println("Enter Song Location");
							String d1= scanner.next();
							if(!d1.toLowerCase().equalsIgnoreCase("na")) {
								music.setS_Location(d1);
							}

							System.out.println("Enter Song Description");
							String e1= scanner.next();
							if(!e1.toLowerCase().equalsIgnoreCase("na")) {
								music.setS_Description(e1);
							}
							System.out.println("Edit Successfully...!!! ");
							for (Music music2 : arrayList) {
								System.out.println(music2);
							}
							
							
						}
					}
					
					
					break;
				}
				case "C": {
					System.out.println("Enter Song ID");
					int l = scanner.nextInt();
					Iterator<Music> t = arrayList.iterator();
					while (t.hasNext()) {
						if (t.next().getS_Id() == l) {
							t.remove();
							break;
						}
					}
					System.out.println("Deleted Successfully...!!! ");
					System.out.println("List of Songs: ");

					for (Music music : arrayList) {
						System.out.println(music.getS_Title());
					}

					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + b);
				}

				break;
			default:
				System.out.println("Enter a Valide Option:");
			}
		} while (true);
	}
}
