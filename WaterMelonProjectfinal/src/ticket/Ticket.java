package ticket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import member.Member;

public class Ticket {
	Scanner sc = new Scanner(System.in);
	static List<Ticket> ticket_list = new ArrayList<Ticket>(); //티켓 리스트
	static List<Ticket> pay_list = new ArrayList<Ticket>(); //구매 리스트

	private String ticket_name; //티켓이름
	private String ticket_price; //티켓가격
	private String ticket_date; //티켓기간
	
	private String mem_id; // 구매한 회원 이름
	private String card_num; //카드번호

	public Ticket() {}
	
	public Ticket(String ticket_name, String ticket_price, String ticket_date) {
		super();
		this.ticket_name = ticket_name;
		this.ticket_price = ticket_price;
		this.ticket_date = ticket_date;
	}
	public Ticket(String mem_id, String card_num) {
		super();
		this.mem_id = mem_id;
		this.card_num = card_num;
	}
	
	static {
		Ticket ticket1 = new Ticket();
		ticket1.setTicket_name("Bronze");
		ticket1.setTicket_price("30,000");
		ticket1.setTicket_date("1개월");
		ticket_list.add(ticket1);
		
		Ticket ticket2 = new Ticket();
		ticket2.setTicket_name("Silver");
		ticket2.setTicket_price("70,000");
		ticket2.setTicket_date("3개월");
		ticket_list.add(ticket2);
		
		Ticket ticket3 = new Ticket();
		ticket3.setTicket_name("Gold");
		ticket3.setTicket_price("150,000");
		ticket3.setTicket_date("6개월");
		ticket_list.add(ticket3);
	}
	
	public String getTicket_name() {
		return ticket_name;
	}

	public void setTicket_name(String ticket_name) {
		this.ticket_name = ticket_name;
	}

	public String getTicket_price() {
		return ticket_price;
	}

	public void setTicket_price(String ticket_price) {
		this.ticket_price = ticket_price;
	}

	public String getTicket_date() {
		return ticket_date;
	}

	public void setTicket_date(String ticket_date) {
		this.ticket_date = ticket_date;
	}
	
	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getCard_num() {
		return card_num;
	}

	public void setCard_num(String card_num) {
		this.card_num = card_num;
	}

	
	//티켓 구매
	public void buyTicket() {
		try {
			for(int i=1; i<=ticket_list.size(); i++) {
				ticketIntro(i);
			}
				System.out.println("구매할 티켓을 입력하세요");
				System.out.println("1. Bronze 2. Silver 3. Gold");
				int t_type = sc.nextInt();
				sc.nextLine(); // 공백제거
				if(Member.getOn_id() != null) {
					pay(t_type);
				}else {
					System.out.println("로그인이 필요합니다 !!");
				}
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다 !!");
			System.out.println();
		}
		
	}

	//티켓 소개
	public void ticketIntro(int i) {
			System.out.println("━━━━━━━━━ ♪♪ 수박 player Ticket ♪♪ ━━━━━━━");
			System.out.println("\t\t" + ticket_list.get(i-1).getTicket_name() + " Ticket");
			System.out.println("\t\t가격 : " + ticket_list.get(i-1).getTicket_price() + "원");
			System.out.println("\t\t기간 : " + ticket_list.get(i-1).getTicket_date());
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println();
	
	}
	
	//결제
	public void pay(int t_type) {
		String t_name = "";
		String m_id = ""; //회원 아이디 가져오기 위해 변수 선언
		
		if(t_type == 1) {
			t_name = "Bronze";
		}else if(t_type == 2) {
			t_name = "Silver";
		}else if(t_type == 3) {
			t_name = "Gold";
		}
		
		switch (t_type) {
		case 1:
			pay2(t_type, t_name);
			break;
		case 2:
			ticketIntro(t_type);
			pay2(t_type, t_name);
			break;
		case 3:
			ticketIntro(t_type);
			pay2(t_type, t_name);
			break;
		default:
			break;
		}
	}
	
	//세부 결제
	public void pay2(int t_type, String t_name) {
		try {
			Thread thread = new Pay(); //쓰레드
			int m_idx = 0; //회원의 인덱스 가져오기 위해 선언
			
			System.out.println("결제 방법을 선택하세요");
			System.out.println("1.카드 2.무통장 입금");
			int p_type = sc.nextInt();
			sc.nextLine();
			if(p_type == 1) {
				System.out.println("카드번호(- 포함) : ");
				String card_num = sc.nextLine();
				System.out.println("유효기간(/포함) : ");
				String card_date = sc.nextLine();
				System.out.println("비밀번호 앞2자리 : ");
				String card_pw = sc.nextLine();
				thread.start();
				
				try {
					thread.join();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				System.out.println("결제 완료");
				System.out.println("수박 Player를 마음껏 이용하세요!");
				
				for(int i=0; i<Member.getMem_list().size(); i++) {
					if(Member.getMem_list().get(i).getMem_id().equals(Member.getOn_id())) {
						m_idx = i;
					}
				}
				Member.getMem_list().get(m_idx).setMem_ticket(t_name); // Member에 티켓설정해줌
				ticketShow(t_type, card_num, Member.getMem_list().get(m_idx).getMem_id(),p_type);
			}
			if(p_type ==2) {
				System.out.println("입금 은행 : 농협");
				System.out.println("계좌주 : 엄유린");
				System.out.println("계좌번호 : 352-1111-1111");
				System.out.println("입금 완료 후 y를 입력해 주세요");
				String a = sc.nextLine();
				if(a != null) {
					thread.start();
					try {
						thread.join();
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					System.out.println("결제 완료");
					System.out.println("수박 Player를 마음껏 이용하세요!");
					
					for(int i=0; i<Member.getMem_list().size(); i++) {
						if(Member.getMem_list().get(i).getMem_id().equals(Member.getOn_id())) {
							m_idx = i;
						}
					}
					Member.getMem_list().get(m_idx).setMem_ticket(t_name); // Member에 티켓설정해줌
					ticketShow(t_type, card_num, Member.getMem_list().get(m_idx).getMem_id(),p_type);
				}
			}
			
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다 !!");
			System.out.println();
		}
		
	}

	//티켓 구매내역
	public void ticketShow(int t_type, String card_num, String mem_id, int p_type) {
		System.out.println("┏━━━━━━━━━━━━━ ♪♪ 구매 내역 ♪♪ ━━━━━━━━┓");
		System.out.println("\t회원 ID : " + mem_id);
		System.out.println("\t구매티켓 : " + ticket_list.get(t_type-1).getTicket_name() + " Ticket");
		System.out.println("\t가격 : " + ticket_list.get(t_type-1).getTicket_price() + "원");
		System.out.println("\t기간 : " + ticket_list.get(t_type-1).getTicket_date());
		if(p_type == 1) {
			System.out.println("\t결제 방법  : " + "카드");
			System.out.println("\t카드번호 : " + card_num);
		}else {
			System.out.println("\t결제 방법  : " + "무통장 입금");
		}
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		
	}
	
	
	
}
