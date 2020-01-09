package playList;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.Media;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

import song.*;
public class PlayList {
	public static List<SongImpl> play_List = new ArrayList<SongImpl>();
	private static Scanner sn = new Scanner(System.in);
	static Clip clip;
	public static String name;
	
	
	public void playView() {
		int num;
		int flag = 0;
		while(true) {
			try {
		System.out.println("━━━━━━━━━━━━━━플레이리스트━━━━━━━━━━━━━━━━━");
		System.out.println("1. 플레이리스트에 곡 추가");
		System.out.println("2. 플레이리스트 초기화");
		System.out.println("3. 플레이리스트 곡 목록");
		System.out.println("4. 플레이리스트 곡 재생");
		System.out.println("5. 플레이리스트 곡 뮤직비디오");
		System.out.println("6. 곡 좋아요 누르기");
		System.out.println("7. 곡 가사보기");
		System.out.println("8. 이전 메뉴로 가기");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.print("입력 : ");
		num = sn.nextInt();
		sn.nextLine();
		switch(num) {
		case 1:
			playAdd();
			
			break;
		case 2:
			playDelete();
			break;
		case 3:
			playShow();
			break;
		case 4:
			playSong();
			break;
		case 5:
			musicVideo();
			break;
		case 6:
			upLike();
			break;
		case 7:
			showText();
			break;
		case 8:
			flag = 1;
			break;
		default:
			System.out.println("다시 입력해주세요");
			break;
		}
		if(flag == 1) {
			break;
		}
			}catch(Exception e) {
				System.out.println("다시 입력해주세요.");
				sn.nextLine();
				continue;
			}
		}
	}
	
	
	
	public void playAdd() {
		String singerName;
		boolean check = false;
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("플레이리스트에 추가하실 곡의 가수를 입력해주세요 : ");
		singerName = sn.nextLine();
		for(int i = 0; i < SongImpl.song_list.size(); i++) {
			if(SongImpl.song_list.get(i).getSong_singer().equals(singerName)) {
				play_List.add(SongImpl.song_list.get(i));
				check = true;
				System.out.println(SongImpl.song_list.get(i).getSong_name() + " 노래가 플레이리스트에 담겼습니다.");
			}
		}
		if(check == false) {
			System.out.println("존재하지 않는 가수입니다.");
		}
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
	}
	
	public void playDelete() {
		play_List.clear();
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("플레이리스트가 전체 삭제 되었습니다.");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
	}
	
	public static boolean playShow() {
		boolean check = true;
		System.out.println("━━━━━━━━━━━━━플레이리스트 목록━━━━━━━━━━━━━━");
		if(play_List.size() == 0) {
			System.out.println("플레이 리스트가 존재하지 않습니다.");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			check = false;
			return check;
		}
		for(SongImpl song : play_List) {
			System.out.println("곡 이름 : " + song.getSong_name() + " 가수 이름 : " + song.getSong_singer());
		}
		return check;
	}
	
	
	
	public static void playSong() {
		String addr = "D:\\ex\\";
		String result;
		boolean check = playShow();
		if(check == false) {
			return;
		}
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("재생하실 곡의 제목을 입력해주세요 : ");
		name = sn.nextLine();
		result = addr + name + ".wav";
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		
		bgm = new File(result);
		

		
		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip)AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
			play();
		} catch (Exception e) {
		System.out.println("해당 노래가 존재하지 않습니다.");
		}
		
	}
	
	
	public static void play(){
		String num;
		while(true) {
			try {
				System.out.print("정지하시려면 ㅁ을 입력해주세요 : ");
				num = sn.nextLine();
				if(num.equals("ㅁ")) {
					clip.stop();
					return;
				}else {
					System.out.println("잘 못 입력하셨습니다.");
				}
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				Thread.sleep(2000000000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public void upLike() {
		String songName;
		boolean check = false;
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.print("좋아요를 누르실 곡의 이름을 입력해주세요 : ");
		songName = sn.nextLine();
		for(SongImpl song : play_List) {
			if(song.getSong_name().equals(songName)) {
				song.setLike(song.getLike()+1);
				System.out.println(song.getSong_name() + "곡의 현재 좋아요 수 : " + song.getLike());
				check = true;
			}
		}
		if(check == false) {
			System.out.println("존재하지 않는 곡입니다.");
		}
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
	}
	
	public void showText() {
		String songName;
		boolean check = false;
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.print("조회하실 가사의 곡 이름을 입력해주세요 : ");
		songName = sn.nextLine();
		for(SongImpl song : play_List) {
			if(song.getSong_name().equals(songName)) {
				System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println(song.getSong_text());
				check = true;
			}
		}
		if(check == false) {
			System.out.println("존재하지 않는 곡입니다.");
		}
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
	}
	
	public void musicVideo() {
		String name;
		boolean check;
		boolean check2 = true;
		int flag = 0;
		check = playShow();
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("재생하실 뮤직비디오의 노래이름을 입력해주세요 : ");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		name = sn.nextLine();
		while(true) {
			if(check == false) {
				System.out.println("다시 입력해주세요.");
				return;
			}
		for(int i = 0; i < play_List.size(); i++) {
			if(name.equals(play_List.get(i).getSong_name()) && name.equals("흔들리는 꽃들 속에서")) {
				try {
					Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=689GoEBjMhY"));
					check2 = false;
					return;
				} catch (IOException e) {
					e.printStackTrace();
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
			}else if(name.equals(play_List.get(i).getSong_name()) && name.equals("오늘도 빛나는 너에게")) {
				try {
					Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=kNYA3H1jSSs"));
					check2 = false;
					return;
				} catch (IOException e) {
					e.printStackTrace();
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
			}else if(name.equals(play_List.get(i).getSong_name()) && name.equals("워커홀릭")) {
				try {
					Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=mrAIqeULUL0"));
					check2 = false;
					return;
				} catch (IOException e) {
					e.printStackTrace();
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
			}
			if(check == true){
				flag = 1;
			}
		}
		if(flag == 1) {
			break;
		}
		}

		
	}
	
}
