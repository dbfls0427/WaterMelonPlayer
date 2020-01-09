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
		System.out.println("�����������������������������÷��̸���Ʈ����������������������������������");
		System.out.println("1. �÷��̸���Ʈ�� �� �߰�");
		System.out.println("2. �÷��̸���Ʈ �ʱ�ȭ");
		System.out.println("3. �÷��̸���Ʈ �� ���");
		System.out.println("4. �÷��̸���Ʈ �� ���");
		System.out.println("5. �÷��̸���Ʈ �� ��������");
		System.out.println("6. �� ���ƿ� ������");
		System.out.println("7. �� ���纸��");
		System.out.println("8. ���� �޴��� ����");
		System.out.println("������������������������������������������������������������������������������");
		System.out.print("�Է� : ");
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
			System.out.println("�ٽ� �Է����ּ���");
			break;
		}
		if(flag == 1) {
			break;
		}
			}catch(Exception e) {
				System.out.println("�ٽ� �Է����ּ���.");
				sn.nextLine();
				continue;
			}
		}
	}
	
	
	
	public void playAdd() {
		String singerName;
		boolean check = false;
		System.out.println("������������������������������������������������������������������������������");
		System.out.println("�÷��̸���Ʈ�� �߰��Ͻ� ���� ������ �Է����ּ��� : ");
		singerName = sn.nextLine();
		for(int i = 0; i < SongImpl.song_list.size(); i++) {
			if(SongImpl.song_list.get(i).getSong_singer().equals(singerName)) {
				play_List.add(SongImpl.song_list.get(i));
				check = true;
				System.out.println(SongImpl.song_list.get(i).getSong_name() + " �뷡�� �÷��̸���Ʈ�� �����ϴ�.");
			}
		}
		if(check == false) {
			System.out.println("�������� �ʴ� �����Դϴ�.");
		}
		System.out.println("������������������������������������������������������������������������������");
	}
	
	public void playDelete() {
		play_List.clear();
		System.out.println("������������������������������������������������������������������������������");
		System.out.println("�÷��̸���Ʈ�� ��ü ���� �Ǿ����ϴ�.");
		System.out.println("������������������������������������������������������������������������������");
	}
	
	public static boolean playShow() {
		boolean check = true;
		System.out.println("���������������������������÷��̸���Ʈ ��Ϧ���������������������������");
		if(play_List.size() == 0) {
			System.out.println("�÷��� ����Ʈ�� �������� �ʽ��ϴ�.");
			System.out.println("������������������������������������������������������������������������������");
			check = false;
			return check;
		}
		for(SongImpl song : play_List) {
			System.out.println("�� �̸� : " + song.getSong_name() + " ���� �̸� : " + song.getSong_singer());
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
		System.out.println("������������������������������������������������������������������������������");
		System.out.println("����Ͻ� ���� ������ �Է����ּ��� : ");
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
		System.out.println("�ش� �뷡�� �������� �ʽ��ϴ�.");
		}
		
	}
	
	
	public static void play(){
		String num;
		while(true) {
			try {
				System.out.print("�����Ͻ÷��� ���� �Է����ּ��� : ");
				num = sn.nextLine();
				if(num.equals("��")) {
					clip.stop();
					return;
				}else {
					System.out.println("�� �� �Է��ϼ̽��ϴ�.");
				}
				System.out.println("������������������������������������������������������������������������������");
				Thread.sleep(2000000000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public void upLike() {
		String songName;
		boolean check = false;
		System.out.println("������������������������������������������������������������������������������");
		System.out.print("���ƿ並 ������ ���� �̸��� �Է����ּ��� : ");
		songName = sn.nextLine();
		for(SongImpl song : play_List) {
			if(song.getSong_name().equals(songName)) {
				song.setLike(song.getLike()+1);
				System.out.println(song.getSong_name() + "���� ���� ���ƿ� �� : " + song.getLike());
				check = true;
			}
		}
		if(check == false) {
			System.out.println("�������� �ʴ� ���Դϴ�.");
		}
		System.out.println("������������������������������������������������������������������������������");
	}
	
	public void showText() {
		String songName;
		boolean check = false;
		System.out.println("������������������������������������������������������������������������������");
		System.out.print("��ȸ�Ͻ� ������ �� �̸��� �Է����ּ��� : ");
		songName = sn.nextLine();
		for(SongImpl song : play_List) {
			if(song.getSong_name().equals(songName)) {
				System.out.println("������������������������������������������������������������������������������");
				System.out.println(song.getSong_text());
				check = true;
			}
		}
		if(check == false) {
			System.out.println("�������� �ʴ� ���Դϴ�.");
		}
		System.out.println("������������������������������������������������������������������������������");
	}
	
	public void musicVideo() {
		String name;
		boolean check;
		boolean check2 = true;
		int flag = 0;
		check = playShow();
		System.out.println("������������������������������������������������������������������������������");
		System.out.println("����Ͻ� ���������� �뷡�̸��� �Է����ּ��� : ");
		System.out.println("������������������������������������������������������������������������������");
		name = sn.nextLine();
		while(true) {
			if(check == false) {
				System.out.println("�ٽ� �Է����ּ���.");
				return;
			}
		for(int i = 0; i < play_List.size(); i++) {
			if(name.equals(play_List.get(i).getSong_name()) && name.equals("��鸮�� �ɵ� �ӿ���")) {
				try {
					Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=689GoEBjMhY"));
					check2 = false;
					return;
				} catch (IOException e) {
					e.printStackTrace();
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
			}else if(name.equals(play_List.get(i).getSong_name()) && name.equals("���õ� ������ �ʿ���")) {
				try {
					Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=kNYA3H1jSSs"));
					check2 = false;
					return;
				} catch (IOException e) {
					e.printStackTrace();
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
			}else if(name.equals(play_List.get(i).getSong_name()) && name.equals("��ĿȦ��")) {
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
