package WorkShop_28_August;
import java.util.*;
public class Music {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] songs = {"Song1", "Song2", "Song3"};
        boolean running = true;
        while (running) {
            System.out.println("Music Playlist Manager");
            System.out.println("1. Play all songs");
            System.out.println("2. Play a song by index");
            System.out.println("3. Search for a song by name");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Playing all songs:");
                    for (String song : songs) {
                        System.out.println(song);
                    }
                    break;

                case 2:
                    System.out.print("Enter song index (0 to " + (songs.length - 1) + "): ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < songs.length) {
                        System.out.println("Now playing: " + songs[index]);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 3:
                    System.out.print("Enter song name to search: ");
                    String name = sc.nextLine();
                    boolean found = false;
                    for (String song : songs) {
                        if (song.equalsIgnoreCase(name)) {
                            System.out.println("Song found!Playing: " + song);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Song not found in playlist.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Music Player... Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}
